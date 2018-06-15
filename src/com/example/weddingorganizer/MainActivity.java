package com.example.weddingorganizer;


import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask tt=new TimerTask()
        {
        	public void run()
        {
         Intent intent=new Intent(MainActivity.this,MainActivity1.class);
         startActivity(intent);
         
        }
        };
        Timer timer=new Timer();
        timer.schedule(tt,3000);
        
    }


    
    
}

