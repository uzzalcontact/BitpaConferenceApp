package com.example.uzzal.bitpawebsite_app;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

         //* set Action bar title

      ActionBar actionBar = getSupportActionBar();
      actionBar.setTitle("About App");
    }
}
