package com.example.lawyer.Fragments.Affaire;

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

import com.example.lawyer.Adapters.MyAdapter;
import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;
import com.example.lawyer.entities.affaire;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Affaire extends Fragment {

    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_affaire2, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(
                        1, StaggeredGridLayoutManager.VERTICAL));
        List<affaire> phoneList=getPhoneList();
        recyclerView.setAdapter(new MyAdapter(getContext(),phoneList));


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
    public List<affaire> getPhoneList(){
        List<affaire> phoneList=new ArrayList<>();
        phoneList.add(new affaire("دائرة تونس 2","محكمة بن عروس"," 0781165477"));
        phoneList.add(new affaire(121,"qsdsdq","qdsqsd","qdsqsd"," 0781165477","2015/12/10"));
        phoneList.add(new affaire("دائرة تونس 2","محكمة بن عروس"," 0781165477"));
        phoneList.add(new affaire("دائرة تونس 2","محكمة بن عروس"," 5871677822"));
        return phoneList;
    }
}
