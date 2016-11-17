package com.zjn.mvpdemo.presenter;

/**
 * Created by houtouke on 16/11/17.
 */

public interface ILoginPresenter {
    public void clear();

    public void doLogin(String name, String password);

    public void setProgressBarVisiblity(int visiblity);


}
