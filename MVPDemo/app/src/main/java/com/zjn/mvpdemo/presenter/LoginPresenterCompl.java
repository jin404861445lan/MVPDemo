package com.zjn.mvpdemo.presenter;

import android.os.Handler;
import android.os.Looper;

import com.zjn.mvpdemo.model.IUser;
import com.zjn.mvpdemo.view.ILoginView;

/**
 * Created by houtouke on 16/11/17.
 */

public class LoginPresenterCompl implements ILoginPresenter {
    private ILoginView iLoginView;
    IUser user;
    Handler handler;

    public LoginPresenterCompl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String password) {
        iLoginView.onLoginResult(true, 1);
    }

    @Override
    public void setProgressBarVisiblity(int visiblity) {

    }
}
