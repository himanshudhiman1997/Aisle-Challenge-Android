package com.example.aislechallenge.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aislechallenge.R;
import com.example.aislechallenge.fragment.PhoneNumberFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneNumberFragment fragment = new PhoneNumberFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.login_frame_layout, fragment).commit();


    }
}