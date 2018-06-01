package org.androidtown.newjjjproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.androidtown.newjjjproject.Progressbar1Activity;
import org.androidtown.newjjjproject.R;

public class FirstFragment extends Fragment {


    Button btnStart;

    public FirstFragment()
    {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //activity_first_fragment 를 인플레이트해 (엑티비티가 아님)
        View view = inflater.inflate(R.layout.activity_first_fragment, container, false);

        btnStart = (Button) view.findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Progressbar1Activity.class);
                startActivity(intent);
            }
        });

        return view;
    }



}
