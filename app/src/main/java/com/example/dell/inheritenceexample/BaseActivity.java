package com.example.dell.inheritenceexample;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Dell on 4/30/2017.
 */
public class BaseActivity extends AppCompatActivity implements InternetCheck {

    boolean status = false;

    @Override
    protected void onResume() {
        status = isNetworkConnected();
        if (status) {
            on();
        } else {
            off();
        }
        super.onResume();
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }


    @Override
    public void on() {
        Toast.makeText(getApplicationContext(), "on is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void off() {
        startActivity(new Intent(getApplicationContext(), NetworkNotAvail.class));
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(BaseActivity.this, "onback called", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
}
