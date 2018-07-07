package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

    private RecyclerView recyclerView;

    private RecyclerView.LayoutManager layoutManager;

    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.words_list, container, false);

        // data to populate the RecyclerView with
        final ArrayList<Attractions> attraction = new ArrayList<>();
        attraction.add(new Attractions("Philadelphia", "dsdadasdsad", "sdasdsddsad"));


        // set up the RecyclerView
        recyclerView = rootView.findViewById(R.id.recycler_view);


        layoutManager = new LinearLayoutManager(getActivity());
        MainAdapter mainAdapter = new MainAdapter(getActivity(),attraction);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainAdapter);

        return rootView;
    }
}


