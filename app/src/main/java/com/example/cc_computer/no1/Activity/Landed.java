package com.example.cc_computer.no1.Activity;

import com.example.cc_computer.no1.Main_viewpager;
import com.example.cc_computer.no1.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Cc-computer on 2016/5/21.
 */
public class Landed extends Activity {

    private Button landed;
    private Button register;
    private EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landed);
        landed= (Button) findViewById(R.id.landed_Button);
        register= (Button) findViewById(R.id.register_Button);
        editText1= (EditText) findViewById(R.id.name);
        editText2= (EditText) findViewById(R.id.pass);

        landed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(editText1.getText().toString().equals("admin") && editText2.getText().toString().equals("123456")){
                    Intent intent = new Intent(Landed.this, Main_viewpager.class);
                    startActivity(intent);
                    finish();
//                }else{
//                    Toast.makeText(Landed.this,"检查账号和密码",Toast.LENGTH_SHORT).show();
//                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Landed.this,Register.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
