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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);

        final ArrayList<Attractions> attractions = new ArrayList<>();

        attractions.add(new Attractions(getString(R.string.shoppingOneName), getString(R.string.shoppingOneAddress), getString(R.string.shoppingOneDescription), R.drawable.rittenrow));
        attractions.add(new Attractions(getString(R.string.shoppingTwoName), getString(R.string.shoppingTwoAddress), getString(R.string.shoppingTwoDescription), R.drawable.midtown));
        attractions.add(new Attractions(getString(R.string.shoppingThreeName), getString(R.string.shoppingThreeAddress), getString(R.string.shoppingThreeDescription), R.drawable.jewelersrow));
        attractions.add(new Attractions(getString(R.string.shoppingFourName), getString(R.string.shoppingFourAddress), getString(R.string.shoppingFourDescription), R.drawable.universitycity));
        attractions.add(new Attractions(getString(R.string.shoppingFiveName), getString(R.string.shoppingFiveAddress), getString(R.string.shoppingFiveDescription), R.drawable.northliberties));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());

        MainAdapter adapter = new MainAdapter(rootView.getContext(), attractions);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        adapter.notifyDataSetChanged();


        return rootView;
    }

}
