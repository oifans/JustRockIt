package com.weibo.lbzone.justrockit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.weibo.lbzone.justrockit.R;
import com.weibo.lbzone.justrockit.model.MActivity;

import java.util.List;

/**
 * 首页活动列表Adapter
 * Created by LB on 16/9/9.
 */

public class IndexAcvitityAdapter extends BaseAdapter{
    private List<MActivity> list;
    private Context context;
    private LayoutInflater inflate;
    @Override
    public int getCount() {
        return list.size();
    }

    public IndexAcvitityAdapter(List<MActivity> list , Context context) {
        this.list = list;
        this.context = context;
        inflate = LayoutInflater.from(context);
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        MActivity activity = list.get(position);
        if(convertView ==  null) {
            convertView = inflate.inflate(R.layout.item_activity, null);
            holder = new ViewHolder();
            holder.mTvName = (TextView)convertView.findViewById(R.id.tv_name);
            holder.mTvAddress = (TextView)convertView.findViewById(R.id.tv_address);
            holder.mTvTime = (TextView)convertView.findViewById(R.id.tv_date);
            holder.mBtAdd = (Button) convertView.findViewById(R.id.bt_add);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mTvName.setText(activity.getName());
        holder.mTvAddress.setText(activity.getAddress());
        //holder.mTvTime.setText(activity.getDate().getDate());
        return convertView;
    }

    class ViewHolder{
        public TextView mTvName;
        public TextView mTvAddress;
        public TextView mTvTime;
        public ImageView MIvImage;
        public Button mBtAdd;
    }
}
