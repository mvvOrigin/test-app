package com.test.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.Feature;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Feature.like();
    }
}
