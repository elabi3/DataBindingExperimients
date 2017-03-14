package com.elabi3.databind.viewModel;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.elabi3.databind.controllers.ListActivity;
import com.elabi3.databind.viewModel.base.BaseViewModel;

/**
 * Created by elabi3 on 9/2/17.
 **/

public class DetailViewModel extends BaseViewModel {

    /**************************************************************************
     * Constructor
     **************************************************************************/

    //region Constructor
    public DetailViewModel(Context ctx, ViewDataBinding dataBinding) {
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
    public View.OnClickListener feedOnClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(ListActivity.getLaunchIntent(mContext));
            }
        };
    }

    //endregion

}
