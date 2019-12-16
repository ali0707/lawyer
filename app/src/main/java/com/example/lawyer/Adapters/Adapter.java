package com.example.lawyer.Adapters;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;



    public Adapter(Context context, List<String> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.fragment_job,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        // bind the textview with data received

        String title = data.get(i);
        viewHolder.textTitle.setText(title);

        // similarly you can set new image for each card and descriptions



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle,textDescription;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AppCompatActivity activity=(AppCompatActivity) itemView.getContext();
                    Fragment resultFragment=new detail_affaire();
                   // resultFragment.setArguments(bundle);
                    activity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.content,resultFragment).commit();

                }
            });
            textTitle = itemView.findViewById(R.id.textTitle);
            textDescription = itemView.findViewById(R.id.textDesc);
        }


    }
}
