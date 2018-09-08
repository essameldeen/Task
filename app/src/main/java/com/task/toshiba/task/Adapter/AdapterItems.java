package com.task.toshiba.task.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.task.toshiba.task.MainActivity;
import com.task.toshiba.task.R;
import com.task.toshiba.task.activity_specificProduct;

import java.util.List;

public class AdapterItems extends RecyclerView.Adapter<AdapterItems.viewHolder>  {
    private Context context;
    private List<String> topics;
    private AdapterSubItems adapterSubItems;
    private LinearLayoutManager layoutManager;
    public AdapterItems(Context context  , List<String>topics) {
        this.context = context;
        this.topics=topics;
        adapterSubItems = new AdapterSubItems(context,topics);

        // make recycle Scroll horizontal


    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_single_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final viewHolder holder, int position) {
      if(topics!=null){
          holder.tv_label.setText(topics.get(position));
      }

      //holder.rv_subItems.setLayoutManager(layoutManager);
      holder.rv_subItems.setAdapter(adapterSubItems);
      adapterSubItems.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }
    class  viewHolder extends  RecyclerView.ViewHolder{
        TextView tv_label;
        TextView tv_more;
        RecyclerView rv_subItems;



        public viewHolder(View itemView) {
            super(itemView);
            layoutManager= new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

            tv_label=(TextView)itemView.findViewById(R.id.tv_label);
            tv_more=(TextView)itemView.findViewById(R.id.tv_more);
            rv_subItems= (RecyclerView)itemView.findViewById(R.id.rv_subItems);

            rv_subItems.setLayoutManager(layoutManager);
        }
    }

}
