package com.example.cc_computer.no1.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cc_computer.no1.R;

/**
 * Created by Cc-computer on 2016/5/26.
 */
public class Register extends Activity {

    private Button button;
    private EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        editText1= (EditText) findViewById(R.id.username);
        editText2= (EditText) findViewById(R.id.password);
        button= (Button) findViewById(R.id.register_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("admin")&&editText2.getText().toString().equals("admin")){
                    Toast.makeText(Register.this,"注册成功",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Register.this,Landed.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(Register.this,"注册失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
