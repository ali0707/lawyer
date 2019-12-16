package com.example.lawyer.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.lawyer.Fragments.Affaire.ResultFragment;
import com.example.lawyer.Fragments.detail_affaire;
import com.example.lawyer.R;
import com.example.lawyer.entities.affaire;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<affaire> affaireList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView imvPhone;
        TextView tvName, tvPrice;

        public MyViewHolder(final View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.textTitle);
            tvPrice = itemView.findViewById(R.id.textDesc2);
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

    public MyAdapter(Context context, List<affaire> affaireList) {
        this.context = context;
        this.affaireList = affaireList;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.fragment_job, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyAdapter.MyViewHolder holder, int pos) {
        final affaire Affaire = affaireList.get(pos);
        holder.tvName.setText(Affaire.getEtat());
        holder.tvPrice.setText(Affaire.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(context,Affaire.getName() + " , NTD : " + Affaire.getEtat(),Toast.LENGTH_LONG);
                toast.show();
                String name=Affaire.getEtat().toString();
                String cercle=Affaire.getName().toString();
                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("cercle",cercle);

                AppCompatActivity activity=(AppCompatActivity) holder.itemView.getContext();
                Fragment resultFragment=new ResultFragment();
                resultFragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment_container,resultFragment).commit();

            }
        });

    }

    @Override
    public int getItemCount() {

        return affaireList.size();
    }


}
