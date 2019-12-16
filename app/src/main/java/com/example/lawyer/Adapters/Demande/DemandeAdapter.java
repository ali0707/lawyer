package com.example.lawyer.Adapters.Demande;

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

import com.example.lawyer.Fragments.Mission.Detail_mission;
import com.example.lawyer.R;
import com.example.lawyer.entities.demande;
import com.example.lawyer.entities.mission;

import java.util.List;

public class DemandeAdapter extends RecyclerView.Adapter<DemandeAdapter.MyViewHolder> {

    private Context context;
    private List<demande> DemandeList;

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
    public DemandeAdapter(Context context, List<demande> DemandeList) {
        this.context = context;
        this.DemandeList = DemandeList;
    }

    @Override
    public DemandeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.fragment_demande_card, parent, false);
        return new DemandeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final DemandeAdapter.MyViewHolder holder, int pos) {
        final demande Demande = DemandeList.get(pos);
        holder.tvName.setText(Demande.getNomdemande());
        holder.tvPrice.setText(Demande.getPartieConcernee());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, Demande.getPartieConcernee() + Demande.getPartieConcernee(), Toast.LENGTH_LONG);
                toast.show();
                String name = Demande.getNomdemande().toString();
                String cercle = Demande.getPartieConcernee().toString();
                Bundle bundle = new Bundle();
                bundle.putString("name", cercle);
                bundle.putString("cercle", name);

                AppCompatActivity activity = (AppCompatActivity) holder.itemView.getContext();
                Fragment resultFragment = new Detail_mission();
                resultFragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment_container, resultFragment).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return DemandeList.size();
    }
}


