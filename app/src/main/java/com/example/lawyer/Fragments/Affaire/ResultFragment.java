package com.example.lawyer.Fragments.Affaire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lawyer.Fragments.Demande.Demande;
import com.example.lawyer.Fragments.Mission.Mission;
import com.example.lawyer.Fragments.Session.Session;
import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;

public class ResultFragment extends Fragment {

    CardView b1 ;
    TextView b2 ;
    TextView b4 ;
    TextView b5 ;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
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
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });

        b1 = view.findViewById(R.id.rtt);
        b2 = view.findViewById(R.id.button3);
        b4 = view.findViewById(R.id.button4);
        b5 = view.findViewById(R.id.buttonmataleb);

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

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Session Session = new Session();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container , Session)
                        .addToBackStack(null)
                        .commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mission Mission = new Mission();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container , Mission)
                        .addToBackStack(null)
                        .commit();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Demande Demande = new Demande();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container , Demande)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }

}
