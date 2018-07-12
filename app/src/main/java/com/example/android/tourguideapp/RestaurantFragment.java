package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        final ArrayList<Attractions> attractions = new ArrayList<>();

        attractions.add(new Attractions(getString(R.string.restOneName),getString(R.string.restOneAddress),getString(R.string.restOneDescription),R.drawable.parc));
        attractions.add(new Attractions(getString(R.string.restTwoName),getString(R.string.restTwoAddress),getString(R.string.restTwoDescription),R.drawable.thelove));
        attractions.add(new Attractions(getString(R.string.restThreeName),getString(R.string.restThreeAddress),getString(R.string.restThreeDescription),R.drawable.thedandelion));
        attractions.add(new Attractions(getString(R.string.restFourName),getString(R.string.restFourAddress),getString(R.string.restFourDescription),R.drawable.whitedogcafe));
        attractions.add(new Attractions(getString(R.string.restFiveName),getString(R.string.restFiveAddress),getString(R.string.restFiveDescription),R.drawable.budandmarilyn));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());

        MainAdapter adapter = new MainAdapter(rootView.getContext(),attractions);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        adapter.notifyDataSetChanged();

        return rootView;
    }

}
