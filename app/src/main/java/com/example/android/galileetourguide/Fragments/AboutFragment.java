package com.example.android.galileetourguide.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.galileetourguide.R;

/**
 * {@link Fragment} that displays a list of info items.
 */
public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.about_view , container , false );
        return rootView;
    }


}