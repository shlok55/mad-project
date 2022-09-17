package com.example.greenrise_sgp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.Model;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class PlantListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Plant> list;
    PlantAdapter adapter;
    DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Plants");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_list2);

        recyclerView = findViewById(R.id.plantlist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new PlantAdapter(this, list);
        recyclerView.setAdapter(adapter);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Plant plant = dataSnapshot.getValue(Plant.class);
                    list.add(plant);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
//        reference = FirebaseDatabase.getInstance().getReference("Plants");
//        storageReference = FirebaseStorage.getInstance().getReference("Images");
//        options = new FirebaseRecyclerOptions.Builder<Plant>().setQuery(reference,Plant.class).build();
//        adapter = new FirebaseRecyclerAdapter<Plant, ViewHolder>(options) {
//        @Override
//        protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Plant model) {
//
////          Picasso.with(context).load(model.getImage()).into(holder.imagev);
//            Glide.with(context).load(model.getImage()).into(holder.imagev);
//        }
//
//        @NonNull
//        @Override
//        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantentry, parent, false);
//            return new ViewHolder(view);
//        }
//        };
//        adapter.startListening();
//        recyclerView.setAdapter(adapter);
}

}