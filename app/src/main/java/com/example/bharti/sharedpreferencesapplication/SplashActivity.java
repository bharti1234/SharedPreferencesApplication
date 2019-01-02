package com.example.bharti.sharedpreferencesapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread th = new Thread(){
            public void run()
            {
                try
                {
                    Thread.sleep(4000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent intent = new Intent(SplashActivity.this,FirstActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                }
            }
        };
        th.start();
    }

}

