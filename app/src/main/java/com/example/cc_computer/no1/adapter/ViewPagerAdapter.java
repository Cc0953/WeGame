package com.example.cc_computer.no1.adapter;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Cc-computer on 2016/5/22.
 */
public class ViewPagerAdapter extends PagerAdapter {

    private List<View> list;
    private String[] mTitles;

    public ViewPagerAdapter(List<View> list,String[] mTitles){
            this.list=list;
            this.mTitles=mTitles;
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }
    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        container.addView(list.get(position));
        return list.get(position);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // TODO Auto-generated method stub
        return mTitles[position];
    }
}
