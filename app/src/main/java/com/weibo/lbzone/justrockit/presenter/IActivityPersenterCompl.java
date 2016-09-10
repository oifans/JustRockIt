package com.weibo.lbzone.justrockit.presenter;

import android.content.Context;

import com.weibo.lbzone.justrockit.model.MActivity;
import com.weibo.lbzone.justrockit.ui.main.IIndexActivityView;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * 首页活动Persenter
 * Created by LB on 16/9/9.
 */

public class IActivityPersenterCompl implements IActivityPersenter {
    private IIndexActivityView view;
    private Context context;

    public IActivityPersenterCompl(Context context , IIndexActivityView  view) {
        this.context = context;
        this.view = view;
    }

    @Override

    public void displayAll() {
        BmobQuery<MActivity> query = new BmobQuery<MActivity>();
        List<MActivity> list = new ArrayList<>();
        query.findObjects(new FindListener<MActivity>() {
            @Override
            public void done(List<MActivity> list, BmobException e) {
                if(e==null) {
                    view.displayAll(list);
                }else{
                }
            }
        });
    }
}
