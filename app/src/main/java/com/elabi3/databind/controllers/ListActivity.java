package com.elabi3.databind.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by elabi3 on 15/3/17.
 **/

public class ListActivity extends AppCompatActivity {


    /**************************************************************************
     * Constructor
     **************************************************************************/

    //region Constructor
    public static Intent getLaunchIntent(Context ctx) {
        Intent intent = new Intent(ctx, ListActivity.class);
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

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    //endregion
}
