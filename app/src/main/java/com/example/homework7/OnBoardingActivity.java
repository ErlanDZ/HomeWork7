package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity {

    private ViewPagerAdapter adapter;
    private ViewPager viewPager;
    DotsIndicator dotsIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        viewPager = findViewById(R.id.view_pager);
        dotsIndicator = ( DotsIndicator ) findViewById (R.id.dots_indicator);
        List<OnDoardingModel> list= new ArrayList<>();
        list.add(new OnDoardingModel("Welcome to Surf", "i provide essential stuff for your ui designs every tuesday!",R.drawable.content12));
        list.add(new OnDoardingModel("Design Template uploads Every Tuesday", "Make sure take a look my uplab profile every tuesday", R.drawable.cont));
        list.add(new OnDoardingModel("Download now!", "You can follow me if you wantand comment on any.to get some freebies", R.drawable.co));

        adapter = new ViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
        dotsIndicator.setViewPager (viewPager);




    }
}