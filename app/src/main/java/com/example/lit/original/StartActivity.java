package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class StartActivity extends AppCompatActivity {
    FrameLayout frame;
    RelativeLayout relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        relative = (RelativeLayout) findViewById(R.id.relative);

    }

    public void make(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void edit(View v){

    }

    public void see(View v){

    }

    public void setting(View v){

    }

    //スタート画面を素敵に！！(Animation)

    //animation はなし、フォント取得

}
