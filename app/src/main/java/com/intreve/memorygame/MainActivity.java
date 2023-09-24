package com.intreve.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_p1, tv_p2;
    ImageView iv11, iv12, iv13, iv14, iv21, iv22, iv23, iv24, iv31, iv32, iv33, iv34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_p1=findViewById(R.id.tv_p1);
        tv_p2=findViewById(R.id.tv_p2);
        iv11=findViewById(R.id.iv11);
        iv12=findViewById(R.id.iv12);
        iv13=findViewById(R.id.iv13);
        iv14=findViewById(R.id.iv14);
        iv21=findViewById(R.id.iv21);
        iv22=findViewById(R.id.iv22);
        iv23=findViewById(R.id.iv23);
        iv24=findViewById(R.id.iv24);
        iv31=findViewById(R.id.iv31);
        iv32=findViewById(R.id.iv32);
        iv34=findViewById(R.id.iv34);

    }
}