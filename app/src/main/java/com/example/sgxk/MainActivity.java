package com.example.sgxk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 1、增加全屏
         * 2、增加隐藏图标
         * 3、新增功能1
         * 4、新增功能2
         * 5、增加功能3
         */
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        int array[] ={1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {

        }
        Object o = new Object();

    }


    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
