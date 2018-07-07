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

    private RecyclerView recyclerView;

    private RecyclerView.LayoutManager layoutManager;

    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Attractions> attraction = new ArrayList<>();
        attraction.add(new Attractions("Philadelphia", "dsdadasdsad", "sdasdsddsad"));

        View rootView = inflater.inflate(R.layout.words_list, container, false);

        // set up the RecyclerView
        recyclerView = rootView.findViewById(R.id.recycler_view);


        layoutManager = new LinearLayoutManager(rootView.getContext());
        MainAdapter mainAdapter = new MainAdapter(rootView.getContext(),attraction);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainAdapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));

        return rootView;
    }
}


