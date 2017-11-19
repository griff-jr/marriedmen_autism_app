package com.marriedmen.autismapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected DBHelper mDBHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDBHelper = new DBHelper(this);


        //TextView text = (TextView) findViewById(R.id.textView);
        //text.setText("testing");
        //profileObj fakeprofile = new profileObj("Jeffery Dahmer", "was a very bad man");
        //profileObj fakeprofile2 = new profileObj("Chistopher Scarver", "Killed Jeff");

    }

    public void startActivity_2(View v) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}