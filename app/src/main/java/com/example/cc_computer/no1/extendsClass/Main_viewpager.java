package com.example.cc_computer.no1.extendsClass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.*;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.cc_computer.no1.Activity.My_Game;
import com.example.cc_computer.no1.Activity.Setting;
import com.example.cc_computer.no1.Activity.Write_edit;
import com.example.cc_computer.no1.R;
import com.example.cc_computer.no1.adapter.ViewPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class Main_viewpager extends Activity {
    private String[] mTitles={"首页","发布","我的信息"};
    private View view1,view2,view3;
    private ViewPager viewPager;
    private List<View> list;
    private TextView textView,textView1;
    private ImageButton imageButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_viewpager);
        LayoutInflater inflater = getLayoutInflater();
        //------------------------------viewpager--------------------------------------
        viewPager = (ViewPager) findViewById(R.id.MainViewPager);
        view1 = inflater.inflate(R.layout.activity_main, null);
        view2 = inflater.inflate(R.layout.write_layout, null);
        view3 = inflater.inflate(R.layout.about_me_layout, null);

        imageButton = (ImageButton) view3.findViewById(R.id.setting_IB);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_viewpager.this,Setting.class);
                startActivity(intent);
            }
        });
        //-----------------------------------------------------------------------------
        // viewpager第三个子页面的 我的信息 点击跳转事件（跳转至My_Game.class)---------
        textView= (TextView) view3.findViewById(R.id.MycardMassage);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_viewpager.this,My_Game.class);
                startActivity(intent);
            }
        });
        //-----------------------------------------------------------------------------
        // viewpager第二个子页面的 内容编辑 点击跳转事件（跳转至Write_edit.class)------
        button= (Button) view2.findViewById(R.id.edit_content);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_viewpager.this, Write_edit.class);
                startActivity(intent);
                finish();
            }
        });
        //-----------------------------------------------------------------------------
        list = new ArrayList<View>();
        list.add(view1);
        list.add(view2);
        list.add(view3);
        ViewPagerAdapter adapter = new ViewPagerAdapter(list,mTitles);
        viewPager.setAdapter(adapter);
    }

}
