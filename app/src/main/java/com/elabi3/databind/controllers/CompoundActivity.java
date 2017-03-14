package com.elabi3.databind.controllers;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.elabi3.databind.R;
import com.elabi3.databind.viewModel.CommonViewModel;
import com.elabi3.databind.viewModel.DetailViewModel;

/**
 * Created by elabi3 on 9/2/17.
 **/

public class CompoundActivity extends AppCompatActivity {

    private CommonViewModel commonViewModel;
    private DetailViewModel detailViewModel;


    /**************************************************************************
     *  Constructor
     **************************************************************************/

    //region Constructor
    public static Intent getLaunchIntent(Context ctx) {
        Intent intent = new Intent(ctx, CompoundActivity.class);
        return intent;
    }

    //endregion


    /**************************************************************************
     * LifeCycle
     **************************************************************************/

    //region LifeCycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);

        // Detalle
        detailViewModel = new DetailViewModel(this, DataBindingUtil.bind(findViewById(R.id.detalle_layout)));

        // Comon
        commonViewModel = new CommonViewModel(this, DataBindingUtil.bind(findViewById(R.id.comun_layout)));
    }

    @Override
    protected void onResume() {
        super.onResume();
        detailViewModel.onResume();
        commonViewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        detailViewModel.onPause();
        commonViewModel.onPause();
    }

    //endregion

}
