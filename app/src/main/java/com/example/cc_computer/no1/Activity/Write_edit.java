package com.example.cc_computer.no1.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cc_computer.no1.R;
import com.example.cc_computer.no1.extendsClass.Main_viewpager;

/**
 * Created by Cc-computer on 2016/6/18.
 */
public class Write_edit extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_layout_edit);

        initView();
        button.setOnClickListener(listener);
    }
    private void initView() {
        button = (Button) findViewById(R.id.write_edit_saveButton);
    }
    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Write_edit.this, Main_viewpager.class);
            startActivity(intent);
            finish();
        }
    };
}
