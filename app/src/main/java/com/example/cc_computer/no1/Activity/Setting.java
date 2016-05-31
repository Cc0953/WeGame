package com.example.cc_computer.no1.Activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cc_computer.no1.R;

/**
 * Created by Cc-computer on 2016/5/22.
 */
public class Setting extends Activity{

    private TextView textView1,textView2,textView3;
    SharedPreferences preferences,preferences1,preferences2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settting);

        //获取并设置昵称
        preferences=getSharedPreferences("Data",MODE_PRIVATE);
        String name = preferences.getString("nickname",null);
        textView1= (TextView) findViewById(R.id.nickname);
        textView1.setText(name);
        //点击跳转编辑页面
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Setting.this,Edit4Name.class);
                startActivity(intent1);
                finish();
            }
        });
        //获取并设置性别
        preferences1=getSharedPreferences("Data",MODE_PRIVATE);
        String sex = preferences1.getString("Sex",null);
        textView2= (TextView) findViewById(R.id.sex);
        textView2.setText(sex);
        //点击跳转编辑页面
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Setting.this,Edit4Sex.class);
                startActivity(intent2);
                finish();
            }
        });
        preferences2 = getSharedPreferences("Data",MODE_PRIVATE);
        String GameTime = preferences2.getString("GameTime",null);
        textView3= (TextView) findViewById(R.id.ganme4time);
        textView3.setText(GameTime);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Setting.this,Edit4GameTime.class);
                startActivity(intent3);
                finish();
            }
        });


    }


}
