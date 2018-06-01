package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button btn_login;
    private Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        imageView = findViewById(R.id.imageView);
        btn_login = findViewById(R.id.btn_login);
        btn_signUp = findViewById(R.id.btn_signUp);
    }

    public void login(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void signUp(View v){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}