package com.example.lit.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
    }

    public void f9(View v){
        Intent intentPin = new Intent(this, Make1Activity.class);
        intentPin.putExtra("Test", 1);
        startActivity(intentPin);
    }
}
