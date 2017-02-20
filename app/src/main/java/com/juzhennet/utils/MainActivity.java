package com.juzhennet.utils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.juzhennet.myutils.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Test().test();
    }
}
