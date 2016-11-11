package com.example.rmayo.myapplication.mFragments;

import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rmayo.myapplication.R;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.util.Locale;

/**
 * Created by rmayo on 23/10/2016.
 */
public class CalendarioFragment extends Fragment {

    //CompactCalendarView compactCalendar;
    //private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendario,container,false);
        //compactCalendar = (CompactCalendarView) findView
        return rootView;
    }
}
