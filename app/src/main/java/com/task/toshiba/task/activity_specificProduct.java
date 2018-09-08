package com.task.toshiba.task;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class activity_specificProduct extends AppCompatActivity {
    private ImageView iv_imageProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_product);
        iv_imageProduct=(ImageView)findViewById(R.id.iv_productImage);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        Integer imageResource=getIntent().getIntExtra("imageResource",-1);
   if(imageResource!=-1){
       iv_imageProduct.setImageResource(imageResource);
   }
        // set Name Of Product here :
        actionBar.setTitle("You Tube");
        actionBar.setDisplayHomeAsUpEnabled(true);


    }
}
