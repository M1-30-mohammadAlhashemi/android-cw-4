package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager vp1 = findViewById(R.id.vp);
        TabLayout tl = findViewById(R.id.tap);
        tl.setupWithViewPager(vp1);

        FragmentAdbter adapt = new FragmentAdbter(getSupportFragmentManager());
        vp1.setAdapter(adapt);

        tl.getTabAt(1).setIcon(R.drawable.ic_baseline_home_24);
        tl.getTabAt(0).setIcon(R.drawable.ic_baseline_keyboard_arrow_left_24);
        tl.getTabAt(2).setIcon(R.drawable.ic_round_keyboard_arrow_right_24);





    }
}