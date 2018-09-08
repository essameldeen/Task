package com.task.toshiba.task.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.toshiba.task.Adapter.AdapterItems;
import com.task.toshiba.task.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentGames extends Fragment {

    private List<String> items;
    private AdapterItems adapterItems;
    private RecyclerView rv_items;

    public fragmentGames() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.layout_fragment_main, container, false);

        items = new ArrayList<>();
        //
        rv_items=(RecyclerView)view.findViewById(R.id.rv_listOfItems);
        rv_items.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterItems = new AdapterItems(getContext(),items);
        rv_items.setAdapter(adapterItems);
        //
        generateItems();

     return view;
    }
    private void generateItems() {
        String tmp="";
        for (int i = 0 ; i <10 ;i++){
            tmp = "suggestions"+ (i+1);
            items.add(tmp);
        }
        adapterItems.notifyDataSetChanged();
    }

}
