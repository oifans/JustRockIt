package com.weibo.lbzone.justrockit.bean;

import cn.bmob.v3.BmobObject;

/**
 * 活动基类
 * Created by LB on 16/9/9.
 */

public class mActivity extends BmobObject{
    private String name; //活动名称
    private String address; //活动地址
    private Integer type;   //活动类型
    protected static int CONCERT = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
