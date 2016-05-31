package com.example.cc_computer.no1;


import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Cc-computer on 2016/5/23.
 */
public class ViewPagerAdapter2 extends PagerAdapter {

    private List<View>list;
    private String[]  mTitles;
    public ViewPagerAdapter2(List<View> list, String[] mTitles) {
        this.list=list;
        this.mTitles=mTitles;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(list.get(position));
        return list.get(position);
    }
}
