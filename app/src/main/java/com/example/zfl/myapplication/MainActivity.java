package com.example.zfl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void dotest(View view){
    String s1="字符串1";
    String s2="字符串2";
 Log.d("xxx",s2);
        Toast.makeText(this,"测试",Toast.LENGTH_SHORT).show();
         Log.d("xxx",s1);
    }
}
