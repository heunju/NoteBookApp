package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import org.androidtown.newjjjproject.Adapter.RecyclerAdapter;

import java.util.ArrayList;

public class BoardActivity extends AppCompatActivity {


    RecyclerAdapter adapter;

    ImageButton imgbtn_reviewAdd;
    EditText edit_modelName;
    Button btn_search;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        ArrayList<BoardItem> item = new ArrayList<>();

        item.add(new BoardItem(R.id.ratingBar, "",""));

        imgbtn_reviewAdd = findViewById(R.id.imgbtn_addReview);
        edit_modelName = findViewById(R.id.edit_modelName);
        btn_search = findViewById(R.id.btn_search);
        recyclerView = findViewById(R.id.recycler_board);


        adapter = new RecyclerAdapter(this, item);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }




    public void addReview(View view)
    {
        Intent intent = new Intent(this, BoardReviewAddActivity.class);
        startActivity(intent);
    }






}
