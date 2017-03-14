package com.elabi3.databind.controllers;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.elabi3.databind.R;
import com.elabi3.databind.model.LoginObject;
import com.elabi3.databind.viewModel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;

    /**************************************************************************
     * LifeCycle
     **************************************************************************/

    //region LifeCycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Login
        loginViewModel = new LoginViewModel(this, DataBindingUtil.setContentView(this, R.layout.activity_login));

        // Set a default obj
        loginViewModel.loginObject = new LoginObject("test", "1111");
    }

    @Override
    protected void onResume() {
        super.onResume();
        loginViewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        loginViewModel.onPause();
    }

    //endregion

}
