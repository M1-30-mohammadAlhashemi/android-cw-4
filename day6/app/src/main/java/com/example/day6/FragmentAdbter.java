package com.example.day6;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.day6.fragmint.Fragment1;
import com.example.day6.fragmint.Fragment2;
import com.example.day6.fragmint.Fragment3;

public class  FragmentAdbter extends FragmentPagerAdapter {


    public FragmentAdbter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public FragmentAdbter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
