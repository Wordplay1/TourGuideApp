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
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        final ArrayList<Attractions> attractions = new ArrayList<>();

        attractions.add(new Attractions(getString(R.string.playOneName),getString(R.string.playOneAddress),getString(R.string.playOneDescription),R.drawable.readingterminal));
        attractions.add(new Attractions(getString(R.string.playTwoName),getString(R.string.playTwoAddress),getString(R.string.playTwoDescription),R.drawable.nationalpark));
        attractions.add(new Attractions(getString(R.string.playThreeName),getString(R.string.playThreeAddress),getString(R.string.playThreeDescription),R.drawable.sugarhouse));
        attractions.add(new Attractions(getString(R.string.playFourName),getString(R.string.playFourAddress),getString(R.string.playFourDescription),R.drawable.valleyforge));
        attractions.add(new Attractions(getString(R.string.playFiveName),getString(R.string.playFiveAddress),getString(R.string.playFiveDescription),R.drawable.libertybell));

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
