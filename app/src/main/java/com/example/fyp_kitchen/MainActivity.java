package com.example.fyp_kitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fyp_kitchen.helper.ImageHelperActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGotoImageActivity(View view) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new string[]{Manifest.permission.READ_EXTERNAL_STORAGE}.requestcode 0);
        }
    }
}