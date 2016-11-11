package com.example.rmayo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by rmayo on 31/10/2016.
 */
public class Signup extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onButtonClick1(View v){
        if(v.getId()==R.id.createAccount){
            Intent k = new Intent(Signup.this,MainActivity.class);
            startActivity(k);
        }
        if(v.getId()==R.id.sLogin){
            Intent l = new Intent(Signup.this,Start.class);
            startActivity(l);
        }
    }
}
