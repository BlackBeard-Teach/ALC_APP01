package com.blackbeard.androidphase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DevInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_info);
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
