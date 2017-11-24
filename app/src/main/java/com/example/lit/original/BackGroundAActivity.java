package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundAActivity extends AppCompatActivity {

    int images[] ={
            R.drawable.backgrounda1,
            R.drawable.backgrounda2,
            R.drawable.backgrounda3,
            R.drawable.backgrounda4,
            R.drawable.backgrounda5,
            R.drawable.backgrounda6,
            R.drawable.backgrounda7,
            R.drawable.backgrounda8,
            R.drawable.backgrounda9,
            R.drawable.backgrounda10,
            R.drawable.backgrounda11,
            R.drawable.backgrounda12,
            R.drawable.backgrounda13,
            R.drawable.backgrounda14,
            R.drawable.backgrounda15,
            R.drawable.backgrounda16
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
        setContentView(R.layout.activity_back_ground_a);

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

    public void atl(View v){
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
        } else if(page == 2){
            if (make1 == 1){
                Intent intent41 = new Intent(this, Make1Activity.class);
                intent41.putExtra("background41", 41);
                startActivity(intent41);
            } else if (make2 == 2){
                Intent intent42 = new Intent(this, Make2Activity.class);
                intent42.putExtra("background42", 42);
                startActivity(intent42);
            } else if (make3 == 3){
                Intent intent43 = new Intent(this, Make3Activity.class);
                intent43.putExtra("background43", 43);
                startActivity(intent43);
            } else if (make4 == 4){
                Intent intent44 = new Intent(this, Make4Activity.class);
                intent44.putExtra("background44", 44);
                startActivity(intent44);
            } else if (make5 == 5){
                Intent intent45 = new Intent(this, Make5Activity.class);
                intent45.putExtra("background45", 45);
                startActivity(intent45);
            } else if (make6 == 6){
                Intent intent46 = new Intent(this, Make6Activity.class);
                intent46.putExtra("background46", 46);
                startActivity(intent46);
            } else if (make7 == 7){
                Intent intent47 = new Intent(this, Make7Activity.class);
                intent47.putExtra("background47", 47);
                startActivity(intent47);
            } else if (make8 == 8){
                Intent intent48 = new Intent(this, Make8Activity.class);
                intent48.putExtra("background48", 48);
                startActivity(intent48);
            } else if (make9 == 9){
                Intent intent49 = new Intent(this, Make9Activity.class);
                intent49.putExtra("background49", 49);
                startActivity(intent49);
            } else if (make10 == 10){
                Intent intent50 = new Intent(this, Make10Activity.class);
                intent50.putExtra("background50", 50);
                startActivity(intent50);
            }
        } else if(page == 3){
            if (make1 == 1){
                Intent intent81 = new Intent(this, Make1Activity.class);
                intent81.putExtra("background81", 81);
                startActivity(intent81);
            } else if (make2 == 2){
                Intent intent82 = new Intent(this, Make2Activity.class);
                intent82.putExtra("background82", 82);
                startActivity(intent82);
            } else if (make3 == 3){
                Intent intent83 = new Intent(this, Make3Activity.class);
                intent83.putExtra("background83", 83);
                startActivity(intent83);
            } else if (make4 == 4){
                Intent intent84 = new Intent(this, Make4Activity.class);
                intent84.putExtra("background84", 84);
                startActivity(intent84);
            } else if (make5 == 5){
                Intent intent85 = new Intent(this, Make5Activity.class);
                intent85.putExtra("background85", 85);
                startActivity(intent85);
            } else if (make6 == 6){
                Intent intent86 = new Intent(this, Make6Activity.class);
                intent86.putExtra("background86", 86);
                startActivity(intent86);
            } else if (make7 == 7){
                Intent intent87 = new Intent(this, Make7Activity.class);
                intent87.putExtra("background87", 87);
                startActivity(intent87);
            } else if (make8 == 8){
                Intent intent88 = new Intent(this, Make8Activity.class);
                intent88.putExtra("background88", 88);
                startActivity(intent88);
            } else if (make9 == 9){
                Intent intent89 = new Intent(this, Make9Activity.class);
                intent89.putExtra("background89", 89);
                startActivity(intent89);
            } else if (make10 == 10){
                Intent intent90 = new Intent(this, Make10Activity.class);
                intent90.putExtra("background90", 90);
                startActivity(intent90);
            }
        } else if(page == 4){
            if (make1 == 1){
                Intent intent121 = new Intent(this, Make1Activity.class);
                intent121.putExtra("background121", 121);
                startActivity(intent121);
            } else if (make2 == 2){
                Intent intent122 = new Intent(this, Make2Activity.class);
                intent122.putExtra("background122", 122);
                startActivity(intent122);
            } else if (make3 == 3){
                Intent intent123 = new Intent(this, Make3Activity.class);
                intent123.putExtra("background123", 123);
                startActivity(intent123);
            } else if (make4 == 4){
                Intent intent124 = new Intent(this, Make4Activity.class);
                intent124.putExtra("background124", 124);
                startActivity(intent124);
            } else if (make5 == 5){
                Intent intent125 = new Intent(this, Make5Activity.class);
                intent125.putExtra("background125", 125);
                startActivity(intent125);
            } else if (make6 == 6){
                Intent intent126 = new Intent(this, Make6Activity.class);
                intent126.putExtra("background126", 126);
                startActivity(intent126);
            } else if (make7 == 7){
                Intent intent127 = new Intent(this, Make7Activity.class);
                intent127.putExtra("background127", 127);
                startActivity(intent127);
            } else if (make8 == 8){
                Intent intent128 = new Intent(this, Make8Activity.class);
                intent128.putExtra("background128", 128);
                startActivity(intent128);
            } else if (make9 == 9){
                Intent intent129 = new Intent(this, Make9Activity.class);
                intent129.putExtra("background129", 129);
                startActivity(intent129);
            } else if (make10 == 10){
                Intent intent130 = new Intent(this, Make10Activity.class);
                intent130.putExtra("background130", 130);
                startActivity(intent130);
            }
        }
    }

    public void atr(View v){
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
        } else if(page == 2){
            if (make1 == 1){
                Intent intent51 = new Intent(this, Make1Activity.class);
                intent51.putExtra("background51", 51);
                startActivity(intent51);
            } else if (make2 == 2){
                Intent intent52 = new Intent(this, Make2Activity.class);
                intent52.putExtra("background52", 52);
                startActivity(intent52);
            } else if (make3 == 3){
                Intent intent53 = new Intent(this, Make3Activity.class);
                intent53.putExtra("background53", 53);
                startActivity(intent53);
            } else if (make4 == 4){
                Intent intent54 = new Intent(this, Make4Activity.class);
                intent54.putExtra("background54", 54);
                startActivity(intent54);
            } else if (make5 == 5){
                Intent intent55 = new Intent(this, Make5Activity.class);
                intent55.putExtra("background55", 55);
                startActivity(intent55);
            } else if (make6 == 6){
                Intent intent56 = new Intent(this, Make6Activity.class);
                intent56.putExtra("background56", 56);
                startActivity(intent56);
            } else if (make7 == 7){
                Intent intent57 = new Intent(this, Make7Activity.class);
                intent57.putExtra("background57", 57);
                startActivity(intent57);
            } else if (make8 == 8){
                Intent intent58 = new Intent(this, Make8Activity.class);
                intent58.putExtra("background58", 58);
                startActivity(intent58);
            } else if (make9 == 9){
                Intent intent59 = new Intent(this, Make9Activity.class);
                intent59.putExtra("background59", 59);
                startActivity(intent59);
            } else if (make10 == 10){
                Intent intent60 = new Intent(this, Make10Activity.class);
                intent60.putExtra("background60", 60);
                startActivity(intent60);
            }
        } else if(page == 3){
            if (make1 == 1){
                Intent intent91 = new Intent(this, Make1Activity.class);
                intent91.putExtra("background91", 91);
                startActivity(intent91);
            } else if (make2 == 2){
                Intent intent92 = new Intent(this, Make2Activity.class);
                intent92.putExtra("background92", 92);
                startActivity(intent92);
            } else if (make3 == 3){
                Intent intent93 = new Intent(this, Make3Activity.class);
                intent93.putExtra("background93", 93);
                startActivity(intent93);
            } else if (make4 == 4){
                Intent intent94 = new Intent(this, Make4Activity.class);
                intent94.putExtra("background94", 94);
                startActivity(intent94);
            } else if (make5 == 5){
                Intent intent95 = new Intent(this, Make5Activity.class);
                intent95.putExtra("background95", 95);
                startActivity(intent95);
            } else if (make6 == 6){
                Intent intent96 = new Intent(this, Make6Activity.class);
                intent96.putExtra("background96", 96);
                startActivity(intent96);
            } else if (make7 == 7){
                Intent intent97 = new Intent(this, Make7Activity.class);
                intent97.putExtra("background97", 97);
                startActivity(intent97);
            } else if (make8 == 8){
                Intent intent98 = new Intent(this, Make8Activity.class);
                intent98.putExtra("background98", 98);
                startActivity(intent98);
            } else if (make9 == 9){
                Intent intent99 = new Intent(this, Make9Activity.class);
                intent99.putExtra("background99", 99);
                startActivity(intent99);
            } else if (make10 == 10){
                Intent intent100 = new Intent(this, Make10Activity.class);
                intent100.putExtra("background100", 100);
                startActivity(intent100);
            }
        } else if(page == 4){
            if (make1 == 1){
                Intent intent131 = new Intent(this, Make1Activity.class);
                intent131.putExtra("background131", 131);
                startActivity(intent131);
            } else if (make2 == 2){
                Intent intent132 = new Intent(this, Make2Activity.class);
                intent132.putExtra("background132", 132);
                startActivity(intent132);
            } else if (make3 == 3){
                Intent intent133 = new Intent(this, Make3Activity.class);
                intent133.putExtra("background133", 133);
                startActivity(intent133);
            } else if (make4 == 4){
                Intent intent134 = new Intent(this, Make4Activity.class);
                intent134.putExtra("background134", 134);
                startActivity(intent134);
            } else if (make5 == 5){
                Intent intent135 = new Intent(this, Make5Activity.class);
                intent135.putExtra("background135", 135);
                startActivity(intent135);
            } else if (make6 == 6){
                Intent intent136 = new Intent(this, Make6Activity.class);
                intent136.putExtra("background136", 136);
                startActivity(intent136);
            } else if (make7 == 7){
                Intent intent137 = new Intent(this, Make7Activity.class);
                intent137.putExtra("background137", 137);
                startActivity(intent137);
            } else if (make8 == 8){
                Intent intent138 = new Intent(this, Make8Activity.class);
                intent138.putExtra("background138", 138);
                startActivity(intent138);
            } else if (make9 == 9){
                Intent intent139 = new Intent(this, Make9Activity.class);
                intent139.putExtra("background139", 139);
                startActivity(intent139);
            } else if (make10 == 10){
                Intent intent140 = new Intent(this, Make10Activity.class);
                intent140.putExtra("background140", 140);
                startActivity(intent140);
            }
        }
    }

    public void abl(View v){
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
        } else if(page == 2){
            if (make1 == 1){
                Intent intent61 = new Intent(this, Make1Activity.class);
                intent61.putExtra("background61", 61);
                startActivity(intent61);
            } else if (make2 == 2){
                Intent intent62 = new Intent(this, Make2Activity.class);
                intent62.putExtra("background62", 62);
                startActivity(intent62);
            } else if (make3 == 3){
                Intent intent63 = new Intent(this, Make3Activity.class);
                intent63.putExtra("background63", 63);
                startActivity(intent63);
            } else if (make4 == 4){
                Intent intent64 = new Intent(this, Make4Activity.class);
                intent64.putExtra("background64", 64);
                startActivity(intent64);
            } else if (make5 == 5){
                Intent intent65 = new Intent(this, Make5Activity.class);
                intent65.putExtra("background65", 65);
                startActivity(intent65);
            } else if (make6 == 6){
                Intent intent66 = new Intent(this, Make6Activity.class);
                intent66.putExtra("background66", 66);
                startActivity(intent66);
            } else if (make7 == 7){
                Intent intent67 = new Intent(this, Make7Activity.class);
                intent67.putExtra("background67", 67);
                startActivity(intent67);
            } else if (make8 == 8){
                Intent intent68 = new Intent(this, Make8Activity.class);
                intent68.putExtra("background68", 68);
                startActivity(intent68);
            } else if (make9 == 9){
                Intent intent69 = new Intent(this, Make9Activity.class);
                intent69.putExtra("background69", 69);
                startActivity(intent69);
            } else if (make10 == 10){
                Intent intent70 = new Intent(this, Make10Activity.class);
                intent70.putExtra("background70", 70);
                startActivity(intent70);
            }
        } else if(page == 3){
            if (make1 == 1){
                Intent intent101 = new Intent(this, Make1Activity.class);
                intent101.putExtra("background101", 101);
                startActivity(intent101);
            } else if (make2 == 2){
                Intent intent102 = new Intent(this, Make2Activity.class);
                intent102.putExtra("background102", 102);
                startActivity(intent102);
            } else if (make3 == 3){
                Intent intent103 = new Intent(this, Make3Activity.class);
                intent103.putExtra("background103", 103);
                startActivity(intent103);
            } else if (make4 == 4){
                Intent intent104 = new Intent(this, Make4Activity.class);
                intent104.putExtra("background104", 104);
                startActivity(intent104);
            } else if (make5 == 5){
                Intent intent105 = new Intent(this, Make5Activity.class);
                intent105.putExtra("background105", 105);
                startActivity(intent105);
            } else if (make6 == 6){
                Intent intent106 = new Intent(this, Make6Activity.class);
                intent106.putExtra("background106", 106);
                startActivity(intent106);
            } else if (make7 == 7){
                Intent intent107 = new Intent(this, Make7Activity.class);
                intent107.putExtra("background107", 107);
                startActivity(intent107);
            } else if (make8 == 8){
                Intent intent108 = new Intent(this, Make8Activity.class);
                intent108.putExtra("background108", 108);
                startActivity(intent108);
            } else if (make9 == 9){
                Intent intent109 = new Intent(this, Make9Activity.class);
                intent109.putExtra("background109", 109);
                startActivity(intent109);
            } else if (make10 == 10){
                Intent intent110 = new Intent(this, Make10Activity.class);
                intent110.putExtra("background110", 110);
                startActivity(intent110);
            }
        } else if(page == 4){
            if (make1 == 1){
                Intent intent141 = new Intent(this, Make1Activity.class);
                intent141.putExtra("background141", 141);
                startActivity(intent141);
            } else if (make2 == 2){
                Intent intent142 = new Intent(this, Make2Activity.class);
                intent142.putExtra("background142", 142);
                startActivity(intent142);
            } else if (make3 == 3){
                Intent intent143 = new Intent(this, Make3Activity.class);
                intent143.putExtra("background143", 143);
                startActivity(intent143);
            } else if (make4 == 4){
                Intent intent144 = new Intent(this, Make4Activity.class);
                intent144.putExtra("background144", 144);
                startActivity(intent144);
            } else if (make5 == 5){
                Intent intent145 = new Intent(this, Make5Activity.class);
                intent145.putExtra("background145", 145);
                startActivity(intent145);
            } else if (make6 == 6){
                Intent intent146 = new Intent(this, Make6Activity.class);
                intent146.putExtra("background146", 146);
                startActivity(intent146);
            } else if (make7 == 7){
                Intent intent147 = new Intent(this, Make7Activity.class);
                intent147.putExtra("background147", 147);
                startActivity(intent147);
            } else if (make8 == 8){
                Intent intent148 = new Intent(this, Make8Activity.class);
                intent148.putExtra("background148", 148);
                startActivity(intent148);
            } else if (make9 == 9){
                Intent intent149 = new Intent(this, Make9Activity.class);
                intent149.putExtra("background149", 149);
                startActivity(intent149);
            } else if (make10 == 10){
                Intent intent150 = new Intent(this, Make10Activity.class);
                intent150.putExtra("background150", 150);
                startActivity(intent150);
            }
        }
    }

    public void abr(View v){
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
        } else if(page == 2){
            if (make1 == 1){
                Intent intent71 = new Intent(this, Make1Activity.class);
                intent71.putExtra("background71", 71);
                startActivity(intent71);
            } else if (make2 == 2){
                Intent intent72 = new Intent(this, Make2Activity.class);
                intent72.putExtra("background72", 72);
                startActivity(intent72);
            } else if (make3 == 3){
                Intent intent73 = new Intent(this, Make3Activity.class);
                intent73.putExtra("background73", 73);
                startActivity(intent73);
            } else if (make4 == 4){
                Intent intent74 = new Intent(this, Make4Activity.class);
                intent74.putExtra("background74", 74);
                startActivity(intent74);
            } else if (make5 == 5){
                Intent intent75 = new Intent(this, Make5Activity.class);
                intent75.putExtra("background75", 75);
                startActivity(intent75);
            } else if (make6 == 6){
                Intent intent76 = new Intent(this, Make6Activity.class);
                intent76.putExtra("background76", 76);
                startActivity(intent76);
            } else if (make7 == 7){
                Intent intent77 = new Intent(this, Make7Activity.class);
                intent77.putExtra("background77", 77);
                startActivity(intent77);
            } else if (make8 == 8){
                Intent intent78 = new Intent(this, Make8Activity.class);
                intent78.putExtra("background78", 78);
                startActivity(intent78);
            } else if (make9 == 9){
                Intent intent79 = new Intent(this, Make9Activity.class);
                intent79.putExtra("background79", 79);
                startActivity(intent79);
            } else if (make10 == 10){
                Intent intent80 = new Intent(this, Make10Activity.class);
                intent80.putExtra("background80", 80);
                startActivity(intent80);
            }
        } else if(page == 3){
            if (make1 == 1){
                Intent intent111 = new Intent(this, Make1Activity.class);
                intent111.putExtra("background111", 111);
                startActivity(intent111);
            } else if (make2 == 2){
                Intent intent112 = new Intent(this, Make2Activity.class);
                intent112.putExtra("background112", 112);
                startActivity(intent112);
            } else if (make3 == 3){
                Intent intent113 = new Intent(this, Make3Activity.class);
                intent113.putExtra("background113", 113);
                startActivity(intent113);
            } else if (make4 == 4){
                Intent intent114 = new Intent(this, Make4Activity.class);
                intent114.putExtra("background114", 114);
                startActivity(intent114);
            } else if (make5 == 5){
                Intent intent115 = new Intent(this, Make5Activity.class);
                intent115.putExtra("background115", 115);
                startActivity(intent115);
            } else if (make6 == 6){
                Intent intent116 = new Intent(this, Make6Activity.class);
                intent116.putExtra("background116", 116);
                startActivity(intent116);
            } else if (make7 == 7){
                Intent intent117 = new Intent(this, Make7Activity.class);
                intent117.putExtra("background117", 117);
                startActivity(intent117);
            } else if (make8 == 8){
                Intent intent118 = new Intent(this, Make8Activity.class);
                intent118.putExtra("background118", 118);
                startActivity(intent118);
            } else if (make9 == 9){
                Intent intent119 = new Intent(this, Make9Activity.class);
                intent119.putExtra("background119", 119);
                startActivity(intent119);
            } else if (make10 == 10){
                Intent intent120 = new Intent(this, Make10Activity.class);
                intent120.putExtra("background120", 120);
                startActivity(intent120);
            }
        } else if(page == 4){
            if (make1 == 1){
                Intent intent151 = new Intent(this, Make1Activity.class);
                intent151.putExtra("background151", 151);
                startActivity(intent151);
            } else if (make2 == 2){
                Intent intent152 = new Intent(this, Make2Activity.class);
                intent152.putExtra("background152", 152);
                startActivity(intent152);
            } else if (make3 == 3){
                Intent intent153 = new Intent(this, Make3Activity.class);
                intent153.putExtra("background153", 153);
                startActivity(intent153);
            } else if (make4 == 4){
                Intent intent154 = new Intent(this, Make4Activity.class);
                intent154.putExtra("background154", 154);
                startActivity(intent154);
            } else if (make5 == 5){
                Intent intent155 = new Intent(this, Make5Activity.class);
                intent155.putExtra("background155", 145);
                startActivity(intent155);
            } else if (make6 == 6){
                Intent intent156 = new Intent(this, Make6Activity.class);
                intent156.putExtra("background156", 156);
                startActivity(intent156);
            } else if (make7 == 7){
                Intent intent157 = new Intent(this, Make7Activity.class);
                intent157.putExtra("background157", 157);
                startActivity(intent157);
            } else if (make8 == 8){
                Intent intent158 = new Intent(this, Make8Activity.class);
                intent158.putExtra("background158", 158);
                startActivity(intent158);
            } else if (make9 == 9){
                Intent intent159 = new Intent(this, Make9Activity.class);
                intent159.putExtra("background159", 159);
                startActivity(intent159);
            } else if (make10 == 10) {
                Intent intent160 = new Intent(this, Make10Activity.class);
                intent160.putExtra("background160", 160);
                startActivity(intent160);
            }
        }
    }
}
