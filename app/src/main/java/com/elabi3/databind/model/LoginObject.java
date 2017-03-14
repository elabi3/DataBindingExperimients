package com.elabi3.databind.model;

import android.databinding.ObservableField;

/**
 * Created by elabi3 on 9/2/17.
 **/

public class LoginObject {
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

    public LoginObject(String username, String password) {
        this.username = new ObservableField<>(username);
        this.password = new ObservableField<>(password);
    }

    public LoginObject() {
    }
}
