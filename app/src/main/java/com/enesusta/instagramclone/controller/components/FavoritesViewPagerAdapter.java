package com.enesusta.instagramclone.controller.components;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FavoritesViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();

    public FavoritesViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }

    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);
    }


    public void AddFragment(Fragment fragment, String Title) {
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }


}