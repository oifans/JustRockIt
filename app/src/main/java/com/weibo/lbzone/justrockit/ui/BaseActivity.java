package com.weibo.lbzone.justrockit.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by LB on 16/9/6.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadViewLayout();
        findViewById();
    }

    protected abstract void findViewById();
    protected abstract void loadViewLayout();
}
