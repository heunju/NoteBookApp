package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progressbar2Activity extends AppCompatActivity {
    private ProgressBar progressBar2;
    private TextView text_price;
    private Button btn_price1;
    private Button btn_price2;
    private Button btn_price3;
    private Button btn_price4;
    private Button btn_price5;
    private Button btn_price6;
    private ImageButton imgbtn_back2;
    private ImageButton imgbtn_front2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar2);
        initView();
    }

    private void initView() {
        progressBar2 = findViewById(R.id.progressBar2);
        text_price = findViewById(R.id.text_price);
        btn_price1 = findViewById(R.id.btn_price1);
        btn_price2 = findViewById(R.id.btn_price2);
        btn_price3 = findViewById(R.id.btn_price3);
        btn_price4 = findViewById(R.id.btn_price4);
        btn_price5 = findViewById(R.id.btn_price5);
        btn_price6 = findViewById(R.id.btn_price6);
        imgbtn_back2 = findViewById(R.id.imgbtn_back2);
        imgbtn_front2 = findViewById(R.id.imgbtn_front2);
    }

    public void btn_price1(View v){
        progressBar2.setProgress(50);
    }

    public void btn_price2(View v){
        progressBar2.setProgress(50);
    }

    public void btn_price3(View v){
        progressBar2.setProgress(50);
    }

    public void btn_price4(View v){
        progressBar2.setProgress(50);
    }

    public void btn_price5(View v){
        progressBar2.setProgress(50);
    }

    public void btn_price6(View v){
        progressBar2.setProgress(50);
    }

    public void back2(View view){
        Intent intent = new Intent(this, Progressbar1Activity.class);
        startActivity(intent);

    }

    public void front2(View view){
        Intent intent = new Intent(this, Progressbar3Activity.class);
        startActivity(intent);
        //progressBar2.setProgress(50);


    }
}
