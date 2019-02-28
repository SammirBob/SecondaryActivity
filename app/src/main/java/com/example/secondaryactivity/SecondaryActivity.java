package com.example.secondaryactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //创建一个接收意图
        Intent intent_accept = getIntent();
        //创建Bundle对象，用于接收Intent数据
        Bundle bundle = intent_accept.getExtras();
        //获取Intent的内容name
        String name = bundle.getString("string");
        //获取Intent的内容age
        int age = bundle.getInt("int");
        Log.i("samir-SecondaryActivity",name+" "+age);
    }
}
