/*
package com.mans.earlybirds;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.earlybirds.R;
import com.example.administrator.earlybirds.handler.RestfulConnection;

*/
/**
 * Created by Owner on 2015-06-25.
 *//*

public class LoginPage extends Activity {
    public static final int RESULT_ERR = 0;
    public static final int RESULT_OK = 1;

    private EditText e_id, e_pass;
    private TextView t_msg;

    private boolean result = false;
    private String input_id = "";
    private String input_pass = "";
    private RestfulConnection login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_login);
        setResult(RESULT_ERR);

        e_id = (EditText) findViewById(R.id.input_id);
        e_pass = (EditText) findViewById(R.id.input_pw);
        t_msg = (TextView) findViewById(R.id.msgview);
    }

    public void onSignIn(View v) {
        input_id = e_id.getText().toString();
        input_pass = e_pass.getText().toString();

        if (input_id.length() == 0) {
            t_msg.setText("ID를 입력해주세요");
            return;
        } else if (input_pass.length() == 0) {
            t_msg.setText("비밀번호를 입력해주세요");
            return;
        }

        if(!(checkFormat(input_id) && checkFormat(input_pass))){
            //id and password should be 'a'-'z' or 'A'-'Z' or '0'-'9'
            t_msg.setText("입력은 알파벳과 숫자만 가능합니다");
            return;
        }

        login = RestfulConnection.getInstance();
        Thread connect_thread = new Thread() {
            @Override
            public void run() {
                result = login.getLogin(input_id, input_pass);
            }
        };
        connect_thread.start();
        try {
            connect_thread.join();
        } catch (InterruptedException ie) {
            Log.e("LOGIN", Log.getStackTraceString(ie));
        }

        if (result) {
            setResult(RESULT_OK);
            finish();
        } else {
            t_msg.setText("로그인에 실패했습니다");
            Log.i("LOGIN", "login failed");
        }

    }

    private boolean checkFormat(String str) {
        for (int i = 0; i < str.length(); i++) {
            char token = str.charAt(i);
            if (!((token >= 'a' && token <= 'z') || (token >= 'A' && token <= 'Z') || (token >= '0' && token <= '9')))
                return false;
        }
        return true;
    }
}
*/
