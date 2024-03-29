package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
 
public class SplashActivity extends Activity {   
 
    private final int SPLASH_DISPLAY_LENGHT = 2000; //延迟三秒 
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable(){
 
         @Override
         public void run() {
             Intent mainIntent = new Intent(SplashActivity.this,CaptureActivity.class);
             SplashActivity.this.startActivity(mainIntent);
             SplashActivity.this.finish();
         }
           
        }, SPLASH_DISPLAY_LENGHT);
    }
}
