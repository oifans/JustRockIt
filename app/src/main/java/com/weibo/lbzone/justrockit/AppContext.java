package com.weibo.lbzone.justrockit;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * 全局应用程序类：用于保存和调用全局应用配置及访问网络数据
 * Created by LB on 16/9/6.
 */

public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this,Constants.BmobAppId);

    }
}
