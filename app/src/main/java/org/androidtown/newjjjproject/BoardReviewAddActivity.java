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
    EditText edit_writeReview;
    RatingBar ratingBar_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_review_add);

        initView();

        ratingBar_review.setNumStars(5);
        ratingBar_review.setStepSize((float)0.5);
        ratingBar_review.setRating((float)2.5);
        ratingBar_review.setIsIndicator(false);

        ratingBar_review.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {


            }
        });


    }


    public void initView()
    {
        btn_writeReview = findViewById(R.id.btn_writeReview);
        edit_writeReview = findViewById(R.id.edit_writeReview);
        ratingBar_review = findViewById(R.id.ratingBar_review);
    }


    public void write(View view)
    {
        Intent intent = new Intent(this, BoardActivity.class);
        startActivity(intent);
    }








}
