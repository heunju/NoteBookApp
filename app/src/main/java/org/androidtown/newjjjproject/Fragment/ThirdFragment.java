package org.androidtown.newjjjproject.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.androidtown.newjjjproject.R;

public class ThirdFragment extends android.support.v4.app.Fragment {

    public ThirdFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //activity_first_fragment 를 인플레이트해 (엑티비티가 아님)
        View view = inflater.inflate(R.layout.activity_third_fragment, container, false);

        return view;
    }
}
