package com.example.dell.inheritenceexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NetworkNotAvail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_not_avail);


    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);

    }
}
