package com.example.user.slidingmenu;

/**
 * Created by liuwei on 2016/6/3.
 */
public class ContentItem {
    private int resId;
    private String name;
    public ContentItem(){

    }

    public ContentItem(int resId, String name) {
        this.resId = resId;
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
