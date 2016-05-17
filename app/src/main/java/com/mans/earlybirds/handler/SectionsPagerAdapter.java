package com.mans.earlybirds.handler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;
import com.mans.earlybirds.ExtraTab;
import com.mans.earlybirds.FriendsTab;
import com.mans.earlybirds.GroupTab;
import com.mans.earlybirds.HomeTab;
import com.mans.earlybirds.R;

/**
 * Created by Mans on 2016-05-17.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider{
    public static final int NUM_OF_TABS = 4;
    private static final int tabIcons[] = {R.drawable.clock_selector, R.drawable.group_selector, R.drawable.bird_selector, R.drawable.etc_selector};


    public SectionsPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeTab();
            case 1:
                return new GroupTab();
            case 2:
                return new FriendsTab();
            case 3:
                return new ExtraTab();
            default:
                ;
        }
        return new HomeTab();
    }

    @Override
    public int getCount() {
        return NUM_OF_TABS;
    }

    @Override
    public int getPageIconResId(int position) {
        return tabIcons[position];
    }
}
