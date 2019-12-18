package com.example.lawyer.Fragments.Demande;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lawyer.Adapters.Demande.DemandeAdapter;
import com.example.lawyer.Fragments.Mission.Add_mission;
import com.example.lawyer.R;
import com.example.lawyer.entities.demande;

import java.util.ArrayList;
import java.util.List;

public class Demande extends Fragment {

    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demande, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView4);
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(
                        1, StaggeredGridLayoutManager.VERTICAL));
        List<demande> demandeList = demandeList();
        recyclerView.setAdapter(new DemandeAdapter(getContext(), demandeList));


        b1 = view.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add_mission Add_Mission = new Add_mission();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, Add_Mission)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;

    }
    public List<demande> demandeList() {
        List<demande> demandeList = new ArrayList<>();
        demandeList.add(new demande("مطلب", "الجهة المتقدم لها"));
        demandeList.add(new demande("مطلب", "الجهة المتقدم لها"));
        demandeList.add(new demande("مطلب", "الجهة المتقدم لها"));
        demandeList.add(new demande("مطلب", "الجهة المتقدم لها"));
        demandeList.add(new demande("مطلب", "الجهة المتقدم لها"));



        return demandeList;
    }

}
