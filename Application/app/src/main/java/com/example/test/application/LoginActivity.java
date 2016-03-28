package com.example.test.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Test on 3/28/2016.
 */
public class LoginActivity extends Activity implements View.OnClickListener {

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

    }

    public void onClick(View v) {

    }
}
