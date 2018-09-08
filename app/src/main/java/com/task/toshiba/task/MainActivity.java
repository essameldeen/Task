package com.task.toshiba.task;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toolbar;

import com.task.toshiba.task.Adapter.FragmentAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabs;
    private FragmentAdapter adapterFragment;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.mainPage);
        tabs=(TabLayout)findViewById(R.id.tabs);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        adapterFragment=new FragmentAdapter(getSupportFragmentManager() );
        viewPager.setAdapter(adapterFragment);
        tabs.setupWithViewPager(viewPager);


        // Set Up Custom ToolBar
        android.support.v7.widget.Toolbar mToolBar = (android.support.v7.widget.Toolbar)findViewById(R.id.my_toolbar_main);
        setSupportActionBar(mToolBar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View actionBarView = inflater.inflate(R.layout.layout_custom_app_bar,null);
        actionBar.setCustomView(actionBarView);

       //

    }

}
