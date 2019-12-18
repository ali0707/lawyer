package com.example.lawyer.Fragments.Affaire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lawyer.Fragments.Demande.Demande;
import com.example.lawyer.Fragments.Mission.Add_Mission;
import com.example.lawyer.Fragments.Mission.Mission;
import com.example.lawyer.Fragments.Session.Session;
import com.example.lawyer.Fragments.Session.Add_session;
import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;

public class ResultFragment extends Fragment implements View.OnClickListener {

    CardView b1 ;
    TextView b2 ;
    TextView b4 ;
    TextView b5 ;

    FloatingActionButton fabMain, fabOne, fabTwo, fabThree;
    LinearLayout layout;
    Float translationY = 100f;

    OvershootInterpolator interpolator = new OvershootInterpolator();

    private static final String TAG = "ResultFragment";

    Boolean isMenuOpen = false;

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

        fabMain = view.findViewById(R.id.fabMain);
        fabOne = view.findViewById(R.id.fabOne);
        fabTwo = view.findViewById(R.id.fabTwo);
        fabThree = view.findViewById(R.id.fabThree);
        layout = view.findViewById(R.id.test);

        fabOne.setAlpha(0f);
        fabTwo.setAlpha(0f);
        fabThree.setAlpha(0f);

        fabOne.setEnabled(false);
        fabTwo.setEnabled(false);
        fabThree.setEnabled(false);

        fabOne.setTranslationY(translationY);
        fabTwo.setTranslationY(translationY);
        fabThree.setTranslationY(translationY);

        fabMain.setOnClickListener(this);
        fabOne.setOnClickListener(this);
        fabTwo.setOnClickListener(this);
        fabThree.setOnClickListener(this);

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
        fabOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add_session Add_session = new Add_session();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container , Add_session)
                        .addToBackStack(null)
                        .commit();
            }
        });
        fabTwo.setOnClickListener(new View.OnClickListener() {
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
        fabThree.setOnClickListener(new View.OnClickListener() {
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

    private void openMenu() {
        isMenuOpen = !isMenuOpen;
        fabOne.setEnabled(true);
        fabTwo.setEnabled(true);
        fabThree.setEnabled(true);

        fabMain.animate().setInterpolator(interpolator).rotation(45f).setDuration(300).start();

        fabOne.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fabTwo.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fabThree.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();

        layout.setBackgroundResource(R.drawable.layout_bg);



    }
    private void closeMenu() {
        isMenuOpen = !isMenuOpen;
        fabMain.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fabOne.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        fabTwo.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        fabThree.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        layout.setBackgroundResource(R.drawable.layout_bgv2);
        fabOne.setEnabled(false);
        fabTwo.setEnabled(false);
        fabThree.setEnabled(false);
    }
    public void onClick(View view) {



        switch (view.getId()) {
            case R.id.fabMain:
                Log.i(TAG, "onClick: fab main");
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
            case R.id.fabOne:
                Log.i(TAG, "onClick: fab one");
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
            case R.id.fabTwo:
                Log.i(TAG, "onClick: fab two");
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
            case R.id.fabThree:
                Log.i(TAG, "onClick: fab three");
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
        }

    }


}
