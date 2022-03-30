package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void test(View view) {
        //TextView textview = (TextView)findViewById(R.id.textView);
        //textview.setText("Test");
    }

    public void changview(View view) {
        setContentView(R.layout.activity_second);
    }

    public void warehouseView(View view) {
        setContentView(R.layout.activity_warehouse_main);
    }

}