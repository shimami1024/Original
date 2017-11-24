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

    public void see(View v){
        Intent intentS = new Intent(this, SaveActivity.class);
        intentS.putExtra("SS", 1);
        startActivity(intentS);
    }

    //スタート画面を素敵に！！(Animation)

}
