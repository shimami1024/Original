package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundDActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.backgroundd1,
            R.drawable.backgroundd2,
            R.drawable.backgroundd3,
            R.drawable.backgroundd4,
            R.drawable.backgroundd5,
            R.drawable.backgroundd6,
            R.drawable.backgroundd7,
            R.drawable.backgroundd8
    };

    int page;

    ImageButton topLeft;
    ImageButton topRight;
    ImageButton botLeft;
    ImageButton botRight;
    Button BACK;
    Button NEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground_d);

        topLeft = (ImageButton)findViewById(R.id.imageButton1);
        topRight = (ImageButton)findViewById(R.id.imageButton2);
        botLeft = (ImageButton)findViewById(R.id.imageButton3);
        botRight = (ImageButton) findViewById(R.id.imageButton4);
        BACK = (Button)findViewById(R.id.BACK);
        NEXT = (Button)findViewById(R.id.NEXT);

        page = 1;

        topLeft.setBackgroundResource(images[0]);
        topRight.setBackgroundResource(images[1]);
        botLeft.setBackgroundResource(images[2]);
        botRight.setBackgroundResource(images[3]);
    }

    public void back(View v){
        page--;

        if(page == 1){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow007);
            NEXT.setBackgroundResource(R.drawable.arrow001);
        } else if(page == 0){
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

    public void next(View v){
        page++;

        if(page == 2){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow002);
            NEXT.setBackgroundResource(R.drawable.arrow006);
        } else if(page == 3){
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

    public void dtl(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent321 = new Intent(this, Make1Activity.class);
                intent321.putExtra("background321", 321);
                startActivity(intent321);
            } else if (make2 == 2) {
                Intent intent322 = new Intent(this, Make2Activity.class);
                intent322.putExtra("background322", 322);
                startActivity(intent322);
            } else if (make3 == 3) {
                Intent intent323 = new Intent(this, Make3Activity.class);
                intent323.putExtra("background323", 323);
                startActivity(intent323);
            } else if (make4 == 4) {
                Intent intent324 = new Intent(this, Make4Activity.class);
                intent324.putExtra("background324", 324);
                startActivity(intent324);
            } else if (make5 == 5) {
                Intent intent325 = new Intent(this, Make5Activity.class);
                intent325.putExtra("background325", 325);
                startActivity(intent325);
            } else if (make6 == 6) {
                Intent intent326 = new Intent(this, Make6Activity.class);
                intent326.putExtra("background326", 326);
                startActivity(intent326);
            } else if (make7 == 7) {
                Intent intent327 = new Intent(this, Make7Activity.class);
                intent327.putExtra("background327", 327);
                startActivity(intent327);
            } else if (make8 == 8) {
                Intent intent328 = new Intent(this, Make8Activity.class);
                intent328.putExtra("background328", 328);
                startActivity(intent328);
            } else if (make9 == 9) {
                Intent intent329 = new Intent(this, Make9Activity.class);
                intent329.putExtra("background329", 329);
                startActivity(intent329);
            } else if (make10 == 10) {
                Intent intent330 = new Intent(this, Make10Activity.class);
                intent330.putExtra("background330", 330);
                startActivity(intent330);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent361 = new Intent(this, Make1Activity.class);
                intent361.putExtra("background361", 361);
                startActivity(intent361);
            } else if (make2 == 2) {
                Intent intent362 = new Intent(this, Make2Activity.class);
                intent362.putExtra("background362", 362);
                startActivity(intent362);
            } else if (make3 == 3) {
                Intent intent363 = new Intent(this, Make3Activity.class);
                intent363.putExtra("background363", 363);
                startActivity(intent363);
            } else if (make4 == 4) {
                Intent intent364 = new Intent(this, Make4Activity.class);
                intent364.putExtra("background364", 364);
                startActivity(intent364);
            } else if (make5 == 5) {
                Intent intent365 = new Intent(this, Make5Activity.class);
                intent365.putExtra("background365", 365);
                startActivity(intent365);
            } else if (make6 == 6) {
                Intent intent366 = new Intent(this, Make6Activity.class);
                intent366.putExtra("background366", 366);
                startActivity(intent366);
            } else if (make7 == 7) {
                Intent intent367 = new Intent(this, Make7Activity.class);
                intent367.putExtra("background367", 367);
                startActivity(intent367);
            } else if (make8 == 8) {
                Intent intent368 = new Intent(this, Make8Activity.class);
                intent368.putExtra("background368", 368);
                startActivity(intent368);
            } else if (make9 == 9) {
                Intent intent369 = new Intent(this, Make9Activity.class);
                intent369.putExtra("background369", 369);
                startActivity(intent369);
            } else if (make10 == 10) {
                Intent intent370 = new Intent(this, Make10Activity.class);
                intent370.putExtra("background370", 370);
                startActivity(intent370);
            }
        }
    }

    public void dtr(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent331 = new Intent(this, Make1Activity.class);
                intent331.putExtra("background331", 331);
                startActivity(intent331);
            } else if (make2 == 2) {
                Intent intent332 = new Intent(this, Make2Activity.class);
                intent332.putExtra("background332", 332);
                startActivity(intent332);
            } else if (make3 == 3) {
                Intent intent333 = new Intent(this, Make3Activity.class);
                intent333.putExtra("background333", 333);
                startActivity(intent333);
            } else if (make4 == 4) {
                Intent intent334 = new Intent(this, Make4Activity.class);
                intent334.putExtra("background334", 334);
                startActivity(intent334);
            } else if (make5 == 5) {
                Intent intent335 = new Intent(this, Make5Activity.class);
                intent335.putExtra("background335", 335);
                startActivity(intent335);
            } else if (make6 == 6) {
                Intent intent336 = new Intent(this, Make6Activity.class);
                intent336.putExtra("background336", 336);
                startActivity(intent336);
            } else if (make7 == 7) {
                Intent intent337 = new Intent(this, Make7Activity.class);
                intent337.putExtra("background337", 337);
                startActivity(intent337);
            } else if (make8 == 8) {
                Intent intent338 = new Intent(this, Make8Activity.class);
                intent338.putExtra("background338", 338);
                startActivity(intent338);
            } else if (make9 == 9) {
                Intent intent339 = new Intent(this, Make9Activity.class);
                intent339.putExtra("background339", 339);
                startActivity(intent339);
            } else if (make10 == 10) {
                Intent intent340 = new Intent(this, Make10Activity.class);
                intent340.putExtra("background340", 340);
                startActivity(intent340);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent371 = new Intent(this, Make1Activity.class);
                intent371.putExtra("background371", 371);
                startActivity(intent371);
            } else if (make2 == 2) {
                Intent intent372 = new Intent(this, Make2Activity.class);
                intent372.putExtra("background372", 372);
                startActivity(intent372);
            } else if (make3 == 3) {
                Intent intent373 = new Intent(this, Make3Activity.class);
                intent373.putExtra("background373", 373);
                startActivity(intent373);
            } else if (make4 == 4) {
                Intent intent374 = new Intent(this, Make4Activity.class);
                intent374.putExtra("background374", 374);
                startActivity(intent374);
            } else if (make5 == 5) {
                Intent intent375 = new Intent(this, Make5Activity.class);
                intent375.putExtra("background375", 375);
                startActivity(intent375);
            } else if (make6 == 6) {
                Intent intent376 = new Intent(this, Make6Activity.class);
                intent376.putExtra("background376", 376);
                startActivity(intent376);
            } else if (make7 == 7) {
                Intent intent377 = new Intent(this, Make7Activity.class);
                intent377.putExtra("background377", 377);
                startActivity(intent377);
            } else if (make8 == 8) {
                Intent intent378 = new Intent(this, Make8Activity.class);
                intent378.putExtra("background378", 378);
                startActivity(intent378);
            } else if (make9 == 9) {
                Intent intent379 = new Intent(this, Make9Activity.class);
                intent379.putExtra("background379", 379);
                startActivity(intent379);
            } else if (make10 == 10) {
                Intent intent380 = new Intent(this, Make10Activity.class);
                intent380.putExtra("background380", 380);
                startActivity(intent380);
            }
        }
    }

    public void dbl(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent341 = new Intent(this, Make1Activity.class);
                intent341.putExtra("background341", 341);
                startActivity(intent341);
            } else if (make2 == 2) {
                Intent intent342 = new Intent(this, Make2Activity.class);
                intent342.putExtra("background342", 342);
                startActivity(intent342);
            } else if (make3 == 3) {
                Intent intent343 = new Intent(this, Make3Activity.class);
                intent343.putExtra("background343", 343);
                startActivity(intent343);
            } else if (make4 == 4) {
                Intent intent344 = new Intent(this, Make4Activity.class);
                intent344.putExtra("background344", 344);
                startActivity(intent344);
            } else if (make5 == 5) {
                Intent intent345 = new Intent(this, Make5Activity.class);
                intent345.putExtra("background345", 345);
                startActivity(intent345);
            } else if (make6 == 6) {
                Intent intent346 = new Intent(this, Make6Activity.class);
                intent346.putExtra("background346", 346);
                startActivity(intent346);
            } else if (make7 == 7) {
                Intent intent347 = new Intent(this, Make7Activity.class);
                intent347.putExtra("background347", 347);
                startActivity(intent347);
            } else if (make8 == 8) {
                Intent intent348 = new Intent(this, Make8Activity.class);
                intent348.putExtra("background348", 348);
                startActivity(intent348);
            } else if (make9 == 9) {
                Intent intent349 = new Intent(this, Make9Activity.class);
                intent349.putExtra("background349", 349);
                startActivity(intent349);
            } else if (make10 == 10) {
                Intent intent350 = new Intent(this, Make10Activity.class);
                intent350.putExtra("background350", 350);
                startActivity(intent350);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent381 = new Intent(this, Make1Activity.class);
                intent381.putExtra("background381", 381);
                startActivity(intent381);
            } else if (make2 == 2) {
                Intent intent382 = new Intent(this, Make2Activity.class);
                intent382.putExtra("background382", 382);
                startActivity(intent382);
            } else if (make3 == 3) {
                Intent intent383 = new Intent(this, Make3Activity.class);
                intent383.putExtra("background383", 383);
                startActivity(intent383);
            } else if (make4 == 4) {
                Intent intent384 = new Intent(this, Make4Activity.class);
                intent384.putExtra("background384", 384);
                startActivity(intent384);
            } else if (make5 == 5) {
                Intent intent385 = new Intent(this, Make5Activity.class);
                intent385.putExtra("background385", 385);
                startActivity(intent385);
            } else if (make6 == 6) {
                Intent intent386 = new Intent(this, Make6Activity.class);
                intent386.putExtra("background386", 386);
                startActivity(intent386);
            } else if (make7 == 7) {
                Intent intent387 = new Intent(this, Make7Activity.class);
                intent387.putExtra("background387", 387);
                startActivity(intent387);
            } else if (make8 == 8) {
                Intent intent388 = new Intent(this, Make8Activity.class);
                intent388.putExtra("background388", 388);
                startActivity(intent388);
            } else if (make9 == 9) {
                Intent intent389 = new Intent(this, Make9Activity.class);
                intent389.putExtra("background389", 389);
                startActivity(intent389);
            } else if (make10 == 10) {
                Intent intent390 = new Intent(this, Make10Activity.class);
                intent390.putExtra("background390", 390);
                startActivity(intent390);
            }
        }
    }

    public void dbr(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent351 = new Intent(this, Make1Activity.class);
                intent351.putExtra("background351", 351);
                startActivity(intent351);
            } else if (make2 == 2) {
                Intent intent352 = new Intent(this, Make2Activity.class);
                intent352.putExtra("background352", 352);
                startActivity(intent352);
            } else if (make3 == 3) {
                Intent intent353 = new Intent(this, Make3Activity.class);
                intent353.putExtra("background353", 353);
                startActivity(intent353);
            } else if (make4 == 4) {
                Intent intent354 = new Intent(this, Make4Activity.class);
                intent354.putExtra("background354", 354);
                startActivity(intent354);
            } else if (make5 == 5) {
                Intent intent355 = new Intent(this, Make5Activity.class);
                intent355.putExtra("background355", 355);
                startActivity(intent355);
            } else if (make6 == 6) {
                Intent intent356 = new Intent(this, Make6Activity.class);
                intent356.putExtra("background356", 356);
                startActivity(intent356);
            } else if (make7 == 7) {
                Intent intent357 = new Intent(this, Make7Activity.class);
                intent357.putExtra("background357", 357);
                startActivity(intent357);
            } else if (make8 == 8) {
                Intent intent358 = new Intent(this, Make8Activity.class);
                intent358.putExtra("background358", 358);
                startActivity(intent358);
            } else if (make9 == 9) {
                Intent intent359 = new Intent(this, Make9Activity.class);
                intent359.putExtra("background359", 359);
                startActivity(intent359);
            } else if (make10 == 10) {
                Intent intent360 = new Intent(this, Make10Activity.class);
                intent360.putExtra("background360", 360);
                startActivity(intent360);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent391 = new Intent(this, Make1Activity.class);
                intent391.putExtra("background391", 391);
                startActivity(intent391);
            } else if (make2 == 2) {
                Intent intent392 = new Intent(this, Make2Activity.class);
                intent392.putExtra("background392", 392);
                startActivity(intent392);
            } else if (make3 == 3) {
                Intent intent393 = new Intent(this, Make3Activity.class);
                intent393.putExtra("background393", 393);
                startActivity(intent393);
            } else if (make4 == 4) {
                Intent intent394 = new Intent(this, Make4Activity.class);
                intent394.putExtra("background394", 394);
                startActivity(intent394);
            } else if (make5 == 5) {
                Intent intent395 = new Intent(this, Make5Activity.class);
                intent395.putExtra("background395", 395);
                startActivity(intent395);
            } else if (make6 == 6) {
                Intent intent396 = new Intent(this, Make6Activity.class);
                intent396.putExtra("background396", 396);
                startActivity(intent396);
            } else if (make7 == 7) {
                Intent intent397 = new Intent(this, Make7Activity.class);
                intent397.putExtra("background397", 397);
                startActivity(intent397);
            } else if (make8 == 8) {
                Intent intent398 = new Intent(this, Make8Activity.class);
                intent398.putExtra("background398", 398);
                startActivity(intent398);
            } else if (make9 == 9) {
                Intent intent399 = new Intent(this, Make9Activity.class);
                intent399.putExtra("background399", 399);
                startActivity(intent399);
            } else if (make10 == 10) {
                Intent intent400 = new Intent(this, Make10Activity.class);
                intent400.putExtra("background400", 400);
                startActivity(intent400);
            }
        }
    }
}
