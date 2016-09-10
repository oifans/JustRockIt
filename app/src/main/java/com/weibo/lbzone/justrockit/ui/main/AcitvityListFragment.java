package com.weibo.lbzone.justrockit.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.weibo.lbzone.justrockit.R;
import com.weibo.lbzone.justrockit.adapter.IndexAcvitityAdapter;
import com.weibo.lbzone.justrockit.model.MActivity;
import com.weibo.lbzone.justrockit.presenter.IActivityPersenter;
import com.weibo.lbzone.justrockit.presenter.IActivityPersenterCompl;
import com.weibo.lbzone.justrockit.ui.BaseFragment;

import java.util.List;

/**
 * 首页活动列表Fragment
 * Created by LB on 16/9/6.
 */

public class AcitvityListFragment extends BaseFragment implements IIndexActivityView{
    private IActivityPersenter persenter;
    private IndexAcvitityAdapter adapter;
    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity,container,false);
        mListView = (ListView)view.findViewById(R.id.lv_activities);
        persenter.displayAll();
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        persenter = new IActivityPersenterCompl(getActivity(),this);
    }

    @Override
    public void displayAll(List<MActivity> list) {
        adapter = new IndexAcvitityAdapter(list,getActivity());
        mListView.setAdapter(adapter);
        adapter.notify();
    }
}
