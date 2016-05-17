package com.mans.earlybirds;

import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.astuetz.PagerSlidingTabStrip;
import com.mans.earlybirds.handler.SectionsPagerAdapter;

public class Activity_Main extends FragmentActivity {
    public static final int LOGIN_REQUEST = 1;

    private PagerSlidingTabStrip mPagerStrip;
    private ViewPager mViewPager;
    private Typeface typeface;

    private SectionsPagerAdapter mSectionPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


 //       actionbar.setTitle(R.string.app_name);
 //       actionbar.setIcon(R.drawable.bird);

        //각 컴포넌트 객체 생성
        mPagerStrip = (PagerSlidingTabStrip)findViewById(R.id.pager_title_strip);
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mSectionPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        //ViewPager에 SectionsPagerAdapter 셋업 후 PagerStrip에 ViewPager 셋업
        mViewPager.setAdapter(mSectionPagerAdapter);
        mPagerStrip.setViewPager(mViewPager);
        mPagerStrip.setShouldExpand(false);

    }
}
