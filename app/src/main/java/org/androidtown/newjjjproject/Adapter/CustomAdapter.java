package org.androidtown.newjjjproject.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.androidtown.newjjjproject.Fragment.FirstFragment;
import org.androidtown.newjjjproject.Fragment.FourthFragment;
import org.androidtown.newjjjproject.Fragment.SecondFragment;
import org.androidtown.newjjjproject.Fragment.ThirdFragment;

/**
 * Created by jikur on 2018-03-26.
 */


//viewPager 와 TabLayout 을 연결해주는 CustomAdapter
public class CustomAdapter extends FragmentStatePagerAdapter {

    private static int COUNT=4;

    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case  0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourthFragment();
            default:
                return new FirstFragment();
        }
    }

    //fragment 가 몇 개 들어가있는가?
    @Override
    public int getCount() {
        return COUNT;
    }
}
