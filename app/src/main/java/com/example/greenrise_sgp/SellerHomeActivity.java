package com.example.greenrise_sgp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

import java.util.Locale;
import java.util.UUID;

public class SellerHomeActivity extends AppCompatActivity {
    Button addp,viewp,up;
    EditText name,about,price,quantity;
    Plant plant;
    StorageReference storageReference;
    DatabaseReference reference;
    int Image_Request_Code = 7;
    ProgressDialog progressDialog;
    ImageView imageView;
    Uri FilePathUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);
        addp = findViewById(R.id.add);
        up = findViewById(R.id.upload);
        viewp = findViewById(R.id.view);
        name = findViewById(R.id.Pname);
        about = findViewById(R.id.Pabout);
        price = findViewById(R.id.Pprice);
        quantity = findViewById(R.id.Pquantity);
        imageView = findViewById(R.id.pimage);
        storageReference = FirebaseStorage.getInstance().getReference("Images");
        reference = FirebaseDatabase.getInstance().getReference("Plants");
        progressDialog = new ProgressDialog(SellerHomeActivity.this);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Select Image"),Image_Request_Code);
            }
        });
        addp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Upload();
            }
        });
        viewp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerHomeActivity.this,PlantListActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==Image_Request_Code && resultCode==RESULT_OK && data!=null && data.getData()!=null){
            FilePathUri = data.getData();
        }
    }
    public String GetFileExtension(Uri uri) {

        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri)) ;

    }
    private void Upload() {
        if(FilePathUri!=null){
            progressDialog.setTitle("Uploading...");
            progressDialog.setMessage("Please wait while we upload the image");
            progressDialog.show();
            String Name = name.getText().toString().trim();
            String About = about.getText().toString().trim();
            Integer Price = Integer.parseInt(price.getText().toString().trim());
            Integer Quantity = Integer.parseInt(quantity.getText().toString().trim());
            StorageReference str = storageReference.child(System.currentTimeMillis()+"."+GetFileExtension(FilePathUri));
            str.putFile(FilePathUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressDialog.dismiss();
                            Toast.makeText(SellerHomeActivity.this, "Data Uploaded...", Toast.LENGTH_SHORT).show();
                            str.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    plant = new Plant(Name,About,Price,Quantity,uri.toString());
                                    String ImageUploadId = reference.push().getKey();
                                    reference.child(ImageUploadId).setValue(plant);
                                }
                            });

                        }
                    });
        }
        else {
            Toast.makeText(SellerHomeActivity.this, "Please select image", Toast.LENGTH_SHORT).show();
        }
    }

}