package com.example.lit.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundHActivity extends AppCompatActivity {

    int images[] ={
            R.drawable.backgroundh1,
            R.drawable.backgroundh2,
            R.drawable.backgroundh3,
            R.drawable.backgroundh4,
            R.drawable.backgroundh5,
            R.drawable.backgroundh6,
            R.drawable.backgroundh7,
            R.drawable.backgroundh8,
            R.drawable.backgroundh9,
            R.drawable.backgroundh10,
            R.drawable.backgroundh11,
            R.drawable.backgroundh12,
            R.drawable.backgroundh13,
            R.drawable.backgroundh14,
            R.drawable.backgroundh15,
            R.drawable.backgroundh16
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
        setContentView(R.layout.activity_back_ground_h);

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

        if(1 < page & page < 4){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            NEXT.setBackgroundResource(R.drawable.arrow001);
        } else if(page == 1){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow007);
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

        if(1 < page & page < 4){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow002);
        } else if(page == 4){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            NEXT.setBackgroundResource(R.drawable.arrow006);
        } else if(page == 5){
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

    public void htl(View v){
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
                Intent intent601 = new Intent(this, Make1Activity.class);
                intent601.putExtra("background601", 601);
                startActivity(intent601);
            } else if (make2 == 2) {
                Intent intent602 = new Intent(this, Make2Activity.class);
                intent602.putExtra("background602", 602);
                startActivity(intent602);
            } else if (make3 == 3) {
                Intent intent603 = new Intent(this, Make3Activity.class);
                intent603.putExtra("background603", 603);
                startActivity(intent603);
            } else if (make4 == 4) {
                Intent intent604 = new Intent(this, Make4Activity.class);
                intent604.putExtra("background604", 604);
                startActivity(intent604);
            } else if (make5 == 5) {
                Intent intent605 = new Intent(this, Make5Activity.class);
                intent605.putExtra("background605", 605);
                startActivity(intent605);
            } else if (make6 == 6) {
                Intent intent606 = new Intent(this, Make6Activity.class);
                intent606.putExtra("background606", 606);
                startActivity(intent606);
            } else if (make7 == 7) {
                Intent intent607 = new Intent(this, Make7Activity.class);
                intent607.putExtra("background607", 607);
                startActivity(intent607);
            } else if (make8 == 8) {
                Intent intent608 = new Intent(this, Make8Activity.class);
                intent608.putExtra("background608", 608);
                startActivity(intent608);
            } else if (make9 == 9) {
                Intent intent609 = new Intent(this, Make9Activity.class);
                intent609.putExtra("background609", 609);
                startActivity(intent609);
            } else if (make10 == 10) {
                Intent intent610 = new Intent(this, Make10Activity.class);
                intent610.putExtra("background610", 610);
                startActivity(intent610);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent641 = new Intent(this, Make1Activity.class);
                intent641.putExtra("background641", 641);
                startActivity(intent641);
            } else if (make2 == 2) {
                Intent intent642 = new Intent(this, Make2Activity.class);
                intent642.putExtra("background642", 642);
                startActivity(intent642);
            } else if (make3 == 3) {
                Intent intent643 = new Intent(this, Make3Activity.class);
                intent643.putExtra("background643", 643);
                startActivity(intent643);
            } else if (make4 == 4) {
                Intent intent644 = new Intent(this, Make4Activity.class);
                intent644.putExtra("background644", 644);
                startActivity(intent644);
            } else if (make5 == 5) {
                Intent intent645 = new Intent(this, Make5Activity.class);
                intent645.putExtra("background645", 645);
                startActivity(intent645);
            } else if (make6 == 6) {
                Intent intent646 = new Intent(this, Make6Activity.class);
                intent646.putExtra("background646", 646);
                startActivity(intent646);
            } else if (make7 == 7) {
                Intent intent647 = new Intent(this, Make7Activity.class);
                intent647.putExtra("background647", 647);
                startActivity(intent647);
            } else if (make8 == 8) {
                Intent intent648 = new Intent(this, Make8Activity.class);
                intent648.putExtra("background648", 648);
                startActivity(intent648);
            } else if (make9 == 9) {
                Intent intent649 = new Intent(this, Make9Activity.class);
                intent649.putExtra("background649", 649);
                startActivity(intent649);
            } else if (make10 == 10) {
                Intent intent650 = new Intent(this, Make10Activity.class);
                intent650.putExtra("background650", 650);
                startActivity(intent650);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent681 = new Intent(this, Make1Activity.class);
                intent681.putExtra("background681", 681);
                startActivity(intent681);
            } else if (make2 == 2) {
                Intent intent682 = new Intent(this, Make2Activity.class);
                intent682.putExtra("background682", 682);
                startActivity(intent682);
            } else if (make3 == 3) {
                Intent intent683 = new Intent(this, Make3Activity.class);
                intent683.putExtra("background683", 683);
                startActivity(intent683);
            } else if (make4 == 4) {
                Intent intent684 = new Intent(this, Make4Activity.class);
                intent684.putExtra("background684", 684);
                startActivity(intent684);
            } else if (make5 == 5) {
                Intent intent685 = new Intent(this, Make5Activity.class);
                intent685.putExtra("background685", 685);
                startActivity(intent685);
            } else if (make6 == 6) {
                Intent intent686 = new Intent(this, Make6Activity.class);
                intent686.putExtra("background686", 686);
                startActivity(intent686);
            } else if (make7 == 7) {
                Intent intent687 = new Intent(this, Make7Activity.class);
                intent687.putExtra("background687", 687);
                startActivity(intent687);
            } else if (make8 == 8) {
                Intent intent688 = new Intent(this, Make8Activity.class);
                intent688.putExtra("background688", 688);
                startActivity(intent688);
            } else if (make9 == 9) {
                Intent intent689 = new Intent(this, Make9Activity.class);
                intent689.putExtra("background689", 689);
                startActivity(intent689);
            } else if (make10 == 10) {
                Intent intent690 = new Intent(this, Make10Activity.class);
                intent690.putExtra("background690", 690);
                startActivity(intent690);
            }
        } else if(page == 4){
            if (make1 == 1) {
                Intent intent721 = new Intent(this, Make1Activity.class);
                intent721.putExtra("background721", 721);
                startActivity(intent721);
            } else if (make2 == 2) {
                Intent intent722 = new Intent(this, Make2Activity.class);
                intent722.putExtra("background722", 722);
                startActivity(intent722);
            } else if (make3 == 3) {
                Intent intent723 = new Intent(this, Make3Activity.class);
                intent723.putExtra("background723", 723);
                startActivity(intent723);
            } else if (make4 == 4) {
                Intent intent724 = new Intent(this, Make4Activity.class);
                intent724.putExtra("background724", 724);
                startActivity(intent724);
            } else if (make5 == 5) {
                Intent intent725 = new Intent(this, Make5Activity.class);
                intent725.putExtra("background725", 725);
                startActivity(intent725);
            } else if (make6 == 6) {
                Intent intent726 = new Intent(this, Make6Activity.class);
                intent726.putExtra("background726", 726);
                startActivity(intent726);
            } else if (make7 == 7) {
                Intent intent727 = new Intent(this, Make7Activity.class);
                intent727.putExtra("background727", 727);
                startActivity(intent727);
            } else if (make8 == 8) {
                Intent intent728 = new Intent(this, Make8Activity.class);
                intent728.putExtra("background728", 728);
                startActivity(intent728);
            } else if (make9 == 9) {
                Intent intent729 = new Intent(this, Make9Activity.class);
                intent729.putExtra("background729", 729);
                startActivity(intent729);
            } else if (make10 == 10) {
                Intent intent730 = new Intent(this, Make10Activity.class);
                intent730.putExtra("background730", 730);
                startActivity(intent730);
            }
        }
    }

    public void htr(View v){
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
                Intent intent611 = new Intent(this, Make1Activity.class);
                intent611.putExtra("background611", 611);
                startActivity(intent611);
            } else if (make2 == 2) {
                Intent intent612 = new Intent(this, Make2Activity.class);
                intent612.putExtra("background612", 612);
                startActivity(intent612);
            } else if (make3 == 3) {
                Intent intent613 = new Intent(this, Make3Activity.class);
                intent613.putExtra("background613", 613);
                startActivity(intent613);
            } else if (make4 == 4) {
                Intent intent614 = new Intent(this, Make4Activity.class);
                intent614.putExtra("background614", 614);
                startActivity(intent614);
            } else if (make5 == 5) {
                Intent intent615 = new Intent(this, Make5Activity.class);
                intent615.putExtra("background615", 615);
                startActivity(intent615);
            } else if (make6 == 6) {
                Intent intent616 = new Intent(this, Make6Activity.class);
                intent616.putExtra("background616", 616);
                startActivity(intent616);
            } else if (make7 == 7) {
                Intent intent617 = new Intent(this, Make7Activity.class);
                intent617.putExtra("background617", 617);
                startActivity(intent617);
            } else if (make8 == 8) {
                Intent intent618 = new Intent(this, Make8Activity.class);
                intent618.putExtra("background618", 618);
                startActivity(intent618);
            } else if (make9 == 9) {
                Intent intent619 = new Intent(this, Make9Activity.class);
                intent619.putExtra("background619", 619);
                startActivity(intent619);
            } else if (make10 == 10) {
                Intent intent620 = new Intent(this, Make10Activity.class);
                intent620.putExtra("background620", 620);
                startActivity(intent620);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent651 = new Intent(this, Make1Activity.class);
                intent651.putExtra("background651", 651);
                startActivity(intent651);
            } else if (make2 == 2) {
                Intent intent652 = new Intent(this, Make2Activity.class);
                intent652.putExtra("background652", 652);
                startActivity(intent652);
            } else if (make3 == 3) {
                Intent intent653 = new Intent(this, Make3Activity.class);
                intent653.putExtra("background653", 653);
                startActivity(intent653);
            } else if (make4 == 4) {
                Intent intent654 = new Intent(this, Make4Activity.class);
                intent654.putExtra("background654", 654);
                startActivity(intent654);
            } else if (make5 == 5) {
                Intent intent655 = new Intent(this, Make5Activity.class);
                intent655.putExtra("background655", 655);
                startActivity(intent655);
            } else if (make6 == 6) {
                Intent intent656 = new Intent(this, Make6Activity.class);
                intent656.putExtra("background656", 656);
                startActivity(intent656);
            } else if (make7 == 7) {
                Intent intent657 = new Intent(this, Make7Activity.class);
                intent657.putExtra("background657", 657);
                startActivity(intent657);
            } else if (make8 == 8) {
                Intent intent658 = new Intent(this, Make8Activity.class);
                intent658.putExtra("background658", 658);
                startActivity(intent658);
            } else if (make9 == 9) {
                Intent intent659 = new Intent(this, Make9Activity.class);
                intent659.putExtra("background659", 659);
                startActivity(intent659);
            } else if (make10 == 10) {
                Intent intent660 = new Intent(this, Make10Activity.class);
                intent660.putExtra("background660", 660);
                startActivity(intent660);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent691 = new Intent(this, Make1Activity.class);
                intent691.putExtra("background691", 691);
                startActivity(intent691);
            } else if (make2 == 2) {
                Intent intent692 = new Intent(this, Make2Activity.class);
                intent692.putExtra("background692", 692);
                startActivity(intent692);
            } else if (make3 == 3) {
                Intent intent693 = new Intent(this, Make3Activity.class);
                intent693.putExtra("background693", 693);
                startActivity(intent693);
            } else if (make4 == 4) {
                Intent intent694 = new Intent(this, Make4Activity.class);
                intent694.putExtra("background694", 694);
                startActivity(intent694);
            } else if (make5 == 5) {
                Intent intent695 = new Intent(this, Make5Activity.class);
                intent695.putExtra("background695", 695);
                startActivity(intent695);
            } else if (make6 == 6) {
                Intent intent696 = new Intent(this, Make6Activity.class);
                intent696.putExtra("background696", 696);
                startActivity(intent696);
            } else if (make7 == 7) {
                Intent intent697 = new Intent(this, Make7Activity.class);
                intent697.putExtra("background697", 697);
                startActivity(intent697);
            } else if (make8 == 8) {
                Intent intent698 = new Intent(this, Make8Activity.class);
                intent698.putExtra("background698", 698);
                startActivity(intent698);
            } else if (make9 == 9) {
                Intent intent699 = new Intent(this, Make9Activity.class);
                intent699.putExtra("background699", 699);
                startActivity(intent699);
            } else if (make10 == 10) {
                Intent intent700 = new Intent(this, Make10Activity.class);
                intent700.putExtra("background700", 700);
                startActivity(intent700);
            }
        } else if(page == 4){
            if (make1 == 1) {
                Intent intent731 = new Intent(this, Make1Activity.class);
                intent731.putExtra("background731", 731);
                startActivity(intent731);
            } else if (make2 == 2) {
                Intent intent732 = new Intent(this, Make2Activity.class);
                intent732.putExtra("background732", 732);
                startActivity(intent732);
            } else if (make3 == 3) {
                Intent intent733 = new Intent(this, Make3Activity.class);
                intent733.putExtra("background733", 733);
                startActivity(intent733);
            } else if (make4 == 4) {
                Intent intent734 = new Intent(this, Make4Activity.class);
                intent734.putExtra("background734", 734);
                startActivity(intent734);
            } else if (make5 == 5) {
                Intent intent735 = new Intent(this, Make5Activity.class);
                intent735.putExtra("background735", 735);
                startActivity(intent735);
            } else if (make6 == 6) {
                Intent intent736 = new Intent(this, Make6Activity.class);
                intent736.putExtra("background736", 736);
                startActivity(intent736);
            } else if (make7 == 7) {
                Intent intent737 = new Intent(this, Make7Activity.class);
                intent737.putExtra("background737", 737);
                startActivity(intent737);
            } else if (make8 == 8) {
                Intent intent738 = new Intent(this, Make8Activity.class);
                intent738.putExtra("background738", 738);
                startActivity(intent738);
            } else if (make9 == 9) {
                Intent intent739 = new Intent(this, Make9Activity.class);
                intent739.putExtra("background739", 739);
                startActivity(intent739);
            } else if (make10 == 10) {
                Intent intent740 = new Intent(this, Make10Activity.class);
                intent740.putExtra("background740", 740);
                startActivity(intent740);
            }
        }
    }

    public void hbl(View v){
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
                Intent intent621 = new Intent(this, Make1Activity.class);
                intent621.putExtra("background621", 621);
                startActivity(intent621);
            } else if (make2 == 2) {
                Intent intent622 = new Intent(this, Make2Activity.class);
                intent622.putExtra("background622", 622);
                startActivity(intent622);
            } else if (make3 == 3) {
                Intent intent623 = new Intent(this, Make3Activity.class);
                intent623.putExtra("background623", 623);
                startActivity(intent623);
            } else if (make4 == 4) {
                Intent intent624 = new Intent(this, Make4Activity.class);
                intent624.putExtra("background624", 624);
                startActivity(intent624);
            } else if (make5 == 5) {
                Intent intent625 = new Intent(this, Make5Activity.class);
                intent625.putExtra("background625", 625);
                startActivity(intent625);
            } else if (make6 == 6) {
                Intent intent626 = new Intent(this, Make6Activity.class);
                intent626.putExtra("background626", 626);
                startActivity(intent626);
            } else if (make7 == 7) {
                Intent intent627 = new Intent(this, Make7Activity.class);
                intent627.putExtra("background627", 627);
                startActivity(intent627);
            } else if (make8 == 8) {
                Intent intent628 = new Intent(this, Make8Activity.class);
                intent628.putExtra("background628", 628);
                startActivity(intent628);
            } else if (make9 == 9) {
                Intent intent629 = new Intent(this, Make9Activity.class);
                intent629.putExtra("background629", 629);
                startActivity(intent629);
            } else if (make10 == 10) {
                Intent intent630 = new Intent(this, Make10Activity.class);
                intent630.putExtra("background630", 630);
                startActivity(intent630);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent661 = new Intent(this, Make1Activity.class);
                intent661.putExtra("background661", 661);
                startActivity(intent661);
            } else if (make2 == 2) {
                Intent intent662 = new Intent(this, Make2Activity.class);
                intent662.putExtra("background662", 662);
                startActivity(intent662);
            } else if (make3 == 3) {
                Intent intent663 = new Intent(this, Make3Activity.class);
                intent663.putExtra("background663", 663);
                startActivity(intent663);
            } else if (make4 == 4) {
                Intent intent664 = new Intent(this, Make4Activity.class);
                intent664.putExtra("background664", 664);
                startActivity(intent664);
            } else if (make5 == 5) {
                Intent intent665 = new Intent(this, Make5Activity.class);
                intent665.putExtra("background665", 665);
                startActivity(intent665);
            } else if (make6 == 6) {
                Intent intent666 = new Intent(this, Make6Activity.class);
                intent666.putExtra("background666", 666);
                startActivity(intent666);
            } else if (make7 == 7) {
                Intent intent667 = new Intent(this, Make7Activity.class);
                intent667.putExtra("background667", 667);
                startActivity(intent667);
            } else if (make8 == 8) {
                Intent intent668 = new Intent(this, Make8Activity.class);
                intent668.putExtra("background668", 668);
                startActivity(intent668);
            } else if (make9 == 9) {
                Intent intent669 = new Intent(this, Make9Activity.class);
                intent669.putExtra("background669", 669);
                startActivity(intent669);
            } else if (make10 == 10) {
                Intent intent670 = new Intent(this, Make10Activity.class);
                intent670.putExtra("background670", 670);
                startActivity(intent670);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent701 = new Intent(this, Make1Activity.class);
                intent701.putExtra("background701", 701);
                startActivity(intent701);
            } else if (make2 == 2) {
                Intent intent702 = new Intent(this, Make2Activity.class);
                intent702.putExtra("background702", 702);
                startActivity(intent702);
            } else if (make3 == 3) {
                Intent intent703 = new Intent(this, Make3Activity.class);
                intent703.putExtra("background703", 703);
                startActivity(intent703);
            } else if (make4 == 4) {
                Intent intent704 = new Intent(this, Make4Activity.class);
                intent704.putExtra("background704", 704);
                startActivity(intent704);
            } else if (make5 == 5) {
                Intent intent705 = new Intent(this, Make5Activity.class);
                intent705.putExtra("background705", 705);
                startActivity(intent705);
            } else if (make6 == 6) {
                Intent intent706 = new Intent(this, Make6Activity.class);
                intent706.putExtra("background706", 706);
                startActivity(intent706);
            } else if (make7 == 7) {
                Intent intent707 = new Intent(this, Make7Activity.class);
                intent707.putExtra("background707", 707);
                startActivity(intent707);
            } else if (make8 == 8) {
                Intent intent708 = new Intent(this, Make8Activity.class);
                intent708.putExtra("background708", 708);
                startActivity(intent708);
            } else if (make9 == 9) {
                Intent intent709 = new Intent(this, Make9Activity.class);
                intent709.putExtra("background709", 709);
                startActivity(intent709);
            } else if (make10 == 10) {
                Intent intent710 = new Intent(this, Make10Activity.class);
                intent710.putExtra("background710", 710);
                startActivity(intent710);
            }
        } else if(page == 4){
            if (make1 == 1) {
                Intent intent741 = new Intent(this, Make1Activity.class);
                intent741.putExtra("background741", 741);
                startActivity(intent741);
            } else if (make2 == 2) {
                Intent intent742 = new Intent(this, Make2Activity.class);
                intent742.putExtra("background742", 742);
                startActivity(intent742);
            } else if (make3 == 3) {
                Intent intent743 = new Intent(this, Make3Activity.class);
                intent743.putExtra("background743", 743);
                startActivity(intent743);
            } else if (make4 == 4) {
                Intent intent744 = new Intent(this, Make4Activity.class);
                intent744.putExtra("background744", 744);
                startActivity(intent744);
            } else if (make5 == 5) {
                Intent intent745 = new Intent(this, Make5Activity.class);
                intent745.putExtra("background745", 745);
                startActivity(intent745);
            } else if (make6 == 6) {
                Intent intent746 = new Intent(this, Make6Activity.class);
                intent746.putExtra("background746", 746);
                startActivity(intent746);
            } else if (make7 == 7) {
                Intent intent747 = new Intent(this, Make7Activity.class);
                intent747.putExtra("background747", 747);
                startActivity(intent747);
            } else if (make8 == 8) {
                Intent intent748 = new Intent(this, Make8Activity.class);
                intent748.putExtra("background748", 748);
                startActivity(intent748);
            } else if (make9 == 9) {
                Intent intent749 = new Intent(this, Make9Activity.class);
                intent749.putExtra("background749", 749);
                startActivity(intent749);
            } else if (make10 == 10) {
                Intent intent750 = new Intent(this, Make10Activity.class);
                intent750.putExtra("background750", 750);
                startActivity(intent750);
            }
        }
    }

    public void hbr(View v){
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
                Intent intent631 = new Intent(this, Make1Activity.class);
                intent631.putExtra("background631", 631);
                startActivity(intent631);
            } else if (make2 == 2) {
                Intent intent632 = new Intent(this, Make2Activity.class);
                intent632.putExtra("background632", 632);
                startActivity(intent632);
            } else if (make3 == 3) {
                Intent intent633 = new Intent(this, Make3Activity.class);
                intent633.putExtra("background633", 633);
                startActivity(intent633);
            } else if (make4 == 4) {
                Intent intent634 = new Intent(this, Make4Activity.class);
                intent634.putExtra("background634", 634);
                startActivity(intent634);
            } else if (make5 == 5) {
                Intent intent635 = new Intent(this, Make5Activity.class);
                intent635.putExtra("background635", 635);
                startActivity(intent635);
            } else if (make6 == 6) {
                Intent intent636 = new Intent(this, Make6Activity.class);
                intent636.putExtra("background636", 636);
                startActivity(intent636);
            } else if (make7 == 7) {
                Intent intent637 = new Intent(this, Make7Activity.class);
                intent637.putExtra("background637", 637);
                startActivity(intent637);
            } else if (make8 == 8) {
                Intent intent638 = new Intent(this, Make8Activity.class);
                intent638.putExtra("background638", 638);
                startActivity(intent638);
            } else if (make9 == 9) {
                Intent intent639 = new Intent(this, Make9Activity.class);
                intent639.putExtra("background639", 639);
                startActivity(intent639);
            } else if (make10 == 10) {
                Intent intent640 = new Intent(this, Make10Activity.class);
                intent640.putExtra("background640", 640);
                startActivity(intent640);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent671 = new Intent(this, Make1Activity.class);
                intent671.putExtra("background671", 671);
                startActivity(intent671);
            } else if (make2 == 2) {
                Intent intent672 = new Intent(this, Make2Activity.class);
                intent672.putExtra("background672", 672);
                startActivity(intent672);
            } else if (make3 == 3) {
                Intent intent673 = new Intent(this, Make3Activity.class);
                intent673.putExtra("background673", 673);
                startActivity(intent673);
            } else if (make4 == 4) {
                Intent intent674 = new Intent(this, Make4Activity.class);
                intent674.putExtra("background674", 674);
                startActivity(intent674);
            } else if (make5 == 5) {
                Intent intent675 = new Intent(this, Make5Activity.class);
                intent675.putExtra("background675", 675);
                startActivity(intent675);
            } else if (make6 == 6) {
                Intent intent676 = new Intent(this, Make6Activity.class);
                intent676.putExtra("background676", 676);
                startActivity(intent676);
            } else if (make7 == 7) {
                Intent intent677 = new Intent(this, Make7Activity.class);
                intent677.putExtra("background677", 677);
                startActivity(intent677);
            } else if (make8 == 8) {
                Intent intent678 = new Intent(this, Make8Activity.class);
                intent678.putExtra("background678", 678);
                startActivity(intent678);
            } else if (make9 == 9) {
                Intent intent679 = new Intent(this, Make9Activity.class);
                intent679.putExtra("background679", 679);
                startActivity(intent679);
            } else if (make10 == 10) {
                Intent intent680 = new Intent(this, Make10Activity.class);
                intent680.putExtra("background680", 680);
                startActivity(intent680);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent711 = new Intent(this, Make1Activity.class);
                intent711.putExtra("background711", 711);
                startActivity(intent711);
            } else if (make2 == 2) {
                Intent intent712 = new Intent(this, Make2Activity.class);
                intent712.putExtra("background712", 712);
                startActivity(intent712);
            } else if (make3 == 3) {
                Intent intent713 = new Intent(this, Make3Activity.class);
                intent713.putExtra("background713", 713);
                startActivity(intent713);
            } else if (make4 == 4) {
                Intent intent714 = new Intent(this, Make4Activity.class);
                intent714.putExtra("background714", 714);
                startActivity(intent714);
            } else if (make5 == 5) {
                Intent intent715 = new Intent(this, Make5Activity.class);
                intent715.putExtra("background715", 715);
                startActivity(intent715);
            } else if (make6 == 6) {
                Intent intent716 = new Intent(this, Make6Activity.class);
                intent716.putExtra("background716", 716);
                startActivity(intent716);
            } else if (make7 == 7) {
                Intent intent717 = new Intent(this, Make7Activity.class);
                intent717.putExtra("background717", 717);
                startActivity(intent717);
            } else if (make8 == 8) {
                Intent intent718 = new Intent(this, Make8Activity.class);
                intent718.putExtra("background718", 718);
                startActivity(intent718);
            } else if (make9 == 9) {
                Intent intent719 = new Intent(this, Make9Activity.class);
                intent719.putExtra("background719", 719);
                startActivity(intent719);
            } else if (make10 == 10) {
                Intent intent720 = new Intent(this, Make10Activity.class);
                intent720.putExtra("background720", 720);
                startActivity(intent720);
            }
        } else if(page == 4){
            if (make1 == 1) {
                Intent intent751 = new Intent(this, Make1Activity.class);
                intent751.putExtra("background751", 751);
                startActivity(intent751);
            } else if (make2 == 2) {
                Intent intent752 = new Intent(this, Make2Activity.class);
                intent752.putExtra("background752", 752);
                startActivity(intent752);
            } else if (make3 == 3) {
                Intent intent753 = new Intent(this, Make3Activity.class);
                intent753.putExtra("background753", 753);
                startActivity(intent753);
            } else if (make4 == 4) {
                Intent intent754 = new Intent(this, Make4Activity.class);
                intent754.putExtra("background754", 754);
                startActivity(intent754);
            } else if (make5 == 5) {
                Intent intent755 = new Intent(this, Make5Activity.class);
                intent755.putExtra("background755", 755);
                startActivity(intent755);
            } else if (make6 == 6) {
                Intent intent756 = new Intent(this, Make6Activity.class);
                intent756.putExtra("background756", 756);
                startActivity(intent756);
            } else if (make7 == 7) {
                Intent intent757 = new Intent(this, Make7Activity.class);
                intent757.putExtra("background757", 757);
                startActivity(intent757);
            } else if (make8 == 8) {
                Intent intent758 = new Intent(this, Make8Activity.class);
                intent758.putExtra("background758", 758);
                startActivity(intent758);
            } else if (make9 == 9) {
                Intent intent759 = new Intent(this, Make9Activity.class);
                intent759.putExtra("background759", 759);
                startActivity(intent759);
            } else if (make10 == 10) {
                Intent intent760 = new Intent(this, Make10Activity.class);
                intent760.putExtra("background760", 760);
                startActivity(intent760);
            }
        }
    }
}
