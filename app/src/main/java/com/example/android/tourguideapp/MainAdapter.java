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

    private LayoutInflater layoutInflater;
    private ArrayList<Attractions> data;

    public MainAdapter(Context c, ArrayList<Attractions> data) {
        this.layoutInflater = LayoutInflater.from(c);
        this.data = data;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder viewHolder, int i) {

        final Attractions attractions = data.get(i);

        viewHolder.name.setText(attractions.getName());
        viewHolder.address.setText(attractions.getAddress());
        viewHolder.phoneNumber.setText(attractions.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }

   class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView address;
        private TextView phoneNumber;

        private ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.text_view_1);
            address = itemView.findViewById(R.id.text_view_2);
            phoneNumber = itemView.findViewById(R.id.text_view_3);

        }
    }
}
