package com.weibo.lbzone.justrockit.model;

import cn.bmob.v3.BmobObject;

/**
 * 活动基类
 * Created by LB on 16/9/9.
 */

public class MActivity extends BmobObject{
    private String name; //活动名称
    private String address; //活动地址
   // private BmobDate date;  //活动日期
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

//    public BmobDate getDate() {
//        return date;
//    }
//
//    public void setDate(BmobDate date) {
//        this.date = date;
//    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
