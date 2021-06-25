package com.example.homework7;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    List<OnDoardingModel> list;


    public ViewPagerAdapter(@NonNull FragmentManager fm, List<OnDoardingModel> list) {
        super(fm);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return OnBoardItemFragment.newInstance(list.get(position).getmTitle(), list.get(position).getmDescription(), list.get(position).mImage);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
