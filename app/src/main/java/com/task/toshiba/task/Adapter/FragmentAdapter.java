package com.task.toshiba.task.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.task.toshiba.task.fragment.fragmentGames;
import com.task.toshiba.task.fragment.fragmentMain;

public class FragmentAdapter extends FragmentStatePagerAdapter {


    public FragmentAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragmentMain main = new fragmentMain();
                return main;
            case 1:
                fragmentGames  games = new fragmentGames();
                return games;
            case 2:
                fragmentMain news = new fragmentMain();
                return news;
            case 3:
                fragmentGames  sports = new fragmentGames();
                return sports;
            case 4:
                fragmentMain weather = new fragmentMain();
                return weather;
            case 5:
                fragmentGames  food = new fragmentGames();
                return food;
            case 6:
                fragmentGames  movies = new fragmentGames();
                return movies;
                default:
                    return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "MAIN";
            case 1:
                return "GAMES";
            case 2:
                return "MOVIES";
            case 3:
                return "NEWS";
            case 4:
                return "FOODS";
            case 5:
                return "WEATHERS";
            case 6:
                return "FOODS";
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 6;
    }
}
