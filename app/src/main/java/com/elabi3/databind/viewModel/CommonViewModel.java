package com.elabi3.databind.viewModel;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.elabi3.databind.viewModel.base.BaseViewModel;

/**
 * Created by elabi3 on 9/2/17.
 **/

public class CommonViewModel extends BaseViewModel {
    public final static String TAG = CommonViewModel.class.getSimpleName();

    public String title = "CommonViewModel";

    /**************************************************************************
     * Constructor
     **************************************************************************/

    //region Constructor
    public CommonViewModel(Context ctx, ViewDataBinding dataBinding) {
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
     *  OnClick
     **************************************************************************/

    //region OnClick
    public View.OnClickListener showToast() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "cliiiiiick");
                Toast.makeText(mContext, "Toast test!!", Toast.LENGTH_SHORT).show();
            }
        };
    }

    //endregion
}