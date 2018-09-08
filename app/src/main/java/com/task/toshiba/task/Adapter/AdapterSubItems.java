package com.task.toshiba.task.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.task.toshiba.task.R;
import com.task.toshiba.task.activity_specificProduct;

import java.util.ArrayList;
import java.util.List;

public class AdapterSubItems extends RecyclerView.Adapter<AdapterSubItems.viewHolder> {
    private Context context;
    private List<String> subTopics;
    private List<Integer>tempPicture;
    public AdapterSubItems(Context context  , List<String>subTopics ) {
        this.context = context;
        this.subTopics=subTopics;
         tempPicture=new ArrayList<>();
         tempPicture.add(R.drawable.contact);
         tempPicture.add(R.drawable.facebook);
         tempPicture.add(R.drawable.drive);
         tempPicture.add(R.drawable.twitter);
         tempPicture.add(R.drawable.youtube);
    }

    @NonNull
    @Override
    public AdapterSubItems.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_single_sub_item,parent,false);
        return new AdapterSubItems.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterSubItems.viewHolder holder, final int position) {
        if(subTopics!=null){
          holder.iv_productImage.setImageResource(tempPicture.get(position%tempPicture.size()));
           holder.iv_productImage.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(context,activity_specificProduct.class);
                   intent.putExtra("imageResource",tempPicture.get(position%tempPicture.size()));
                   android.support.v4.util.Pair <View,String > pair = android.support.v4.util.Pair.create(view,"imageProduct");
                   ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context,pair);
                   context.startActivity(intent,activityOptionsCompat.toBundle());
               }
           });
        }
    }

    @Override
    public int getItemCount() {
        return subTopics.size();
    }

    class  viewHolder extends  RecyclerView.ViewHolder  {
        ImageView iv_productImage;
        android.support.v7.widget.Toolbar toolbar_single_item;
        TextView tv_productSize;
        TextView tv_productName;

        View view;


        public viewHolder(View itemView) {
            super(itemView);
            view=itemView;
            iv_productImage=(ImageView)itemView.findViewById(R.id.iv_productImage);
            tv_productName=(TextView)itemView.findViewById(R.id.tv_productName);
            toolbar_single_item=(android.support.v7.widget.Toolbar)itemView.findViewById(R.id.app_bar_single_item) ;
            tv_productSize=(TextView)itemView.findViewById(R.id.tv_sizeProduct);

            //
            toolbar_single_item.inflateMenu(R.menu.sub_menu);


        }



    }

}
