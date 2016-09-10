package com.weibo.lbzone.justrockit.ui.main;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.weibo.lbzone.justrockit.R;
import com.weibo.lbzone.justrockit.ui.BaseActivity;

public class MainActivity extends BaseActivity implements IMainView,View.OnClickListener{

    private AcitvityListFragment acitvityListFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        acitvityListFragment = new AcitvityListFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fl_content,acitvityListFragment);
        transaction.commit();
    }

    @Override
    protected void findViewById() {
    }

    @Override
    protected void loadViewLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void changeTab() {

    }
}
