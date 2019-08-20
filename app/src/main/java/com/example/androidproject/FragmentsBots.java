package com.example.androidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentsBots extends Fragment {
    public static final int message_query = 1;
    public static final int message_send = 2;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    BotAdapter botAdapter;
    ArrayList<Message> list;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        linearlist();
        View rootView = inflater.inflate(R.layout.fragment_bots,container,false);
        recyclerView = rootView.findViewById(R.id.messagerecyclerview);
        recyclerView.hasFixedSize();
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        botAdapter = new BotAdapter(getActivity(),this.list);
        recyclerView.setAdapter(botAdapter);
        return rootView;
    }

    private void linearlist(){
        list = new ArrayList<Message>();
        list.add(new Message("Hey",2));
        list.add(new Message("Hello, Welcome",1));
    }
}
