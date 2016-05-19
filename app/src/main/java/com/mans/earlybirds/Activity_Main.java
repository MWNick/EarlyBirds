package com.mans.earlybirds;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;
import com.mans.earlybirds.handler.SectionsPagerAdapter;

public class Activity_Main extends FragmentActivity {
    public static final int LOGIN_REQUEST = 1;

    private PagerSlidingTabStrip mStrip;
    private ViewPager mPager;
    private SectionsPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //각 컴포넌트 객체 생성
        mStrip = (PagerSlidingTabStrip)findViewById(R.id.pager_title_strip);
        mPager = (ViewPager)findViewById(R.id.pager);
        mAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        //ViewPager에 SectionsPagerAdapter 셋업 후 PagerStrip에 ViewPager 셋업
        mPager.setAdapter(mAdapter);
        mStrip.setViewPager(mPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("MAIN_ACT", "item");
        return super.onOptionsItemSelected(item);
    }
}
