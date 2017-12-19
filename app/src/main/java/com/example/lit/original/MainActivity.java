package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView imgView;
    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void first(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 1);
        startActivity(intent);
    }

    public void second(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 2);
        startActivity(intent);
    }

    public void third(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 3);
        startActivity(intent);
    }

    public void fourth(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 4);
        startActivity(intent);
    }

    public void fifth(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 5);
        startActivity(intent);
    }

    public void sixth(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 6);
        startActivity(intent);
    }

    public void seventh(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 7);
        startActivity(intent);
    }

    public void eighth(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 8);
        startActivity(intent);
    }

    public void ninth(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 9);
        startActivity(intent);
    }

    public void tenth(View v){
        Intent intent = new Intent(this, MakeActivity.class);
        intent.putExtra("L", 10);
        startActivity(intent);
    }

    //レイアウトの選択ボタンの背景の画像をmakeActivityからつくっておくこと
    //listViewにbuttonを組み込む
}
