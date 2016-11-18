package com.zjn.mvpdemo.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zjn.mvpdemo.MainActivity;
import com.zjn.mvpdemo.R;
import com.zjn.mvpdemo.presenter.ILoginPresenter;
import com.zjn.mvpdemo.presenter.LoginPresenterCompl;

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
        setContentView(R.layout.activity_login);
        editUser = (EditText) findViewById(R.id.username);
        editPass = (EditText) findViewById(R.id.pwd);
        btnLogin = (Button) findViewById(R.id.login);
        btnClear = (Button) findViewById(R.id.clear);
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        loginPresenter = new LoginPresenterCompl(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.login:
                loginPresenter.doLogin(editUser.getText().toString(), editPass.getText().toString());
                break;

            case R.id.clear:
                loginPresenter.clear();

                break;
        }


    }

    @Override
    public void onClearText() {
        editUser.setText("");
        editPass.setText("");
    }

    @Override
    public void onLoginResult(Boolean result, int code) {
        Intent mIntent = new Intent(this, MainActivity.class);
        startActivity(mIntent);
    }

    @Override
    public void onSetProgressBarVisiblity(int visibility) {

    }
}
