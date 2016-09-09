package com.weibo.lbzone.justrockit.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.weibo.lbzone.justrockit.R;
import com.weibo.lbzone.justrockit.ui.BaseFragment;

/**
 * Created by LB on 16/9/6.
 */

public class AcitvityListFragment extends BaseFragment implements IIndexActivityView{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ListView mListView;
        View view = inflater.inflate(R.layout.fragment_activity,container);
        mListView = (ListView)view.findViewById(R.id.lv_activities);
        return view;
    }
}
