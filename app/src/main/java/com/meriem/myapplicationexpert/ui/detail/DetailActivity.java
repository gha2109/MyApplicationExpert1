package com.meriem.myapplicationexpert.ui.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.meriem.myapplicationexpert.R;
import com.meriem.myapplicationexpert.ui.InterventionDetail.interventionDetailFragment;
import com.meriem.myapplicationexpert.ui.slideshow.CameraFragment;

public class DetailActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        tabLayout = findViewById(R.id.detail);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);
        adapterdetail adapterdetail = new adapterdetail(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapterdetail.addFragment(new interventionDetailFragment(),"detais");
        adapterdetail.addFragment(new CameraFragment(),"fichier");
        viewPager.setAdapter(adapterdetail);

    }}