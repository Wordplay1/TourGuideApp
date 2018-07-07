package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context c;
    private ArrayList<Attractions> data;

    public MainAdapter(Context c, ArrayList<Attractions> data) {
        this.data = data;
        this.c = c;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(c).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder viewHolder, int i) {
        viewHolder.name.setText(this.data.get(i).getName());
        viewHolder.address.setText(this.data.get(i).getAddress());
        viewHolder.phoneNumber.setText(this.data.get(i).getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView address;
        public TextView phoneNumber;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.text_view_1);
            address = itemView.findViewById(R.id.text_view_2);
            phoneNumber = itemView.findViewById(R.id.text_view_3);

        }
    }
}
