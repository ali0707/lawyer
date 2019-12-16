package com.example.lawyer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.lawyer.Fragments.Affaire.Affaire;
import com.example.lawyer.Fragments.Book_fragment;
import com.example.lawyer.Fragments.HomeFragment;
import com.example.lawyer.Fragments.Mission.Mission;
import com.example.lawyer.Fragments.lawyers_Fragment;


public class MainActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loading the default fragment
        loadFragment(new HomeFragment());

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_profile1:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_profile2:
                fragment = new Affaire();
                break;


            case R.id.navigation_profile3:
                fragment = new Mission();
                break;

            case R.id.navigation_profile4:
                fragment = new Book_fragment();
                break;

            case R.id.navigation_profile5:
                fragment = new lawyers_Fragment();
                break;


        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
