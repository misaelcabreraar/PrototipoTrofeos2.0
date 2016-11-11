package com.example.rmayo.myapplication.mFragments;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.example.rmayo.myapplication.R;

import java.util.ArrayList;

/**
 * Created by rmayo on 23/10/2016.
 */
public class RecordatoriosFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recordatorios,container,false);
        //setContentView
        return rootView;
    }

}
