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

public class SecondFragment extends android.support.v4.app.Fragment{

    ListView list_board;


    public SecondFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_second_fragment, container, false);
        final String[] MenuList = {"구매 후기 및 평가", "프로그래밍 게시판", "디자인 게시판", "게임 게시판", "자유 게시판"} ;
        list_board = view.findViewById(R.id.list_board);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MenuList);
        list_board.setAdapter(adapter);

        list_board.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos) {
                    case 0 :
                        Intent review = new Intent(getActivity(), BoardActivity.class);
                        startActivity(review);
                        break;
                    case 1 :
                        Intent programming = new Intent(getActivity(), ProgrammingBoardActivity.class);
                        startActivity(programming);
                        break;
                    case 2 :
                        Intent design = new Intent(getActivity(), DesignBoardActivity.class);
                        startActivity(design);
                        break;
                    case 3 :
                        Intent game = new Intent(getActivity(), GameBoardActivity.class);
                        startActivity(game);
                        break;
                    case 4 :
                        Intent free = new Intent(getActivity(), FreeBoardActivity.class);
                        startActivity(free);
                        break;
                }
            }

        });
        return view;
    }

}
