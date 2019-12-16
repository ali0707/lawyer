package com.example.lawyer.Fragments.Mission;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lawyer.Fragments.Session.Session;
import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;


public class Detail_mission extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail_mission, container, false);
        TextView tvResult = view.findViewById(R.id.textView3);
        TextView tvResultx = view.findViewById(R.id.textTitle);
        Button btnBack = view.findViewById(R.id.button);
        Bundle bundle = getArguments();

        if (bundle != null) {
            String name = bundle.getString("name");
            String cercle = bundle.getString("cercle");
            String text =  name ;
            String text1 =  cercle ;
            tvResult.setText(text);
            tvResultx.setText(text1);
        }


        return view;
    }



}
