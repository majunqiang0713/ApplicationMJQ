package com.example.sgxk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private Intent intent1;


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
        int array[] = {1, 2, 3, 4, 5};
        Context context = getApplicationContext();
        String path = context.getFilesDir().getPath();
        Toast.makeText(this, "path", Toast.LENGTH_SHORT).show();
        NewClass newClass1 = new NewClass();
        NewClass newClass2 = new NewClass();
        newClass1.setPassWord("pwd");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            Object o = new Object();
            NewClass newClass = new NewClass();
            String path1 = context.getFilesDir().getPath();
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
            intent1 = new Intent(this, MainActivity.class);

            SharedPreferences sharedPreferences = this.getSharedPreferences("setting_info", MODE_PRIVATE);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("state", true);
            edit.commit();

        }

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    public  String streamToString(InputStream InputStream) throws IOException {


            byte[] b = new byte[1024];
            int length = -1;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((length = InputStream.read(b)) != -1) {
                baos.write(b, 0, length);
            }
            InputStream.close();
            return baos.toString();

        }


}