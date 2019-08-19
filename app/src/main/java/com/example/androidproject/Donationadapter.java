package com.example.androidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Donationadapter extends RecyclerView.Adapter<Donationadapter.MyHolder> {
    Context context;
    ArrayList<NGO> ngos;

    public Donationadapter(Context context, ArrayList<NGO> ngos) {
        this.context = context;
        this.ngos = ngos;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.donation_list, viewGroup, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myholder, int i) {
        myholder.ngoname.setText(ngos.get(i).getngoname());
        myholder.ngolocation.setText(ngos.get(i).getngolocation());
    }

    @Override
    public int getItemCount() {

        return ngos.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        TextView ngoname, ngolocation;

        private MyHolder(@NonNull View itemView) {
            super(itemView);
            ngoname = itemView.findViewById(R.id.ngoname);
            ngolocation = itemView.findViewById(R.id.ngolocation);
        }
    }
}
