package com.example.cc_computer.no1.Activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cc_computer.no1.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Cc-computer on 2016/5/24.
 */
public class My_Game extends Activity {

    private Spinner spinner;
    private ListView listView;
    private String[] gamename={"暗黑破坏神","英雄联盟"};
    private int[] ImagerId={R.mipmap.d,R.mipmap.lol};
    SharedPreferences preferences;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_game);

        //获取昵称
        preferences=getSharedPreferences("Data",MODE_PRIVATE);
        String s = preferences.getString("nickname",null);
        textView= (TextView) findViewById(R.id.getname);

        textView.setText(s);
        spinner= (Spinner) findViewById(R.id.spinner_1);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        for(int i=0;i<gamename.length;i++){
            Map<String,Object> lists = new HashMap<String,Object>();
            lists.put("content",gamename[i]);
            lists.put("header",ImagerId[i]);
            list.add(lists);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,list,R.layout.simple_item2,
                new String[]{"content","header"},new int[]{R.id.content,R.id.header});
        listView= (ListView) findViewById(R.id.game_listview);
        listView.setAdapter(adapter);
    }
}
