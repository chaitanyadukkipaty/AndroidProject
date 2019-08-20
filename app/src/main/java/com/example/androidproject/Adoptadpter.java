package com.example.androidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adoptadpter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<Adopt> mDataset;
    Context context;

    public Adoptadpter(Context context, ArrayList<Adopt>Inputdata){
        this.context = context;
        this.mDataset = Inputdata;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        RecyclerView.ViewHolder vh;
        ConstraintLayout constraintLayout;
        constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.adpot_list,parent,false);
        vh=new Adoptadpter.MessageViewHolder(constraintLayout);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int i){
                ((Adoptadpter.MessageViewHolder) holder).bind(mDataset.get(i));
    }

    @Override
    public int getItemCount(){
        return mDataset.size();
    }


    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        public TextView mNgoname, mAnimalname;

        public MessageViewHolder(ConstraintLayout c) {
            super(c);
            mNgoname = (TextView) c.findViewById(R.id.ngoName);
            mAnimalname = (TextView) c.findViewById(R.id.animalname);
        }

        void bind(Adopt message){
            mNgoname.setText(message.getNgoname());
            mAnimalname.setText(message.getAnimalname());
        }
    }


}
