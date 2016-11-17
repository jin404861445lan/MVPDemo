package com.zjn.mvpdemo.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zjn.mvpdemo.R;
import com.zjn.mvpdemo.presenter.ILoginPresenter;

/**
 * Created by houtouke on 16/11/17.
 */

public class LoginActivity extends Activity implements ILoginView, View.OnClickListener {
    private EditText editUser;
    private EditText editPass;
    private Button btnLogin;
    private Button btnClear;
    ILoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editUser = (EditText) findViewById(R.id.username);
        editPass = (EditText) findViewById(R.id.pwd);
        btnLogin = (Button) findViewById(R.id.login);
        btnClear = (Button) findViewById(R.id.clear);


    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onClearText() {

    }

    @Override
    public void onLoginResult(Boolean result, int code) {

    }

    @Override
    public void onSetProgressBarVisiblity(int visibility) {

    }
}
