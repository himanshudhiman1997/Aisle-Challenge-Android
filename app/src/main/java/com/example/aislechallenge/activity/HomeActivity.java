package com.example.aislechallenge.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.aislechallenge.R;
import com.example.aislechallenge.fragment.DiscoverFragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationMenuView bottomNavigationMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String token = getIntent().getStringExtra("token");

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationMenuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);

        setBadge(1, "9");
        setBadge(2, "50+");


        getSupportFragmentManager().beginTransaction().add(R.id.home_frame_container, DiscoverFragment.newInstance(token)).commit();
    }

    private void setBadge(int i, String badgeText) {
        View v = bottomNavigationMenuView.getChildAt(i);
        BottomNavigationItemView itemView = (BottomNavigationItemView) v;

        View badge = LayoutInflater.from(this)
                .inflate(R.layout.notification_badge, itemView, true);
        TextView badgeTextView = badge.findViewById(R.id.notifications_badge);
        badgeTextView.setText(badgeText);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //close the app
        finishAffinity();
    }
}