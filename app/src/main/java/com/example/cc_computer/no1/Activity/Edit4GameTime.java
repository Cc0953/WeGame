package com.example.cc_computer.no1.Activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cc_computer.no1.R;

public class Edit4GameTime extends Activity {

    private Button button;
    private EditText editText;
    private String s;
    SharedPreferences pref;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_layout);

        editText = (EditText) findViewById(R.id.edit);

        button= (Button) findViewById(R.id.save_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取只能被本应用程序读写的sharePreferences对象
                pref=getSharedPreferences("Data",MODE_PRIVATE);
                editor=pref.edit();
                //获得edit内容
                s=editText.getText().toString();
                editor.putString("GameTime",s);
                editor.commit();
                String name = pref.getString("GameTime",null);
                Toast.makeText(Edit4GameTime.this, "时间设置成功: "+name,Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
