package com.example.test.applicationtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Test on 3/28/2016.
 */
public class LoginActivity extends Activity implements View.OnClickListener {

    //手机号码输入框
    private EditText inputPhoneEt;

    private EditText inputCodeEt;

    private Button requestCodeBtn;

    private Button commitBtn;

    int i = 30;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        inputPhoneEt = (EditText) findViewById(R.id.login_input_phone_et);
        inputCodeEt = (EditText) findViewById(R.id.login_input_code_et);
        requestCodeBtn = (Button) findViewById(R.id.login_request_code_btn);
        commitBtn = (Button) findViewById(R.id.login_commit_btn);
    }

    public void onClick(View v) {

    }
}
