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
        Intent intent = new Intent(this, Make1Activity.class);
        startActivity(intent);
    }

    public void second(View v){
        Intent intent = new Intent(this, Make2Activity.class);
        startActivity(intent);
    }

    public void third(View v){
        Intent intent = new Intent(this, Make3Activity.class);
        startActivity(intent);
    }

    public void fourth(View v){
        Intent intent = new Intent(this, Make4Activity.class);
        startActivity(intent);
    }

    public void fifth(View v){
        Intent intent = new Intent(this, Make5Activity.class);
        startActivity(intent);
    }

    public void sixth(View v){
        Intent intent = new Intent(this, Make6Activity.class);
        startActivity(intent);
    }

    public void seventh(View v){
        Intent intent = new Intent(this, Make7Activity.class);
        startActivity(intent);
    }

    public void eighth(View v){
        Intent intent = new Intent(this, Make8Activity.class);
        startActivity(intent);
    }

    public void ninth(View v){
        Intent intent = new Intent(this, Make9Activity.class);
        startActivity(intent);
    }

    public void tenth(View v){
        Intent intent = new Intent(this, Make10Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    }
}
