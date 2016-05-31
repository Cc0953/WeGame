package com.example.cc_computer.no1.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Cc-computer on 2016/5/27.
 */
public class MyDataBaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_UEER = "create table user("
            +"id integer primary key autoincrement,"
            +"name text,"
            +"personality text)";
    private Context mContext;

    public  MyDataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
        mContext =context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_UEER);
        Toast.makeText(mContext,"Create succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
