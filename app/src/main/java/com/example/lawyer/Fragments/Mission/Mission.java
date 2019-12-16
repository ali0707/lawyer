package com.example.lawyer.Fragments.Mission;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lawyer.Adapters.Mission.MissionAdapter;
import com.example.lawyer.Adapters.Session.SessionAdapter;
import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;
import com.example.lawyer.entities.mission;
import com.example.lawyer.entities.session;

import java.util.ArrayList;
import java.util.List;

public class Mission extends Fragment {


    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mission, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(
                        1, StaggeredGridLayoutManager.VERTICAL));
        List<mission> missionList =getPhoneList();
        recyclerView.setAdapter(new MissionAdapter(getContext(),missionList));


        b1 = view.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add_Mission Add_Mission = new Add_Mission();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container , Add_Mission)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;

    }
    public List<mission> getPhoneList(){
        List<mission> missionList=new ArrayList<>();
        missionList.add(new mission("1 المهمة","13 / 02 / 2019"));
        missionList.add(new mission("2 المهمة","13 / 02 / 2019"));
        missionList.add(new mission("3 المهمة","13 / 02 / 2019"));
        missionList.add(new mission("3 المهمة","13 / 02 / 2019"));
        missionList.add(new mission("3 المهمة","13 / 02 / 2019"));
        missionList.add(new mission("3 المهمة","13 / 02 / 2019"));

        return missionList;
    }
}
