package com.weibo.lbzone.justrockit.ui.main;

import com.weibo.lbzone.justrockit.model.MActivity;

import java.util.List;

/**
 * 首页活动列表View
 * Created by LB on 16/9/9.
 */

public interface IIndexActivityView {
    //显示所有活动
    void displayAll(List<MActivity> list);
}
