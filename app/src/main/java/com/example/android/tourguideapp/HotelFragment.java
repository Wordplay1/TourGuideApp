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
public class HotelFragment extends Fragment {


    public HotelFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        final ArrayList<Attractions> attractions = new ArrayList<>();

        attractions.add(new Attractions(getString(R.string.hotelOneName),getString(R.string.hotelOneAddress),getString(R.string.hotelOneDescription),R.drawable.monaco));
        attractions.add(new Attractions(getString(R.string.hotelTwoName),getString(R.string.hotelTwoAddress),getString(R.string.hotelTwoDescription),R.drawable.akarittenhouse));
        attractions.add(new Attractions(getString(R.string.hotelThreeName),getString(R.string.hotelThreeAddress),getString(R.string.hotelThreeDescription),R.drawable.thelogan));
        attractions.add(new Attractions(getString(R.string.hotelFourName),getString(R.string.hotelFourAddress),getString(R.string.hotelFourDescription),R.drawable.palomar));
        attractions.add(new Attractions(getString(R.string.hotelFiveName),getString(R.string.hotelFiveAddress),getString(R.string.hotelFiveDescription),R.drawable.lameridian));

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


