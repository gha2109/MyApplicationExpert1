package com.meriem.myapplicationexpert.ui.detail;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class adapterdetail extends FragmentPagerAdapter {
    private final ArrayList<Fragment>fragmentArrayList = new ArrayList<>();
    private final  ArrayList<String> fragmenttitle = new ArrayList<>();

    public adapterdetail(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
    public void addFragment(Fragment fragment,String title){
fragmentArrayList.add(fragment);
fragmenttitle.add(title);


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenttitle.get(position);
    }
}
