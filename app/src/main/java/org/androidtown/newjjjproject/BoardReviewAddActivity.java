package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class BoardReviewAddActivity extends AppCompatActivity {

    Button btn_writeReview;
    EditText edit_wirteReview;
    RatingBar ratingBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_review_add);

        initview();
    }

    public void initview()
    {
        btn_writeReview = findViewById(R.id.btn_wirteReview);
        edit_wirteReview = findViewById(R.id.edit_wirteReview);
        ratingBar2 = findViewById(R.id.ratingBar2);
    }



    public void write(View view)
    {
        Intent intent = new Intent(this, BoardActivity.class);
        startActivity(intent);
    }





}
