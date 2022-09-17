package com.example.greenrise_sgp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.myViewHolder> {
    ArrayList<Plant> list;
    Context context;

    public PlantAdapter(Context context, ArrayList<Plant> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public PlantAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.plantentry,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantAdapter.myViewHolder holder, int position) {
        Plant plant = list.get(position);
        holder.namev.setText(plant.getName());
        holder.aboutv.setText(plant.getAbout());
        holder.pricev.setText(String.valueOf(plant.getPrice()));
        holder.quantv.setText(String.valueOf(plant.getQuantity()));
        Glide.with(context).load(plant.getImage()).into(holder.imagev);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView namev,aboutv,pricev,quantv;
        ImageView imagev;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            namev = itemView.findViewById(R.id.plantname);
            aboutv = itemView.findViewById(R.id.plantabout);
            pricev = itemView.findViewById(R.id.plantprice);
            quantv = itemView.findViewById(R.id.plantquantity);
            imagev = itemView.findViewById(R.id.plantimage);
        }
    }
}
