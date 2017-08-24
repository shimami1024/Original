package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BackGroundA1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground_a1);
    }

    public void a1(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if (make1 == 1){
            Intent intent1 = new Intent(this, Make1Activity.class);
            intent1.putExtra("background1", 1);
            startActivity(intent1);
        } else if (make2 == 2){
            Intent intent2 = new Intent(this, Make2Activity.class);
            intent2.putExtra("background2", 2);
            startActivity(intent2);
        } else if (make3 == 3){
            Intent intent3 = new Intent(this, Make3Activity.class);
            intent3.putExtra("background3", 3);
            startActivity(intent3);
        } else if (make4 == 4){
            Intent intent4 = new Intent(this, Make4Activity.class);
            intent4.putExtra("background4", 4);
            startActivity(intent4);
        } else if (make5 == 5){
            Intent intent5 = new Intent(this, Make5Activity.class);
            intent5.putExtra("background5", 5);
            startActivity(intent5);
        } else if (make6 == 6){
            Intent intent6 = new Intent(this, Make6Activity.class);
            intent6.putExtra("background6", 6);
            startActivity(intent6);
        } else if (make7 == 7){
            Intent intent7 = new Intent(this, Make7Activity.class);
            intent7.putExtra("background7", 7);
            startActivity(intent7);
        } else if (make8 == 8){
            Intent intent8 = new Intent(this, Make8Activity.class);
            intent8.putExtra("background8", 8);
            startActivity(intent8);
        } else if (make9 == 9){
            Intent intent9 = new Intent(this, Make9Activity.class);
            intent9.putExtra("background9", 9);
            startActivity(intent9);
        } else if (make10 == 10){
            Intent intent10 = new Intent(this, Make10Activity.class);
            intent10.putExtra("background10", 10);
            startActivity(intent10);
        }
    }

    public void a2(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if (make1 == 1){
            Intent intent11 = new Intent(this, Make1Activity.class);
            intent11.putExtra("background11", 11);
            startActivity(intent11);
        } else if (make2 == 2){
            Intent intent12 = new Intent(this, Make2Activity.class);
            intent12.putExtra("background12", 12);
            startActivity(intent12);
        } else if (make3 == 3){
            Intent intent13 = new Intent(this, Make3Activity.class);
            intent13.putExtra("background13", 13);
            startActivity(intent13);
        } else if (make4 == 4){
            Intent intent14 = new Intent(this, Make4Activity.class);
            intent14.putExtra("background14", 14);
            startActivity(intent14);
        } else if (make5 == 5){
            Intent intent15 = new Intent(this, Make5Activity.class);
            intent15.putExtra("background15", 15);
            startActivity(intent15);
        } else if (make6 == 6){
            Intent intent16 = new Intent(this, Make6Activity.class);
            intent16.putExtra("background16", 16);
            startActivity(intent16);
        } else if (make7 == 7){
            Intent intent17 = new Intent(this, Make7Activity.class);
            intent17.putExtra("background17", 17);
            startActivity(intent17);
        } else if (make8 == 18){
            Intent intent18 = new Intent(this, Make8Activity.class);
            intent18.putExtra("background18", 18);
            startActivity(intent18);
        } else if (make9 == 9){
            Intent intent19 = new Intent(this, Make9Activity.class);
            intent19.putExtra("background19", 19);
            startActivity(intent19);
        } else if (make10 == 10){
            Intent intent20 = new Intent(this, Make10Activity.class);
            intent20.putExtra("background20", 20);
            startActivity(intent20);
        }
    }

    public void a3(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if (make1 == 1){
            Intent intent21 = new Intent(this, Make1Activity.class);
            intent21.putExtra("background21", 21);
            startActivity(intent21);
        } else if (make2 == 2){
            Intent intent22 = new Intent(this, Make2Activity.class);
            intent22.putExtra("background22", 22);
            startActivity(intent22);
        } else if (make3 == 3){
            Intent intent23 = new Intent(this, Make3Activity.class);
            intent23.putExtra("background23", 23);
            startActivity(intent23);
        } else if (make4 == 4){
            Intent intent24 = new Intent(this, Make4Activity.class);
            intent24.putExtra("background24", 24);
            startActivity(intent24);
        } else if (make5 == 5){
            Intent intent25 = new Intent(this, Make5Activity.class);
            intent25.putExtra("background25", 25);
            startActivity(intent25);
        } else if (make6 == 6){
            Intent intent26 = new Intent(this, Make6Activity.class);
            intent26.putExtra("background26", 26);
            startActivity(intent26);
        } else if (make7 == 7){
            Intent intent27 = new Intent(this, Make7Activity.class);
            intent27.putExtra("background27", 27);
            startActivity(intent27);
        } else if (make8 == 8){
            Intent intent28 = new Intent(this, Make8Activity.class);
            intent28.putExtra("background28", 28);
            startActivity(intent28);
        } else if (make9 == 9){
            Intent intent29 = new Intent(this, Make9Activity.class);
            intent29.putExtra("background29", 29);
            startActivity(intent29);
        } else if (make10 == 10){
            Intent intent30 = new Intent(this, Make10Activity.class);
            intent30.putExtra("background30", 30);
            startActivity(intent30);
        }
    }

    public void a4(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if (make1 == 1){
            Intent intent31 = new Intent(this, Make1Activity.class);
            intent31.putExtra("background31", 31);
            startActivity(intent31);
        } else if (make2 == 2){
            Intent intent32 = new Intent(this, Make2Activity.class);
            intent32.putExtra("background32", 32);
            startActivity(intent32);
        } else if (make3 == 3){
            Intent intent33 = new Intent(this, Make3Activity.class);
            intent33.putExtra("background33", 33);
            startActivity(intent33);
        } else if (make4 == 4){
            Intent intent34 = new Intent(this, Make4Activity.class);
            intent34.putExtra("background34", 34);
            startActivity(intent34);
        } else if (make5 == 5){
            Intent intent35 = new Intent(this, Make5Activity.class);
            intent35.putExtra("background35", 35);
            startActivity(intent35);
        } else if (make6 == 6){
            Intent intent36 = new Intent(this, Make6Activity.class);
            intent36.putExtra("background36", 36);
            startActivity(intent36);
        } else if (make7 == 7){
            Intent intent37 = new Intent(this, Make7Activity.class);
            intent37.putExtra("background37", 37);
            startActivity(intent37);
        } else if (make8 == 8){
            Intent intent38 = new Intent(this, Make8Activity.class);
            intent38.putExtra("background38", 38);
            startActivity(intent38);
        } else if (make9 == 9){
            Intent intent39 = new Intent(this, Make9Activity.class);
            intent39.putExtra("background39", 39);
            startActivity(intent39);
        } else if (make10 == 10){
            Intent intent40 = new Intent(this, Make10Activity.class);
            intent40.putExtra("background40", 40);
            startActivity(intent40);
        }
    }

    public void a12(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGroundA2Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGroundA2Activity.class);

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

    public void a10(View v){
        Intent intentM1 = getIntent();
        int make1 = intentM1.getIntExtra("M1", 0);
        Intent intentMM1 = new Intent(this, BackGround0Activity.class);

        Intent intentM2 = getIntent();
        int make2 = intentM2.getIntExtra("M2", 0);
        Intent intentMM2 = new Intent(this, BackGround0Activity.class);

        Intent intentM3 = getIntent();
        int make3 = intentM3.getIntExtra("M3", 0);
        Intent intentMM3 = new Intent(this, BackGround0Activity.class);

        Intent intentM4 = getIntent();
        int make4 = intentM4.getIntExtra("M4", 0);
        Intent intentMM4 = new Intent(this, BackGround0Activity.class);

        Intent intentM5 = getIntent();
        int make5 = intentM5.getIntExtra("M5", 0);
        Intent intentMM5 = new Intent(this, BackGround0Activity.class);

        Intent intentM6 = getIntent();
        int make6 = intentM6.getIntExtra("M6", 0);
        Intent intentMM6 = new Intent(this, BackGround0Activity.class);

        Intent intentM7 = getIntent();
        int make7 = intentM7.getIntExtra("M7", 0);
        Intent intentMM7 = new Intent(this, BackGround0Activity.class);

        Intent intentM8 = getIntent();
        int make8 = intentM8.getIntExtra("M8", 0);
        Intent intentMM8 = new Intent(this, BackGround0Activity.class);

        Intent intentM9 = getIntent();
        int make9 = intentM9.getIntExtra("M9", 0);
        Intent intentMM9 = new Intent(this, BackGround0Activity.class);

        Intent intentM10 = getIntent();
        int make10 = intentM10.getIntExtra("M10", 0);
        Intent intentMM10 = new Intent(this, BackGround0Activity.class);

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
