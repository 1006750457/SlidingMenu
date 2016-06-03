package com.example.user.slidingmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liuwei on 2016/2/19.
 */
public class ContentAdapter extends BaseAdapter {
    private List<ContentItem> mDatas;
    private LayoutInflater mInflater;
    public ContentAdapter(Context context, List<ContentItem> datas){
        mInflater = LayoutInflater.from(context);
        mDatas = datas;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.content_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.mImageView = (ImageView) convertView.findViewById(R.id.content_imageview);
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.content_textview);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ContentItem contentItem = mDatas.get(position);
        viewHolder.mImageView.setImageResource(contentItem.getResId());
        viewHolder.mTextView.setText(contentItem.getName());
        return convertView;
    }
     static class ViewHolder{
        ImageView mImageView;
        TextView mTextView;
    }
}
