package com.example.lit.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundEActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.backgrounde1,
            R.drawable.backgrounde2,
            R.drawable.backgrounde3,
            R.drawable.backgrounde4,
            R.drawable.backgrounde5,
            R.drawable.backgrounde6,
            R.drawable.backgrounde7,
            R.drawable.backgrounde8
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
        setContentView(R.layout.activity_back_ground_e);

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

    public void etl(View v){
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
                Intent intent401 = new Intent(this, Make1Activity.class);
                intent401.putExtra("background401", 401);
                startActivity(intent401);
            } else if (make2 == 2) {
                Intent intent402 = new Intent(this, Make2Activity.class);
                intent402.putExtra("background402", 402);
                startActivity(intent402);
            } else if (make3 == 3) {
                Intent intent403 = new Intent(this, Make3Activity.class);
                intent403.putExtra("background403", 403);
                startActivity(intent403);
            } else if (make4 == 4) {
                Intent intent404 = new Intent(this, Make4Activity.class);
                intent404.putExtra("background404", 404);
                startActivity(intent404);
            } else if (make5 == 5) {
                Intent intent405 = new Intent(this, Make5Activity.class);
                intent405.putExtra("background405", 405);
                startActivity(intent405);
            } else if (make6 == 6) {
                Intent intent406 = new Intent(this, Make6Activity.class);
                intent406.putExtra("background406", 406);
                startActivity(intent406);
            } else if (make7 == 7) {
                Intent intent407 = new Intent(this, Make7Activity.class);
                intent407.putExtra("background407", 407);
                startActivity(intent407);
            } else if (make8 == 8) {
                Intent intent408 = new Intent(this, Make8Activity.class);
                intent408.putExtra("background408", 408);
                startActivity(intent408);
            } else if (make9 == 9) {
                Intent intent409 = new Intent(this, Make9Activity.class);
                intent409.putExtra("background409", 409);
                startActivity(intent409);
            } else if (make10 == 10) {
                Intent intent410 = new Intent(this, Make10Activity.class);
                intent410.putExtra("background410", 410);
                startActivity(intent410);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent441 = new Intent(this, Make1Activity.class);
                intent441.putExtra("background441", 441);
                startActivity(intent441);
            } else if (make2 == 2) {
                Intent intent442 = new Intent(this, Make2Activity.class);
                intent442.putExtra("background442", 442);
                startActivity(intent442);
            } else if (make3 == 3) {
                Intent intent443 = new Intent(this, Make3Activity.class);
                intent443.putExtra("background443", 443);
                startActivity(intent443);
            } else if (make4 == 4) {
                Intent intent444 = new Intent(this, Make4Activity.class);
                intent444.putExtra("background444", 444);
                startActivity(intent444);
            } else if (make5 == 5) {
                Intent intent445 = new Intent(this, Make5Activity.class);
                intent445.putExtra("background445", 445);
                startActivity(intent445);
            } else if (make6 == 6) {
                Intent intent446 = new Intent(this, Make6Activity.class);
                intent446.putExtra("background446", 446);
                startActivity(intent446);
            } else if (make7 == 7) {
                Intent intent447 = new Intent(this, Make7Activity.class);
                intent447.putExtra("background447", 447);
                startActivity(intent447);
            } else if (make8 == 8) {
                Intent intent448 = new Intent(this, Make8Activity.class);
                intent448.putExtra("background448", 448);
                startActivity(intent448);
            } else if (make9 == 9) {
                Intent intent449 = new Intent(this, Make9Activity.class);
                intent449.putExtra("background449", 449);
                startActivity(intent449);
            } else if (make10 == 10) {
                Intent intent450 = new Intent(this, Make10Activity.class);
                intent450.putExtra("background450", 450);
                startActivity(intent450);
            }
        }
    }

    public void etr(View v){
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
                Intent intent411 = new Intent(this, Make1Activity.class);
                intent411.putExtra("background411", 411);
                startActivity(intent411);
            } else if (make2 == 2) {
                Intent intent412 = new Intent(this, Make2Activity.class);
                intent412.putExtra("background412", 412);
                startActivity(intent412);
            } else if (make3 == 3) {
                Intent intent413 = new Intent(this, Make3Activity.class);
                intent413.putExtra("background413", 413);
                startActivity(intent413);
            } else if (make4 == 4) {
                Intent intent414 = new Intent(this, Make4Activity.class);
                intent414.putExtra("background414", 414);
                startActivity(intent414);
            } else if (make5 == 5) {
                Intent intent415 = new Intent(this, Make5Activity.class);
                intent415.putExtra("background415", 415);
                startActivity(intent415);
            } else if (make6 == 6) {
                Intent intent416 = new Intent(this, Make6Activity.class);
                intent416.putExtra("background416", 416);
                startActivity(intent416);
            } else if (make7 == 7) {
                Intent intent417 = new Intent(this, Make7Activity.class);
                intent417.putExtra("background417", 417);
                startActivity(intent417);
            } else if (make8 == 8) {
                Intent intent418 = new Intent(this, Make8Activity.class);
                intent418.putExtra("background418", 418);
                startActivity(intent418);
            } else if (make9 == 9) {
                Intent intent419 = new Intent(this, Make9Activity.class);
                intent419.putExtra("background419", 419);
                startActivity(intent419);
            } else if (make10 == 10) {
                Intent intent420 = new Intent(this, Make10Activity.class);
                intent420.putExtra("background420", 420);
                startActivity(intent420);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent451 = new Intent(this, Make1Activity.class);
                intent451.putExtra("background451", 451);
                startActivity(intent451);
            } else if (make2 == 2) {
                Intent intent452 = new Intent(this, Make2Activity.class);
                intent452.putExtra("background452", 452);
                startActivity(intent452);
            } else if (make3 == 3) {
                Intent intent453 = new Intent(this, Make3Activity.class);
                intent453.putExtra("background453", 453);
                startActivity(intent453);
            } else if (make4 == 4) {
                Intent intent454 = new Intent(this, Make4Activity.class);
                intent454.putExtra("background454", 454);
                startActivity(intent454);
            } else if (make5 == 5) {
                Intent intent455 = new Intent(this, Make5Activity.class);
                intent455.putExtra("background455", 455);
                startActivity(intent455);
            } else if (make6 == 6) {
                Intent intent456 = new Intent(this, Make6Activity.class);
                intent456.putExtra("background456", 456);
                startActivity(intent456);
            } else if (make7 == 7) {
                Intent intent457 = new Intent(this, Make7Activity.class);
                intent457.putExtra("background457", 457);
                startActivity(intent457);
            } else if (make8 == 8) {
                Intent intent458 = new Intent(this, Make8Activity.class);
                intent458.putExtra("background448", 458);
                startActivity(intent458);
            } else if (make9 == 9) {
                Intent intent459 = new Intent(this, Make9Activity.class);
                intent459.putExtra("background459", 459);
                startActivity(intent459);
            } else if (make10 == 10) {
                Intent intent460 = new Intent(this, Make10Activity.class);
                intent460.putExtra("background460", 460);
                startActivity(intent460);
            }
        }
    }

    public void ebl(View v){
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
                Intent intent421 = new Intent(this, Make1Activity.class);
                intent421.putExtra("background421", 421);
                startActivity(intent421);
            } else if (make2 == 2) {
                Intent intent422 = new Intent(this, Make2Activity.class);
                intent422.putExtra("background422", 422);
                startActivity(intent422);
            } else if (make3 == 3) {
                Intent intent423 = new Intent(this, Make3Activity.class);
                intent423.putExtra("background423", 423);
                startActivity(intent423);
            } else if (make4 == 4) {
                Intent intent424 = new Intent(this, Make4Activity.class);
                intent424.putExtra("background424", 424);
                startActivity(intent424);
            } else if (make5 == 5) {
                Intent intent425 = new Intent(this, Make5Activity.class);
                intent425.putExtra("background425", 425);
                startActivity(intent425);
            } else if (make6 == 6) {
                Intent intent426 = new Intent(this, Make6Activity.class);
                intent426.putExtra("background426", 426);
                startActivity(intent426);
            } else if (make7 == 7) {
                Intent intent427 = new Intent(this, Make7Activity.class);
                intent427.putExtra("background427", 427);
                startActivity(intent427);
            } else if (make8 == 8) {
                Intent intent428 = new Intent(this, Make8Activity.class);
                intent428.putExtra("background428", 428);
                startActivity(intent428);
            } else if (make9 == 9) {
                Intent intent429 = new Intent(this, Make9Activity.class);
                intent429.putExtra("background429", 429);
                startActivity(intent429);
            } else if (make10 == 10) {
                Intent intent430 = new Intent(this, Make10Activity.class);
                intent430.putExtra("background430", 430);
                startActivity(intent430);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent461 = new Intent(this, Make1Activity.class);
                intent461.putExtra("background461", 461);
                startActivity(intent461);
            } else if (make2 == 2) {
                Intent intent462 = new Intent(this, Make2Activity.class);
                intent462.putExtra("background462", 462);
                startActivity(intent462);
            } else if (make3 == 3) {
                Intent intent463 = new Intent(this, Make3Activity.class);
                intent463.putExtra("background463", 463);
                startActivity(intent463);
            } else if (make4 == 4) {
                Intent intent464 = new Intent(this, Make4Activity.class);
                intent464.putExtra("background464", 464);
                startActivity(intent464);
            } else if (make5 == 5) {
                Intent intent465 = new Intent(this, Make5Activity.class);
                intent465.putExtra("background465", 465);
                startActivity(intent465);
            } else if (make6 == 6) {
                Intent intent466 = new Intent(this, Make6Activity.class);
                intent466.putExtra("background466", 466);
                startActivity(intent466);
            } else if (make7 == 7) {
                Intent intent467 = new Intent(this, Make7Activity.class);
                intent467.putExtra("background467", 467);
                startActivity(intent467);
            } else if (make8 == 8) {
                Intent intent468 = new Intent(this, Make8Activity.class);
                intent468.putExtra("background468", 468);
                startActivity(intent468);
            } else if (make9 == 9) {
                Intent intent469 = new Intent(this, Make9Activity.class);
                intent469.putExtra("background469", 469);
                startActivity(intent469);
            } else if (make10 == 10) {
                Intent intent470 = new Intent(this, Make10Activity.class);
                intent470.putExtra("background470", 470);
                startActivity(intent470);
            }
        }
    }

    public void ebr(View v){
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
                Intent intent431 = new Intent(this, Make1Activity.class);
                intent431.putExtra("background431", 431);
                startActivity(intent431);
            } else if (make2 == 2) {
                Intent intent432 = new Intent(this, Make2Activity.class);
                intent432.putExtra("background432", 432);
                startActivity(intent432);
            } else if (make3 == 3) {
                Intent intent433 = new Intent(this, Make3Activity.class);
                intent433.putExtra("background433", 433);
                startActivity(intent433);
            } else if (make4 == 4) {
                Intent intent434 = new Intent(this, Make4Activity.class);
                intent434.putExtra("background434", 434);
                startActivity(intent434);
            } else if (make5 == 5) {
                Intent intent435 = new Intent(this, Make5Activity.class);
                intent435.putExtra("background435", 435);
                startActivity(intent435);
            } else if (make6 == 6) {
                Intent intent436 = new Intent(this, Make6Activity.class);
                intent436.putExtra("background436", 436);
                startActivity(intent436);
            } else if (make7 == 7) {
                Intent intent437 = new Intent(this, Make7Activity.class);
                intent437.putExtra("background437", 437);
                startActivity(intent437);
            } else if (make8 == 8) {
                Intent intent438 = new Intent(this, Make8Activity.class);
                intent438.putExtra("background438", 438);
                startActivity(intent438);
            } else if (make9 == 9) {
                Intent intent439 = new Intent(this, Make9Activity.class);
                intent439.putExtra("background439", 439);
                startActivity(intent439);
            } else if (make10 == 10) {
                Intent intent440 = new Intent(this, Make10Activity.class);
                intent440.putExtra("background440", 440);
                startActivity(intent440);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent471 = new Intent(this, Make1Activity.class);
                intent471.putExtra("background471", 471);
                startActivity(intent471);
            } else if (make2 == 2) {
                Intent intent472 = new Intent(this, Make2Activity.class);
                intent472.putExtra("background472", 472);
                startActivity(intent472);
            } else if (make3 == 3) {
                Intent intent473 = new Intent(this, Make3Activity.class);
                intent473.putExtra("background473", 473);
                startActivity(intent473);
            } else if (make4 == 4) {
                Intent intent474 = new Intent(this, Make4Activity.class);
                intent474.putExtra("background474", 474);
                startActivity(intent474);
            } else if (make5 == 5) {
                Intent intent475 = new Intent(this, Make5Activity.class);
                intent475.putExtra("background475", 475);
                startActivity(intent475);
            } else if (make6 == 6) {
                Intent intent476 = new Intent(this, Make6Activity.class);
                intent476.putExtra("background476", 476);
                startActivity(intent476);
            } else if (make7 == 7) {
                Intent intent477 = new Intent(this, Make7Activity.class);
                intent477.putExtra("background477", 477);
                startActivity(intent477);
            } else if (make8 == 8) {
                Intent intent478 = new Intent(this, Make8Activity.class);
                intent478.putExtra("background478", 478);
                startActivity(intent478);
            } else if (make9 == 9) {
                Intent intent479 = new Intent(this, Make9Activity.class);
                intent479.putExtra("background479", 479);
                startActivity(intent479);
            } else if (make10 == 10) {
                Intent intent480 = new Intent(this, Make10Activity.class);
                intent480.putExtra("background480", 480);
                startActivity(intent480);
            }
        }
    }
}
