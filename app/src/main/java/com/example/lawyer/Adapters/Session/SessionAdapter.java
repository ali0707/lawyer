package com.example.lawyer.Adapters.Session;

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
import com.example.lawyer.R;
import com.example.lawyer.entities.session;



import java.util.List;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.MyViewHolder> {

    private Context context;
    private List<session> SessionList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView imvPhone;
        TextView tvName, tvPrice;

        public MyViewHolder(final View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.textTitle1);
            tvPrice = itemView.findViewById(R.id.textDesc1);
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

    public SessionAdapter (Context context, List<session> SessionList) {
        this.context = context;
        this.SessionList = SessionList;
    }

    @Override
    public SessionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.fragment_session_cad, parent, false);
        return new SessionAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final SessionAdapter.MyViewHolder holder, int pos) {
        final session Session = SessionList.get(pos);
        holder.tvName.setText(Session.getNomSession());
        holder.tvPrice.setText(Session.getNotes());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(context,Session.getNomSession() + " , NTD : " + Session.getNotes(),Toast.LENGTH_LONG);
                toast.show();
                String name=Session.getNomSession().toString();
                String cercle=Session.getNotes().toString();
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
        return SessionList.size();
    }


}