package com.example.bharti.sharedpreferencesapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {

    EditText t3,t4;
    public static final String DEFAULT = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t3=(EditText)findViewById(R.id.editText3);
        t4=(EditText)findViewById(R.id.editText4);
    }

    public void fetch(View view) {
        SharedPreferences pref = getSharedPreferences("Xyz", Context.MODE_PRIVATE);
        String userName = pref.getString("uname",DEFAULT);
        String userPassword = pref.getString("upass",DEFAULT);
        if(userName==DEFAULT || userPassword==DEFAULT)
        {
            Toast.makeText(this,"Sorry! Nothing is found!",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Hurray! Your record is found!",Toast.LENGTH_LONG).show();
            t3.setText(userName);
            t4.setText(userPassword);
        }

    }

    public void back(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);

    }
}
