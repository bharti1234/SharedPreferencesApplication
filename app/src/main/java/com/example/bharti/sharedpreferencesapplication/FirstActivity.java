package com.example.bharti.sharedpreferencesapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends Activity {

    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
    }

    public void save(View view) {

        //Obtaining object of SharedPreferences
        SharedPreferences preferences = getSharedPreferences("Xyz", Context.MODE_PRIVATE);
        //Obtaining object of Editor
        SharedPreferences.Editor editor = preferences.edit();
        //Now call put methods to store or write information
        editor.putString("uname",t1.getText().toString());
        editor.putString("upass",t2.getText().toString());
        //Now commit the editor
        editor.commit();
        Toast.makeText(this,"Login details are successfully saved!",Toast.LENGTH_LONG).show();


    }

    public void next(View view) {

        Intent intent = new Intent(this,SecondActivity.class);
        Toast.makeText(this,"Ok, Second Activity is going to load...",Toast.LENGTH_SHORT).show();
        startActivity(intent);


    }
}
