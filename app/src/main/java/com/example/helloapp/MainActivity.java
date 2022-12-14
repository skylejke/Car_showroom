package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSkyline(View view) {
        Intent intent = new Intent(this, Skyline.class);
        startActivity(intent);
    }

    public void startSupra(View view) {
        Intent intent = new Intent(this, Supra.class);
        startActivity(intent);
    }

    public void startRX7(View view) {
        Intent intent = new Intent(this, Rx7.class);
        startActivity(intent);
    }
}