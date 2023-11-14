package com.example.scrolltab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPageId);
        FragmentManager fragmentManager=getSupportFragmentManager();
        CustomAdapt adapt=new CustomAdapt(fragmentManager);
        viewPager.setAdapter(adapt);


    }
    class CustomAdapt extends FragmentPagerAdapter {
        public CustomAdapt(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            Fragment fragment=null;
            if(position==0)
            {
                fragment=new FragmentOne();
            }
            if(position==1)
            {
                fragment=new FragmentTwo();
            }
            if(position==2)
            {
                fragment=new FragmentThree();
            }
            return fragment;
        }


        public int getCount() {
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int position)
        {
            if(position==0)
            {
                return "tab1";
            }
            else if(position==1)
            {
                return "tab2";

            }
            if(position==2)
            {
                return "tab3";

            }
            return null;
        }
    }


}