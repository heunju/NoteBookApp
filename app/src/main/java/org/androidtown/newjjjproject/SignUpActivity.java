package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {

    private boolean email = false;
    private boolean pw = false;
    private boolean checkPw = false;
    private EditText edit_email;
    private EditText edit_pw;
    private EditText edit_checkPw;
    private Button btn_singIn;
    private Button btn_addProfile;
    private ImageView img_email;
    private ImageView img_pw;
    private ImageView img_checkPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initView();
        initListener();
    }

    private void initView() {
        edit_email = findViewById(R.id.edit_email);
        edit_pw = findViewById(R.id.edit_pw);
        edit_checkPw = findViewById(R.id.edit_checkPw);
        btn_singIn = findViewById(R.id.btn_singIn);
        btn_addProfile =  findViewById(R.id.btn_addProfile);
        img_email = findViewById(R.id.img_email);
        img_pw = findViewById(R.id.img_pw);
        img_checkPw = findViewById(R.id.img_checkPw);
    }

    private void initListener() {

        //이메일
        edit_email.addTextChangedListener(new TextWatcher() {
            @Override //텍스트 입력하기 전
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override //입력되는 텍스트에 변화가 있을 때
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (checkEmail(charSequence.toString()) != true) {
                    img_email.setVisibility(View.VISIBLE);
                    email = false;
                    enableLogin(email, pw, checkPw);
                } else {
                    img_email.setVisibility(View.INVISIBLE);
                    email = true;
                    enableLogin(email, pw, checkPw);
                }
            }

            @Override //텍스트 입력이 끝났을 때
            public void afterTextChanged(Editable editable) {
                if (editable.toString().equals("")) {
                    img_email.setVisibility(View.INVISIBLE);
                    email = false;
                    enableLogin(email, pw, checkPw);
                }
            }
        });


        //비밀번호
        edit_pw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (checkPw(charSequence.toString()) != true) {
                    img_pw.setVisibility(View.VISIBLE);
                    pw = false;
                    enableLogin(email, pw, checkPw);
                } else {
                    img_pw.setVisibility(View.INVISIBLE);
                    pw = true;
                    enableLogin(email, pw, checkPw);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (editable.toString().equals("")) {
                    img_pw.setVisibility(View.INVISIBLE);
                    pw = false;
                    enableLogin(email, pw, checkPw);
                }
            }
        });



        //비밀번호체크
        edit_checkPw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().equals(edit_pw.getText().toString()))
                {
                    img_checkPw.setVisibility(View.INVISIBLE);
                    checkPw=true;
                    enableLogin(email, pw, checkPw);
                }
                else
                {
                    img_checkPw.setVisibility(View.VISIBLE);
                    checkPw=false;
                    enableLogin(email, pw, checkPw);
                }
            }
        });
    }


    //enableLogin 메소드 선언
    private void enableLogin(boolean email, boolean pw, boolean checkPw) {
        if (email && pw && checkPw == true) {
            btn_singIn.setEnabled(true); //singIn 버튼 활성화
        } else {
            btn_singIn.setEnabled(false); //singIn 버튼 비활성화
        }
    }

    //checkEamil 메소드 선언
    private boolean checkEmail(String email) {
        String regex = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean isNormal = m.matches();
        return isNormal;
    }

    //checkPw 메소드 선언
    private boolean checkPw(String str) {
        String Password_PATTERN = "^(?=.*[a-zA-Z]+)(?=.*[0-9]+).{8,16}$";
        Pattern pattern = Pattern.compile(Password_PATTERN);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    //SignIp Activity 로 전환
    public void signIn(View v) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    //Add Profile Activity 로 전환
    public void addProfile(View v) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
