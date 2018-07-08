package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private ArrayList<Attractions> data;
    private LayoutInflater layoutInflater;


    public MainAdapter(Context context, ArrayList<Attractions> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Attractions currentAttraction = data.get(position);

        holder.name.setText(currentAttraction.getName());
        holder.address.setText(currentAttraction.getAddress());
        holder.phoneNumber.setText(currentAttraction.getPhoneNumber());
        holder.description.setText(currentAttraction.getDescription());
        holder.image.setImageResource(currentAttraction.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView address;
        private TextView phoneNumber;
        private TextView description;
        private ImageView image;

        private ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.text_view_1);
            address = view.findViewById(R.id.text_view_2);
            phoneNumber = view.findViewById(R.id.text_view_3);
            description = view.findViewById(R.id.text_view_4);
            image = view.findViewById(R.id.image_view);
        }
    }

}
