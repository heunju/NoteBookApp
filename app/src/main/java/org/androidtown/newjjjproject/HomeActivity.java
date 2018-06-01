package org.androidtown.newjjjproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import java.util.ArrayList;

import org.androidtown.newjjjproject.Adapter.CustomAdapter;

public class HomeActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        setAdapter();
        setListener();
    }

    public void initView()
    {
        viewPager = findViewById(R.id.viewPager_home);
        tabLayout = findViewById(R.id.tabLayout);
    }

    public void setAdapter()
    {
        CustomAdapter customAdapter = new CustomAdapter(getSupportFragmentManager()); //fragment 에 접근
        viewPager.setAdapter(customAdapter);
    }

    public void setListener()
    {
        //탭 버튼을 눌렀을 때 뷰 페이저 바꾸기
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}