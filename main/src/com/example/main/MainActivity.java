package com.example.main;

import android.app.Activity; 
import android.graphics.Rect; 
import android.os.Bundle; 
import android.util.Log; 
import android.view.View; 
import android.view.ViewStub;
import android.view.Window; 


public class MainActivity extends Activity {

    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        SlidingView sv = new SlidingView(this); 
        View2 view = new View2(this);
        View v1 = View.inflate(this, R.layout.activity_main , null); 
        View v2 = View.inflate(this, R.layout.t2, null); 
        View v3 = view;
        View v4 = View.inflate(this, R.layout.main, null);
        sv.addView(v1); 
        sv.addView(v2);
        sv.addView(v3);
        sv.addView(v4);
        setContentView(sv); 
    }
}


