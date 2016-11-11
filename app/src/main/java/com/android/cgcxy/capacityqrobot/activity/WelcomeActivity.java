package com.android.cgcxy.capacityqrobot.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.cgcxy.capacityqrobot.R;
import com.turing.androidsdk.SDKInit;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        startActivity(new Intent(this,MainActivity.class));
    }
}
