package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, MakeActivity.class);
        intent.putExtra("MAKE", true);
    }

    public void first(View v){
        intent.putExtra("L", 1);
        startActivity(intent);
    }

    public void second(View v){
        intent.putExtra("L", 2);
        startActivity(intent);
    }

    public void third(View v){
        intent.putExtra("L", 3);
        startActivity(intent);
    }

    public void fourth(View v){
        intent.putExtra("L", 4);
        startActivity(intent);
    }

    public void fifth(View v){
        intent.putExtra("L", 5);
        startActivity(intent);
    }

    public void sixth(View v){
        intent.putExtra("L", 6);
        startActivity(intent);
    }

    public void seventh(View v){
        intent.putExtra("L", 7);
        startActivity(intent);
    }

    public void eighth(View v){
        intent.putExtra("L", 8);
        startActivity(intent);
    }

    public void ninth(View v){
        intent.putExtra("L", 9);
        startActivity(intent);
    }

    public void tenth(View v){
        intent.putExtra("L", 10);
        startActivity(intent);
    }

    //レイアウトの選択ボタンの背景の画像をmakeActivityからつくっておくこと
    //listViewにbuttonを組み込む
}
