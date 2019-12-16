package com.example.lawyer.Adapters.Mission;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lawyer.Fragments.Affaire.ResultFragment;

import com.example.lawyer.Fragments.Mission.Detail_mission;
import com.example.lawyer.R;
import com.example.lawyer.entities.mission;

import java.util.List;

public class MissionAdapter extends RecyclerView.Adapter<MissionAdapter.MyViewHolder> {

    private Context context;
    private List<mission> MissionList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvPrice;

        public MyViewHolder(final View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.textTitle3);
            tvPrice = itemView.findViewById(R.id.textDesc3);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    String name=tvName.getText().toString();
//                    String price=tvPrice.getText().toString();
//                    Bundle bundle=new Bundle();
//                    bundle.putString("name",name);
//                    bundle.putString("price",price);
//
//
//
//                }
//            });
        }
    }

    public MissionAdapter (Context context, List<mission> MissionList) {
        this.context = context;
        this.MissionList = MissionList;
    }

    @Override
    public MissionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.fragment_mission_card, parent, false);
        return new MissionAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MissionAdapter.MyViewHolder holder, int pos) {
        final mission Mission = MissionList.get(pos);
        holder.tvName.setText(Mission.getNommission());
        holder.tvPrice.setText(Mission.getDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(context,Mission.getNommission() + Mission.getDate(),Toast.LENGTH_LONG);
                toast.show();
                String name=Mission.getNommission().toString();
                String cercle=Mission.getDate().toString();
                Bundle bundle=new Bundle();
                bundle.putString("name",cercle);
                bundle.putString("cercle",name);

                AppCompatActivity activity=(AppCompatActivity) holder.itemView.getContext();
                Fragment resultFragment=new Detail_mission();
                resultFragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment_container,resultFragment).commit();
            }
        });
    }
    @Override
    public int getItemCount() {
        return MissionList.size();
    }


}