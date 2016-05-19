package com.mans.earlybirds;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mans on 2016-05-17.
 */
public class GroupTab extends Fragment {
    public static final String TITLE = "Groups";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TITLE, "Create View");
        View rootView = inflater.inflate(R.layout.fragment_group, container, false);

        return rootView;
    }

}
