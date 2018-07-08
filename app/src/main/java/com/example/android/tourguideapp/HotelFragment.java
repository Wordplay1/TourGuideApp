package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        final ArrayList<Attractions> attractions = new ArrayList<>();

        attractions.add(new Attractions(getString(R.string.hotelOneName),getString(R.string.hotelOneAddress),getString(R.string.hotelOnePhoneNumber),getString(R.string.hotelOneDescription),R.drawable.monaco));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());

        MainAdapter adapter = new MainAdapter(rootView.getContext(),attractions);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        adapter.notifyDataSetChanged();

        return rootView;
    }
}


