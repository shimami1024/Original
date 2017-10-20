package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BackGround0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground0);

    }

    public void a01(View v) {
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundA1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundA1Activity.class);

        if (make1 == 1) {
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2) {
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3) {
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4) {
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5) {
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6) {
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7) {
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8) {
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9) {
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void b01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundB1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundB1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void c01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundC1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundC1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void d01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundD1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundD1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void e01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundE1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundE1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void f01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundF1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundF1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void g01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundG1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundG1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void h01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundH1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundH1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void i01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundI1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundI1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }

    public void j01(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundJ1Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundJ1Activity.class);

        if (make1 == 1){
            intentMM1.putExtra("M1", 1);
            startActivity(intentMM1);
        } else if (make2 == 2){
            intentMM2.putExtra("M2", 2);
            startActivity(intentMM2);
        } else if (make3 == 3){
            intentMM3.putExtra("M3", 3);
            startActivity(intentMM3);
        } else if (make4 == 4){
            intentMM4.putExtra("M4", 4);
            startActivity(intentMM4);
        } else if (make5 == 5){
            intentMM5.putExtra("M5", 5);
            startActivity(intentMM5);
        } else if (make6 == 6){
            intentMM6.putExtra("M6", 6);
            startActivity(intentMM6);
        } else if (make7 == 7){
            intentMM7.putExtra("M7", 7);
            startActivity(intentMM7);
        } else if (make8 == 8){
            intentMM8.putExtra("M8", 8);
            startActivity(intentMM8);
        } else if (make9 == 9){
            intentMM9.putExtra("M9", 9);
            startActivity(intentMM2);
        } else if (make10 == 10) {
            intentMM10.putExtra("M10", 10);
            startActivity(intentMM10);
        }
    }
}
