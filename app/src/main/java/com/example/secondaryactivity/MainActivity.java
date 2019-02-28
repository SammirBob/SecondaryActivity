package com.example.secondaryactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到第二个Activity
                gotoSecondaryActivity();
            }
        });
    }

    private void gotoSecondaryActivity() {
        //创建一个Intent
        Intent toSecondary = new Intent();
        Bundle bundle = new Bundle();
        //指定跳转SecondaryActivity
        toSecondary.setClass(this,SecondaryActivity.class);
        //toSecondary.putExtra("string","Ricky");//设置传递字符串
        //toSecondary.putExtra("int",25);//设置传递int类型内容
        bundle.putString("string","Ricky");
        bundle.putInt("int",25);
        toSecondary.putExtras(bundle);
        startActivity(toSecondary);
    }
}
