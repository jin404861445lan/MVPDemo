package com.zjn.mvpdemo.view;

/**
 * Created by houtouke on 16/11/17.
 */

public interface ILoginView {
    public void onClearText();

    public void onLoginResult(Boolean result, int code);

    public void onSetProgressBarVisiblity(int visibility);


}
