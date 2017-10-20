package com.example.lit.original;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.InputStream;


public class Make10Activity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    EditText editText1;
    EditText editText2;
    EditText editText3;

    SharedPreferences preferences;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make10);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText1.setText(preferences.getString("memo1",""));
        editText2.setText(preferences.getString("memo2",""));
        editText3.setText(preferences.getString("memo3",""));

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout10);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);

            }});

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 2);

            }});

        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 3);

            }});

        Intent intent10 = getIntent();
        int number1 = intent10.getIntExtra("background10", 0);
        if(number1 == 0){
            Log.d("あいうえお10", "あいうえお");
        } else if (number1 == 10) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent20 = getIntent();
        int number2 = intent20.getIntExtra("background20", 0);
        if(number2 == 0){
            Log.d("あいうえお20", "あいうえお");
        } else if (number2 == 20) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent30 = getIntent();
        int number3 = intent30.getIntExtra("background30", 0);
        if(number3 == 0){
            Log.d("あいうえお30", "あいうえお");
        } else if (number3 == 30) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent40 = getIntent();
        int number4 = intent40.getIntExtra("background40", 0);
        if(number4 == 0){
            Log.d("あいうえお40", "あいうえお");
        } else if (number4 == 40) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent50 = getIntent();
        int number5 = intent50.getIntExtra("background50", 0);
        if(number5 == 0){
            Log.d("あいうえお50", "あいうえお");
        } else if (number5 == 50) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent60 = getIntent();
        int number6 = intent60.getIntExtra("background60", 0);
        if(number6 == 0){
            Log.d("あいうえお60", "あいうえお");
        } else if (number6 == 60) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent70 = getIntent();
        int number7 = intent70.getIntExtra("background70", 0);
        if(number7 == 0){
            Log.d("あいうえお70", "あいうえお");
        } else if (number7 == 70) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent80 = getIntent();
        int number8 = intent80.getIntExtra("background80", 0);
        if(number8 == 0){
            Log.d("あいうえお80", "あいうえお");
        } else if (number8 == 80) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent90 = getIntent();
        int number9 = intent90.getIntExtra("background90", 0);
        if(number9 == 0){
            Log.d("あいうえお90", "あいうえお");
        } else if (number9 == 90) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent100 = getIntent();
        int number10 = intent100.getIntExtra("background100", 0);
        if(number10 == 0){
            Log.d("あいうえお100", "あいうえお");
        } else if (number10 == 100) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent110 = getIntent();
        int number11 = intent110.getIntExtra("background110", 0);
        if(number11 == 0){
            Log.d("あいうえお110", "あいうえお");
        } else if (number11 == 110) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent120 = getIntent();
        int number12 = intent120.getIntExtra("background120", 0);
        if(number12 == 0){
            Log.d("あいうえお120", "あいうえお");
        } else if (number12 == 120) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent130 = getIntent();
        int number13 = intent130.getIntExtra("background130", 0);
        if(number13 == 0){
            Log.d("あいうえお130", "あいうえお");
        } else if (number13 == 130) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent140 = getIntent();
        int number14 = intent140.getIntExtra("background140", 0);
        if(number14 == 0){
            Log.d("あいうえお140", "あいうえお");
        } else if (number14 == 140) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent150 = getIntent();
        int number15 = intent150.getIntExtra("background150", 0);
        if(number15 == 0){
            Log.d("あいうえお150", "あいうえお");
        } else if (number15 == 150) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent160 = getIntent();
        int number16 = intent160.getIntExtra("background160", 0);
        if(number16 == 0){
            Log.d("あいうえお160", "あいうえお");
        } else if (number16 == 160) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent170 = getIntent();
        int number17 = intent170.getIntExtra("background170", 0);
        if(number17 == 0){
            Log.d("あいうえお170", "あいうえお");
        } else if (number17 == 170) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent180 = getIntent();
        int number18 = intent180.getIntExtra("background180", 0);
        if(number18 == 0){
            Log.d("あいうえお180", "あいうえお");
        } else if (number18 == 180) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent190 = getIntent();
        int number19 = intent190.getIntExtra("background190", 0);
        if(number19 == 0){
            Log.d("あいうえお190", "あいうえお");
        } else if (number19 == 190) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent200 = getIntent();
        int number20 = intent200.getIntExtra("background200", 0);
        if(number20 == 0){
            Log.d("あいうえお200", "あいうえお");
        } else if (number20 == 200) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent210 = getIntent();
        int number21 = intent210.getIntExtra("background210", 0);
        if(number21 == 0){
            Log.d("あいうえお210", "あいうえお");
        } else if (number21 == 210) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent220 = getIntent();
        int number22 = intent220.getIntExtra("background220", 0);
        if(number22 == 0){
            Log.d("あいうえお220", "あいうえお");
        } else if (number22 == 220) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent230 = getIntent();
        int number23 = intent230.getIntExtra("background230", 0);
        if(number23 == 0){
            Log.d("あいうえお230", "あいうえお");
        } else if (number23 == 230) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent240 = getIntent();
        int number24 = intent240.getIntExtra("background240", 0);
        if(number24 == 0){
            Log.d("あいうえお240", "あいうえお");
        } else if (number24 == 240) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent250 = getIntent();
        int number25 = intent250.getIntExtra("background250", 0);
        if(number25 == 0){
            Log.d("あいうえお250", "あいうえお");
        } else if (number25 == 250) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent260 = getIntent();
        int number26 = intent260.getIntExtra("background260", 0);
        if(number26 == 0){
            Log.d("あいうえお260", "あいうえお");
        } else if (number26 == 260) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent270 = getIntent();
        int number27 = intent270.getIntExtra("background270", 0);
        if(number27 == 0){
            Log.d("あいうえお270", "あいうえお");
        } else if (number27 == 270) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent280 = getIntent();
        int number28 = intent280.getIntExtra("background280", 0);
        if(number28 == 0){
            Log.d("あいうえお280", "あいうえお");
        } else if (number28 == 280) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent290 = getIntent();
        int number29 = intent290.getIntExtra("background290", 0);
        if(number29 == 0){
            Log.d("あいうえお290", "あいうえお");
        } else if (number29 == 290) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent300 = getIntent();
        int number30 = intent300.getIntExtra("background300", 0);
        if(number30 == 0){
            Log.d("あいうえお300", "あいうえお");
        } else if (number30 == 300) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent310 = getIntent();
        int number31 = intent310.getIntExtra("background310", 0);
        if(number31 == 0){
            Log.d("あいうえお310", "あいうえお");
        } else if (number31 == 310) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent320 = getIntent();
        int number32 = intent320.getIntExtra("background320", 0);
        if(number32 == 0){
            Log.d("あいうえお320", "あいうえお");
        } else if (number32 == 320) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent330 = getIntent();
        int number33 = intent330.getIntExtra("background330", 0);
        if(number33 == 0){
            Log.d("あいうえお330", "あいうえお");
        } else if (number33 == 330) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent340 = getIntent();
        int number34 = intent340.getIntExtra("background340", 0);
        if(number34 == 0){
            Log.d("あいうえお340", "あいうえお");
        } else if (number34 == 340) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent350 = getIntent();
        int number35 = intent350.getIntExtra("background350", 0);
        if(number35 == 0){
            Log.d("あいうえお350", "あいうえお");
        } else if (number35 == 350) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent360 = getIntent();
        int number36 = intent360.getIntExtra("background360", 0);
        if(number36 == 0){
            Log.d("あいうえお360", "あいうえお");
        } else if (number36 == 360) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent370 = getIntent();
        int number37 = intent370.getIntExtra("background370", 0);
        if(number37 == 0){
            Log.d("あいうえお370", "あいうえお");
        } else if (number37 == 370) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent380 = getIntent();
        int number38 = intent380.getIntExtra("background380", 0);
        if(number38 == 0){
            Log.d("あいうえお380", "あいうえお");
        } else if (number38 == 380) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent390 = getIntent();
        int number39 = intent390.getIntExtra("background390", 0);
        if(number39 == 0){
            Log.d("あいうえお390", "あいうえお");
        } else if (number39 == 390) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent400 = getIntent();
        int number40 = intent400.getIntExtra("background400", 0);
        if(number40 == 0){
            Log.d("あいうえお400", "あいうえお");
        } else if (number40 == 400) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent410 = getIntent();
        int number41 = intent410.getIntExtra("background410", 0);
        if(number41 == 0){
            Log.d("あいうえお410", "あいうえお");
        } else if (number41 == 410) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent420 = getIntent();
        int number42 = intent420.getIntExtra("background420", 0);
        if(number42 == 0){
            Log.d("あいうえお420", "あいうえお");
        } else if (number42 == 420) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent430 = getIntent();
        int number43 = intent430.getIntExtra("background430", 0);
        if(number43 == 0){
            Log.d("あいうえお430", "あいうえお");
        } else if (number43 == 430) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent440 = getIntent();
        int number44 = intent440.getIntExtra("background440", 0);
        if(number44 == 0){
            Log.d("あいうえお440", "あいうえお");
        } else if (number44 == 440) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent450 = getIntent();
        int number45 = intent450.getIntExtra("background450", 0);
        if(number45 == 0){
            Log.d("あいうえお450", "あいうえお");
        } else if (number45 == 450) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent460 = getIntent();
        int number46 = intent460.getIntExtra("background460", 0);
        if(number46 == 0){
            Log.d("あいうえお460", "あいうえお");
        } else if (number46 == 460) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent470 = getIntent();
        int number47 = intent470.getIntExtra("background470", 0);
        if(number47 == 0){
            Log.d("あいうえお470", "あいうえお");
        } else if (number47 == 470) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent480 = getIntent();
        int number48 = intent480.getIntExtra("background480", 0);
        if(number48 == 0){
            Log.d("あいうえお480", "あいうえお");
        } else if (number48 == 480) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent490 = getIntent();
        int number49 = intent490.getIntExtra("background490", 0);
        if(number49 == 0){
            Log.d("あいうえお490", "あいうえお");
        } else if (number49 == 490) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent500 = getIntent();
        int number50 = intent500.getIntExtra("background500", 0);
        if(number50 == 0){
            Log.d("あいうえお500", "あいうえお");
        } else if (number50 == 500) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent510 = getIntent();
        int number51 = intent510.getIntExtra("background510", 0);
        if(number51 == 0){
            Log.d("あいうえお510", "あいうえお");
        } else if (number51 == 510) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent520 = getIntent();
        int number52 = intent520.getIntExtra("background520", 0);
        if(number52 == 0){
            Log.d("あいうえお520", "あいうえお");
        } else if (number52 == 520) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent530 = getIntent();
        int number53 = intent530.getIntExtra("background530", 0);
        if(number53 == 0){
            Log.d("あいうえお530", "あいうえお");
        } else if (number53 == 530) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent540 = getIntent();
        int number54 = intent540.getIntExtra("background540", 0);
        if(number54 == 0){
            Log.d("あいうえお540", "あいうえお");
        } else if (number54 == 540) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent550 = getIntent();
        int number55 = intent550.getIntExtra("background550", 0);
        if(number55 == 0){
            Log.d("あいうえお550", "あいうえお");
        } else if (number55 == 550) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent560 = getIntent();
        int number56 = intent560.getIntExtra("background560", 0);
        if(number56 == 0){
            Log.d("あいうえお560", "あいうえお");
        } else if (number56 == 560) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent570 = getIntent();
        int number57 = intent570.getIntExtra("background570", 0);
        if(number57 == 0){
            Log.d("あいうえお570", "あいうえお");
        } else if (number57 == 570) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent580 = getIntent();
        int number58 = intent580.getIntExtra("background580", 0);
        if(number58 == 0){
            Log.d("あいうえお580", "あいうえお");
        } else if (number58 == 580) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent590 = getIntent();
        int number59 = intent590.getIntExtra("background590", 0);
        if(number59 == 0){
            Log.d("あいうえお590", "あいうえお");
        } else if (number59 == 590) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent600 = getIntent();
        int number60 = intent600.getIntExtra("background600", 0);
        if(number60 == 0){
            Log.d("あいうえお600", "あいうえお");
        } else if (number60 == 600) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent610 = getIntent();
        int number61 = intent610.getIntExtra("background610", 0);
        if(number61 == 0){
            Log.d("あいうえお610", "あいうえお");
        } else if (number61 == 610) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent620 = getIntent();
        int number62 = intent620.getIntExtra("background620", 0);
        if(number62 == 0){
            Log.d("あいうえお620", "あいうえお");
        } else if (number62 == 620) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent630 = getIntent();
        int number63 = intent630.getIntExtra("background630", 0);
        if(number63 == 0){
            Log.d("あいうえお630", "あいうえお");
        } else if (number63 == 630) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent640 = getIntent();
        int number64 = intent640.getIntExtra("background640", 0);
        if(number64 == 0){
            Log.d("あいうえお640", "あいうえお");
        } else if (number64 == 640) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent650 = getIntent();
        int number65 = intent650.getIntExtra("background650", 0);
        if(number65 == 0){
            Log.d("あいうえお650", "あいうえお");
        } else if (number65 == 650) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent660 = getIntent();
        int number66 = intent660.getIntExtra("background660", 0);
        if(number66 == 0){
            Log.d("あいうえお660", "あいうえお");
        } else if (number66 == 660) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent670 = getIntent();
        int number67 = intent670.getIntExtra("background670", 0);
        if(number67 == 0){
            Log.d("あいうえお670", "あいうえお");
        } else if (number67 == 670) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent680 = getIntent();
        int number68 = intent680.getIntExtra("background680", 0);
        if(number68 == 0){
            Log.d("あいうえお680", "あいうえお");
        } else if (number68 == 680) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent690 = getIntent();
        int number69 = intent690.getIntExtra("background690", 0);
        if(number69 == 0){
            Log.d("あいうえお690", "あいうえお");
        } else if (number69 == 690) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent700 = getIntent();
        int number70 = intent700.getIntExtra("background700", 0);
        if(number70 == 0){
            Log.d("あいうえお700", "あいうえお");
        } else if (number70 == 700) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent710 = getIntent();
        int number71 = intent710.getIntExtra("background710", 0);
        if(number71 == 0){
            Log.d("あいうえお710", "あいうえお");
        } else if (number71 == 710) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent720 = getIntent();
        int number72 = intent720.getIntExtra("background720", 0);
        if(number72 == 0){
            Log.d("あいうえお720", "あいうえお");
        } else if (number72 == 720) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent730 = getIntent();
        int number73 = intent730.getIntExtra("background730", 0);
        if(number73 == 0){
            Log.d("あいうえお730", "あいうえお");
        } else if (number73 == 730) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent740 = getIntent();
        int number74 = intent740.getIntExtra("background740", 0);
        if(number74 == 0){
            Log.d("あいうえお740", "あいうえお");
        } else if (number74 == 740) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent750 = getIntent();
        int number75 = intent750.getIntExtra("background750", 0);
        if(number75 == 0){
            Log.d("あいうえお750", "あいうえお");
        } else if (number75 == 750) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent760 = getIntent();
        int number76 = intent760.getIntExtra("background760", 0);
        if(number76 == 0){
            Log.d("あいうえお760", "あいうえお");
        } else if (number76 == 760) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent770 = getIntent();
        int number77 = intent770.getIntExtra("background770", 0);
        if(number77 == 0){
            Log.d("あいうえお770", "あいうえお");
        } else if (number77 == 770) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent780 = getIntent();
        int number78 = intent780.getIntExtra("background780", 0);
        if(number78 == 0){
            Log.d("あいうえお780", "あいうえお");
        } else if (number78 == 780) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent790 = getIntent();
        int number79 = intent790.getIntExtra("background790", 0);
        if(number79 == 0){
            Log.d("あいうえお790", "あいうえお");
        } else if (number79 == 790) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent800 = getIntent();
        int number80 = intent800.getIntExtra("background800", 0);
        if(number80 == 0){
            Log.d("あいうえお799", "あいうえお");
        } else if (number80 == 799) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent810 = getIntent();
        int number81 = intent810.getIntExtra("background810", 0);
        if(number81 == 0){
            Log.d("あいうえお810", "あいうえお");
        } else if (number81 == 810) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent820 = getIntent();
        int number82 = intent820.getIntExtra("background820", 0);
        if(number82 == 0){
            Log.d("あいうえお820", "あいうえお");
        } else if (number82 == 820) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent830 = getIntent();
        int number83 = intent830.getIntExtra("background830", 0);
        if(number83 == 0){
            Log.d("あいうえお830", "あいうえお");
        } else if (number83 == 830) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent840 = getIntent();
        int number84 = intent840.getIntExtra("background840", 0);
        if(number84 == 0){
            Log.d("あいうえお840", "あいうえお");
        } else if (number84 == 840) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent850 = getIntent();
        int number85 = intent850.getIntExtra("background850", 0);
        if(number85 == 0){
            Log.d("あいうえお850", "あいうえお");
        } else if (number85 == 850) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent860 = getIntent();
        int number86 = intent860.getIntExtra("background860", 0);
        if(number86 == 0){
            Log.d("あいうえお860", "あいうえお");
        } else if (number86 == 860) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent870 = getIntent();
        int number87 = intent870.getIntExtra("background870", 0);
        if(number87 == 0){
            Log.d("あいうえお870", "あいうえお");
        } else if (number87 == 870) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent880 = getIntent();
        int number88 = intent880.getIntExtra("background880", 0);
        if(number88 == 0){
            Log.d("あいうえお880", "あいうえお");
        } else if (number88 == 880) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent890 = getIntent();
        int number89 = intent890.getIntExtra("background890", 0);
        if(number89 == 0){
            Log.d("あいうえお890", "あいうえお");
        } else if (number89 == 890) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent900 = getIntent();
        int number90 = intent900.getIntExtra("background900", 0);
        if(number90 == 0){
            Log.d("あいうえお900", "あいうえお");
        } else if (number90 == 900) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent910 = getIntent();
        int number91 = intent910.getIntExtra("background910", 0);
        if(number91 == 0){
            Log.d("あいうえお910", "あいうえお");
        } else if (number91 == 910) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent920 = getIntent();
        int number92 = intent920.getIntExtra("background920", 0);
        if(number92 == 0){
            Log.d("あいうえお920", "あいうえお");
        } else if (number92 == 920) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent930 = getIntent();
        int number93 = intent930.getIntExtra("background930", 0);
        if(number93 == 0){
            Log.d("あいうえお930", "あいうえお");
        } else if (number93 == 930) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent940 = getIntent();
        int number94 = intent940.getIntExtra("background940", 0);
        if(number94 == 0){
            Log.d("あいうえお940", "あいうえお");
        } else if (number94 == 940) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent950 = getIntent();
        int number95 = intent950.getIntExtra("background950", 0);
        if(number95 == 0){
            Log.d("あいうえお950", "あいうえお");
        } else if (number95 == 950) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent960 = getIntent();
        int number96 = intent960.getIntExtra("background960", 0);
        if(number96 == 0){
            Log.d("あいうえお960", "あいうえお");
        } else if (number96 == 960) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent970 = getIntent();
        int number97 = intent970.getIntExtra("background970", 0);
        if(number97 == 0){
            Log.d("あいうえお970", "あいうえお");
        } else if (number97 == 970) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent980 = getIntent();
        int number98 = intent980.getIntExtra("background980", 0);
        if(number98 == 0){
            Log.d("あいうえお980", "あいうえお");
        } else if (number98 == 980) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent990 = getIntent();
        int number99 = intent990.getIntExtra("background990", 0);
        if(number99 == 0){
            Log.d("あいうえお990", "あいうえお");
        } else if (number99 == 990) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent1000 = getIntent();
        int number100 = intent1000.getIntExtra("background1000", 0);
        if(number100 == 0){
            Log.d("あいうえお1000", "あいうえお");
        } else if (number100 == 1000) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background10(View v){
        Intent intentM10 = new Intent(this, BackGround0Activity.class);
        intentM10.putExtra("M10", 10);
        startActivity(intentM10);
    }

    public void save(View v){
        String memo1Text = editText1.getText().toString();
        String memo2Text = editText2.getText().toString();
        String memo3Text = editText3.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("memo1",memo1Text);
        editor.putString("memo2",memo2Text);
        editor.putString("memo3",memo3Text);
        editor.commit();

        finish();
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        // TODO Auto-generated method stub

        if(resultCode == RESULT_OK) {
            //ギャラリーから画像を選択してくる
            try {
                InputStream in = getContentResolver().openInputStream(data.getData());
                Bitmap img = BitmapFactory.decodeStream(in);
                in.close();
                Log.d("ああああああああああ", "いいいいいいいいいい");
                // 選択した画像を表示
                if (requestCode == 1){
                    imageView1.setImageBitmap(img);
                } else if(requestCode == 2){
                    imageView2.setImageBitmap(img);
                } else if(requestCode == 3){
                    imageView3.setImageBitmap(img);
                }

            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }



}