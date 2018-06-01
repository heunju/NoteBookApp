package org.androidtown.newjjjproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidtown.newjjjproject.BoardActivity;
import org.androidtown.newjjjproject.DesignBoardActivity;
import org.androidtown.newjjjproject.FreeBoardActivity;
import org.androidtown.newjjjproject.GameBoardActivity;
import org.androidtown.newjjjproject.ProgrammingBoardActivity;
import org.androidtown.newjjjproject.R;

public class FourthFragment extends android.support.v4.app.Fragment{

    ListView list_my;

    public FourthFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //activity_first_fragment 를 인플레이트해 (엑티비티가 아님)
        View view = inflater.inflate(R.layout.activity_fourth_fragment, container, false);
        final String[] MyList = {"위시리스트", "알림", "내 글", "댓글 단 글", "닉네임 변경", "로그아웃", "회원 탈퇴"} ;
        list_my = view.findViewById(R.id.list_my);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MyList);
        list_my.setAdapter(adapter);

        list_my.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos) {
                    case 0 :
                        Intent wish = new Intent(getActivity(), BoardActivity.class);
                        startActivity(wish);
                        break;
                    case 1 :
                        Intent alarm = new Intent(getActivity(), ProgrammingBoardActivity.class);
                        startActivity(alarm);
                        break;
                    case 2 :
                        Intent writing = new Intent(getActivity(), DesignBoardActivity.class);
                        startActivity(writing);
                        break;
                    case 3 :
                        Intent reply = new Intent(getActivity(), GameBoardActivity.class);
                        startActivity(reply);
                        break;
                    case 4 :
                        Intent changeNick = new Intent(getActivity(), FreeBoardActivity.class);
                        startActivity(changeNick);
                        break;
                    case 5 :
                        Intent logout = new Intent(getActivity(), FreeBoardActivity.class);
                        startActivity(logout);
                        break;
                    case 6 :
                        Intent out = new Intent(getActivity(), FreeBoardActivity.class);
                        startActivity(out);
                        break;
                }
            }
        });
        return view;
    }
}
