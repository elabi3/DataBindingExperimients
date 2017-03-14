package com.elabi3.databind.viewModel.base;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ViewDataBinding;

import com.elabi3.databind.BR;

/**
 * Created by elabi3 on 9/2/17.
 **/

public abstract class BaseViewModel extends BaseObservable {
    public Context mContext;
    public ViewDataBinding viewDataBinding;

    public BaseViewModel(Context ctx, ViewDataBinding dataBinding) {
        mContext = ctx;
        viewDataBinding = dataBinding;
        viewDataBinding.setVariable(BR.viewModel, this);
    }

    public abstract void onResume();
    public abstract void onPause();

}
