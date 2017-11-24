package com.example.lit.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundFActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.backgroundf1,
            R.drawable.backgroundf2,
            R.drawable.backgroundf3,
            R.drawable.backgroundf4,
            R.drawable.backgroundf5,
            R.drawable.backgroundf6,
            R.drawable.backgroundf7,
            R.drawable.backgroundf8
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
        setContentView(R.layout.activity_back_ground_f);

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

    public void ftl(View v){
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
                Intent intent481 = new Intent(this, Make1Activity.class);
                intent481.putExtra("background481", 481);
                startActivity(intent481);
            } else if (make2 == 2) {
                Intent intent482 = new Intent(this, Make2Activity.class);
                intent482.putExtra("background482", 482);
                startActivity(intent482);
            } else if (make3 == 3) {
                Intent intent483 = new Intent(this, Make3Activity.class);
                intent483.putExtra("background483", 483);
                startActivity(intent483);
            } else if (make4 == 4) {
                Intent intent484 = new Intent(this, Make4Activity.class);
                intent484.putExtra("background484", 484);
                startActivity(intent484);
            } else if (make5 == 5) {
                Intent intent485 = new Intent(this, Make5Activity.class);
                intent485.putExtra("background485", 485);
                startActivity(intent485);
            } else if (make6 == 6) {
                Intent intent486 = new Intent(this, Make6Activity.class);
                intent486.putExtra("background486", 486);
                startActivity(intent486);
            } else if (make7 == 7) {
                Intent intent487 = new Intent(this, Make7Activity.class);
                intent487.putExtra("background487", 487);
                startActivity(intent487);
            } else if (make8 == 8) {
                Intent intent488 = new Intent(this, Make8Activity.class);
                intent488.putExtra("background488", 488);
                startActivity(intent488);
            } else if (make9 == 9) {
                Intent intent489 = new Intent(this, Make9Activity.class);
                intent489.putExtra("background489", 489);
                startActivity(intent489);
            } else if (make10 == 10) {
                Intent intent490 = new Intent(this, Make10Activity.class);
                intent490.putExtra("background490", 490);
                startActivity(intent490);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent521 = new Intent(this, Make1Activity.class);
                intent521.putExtra("background521", 521);
                startActivity(intent521);
            } else if (make2 == 2) {
                Intent intent522 = new Intent(this, Make2Activity.class);
                intent522.putExtra("background522", 522);
                startActivity(intent522);
            } else if (make3 == 3) {
                Intent intent523 = new Intent(this, Make3Activity.class);
                intent523.putExtra("background523", 523);
                startActivity(intent523);
            } else if (make4 == 4) {
                Intent intent524 = new Intent(this, Make4Activity.class);
                intent524.putExtra("background524", 524);
                startActivity(intent524);
            } else if (make5 == 5) {
                Intent intent525 = new Intent(this, Make5Activity.class);
                intent525.putExtra("background525", 525);
                startActivity(intent525);
            } else if (make6 == 6) {
                Intent intent526 = new Intent(this, Make6Activity.class);
                intent526.putExtra("background526", 526);
                startActivity(intent526);
            } else if (make7 == 7) {
                Intent intent527 = new Intent(this, Make7Activity.class);
                intent527.putExtra("background527", 527);
                startActivity(intent527);
            } else if (make8 == 8) {
                Intent intent528 = new Intent(this, Make8Activity.class);
                intent528.putExtra("background528", 528);
                startActivity(intent528);
            } else if (make9 == 9) {
                Intent intent529 = new Intent(this, Make9Activity.class);
                intent529.putExtra("background529", 529);
                startActivity(intent529);
            } else if (make10 == 10) {
                Intent intent530 = new Intent(this, Make10Activity.class);
                intent530.putExtra("background530", 530);
                startActivity(intent530);
            }
        }
    }

    public void ftr(View v){
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
                Intent intent491 = new Intent(this, Make1Activity.class);
                intent491.putExtra("background491", 491);
                startActivity(intent491);
            } else if (make2 == 2) {
                Intent intent492 = new Intent(this, Make2Activity.class);
                intent492.putExtra("background492", 492);
                startActivity(intent492);
            } else if (make3 == 3) {
                Intent intent493 = new Intent(this, Make3Activity.class);
                intent493.putExtra("background493", 493);
                startActivity(intent493);
            } else if (make4 == 4) {
                Intent intent494 = new Intent(this, Make4Activity.class);
                intent494.putExtra("background494", 494);
                startActivity(intent494);
            } else if (make5 == 5) {
                Intent intent495 = new Intent(this, Make5Activity.class);
                intent495.putExtra("background495", 495);
                startActivity(intent495);
            } else if (make6 == 6) {
                Intent intent496 = new Intent(this, Make6Activity.class);
                intent496.putExtra("background496", 496);
                startActivity(intent496);
            } else if (make7 == 7) {
                Intent intent497 = new Intent(this, Make7Activity.class);
                intent497.putExtra("background497", 497);
                startActivity(intent497);
            } else if (make8 == 8) {
                Intent intent498 = new Intent(this, Make8Activity.class);
                intent498.putExtra("background498", 498);
                startActivity(intent498);
            } else if (make9 == 9) {
                Intent intent499 = new Intent(this, Make9Activity.class);
                intent499.putExtra("background499", 499);
                startActivity(intent499);
            } else if (make10 == 10) {
                Intent intent500 = new Intent(this, Make10Activity.class);
                intent500.putExtra("background500", 500);
                startActivity(intent500);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent531 = new Intent(this, Make1Activity.class);
                intent531.putExtra("background531", 531);
                startActivity(intent531);
            } else if (make2 == 2) {
                Intent intent532 = new Intent(this, Make2Activity.class);
                intent532.putExtra("background532", 532);
                startActivity(intent532);
            } else if (make3 == 3) {
                Intent intent533 = new Intent(this, Make3Activity.class);
                intent533.putExtra("background533", 533);
                startActivity(intent533);
            } else if (make4 == 4) {
                Intent intent534 = new Intent(this, Make4Activity.class);
                intent534.putExtra("background534", 534);
                startActivity(intent534);
            } else if (make5 == 5) {
                Intent intent535 = new Intent(this, Make5Activity.class);
                intent535.putExtra("background535", 535);
                startActivity(intent535);
            } else if (make6 == 6) {
                Intent intent536 = new Intent(this, Make6Activity.class);
                intent536.putExtra("background536", 536);
                startActivity(intent536);
            } else if (make7 == 7) {
                Intent intent537 = new Intent(this, Make7Activity.class);
                intent537.putExtra("background537", 537);
                startActivity(intent537);
            } else if (make8 == 8) {
                Intent intent538 = new Intent(this, Make8Activity.class);
                intent538.putExtra("background538", 538);
                startActivity(intent538);
            } else if (make9 == 9) {
                Intent intent539 = new Intent(this, Make9Activity.class);
                intent539.putExtra("background539", 539);
                startActivity(intent539);
            } else if (make10 == 10) {
                Intent intent540 = new Intent(this, Make10Activity.class);
                intent540.putExtra("background540", 540);
                startActivity(intent540);
            }
        }
    }

    public void fbl(View v){
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
                Intent intent501 = new Intent(this, Make1Activity.class);
                intent501.putExtra("background501", 501);
                startActivity(intent501);
            } else if (make2 == 2) {
                Intent intent502 = new Intent(this, Make2Activity.class);
                intent502.putExtra("background502", 502);
                startActivity(intent502);
            } else if (make3 == 3) {
                Intent intent503 = new Intent(this, Make3Activity.class);
                intent503.putExtra("background503", 503);
                startActivity(intent503);
            } else if (make4 == 4) {
                Intent intent504 = new Intent(this, Make4Activity.class);
                intent504.putExtra("background504", 504);
                startActivity(intent504);
            } else if (make5 == 5) {
                Intent intent505 = new Intent(this, Make5Activity.class);
                intent505.putExtra("background505", 505);
                startActivity(intent505);
            } else if (make6 == 6) {
                Intent intent506 = new Intent(this, Make6Activity.class);
                intent506.putExtra("background506", 506);
                startActivity(intent506);
            } else if (make7 == 7) {
                Intent intent507 = new Intent(this, Make7Activity.class);
                intent507.putExtra("background507", 507);
                startActivity(intent507);
            } else if (make8 == 8) {
                Intent intent508 = new Intent(this, Make8Activity.class);
                intent508.putExtra("background508", 508);
                startActivity(intent508);
            } else if (make9 == 9) {
                Intent intent509 = new Intent(this, Make9Activity.class);
                intent509.putExtra("background509", 509);
                startActivity(intent509);
            } else if (make10 == 10) {
                Intent intent510 = new Intent(this, Make10Activity.class);
                intent510.putExtra("background510", 510);
                startActivity(intent510);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent541 = new Intent(this, Make1Activity.class);
                intent541.putExtra("background541", 541);
                startActivity(intent541);
            } else if (make2 == 2) {
                Intent intent542 = new Intent(this, Make2Activity.class);
                intent542.putExtra("background542", 542);
                startActivity(intent542);
            } else if (make3 == 3) {
                Intent intent543 = new Intent(this, Make3Activity.class);
                intent543.putExtra("background543", 543);
                startActivity(intent543);
            } else if (make4 == 4) {
                Intent intent544 = new Intent(this, Make4Activity.class);
                intent544.putExtra("background544", 544);
                startActivity(intent544);
            } else if (make5 == 5) {
                Intent intent545 = new Intent(this, Make5Activity.class);
                intent545.putExtra("background545", 545);
                startActivity(intent545);
            } else if (make6 == 6) {
                Intent intent546 = new Intent(this, Make6Activity.class);
                intent546.putExtra("background546", 546);
                startActivity(intent546);
            } else if (make7 == 7) {
                Intent intent547 = new Intent(this, Make7Activity.class);
                intent547.putExtra("background547", 547);
                startActivity(intent547);
            } else if (make8 == 8) {
                Intent intent548 = new Intent(this, Make8Activity.class);
                intent548.putExtra("background548", 548);
                startActivity(intent548);
            } else if (make9 == 9) {
                Intent intent549 = new Intent(this, Make9Activity.class);
                intent549.putExtra("background549", 549);
                startActivity(intent549);
            } else if (make10 == 10) {
                Intent intent550 = new Intent(this, Make10Activity.class);
                intent550.putExtra("background550", 550);
                startActivity(intent550);
            }
        }
    }

    public void fbr(View v){
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
                Intent intent511 = new Intent(this, Make1Activity.class);
                intent511.putExtra("background511", 511);
                startActivity(intent511);
            } else if (make2 == 2) {
                Intent intent512 = new Intent(this, Make2Activity.class);
                intent512.putExtra("background512", 512);
                startActivity(intent512);
            } else if (make3 == 3) {
                Intent intent513 = new Intent(this, Make3Activity.class);
                intent513.putExtra("background513", 513);
                startActivity(intent513);
            } else if (make4 == 4) {
                Intent intent514 = new Intent(this, Make4Activity.class);
                intent514.putExtra("background514", 514);
                startActivity(intent514);
            } else if (make5 == 5) {
                Intent intent515 = new Intent(this, Make5Activity.class);
                intent515.putExtra("background515", 515);
                startActivity(intent515);
            } else if (make6 == 6) {
                Intent intent516 = new Intent(this, Make6Activity.class);
                intent516.putExtra("background516", 516);
                startActivity(intent516);
            } else if (make7 == 7) {
                Intent intent517 = new Intent(this, Make7Activity.class);
                intent517.putExtra("background517", 517);
                startActivity(intent517);
            } else if (make8 == 8) {
                Intent intent518 = new Intent(this, Make8Activity.class);
                intent518.putExtra("background518", 518);
                startActivity(intent518);
            } else if (make9 == 9) {
                Intent intent519 = new Intent(this, Make9Activity.class);
                intent519.putExtra("background519", 519);
                startActivity(intent519);
            } else if (make10 == 10) {
                Intent intent520 = new Intent(this, Make10Activity.class);
                intent520.putExtra("background520", 520);
                startActivity(intent520);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent551 = new Intent(this, Make1Activity.class);
                intent551.putExtra("background551", 551);
                startActivity(intent551);
            } else if (make2 == 2) {
                Intent intent552 = new Intent(this, Make2Activity.class);
                intent552.putExtra("background552", 552);
                startActivity(intent552);
            } else if (make3 == 3) {
                Intent intent553 = new Intent(this, Make3Activity.class);
                intent553.putExtra("background553", 553);
                startActivity(intent553);
            } else if (make4 == 4) {
                Intent intent554 = new Intent(this, Make4Activity.class);
                intent554.putExtra("background554", 554);
                startActivity(intent554);
            } else if (make5 == 5) {
                Intent intent555 = new Intent(this, Make5Activity.class);
                intent555.putExtra("background555", 555);
                startActivity(intent555);
            } else if (make6 == 6) {
                Intent intent556 = new Intent(this, Make6Activity.class);
                intent556.putExtra("background556", 556);
                startActivity(intent556);
            } else if (make7 == 7) {
                Intent intent557 = new Intent(this, Make7Activity.class);
                intent557.putExtra("background557", 557);
                startActivity(intent557);
            } else if (make8 == 8) {
                Intent intent558 = new Intent(this, Make8Activity.class);
                intent558.putExtra("background558", 558);
                startActivity(intent558);
            } else if (make9 == 9) {
                Intent intent559 = new Intent(this, Make9Activity.class);
                intent559.putExtra("background559", 559);
                startActivity(intent559);
            } else if (make10 == 10) {
                Intent intent560 = new Intent(this, Make10Activity.class);
                intent560.putExtra("background560", 560);
                startActivity(intent560);
            }
        }
    }
}
