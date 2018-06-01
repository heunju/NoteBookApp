package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progressbar4Activity extends AppCompatActivity {
    private ProgressBar progressBar4;
    private TextView text_design;
    private Button btn_design1;
    private Button btn_design2;
    private Button btn_design3;
    private Button btn_design4;
    private Button btn_design5;
    private Button btn_design6;
    private ImageButton imgbtn_back4;
    private ImageButton imgbtn_front4;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar4);
        initView();
    }

    private void initView() {
        progressBar4 = findViewById(R.id.progressBar4);
        text_design = findViewById(R.id.text_design);
        btn_design1 = findViewById(R.id.btn_design1);
        btn_design2 = findViewById(R.id.btn_design2);
        btn_design3 = findViewById(R.id.btn_design3);
        btn_design4 = findViewById(R.id.btn_design4);
        btn_design5 = findViewById(R.id.btn_design5);
        btn_design6 = findViewById(R.id.btn_design6);
        imgbtn_back4 = findViewById(R.id.imgbtn_back4);
        imgbtn_front4 = findViewById(R.id.imgbtn_front4);
    }

    public void btn_design1(View v) {
       progressBar4.setProgress(100);
    }

    public void btn_design2(View v) {
        progressBar4.setProgress(100);
    }

    public void btn_design3(View v) {
        progressBar4.setProgress(100);
    }

    public void btn_design4(View v) {
        progressBar4.setProgress(100);
    }

    public void btn_design5(View v) {
        progressBar4.setProgress(100);
    }

    public void btn_design6(View v) {
        progressBar4.setProgress(100);
    }

    public void back4(View v) {
        Intent intent = new Intent(this, Progressbar3Activity.class);
        startActivity(intent);
        imgbtn_back4 = findViewById(R.id.imgbtn_back4);

        //프로그레스바 줄어드는 것
        new CountDownTimer(7 * 1000, 1) {
            @Override
            public void onTick(long l) {
                progressBar4.setProgress((int) (100 * l) / 1000);
            }
            @Override
            public void onFinish() {
            }
        };
    }

    public void front4(View view){
        Intent intent = new Intent(this, Progressbar4Activity.class); // 노트북 결과 나오는 화면 나중에 intent!!
        startActivity(intent);
        progressBar4.setProgress(100);

    }

}
