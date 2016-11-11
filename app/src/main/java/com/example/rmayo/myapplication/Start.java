package com.example.rmayo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by rmayo on 31/10/2016.
 */
public class Start extends Activity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void onButtonClick(View v){
        if(v.getId()==R.id.login){
            Intent i = new Intent(Start.this,MainActivity.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.signup){
            Intent i = new Intent(this,Signup.class);
            startActivity(i);
        }
    }
}
