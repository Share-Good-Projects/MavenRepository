package com.share.maven.repository;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maven.nativerep.NativeRepoTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NativeRepoTest.Toast(this);
    }
}
