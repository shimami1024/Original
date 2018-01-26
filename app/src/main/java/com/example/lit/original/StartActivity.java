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
        Intent intentMake = new Intent(this, MainActivity.class);
        startActivity(intentMake);
    }

    public void edit(View v){
        Intent intentMake = new Intent(this, MakeActivity.class);
        intentMake.putExtra("EDIT", true);
        startActivity(intentMake);
    }

    public void see(View v){
        Intent intentSee = new Intent(this, SaveActivity.class);
        startActivity(intentSee);
    }

    public void setting(View v){

    }

    public void daily(View v){

    }

    //スタート画面を素敵に！！(Animation)

    //animation はなし、フォント取得

}
