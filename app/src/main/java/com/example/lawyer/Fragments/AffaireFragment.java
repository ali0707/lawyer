package com.example.lawyer.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lawyer.Adapters.Adapter;
import com.example.lawyer.R;

import java.util.ArrayList;

public class AffaireFragment extends Fragment {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;

    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_affaire2, container, false);
        items = new ArrayList<>();
        items.add("First CardView Item");
        items.add("Second CardView Item");
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),items);
        recyclerView.setAdapter(adapter);

        b1 = view.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detail_affaire detail_affaire = new detail_affaire();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container , detail_affaire)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;


    }

}
