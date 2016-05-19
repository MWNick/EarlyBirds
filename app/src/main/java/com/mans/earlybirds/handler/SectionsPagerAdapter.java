package com.mans.earlybirds.handler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

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
    private static final int TAB_ICONS[] = {R.drawable.clock_selector, R.drawable.group_selector, R.drawable.bird_selector, R.drawable.etc_selector};


    public SectionsPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Log.d("SectionsPagerAdapter","Home");
                return new HomeTab();
            case 1:
                Log.d("SectionsPagerAdapter","Group");
                return new GroupTab();
            case 2:
                Log.d("SectionsPagerAdapter","Friends");
                return new FriendsTab();
            case 3:
                Log.d("SectionsPagerAdapter","ETC");
                return new ExtraTab();
            default:
                ;
        }
        return new HomeTab();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "ABC";
    }

    @Override
    public int getCount() {return TAB_ICONS.length ; }

    @Override
    public int getPageIconResId(int position) {
        return TAB_ICONS[position];
    }
}
