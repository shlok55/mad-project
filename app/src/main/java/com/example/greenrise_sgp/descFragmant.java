package com.example.greenrise_sgp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;


public class descFragmant extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    String about,image,name,price,quantity;
    SimpleDateFormat currentTime;
    SimpleDateFormat currentDate;
 //     int quantityincart;
    private static final  String h1="THE_C";
    int k;
    static int i=1;
    static int h=1;
    public descFragmant() {

    }
    public descFragmant(String about,String image,String name,String price,String quantity) {
        this.about=about;
        this.image=image;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public static descFragmant newInstance(String param1, String param2) {
        descFragmant fragment = new descFragmant();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_desc_fragmant, container, false);
        ImageView imageholder=view.findViewById(R.id.imagegholder);
        TextView nameholder=view.findViewById(R.id.nameholder);
        TextView aboutholder=view.findViewById(R.id.aboutholder);
        TextView priceholder=view.findViewById(R.id.priceholder);
        TextView quantityholder=view.findViewById(R.id.quantityholder);
        Button btn=view.findViewById(R.id.button);
        Button btn1=view.findViewById(R.id.button3);
        Button btn2=view.findViewById(R.id.button4);
        nameholder.setText(name);
        aboutholder.setText(about);
        priceholder.setText(price);
        quantityholder.setText(quantity);
        Glide.with(getContext()).load(image).into(imageholder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k=0;
                btn.setEnabled(false);
                FirebaseAuth fa = FirebaseAuth.getInstance();
                currentDate = new SimpleDateFormat("dd-MM-yyyy");
                currentTime = new SimpleDateFormat("HH:mm:ss");
                final String t = String.valueOf(currentDate.format(Calendar.getInstance().getTime()));
                final String d = String.valueOf(currentTime.format(Calendar.getInstance().getTime()));
                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference cart = db.getReference("Cart");
                cart.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                         //   Log.i("The_C", s);
                            if (snapshot1.child("name").getValue().toString().equals(name)) {
                                k=1;
                                String  s = snapshot1.child("totalquantity").getValue().toString();
                                int q=Integer.parseInt(s)+1;
                                String up=snapshot1.child("unitprice").getValue().toString();
                         //       Log.i("The_C", "h1");
                                HashMap updateq=new HashMap();
                                updateq.put("totalquantity",String.valueOf(q));
                                updateq.put("totalprice",String.valueOf(Integer.parseInt(up)*q));
                                cart.child(snapshot1.child("parent").getValue().toString()).updateChildren(updateq);
                            }
                        }
                        System.out.println(k);
                        if (k==0) {
                            cartModel cm = new cartModel(name, price, t, d, "1", price, String.valueOf(1), String.valueOf(1), String.valueOf(i),image);
                            cart.child(String.valueOf(i)).setValue(cm);
                            //quantityincart++;
                            i++;
                        }

                        btn.setEnabled(true);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setEnabled(false);
                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference cart = db.getReference("Cart");
                cart.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for(DataSnapshot snapshot1:snapshot.getChildren())
                        {
                            if(snapshot1.child("name").getValue().toString().equals(name))
                            {
                                cart.child(snapshot1.child("parent").getValue().toString()).removeValue();
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                btn.setEnabled(true);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String t = String.valueOf(currentDate.format(Calendar.getInstance().getTime()));
                final String d = String.valueOf(currentTime.format(Calendar.getInstance().getTime()));
                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference wishlist = db.getReference("Wishlist");
                wishModel wm = new wishModel(name,price,t,d,String.valueOf(1),String.valueOf(1),String.valueOf(h),image);
                wishlist.child(String.valueOf(h)).setValue(wm);
                        h++;
                }

        });

        return view;
    }


    public void onBackPressed()
    {
        AppCompatActivity activity = (AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new HomeFragment()).addToBackStack(null).commit();

    }
}