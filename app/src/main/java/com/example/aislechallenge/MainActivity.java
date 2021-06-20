package com.example.aislechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneNumberFragment fragment = new PhoneNumberFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.login_frame_layout, fragment).commit();


    }
}