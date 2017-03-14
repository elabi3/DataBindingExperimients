package com.elabi3.databind.viewModel;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.elabi3.databind.controllers.CompoundActivity;
import com.elabi3.databind.model.LoginObject;
import com.elabi3.databind.viewModel.base.BaseViewModel;

/**
 * Created by elabi3 on 9/2/17.
 **/

public class LoginViewModel extends BaseViewModel {
    public final static String TAG = LoginViewModel.class.getSimpleName();

    public LoginObject loginObject = new LoginObject();


    /**************************************************************************
     * Constructor
     **************************************************************************/

    //region Constructor
    public LoginViewModel(Context ctx, ViewDataBinding dataBinding) {
        super(ctx, dataBinding);
    }

    //endregion

    /**************************************************************************
     * LifeCycle
     **************************************************************************/

    //region LifeCycle
    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    //endregion


    /**************************************************************************
     * OnTextChange
     **************************************************************************/

    //region OnTextChange
    public void usernameOnTextChanged(CharSequence s, int start, int before, int count) {
        Log.w(TAG, "onTextChanged " + s);
        loginObject.username.set(s.toString());
    }

    public void passwordOnTextChanged(CharSequence s, int start, int before, int count) {
        Log.w(TAG, "onTextChanged " + s);
        loginObject.password.set(s.toString());
    }

    //endregion


    /**************************************************************************
     * Onclicks
     **************************************************************************/

    //region Onclicks
    public View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "username: " + loginObject.username.get() + " - password: " + loginObject.password.get());
                mContext.startActivity(CompoundActivity.getLaunchIntent(mContext));
                ((AppCompatActivity)mContext).overridePendingTransition(0, 0);
            }
        };
    }

    //endregion
}
