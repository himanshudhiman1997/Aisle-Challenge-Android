package com.example.aislechallenge.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aislechallenge.R;
import com.example.aislechallenge.fragment.DiscoverFragment;

public class HomeActivity extends AppCompatActivity {

    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        token = getIntent().getStringExtra("token");

        getSupportFragmentManager().beginTransaction().add(R.id.home_frame_container, DiscoverFragment.newInstance(token)).commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //close the app
        finishAffinity();
    }
}