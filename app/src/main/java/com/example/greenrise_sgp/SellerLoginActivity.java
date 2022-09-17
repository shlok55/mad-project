package com.example.greenrise_sgp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SellerLoginActivity extends AppCompatActivity {
    EditText email_login, pass_login;
    Button loginbtn;
    TextView reg, forpass, google_login;
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    GoogleSignInClient googleSignInClient;
    private static final int RC_SIGN_IN = 1;
    private static final String TAG = "GOOGLEAUTH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_login);
        email_login = findViewById(R.id.LoginEmail);
        pass_login = findViewById(R.id.LoginPasswd);
        loginbtn = findViewById(R.id.loginbtn);
        google_login = findViewById(R.id.googlesignin);
        reg = findViewById(R.id.regtv);
        mAuth = FirebaseAuth.getInstance();
//        if (mAuth.getCurrentUser() != null) {
//            finish();
//            return;
//        }
        forpass = findViewById(R.id.forgotpass);
        forpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerLoginActivity.this, ForgetPass.class);
                startActivity(intent);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                authenticate_user();

            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerLoginActivity.this, SellerRegisterActivity.class);
                startActivity(intent);
            }
        });

        google_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerLoginActivity.this, GoogleLoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void authenticate_user() {


        String email = email_login.getText().toString();
        String pass = pass_login.getText().toString();

        if(TextUtils.isEmpty(email)){
            email_login.setError("Email is required!");
        }
        else if(TextUtils.isEmpty(pass)){
            pass_login.setError("Password is required!");
        }
        else{
            mAuth.signInWithEmailAndPassword(email,pass)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        Intent intent = new Intent(SellerLoginActivity.this, SellerHomeActivity.class);
                                        startActivity(intent);
                                    }
                                    else {
                                        Toast.makeText(SellerLoginActivity.this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
            mAuth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Intent intent = new Intent(SellerLoginActivity.this, SellerHomeActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SellerLoginActivity.this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}

