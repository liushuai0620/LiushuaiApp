package com.example.administrator.liushuaiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //修改一次,直接在服务器上修改
        Log.i("<<<", "onCreate: this is first setting");
    }
}
