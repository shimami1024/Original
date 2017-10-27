package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void make(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //HomeWork10/20
    //BackGroundActivityの画像の透明度みたいなのの編集
    //画鋲のイラストの表示（大きさ合わせる）

    //角度調整のときの角度を記入するときの表示
    //FileActivityのlistView
    //TouchEvent
    //galleryからとってきた画像の固定化
}
