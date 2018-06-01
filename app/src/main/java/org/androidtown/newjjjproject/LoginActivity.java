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
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    private TextView text_login;
    private TextView text_id;
    private TextView text_pw;
    private EditText edit_id;
    private EditText edit_pw;
    private Button btn_enter;
    private Button btn_findPw;
    private ImageView img_email;
    private ImageView img_pw;
    private boolean checkId = false; // 아이디가 맞냐 틀리냐 보는 거 -> 처음엔 아무것도 안적힌 상태일테니까 초기값은 false로 해둔다.
    private boolean checkPw = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initListener();
    }

    private void initView() {
        text_login = findViewById(R.id.text_login);
        text_id = findViewById(R.id.text_id);
        text_pw = findViewById(R.id.text_pw);
        edit_id = findViewById(R.id.edit_id);
        edit_pw = findViewById(R.id.edit_pw);
        btn_enter = findViewById(R.id.btn_enter);
        btn_findPw = findViewById(R.id.btn_findPw);
        btn_enter.setEnabled(false);
        img_email = findViewById(R.id.img_email);
        img_pw = findViewById(R.id.img_pw);
        // 초기에 id  != pw 일 때 버튼 안눌리도록 하는 것, 로그인 불가하게 만드는 것
    }

    private void initListener() { // 유저가 무엇을 누르거나 했을 때, 그 반응을 보는 함수
        edit_id.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(checkEmail(charSequence.toString())==false) {
                    img_email.setVisibility(View.VISIBLE);
                    checkId = false;
                    enableButton(checkId, checkPw);
                }
                else
                    img_email.setVisibility(View.INVISIBLE);
                    checkId = true;
                    enableButton(checkId, checkPw);
                }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().equals("")){
                    img_email.setVisibility(View.INVISIBLE);
                    checkId = false;
                    enableButton(checkId, checkPw);
                }
            }
        });

        edit_pw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!checkPassword(charSequence.toString())){
                    img_pw.setVisibility(View.VISIBLE);
                    checkPw = false;
                    enableButton(checkId, checkPw);
                }
                else
                    img_pw.setVisibility(View.INVISIBLE);
                    checkPw = true;
                    enableButton(checkId, checkPw);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().equals("")){
                    img_pw.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private boolean checkEmail(String s) { // 이메일 형식이 맞는지 체크해주는 함수
        String regex = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean isNormal = m.matches();
        return isNormal;
    }

    private void enableButton(boolean id, boolean pw){ // id = pw라서 로그인 버튼이 눌리냐, 안눌리냐를 판가름해주는 함수
        if( id == pw ) {
            btn_enter.setEnabled(true);
        }
        else
            btn_enter.setEnabled(false);
    }

    /*public void login(View v) { // id = pw이면 로그인, 그래서 창이 MainActivity로 넘어가게 해주는 함수..!
        boolean id = edit_id.getText().toString().equals(SharedPreferenceManager.getInstance().getId());
        boolean pw = edit_pw.getText().toString().equals(SharedPreferenceManager.getInstance().getPw());
        if (id && pw == true) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
    */


    private boolean checkPassword(String s){
        String Password_PATTERN = "^(?=.*[a-zA-Z]+)(?=.*[0-9]+).{8,16}$";
        Pattern pattern = Pattern.compile(Password_PATTERN);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //Add Profile Activity 로 전환
    public void home(View v) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}