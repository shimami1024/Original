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


public class Make4Activity extends AppCompatActivity {
    //private static final int REQUEST_GALLERY = 0;

    ImageView imageView1;
    ImageView imageView2;
    EditText editText1;
    EditText editText2;

    SharedPreferences preferences;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make4);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText1.setText(preferences.getString("memo1",""));
        editText2.setText(preferences.getString("memo2",""));

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);

            }});

        //gitHubはCommit&Pushにする
        //editTextの文字の入力位置

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 2);

            }});

        Intent intent4 = getIntent();
        int number1 = intent4.getIntExtra("background4", 0);
        if(number1 == 0){
            Log.d("あいうえお4", "あいうえお");
        } else if (number1 == 4) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent14 = getIntent();
        int number2 = intent14.getIntExtra("background14", 0);
        if(number2 == 0){
            Log.d("あいうえお14", "あいうえお");
        } else if (number2 == 14) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent24 = getIntent();
        int number3 = intent24.getIntExtra("background24", 0);
        if(number3 == 0){
            Log.d("あいうえお24", "あいうえお");
        } else if (number3 == 24) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent34 = getIntent();
        int number4 = intent34.getIntExtra("background34", 0);
        if(number4 == 0){
            Log.d("あいうえお34", "あいうえお");
        } else if (number4 == 34) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent44 = getIntent();
        int number5 = intent44.getIntExtra("background44", 0);
        if(number5 == 0){
            Log.d("あいうえお44", "あいうえお");
        } else if (number5 == 44) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent54 = getIntent();
        int number6 = intent54.getIntExtra("background54", 0);
        if(number6 == 0){
            Log.d("あいうえお54", "あいうえお");
        } else if (number6 == 54) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent64 = getIntent();
        int number7 = intent64.getIntExtra("background64", 0);
        if(number7 == 0){
            Log.d("あいうえお64", "あいうえお");
        } else if (number7 == 64) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent74 = getIntent();
        int number8 = intent74.getIntExtra("background74", 0);
        if(number8 == 0){
            Log.d("あいうえお74", "あいうえお");
        } else if (number8 == 74) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent84 = getIntent();
        int number9 = intent84.getIntExtra("background84", 0);
        if(number9 == 0){
            Log.d("あいうえお84", "あいうえお");
        } else if (number9 == 84) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent94 = getIntent();
        int number10 = intent94.getIntExtra("background94", 0);
        if(number10 == 0){
            Log.d("あいうえお94", "あいうえお");
        } else if (number10 == 94) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent104 = getIntent();
        int number11 = intent104.getIntExtra("background104", 0);
        if(number11 == 0){
            Log.d("あいうえお104", "あいうえお");
        } else if (number11 == 104) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent114 = getIntent();
        int number12 = intent114.getIntExtra("background114", 0);
        if(number12 == 0){
            Log.d("あいうえお114", "あいうえお");
        } else if (number12 == 114) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent124 = getIntent();
        int number13 = intent124.getIntExtra("background124", 0);
        if(number13 == 0){
            Log.d("あいうえお124", "あいうえお");
        } else if (number13 == 124) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent134 = getIntent();
        int number14 = intent134.getIntExtra("background134", 0);
        if(number14 == 0){
            Log.d("あいうえお134", "あいうえお");
        } else if (number14 == 134) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent144 = getIntent();
        int number15 = intent144.getIntExtra("background144", 0);
        if(number15 == 0){
            Log.d("あいうえお144", "あいうえお");
        } else if (number15 == 144) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent154 = getIntent();
        int number16 = intent154.getIntExtra("background154", 0);
        if(number16 == 0){
            Log.d("あいうえお154", "あいうえお");
        } else if (number16 == 154) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent164 = getIntent();
        int number17 = intent164.getIntExtra("background164", 0);
        if(number17 == 0){
            Log.d("あいうえお164", "あいうえお");
        } else if (number17 == 164) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent174 = getIntent();
        int number18 = intent174.getIntExtra("background174", 0);
        if(number18 == 0){
            Log.d("あいうえお174", "あいうえお");
        } else if (number18 == 174) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent184 = getIntent();
        int number19 = intent184.getIntExtra("background184", 0);
        if(number19 == 0){
            Log.d("あいうえお184", "あいうえお");
        } else if (number19 == 184) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent194 = getIntent();
        int number20 = intent194.getIntExtra("background194", 0);
        if(number20 == 0){
            Log.d("あいうえお194", "あいうえお");
        } else if (number20 == 194) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent204 = getIntent();
        int number21 = intent204.getIntExtra("background204", 0);
        if(number21 == 0){
            Log.d("あいうえお204", "あいうえお");
        } else if (number21 == 204) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent214 = getIntent();
        int number22 = intent214.getIntExtra("background214", 0);
        if(number22 == 0){
            Log.d("あいうえお214", "あいうえお");
        } else if (number22 == 214) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent224 = getIntent();
        int number23 = intent224.getIntExtra("background224", 0);
        if(number23 == 0){
            Log.d("あいうえお224", "あいうえお");
        } else if (number23 == 224) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent234 = getIntent();
        int number24 = intent234.getIntExtra("background234", 0);
        if(number24 == 0){
            Log.d("あいうえお234", "あいうえお");
        } else if (number24 == 234) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent244 = getIntent();
        int number25 = intent244.getIntExtra("background244", 0);
        if(number25 == 0){
            Log.d("あいうえお244", "あいうえお");
        } else if (number25 == 244) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent254 = getIntent();
        int number26 = intent254.getIntExtra("background254", 0);
        if(number26 == 0){
            Log.d("あいうえお254", "あいうえお");
        } else if (number26 == 254) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent264 = getIntent();
        int number27 = intent264.getIntExtra("background264", 0);
        if(number27 == 0){
            Log.d("あいうえお264", "あいうえお");
        } else if (number27 == 264) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent274 = getIntent();
        int number28 = intent274.getIntExtra("background274", 0);
        if(number28 == 0){
            Log.d("あいうえお274", "あいうえお");
        } else if (number28 == 274) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent284 = getIntent();
        int number29 = intent284.getIntExtra("background284", 0);
        if(number29 == 0){
            Log.d("あいうえお284", "あいうえお");
        } else if (number29 == 284) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent294 = getIntent();
        int number30 = intent294.getIntExtra("background294", 0);
        if(number30 == 0){
            Log.d("あいうえお294", "あいうえお");
        } else if (number30 == 294) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent304 = getIntent();
        int number31 = intent304.getIntExtra("background304", 0);
        if(number31 == 0){
            Log.d("あいうえお304", "あいうえお");
        } else if (number31 == 304) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent314 = getIntent();
        int number32 = intent314.getIntExtra("background314", 0);
        if(number32 == 0){
            Log.d("あいうえお314", "あいうえお");
        } else if (number32 == 314) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent324 = getIntent();
        int number33 = intent324.getIntExtra("background324", 0);
        if(number33 == 0){
            Log.d("あいうえお324", "あいうえお");
        } else if (number33 == 324) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent334 = getIntent();
        int number34 = intent334.getIntExtra("background334", 0);
        if(number34 == 0){
            Log.d("あいうえお334", "あいうえお");
        } else if (number34 == 334) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent344 = getIntent();
        int number35 = intent344.getIntExtra("background344", 0);
        if(number35 == 0){
            Log.d("あいうえお344", "あいうえお");
        } else if (number35 == 344) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent354 = getIntent();
        int number36 = intent354.getIntExtra("background354", 0);
        if(number36 == 0){
            Log.d("あいうえお354", "あいうえお");
        } else if (number36 == 354) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent364 = getIntent();
        int number37 = intent364.getIntExtra("background364", 0);
        if(number37 == 0){
            Log.d("あいうえお364", "あいうえお");
        } else if (number37 == 364) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent374 = getIntent();
        int number38 = intent374.getIntExtra("background374", 0);
        if(number38 == 0){
            Log.d("あいうえお374", "あいうえお");
        } else if (number38 == 374) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent384 = getIntent();
        int number39 = intent384.getIntExtra("background384", 0);
        if(number39 == 0){
            Log.d("あいうえお384", "あいうえお");
        } else if (number39 == 384) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent394 = getIntent();
        int number40 = intent394.getIntExtra("background394", 0);
        if(number40 == 0){
            Log.d("あいうえお394", "あいうえお");
        } else if (number40 == 394) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent404 = getIntent();
        int number41 = intent404.getIntExtra("background404", 0);
        if(number41 == 0){
            Log.d("あいうえお404", "あいうえお");
        } else if (number41 == 404) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent414 = getIntent();
        int number42 = intent414.getIntExtra("background414", 0);
        if(number42 == 0){
            Log.d("あいうえお414", "あいうえお");
        } else if (number42 == 414) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent424 = getIntent();
        int number43 = intent424.getIntExtra("background424", 0);
        if(number43 == 0){
            Log.d("あいうえお424", "あいうえお");
        } else if (number43 == 424) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent434 = getIntent();
        int number44 = intent434.getIntExtra("background434", 0);
        if(number44 == 0){
            Log.d("あいうえお434", "あいうえお");
        } else if (number44 == 434) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent444 = getIntent();
        int number45 = intent444.getIntExtra("background444", 0);
        if(number45 == 0){
            Log.d("あいうえお444", "あいうえお");
        } else if (number45 == 444) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent454 = getIntent();
        int number46 = intent454.getIntExtra("background454", 0);
        if(number46 == 0){
            Log.d("あいうえお454", "あいうえお");
        } else if (number46 == 454) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent464 = getIntent();
        int number47 = intent464.getIntExtra("background464", 0);
        if(number47 == 0){
            Log.d("あいうえお464", "あいうえお");
        } else if (number47 == 464) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent474 = getIntent();
        int number48 = intent474.getIntExtra("background474", 0);
        if(number48 == 0){
            Log.d("あいうえお474", "あいうえお");
        } else if (number48 == 474) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent484 = getIntent();
        int number49 = intent484.getIntExtra("background484", 0);
        if(number49 == 0){
            Log.d("あいうえお484", "あいうえお");
        } else if (number49 == 484) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent494 = getIntent();
        int number50 = intent494.getIntExtra("background494", 0);
        if(number50 == 0){
            Log.d("あいうえお494", "あいうえお");
        } else if (number50 == 494) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent504 = getIntent();
        int number51 = intent504.getIntExtra("background504", 0);
        if(number51 == 0){
            Log.d("あいうえお504", "あいうえお");
        } else if (number51 == 504) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent514 = getIntent();
        int number52 = intent514.getIntExtra("background514", 0);
        if(number52 == 0){
            Log.d("あいうえお514", "あいうえお");
        } else if (number52 == 514) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent524 = getIntent();
        int number53 = intent524.getIntExtra("background524", 0);
        if(number53 == 0){
            Log.d("あいうえお524", "あいうえお");
        } else if (number53 == 524) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent534 = getIntent();
        int number54 = intent534.getIntExtra("background534", 0);
        if(number54 == 0){
            Log.d("あいうえお534", "あいうえお");
        } else if (number54 == 534) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent544 = getIntent();
        int number55 = intent544.getIntExtra("background544", 0);
        if(number55 == 0){
            Log.d("あいうえお544", "あいうえお");
        } else if (number55 == 544) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent554 = getIntent();
        int number56 = intent554.getIntExtra("background554", 0);
        if(number56 == 0){
            Log.d("あいうえお554", "あいうえお");
        } else if (number56 == 554) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent564 = getIntent();
        int number57 = intent564.getIntExtra("background564", 0);
        if(number57 == 0){
            Log.d("あいうえお564", "あいうえお");
        } else if (number57 == 564) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent574 = getIntent();
        int number58 = intent574.getIntExtra("background574", 0);
        if(number58 == 0){
            Log.d("あいうえお574", "あいうえお");
        } else if (number58 == 574) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }

        Intent intent584 = getIntent();
        int number59 = intent584.getIntExtra("background584", 0);
        if(number59 == 0){
            Log.d("あいうえお584", "あいうえお");
        } else if (number59 == 584) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent594 = getIntent();
        int number60 = intent594.getIntExtra("background594", 0);
        if(number60 == 0){
            Log.d("あいうえお594", "あいうえお");
        } else if (number60 == 594) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent604 = getIntent();
        int number61 = intent604.getIntExtra("background604", 0);
        if(number61 == 0){
            Log.d("あいうえお604", "あいうえお");
        } else if (number61 == 604) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }

        Intent intent614 = getIntent();
        int number62 = intent614.getIntExtra("background614", 0);
        if(number62 == 0){
            Log.d("あいうえお614", "あいうえお");
        } else if (number62 == 614) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }

        Intent intent624 = getIntent();
        int number63 = intent624.getIntExtra("background624", 0);
        if(number63 == 0){
            Log.d("あいうえお624", "あいうえお");
        } else if (number63 == 624) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }

        Intent intent634 = getIntent();
        int number64 = intent634.getIntExtra("background634", 0);
        if(number64 == 0){
            Log.d("あいうえお634", "あいうえお");
        } else if (number64 == 634) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent644 = getIntent();
        int number65 = intent644.getIntExtra("background644", 0);
        if(number65 == 0){
            Log.d("あいうえお644", "あいうえお");
        } else if (number65 == 644) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent654 = getIntent();
        int number66 = intent654.getIntExtra("background654", 0);
        if(number66 == 0){
            Log.d("あいうえお654", "あいうえお");
        } else if (number66 == 654) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent664 = getIntent();
        int number67 = intent664.getIntExtra("background664", 0);
        if(number67 == 0){
            Log.d("あいうえお664", "あいうえお");
        } else if (number67 == 664) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent674 = getIntent();
        int number68 = intent674.getIntExtra("background674", 0);
        if(number68 == 0){
            Log.d("あいうえお674", "あいうえお");
        } else if (number68 == 674) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }

        Intent intent684 = getIntent();
        int number69 = intent684.getIntExtra("background684", 0);
        if(number69 == 0){
            Log.d("あいうえお684", "あいうえお");
        } else if (number69 == 684) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }

        Intent intent694 = getIntent();
        int number70 = intent694.getIntExtra("background694", 0);
        if(number70 == 0){
            Log.d("あいうえお694", "あいうえお");
        } else if (number70 == 694) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }

        Intent intent704 = getIntent();
        int number71 = intent704.getIntExtra("background704", 0);
        if(number71 == 0){
            Log.d("あいうえお704", "あいうえお");
        } else if (number71 == 704) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }

        Intent intent714 = getIntent();
        int number72 = intent714.getIntExtra("background714", 0);
        if(number72 == 0){
            Log.d("あいうえお714", "あいうえお");
        } else if (number72 == 714) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }

        Intent intent724 = getIntent();
        int number73 = intent724.getIntExtra("background724", 0);
        if(number73 == 0){
            Log.d("あいうえお724", "あいうえお");
        } else if (number73 == 724) {
            layout.setBackgroundResource(R.drawable.backgroundh13);
        }

        Intent intent734 = getIntent();
        int number74 = intent734.getIntExtra("background734", 0);
        if(number74 == 0){
            Log.d("あいうえお734", "あいうえお");
        } else if (number74 == 734) {
            layout.setBackgroundResource(R.drawable.backgroundh14);
        }

        Intent intent744 = getIntent();
        int number75 = intent744.getIntExtra("background744", 0);
        if(number75 == 0){
            Log.d("あいうえお744", "あいうえお");
        } else if (number75 == 744) {
            layout.setBackgroundResource(R.drawable.backgroundh15);
        }

        Intent intent754 = getIntent();
        int number76 = intent754.getIntExtra("background754", 0);
        if(number76 == 0){
            Log.d("あいうえお754", "あいうえお");
        } else if (number76 == 754) {
            layout.setBackgroundResource(R.drawable.backgroundh16);
        }

        Intent intent764 = getIntent();
        int number77 = intent764.getIntExtra("background764", 0);
        if(number77 == 0){
            Log.d("あいうえお764", "あいうえお");
        } else if (number77 == 764) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }

        Intent intent774 = getIntent();
        int number78 = intent774.getIntExtra("background774", 0);
        if(number78 == 0){
            Log.d("あいうえお774", "あいうえお");
        } else if (number78 == 774) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }

        Intent intent784 = getIntent();
        int number79 = intent784.getIntExtra("background784", 0);
        if(number79 == 0){
            Log.d("あいうえお784", "あいうえお");
        } else if (number79 == 784) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }

        Intent intent794 = getIntent();
        int number80 = intent794.getIntExtra("background794", 0);
        if(number80 == 0){
            Log.d("あいうえお794", "あいうえお");
        } else if (number80 == 794) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }

        Intent intent804 = getIntent();
        int number81 = intent804.getIntExtra("background804", 0);
        if(number81 == 0){
            Log.d("あいうえお804", "あいうえお");
        } else if (number81 == 804) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }

        Intent intent814 = getIntent();
        int number82 = intent814.getIntExtra("background814", 0);
        if(number82 == 0){
            Log.d("あいうえお814", "あいうえお");
        } else if (number82 == 814) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }

        Intent intent824 = getIntent();
        int number83 = intent824.getIntExtra("background824", 0);
        if(number83 == 0){
            Log.d("あいうえお824", "あいうえお");
        } else if (number83 == 824) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }

        Intent intent834 = getIntent();
        int number84 = intent834.getIntExtra("background834", 0);
        if(number84 == 0){
            Log.d("あいうえお834", "あいうえお");
        } else if (number84 == 834) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent844 = getIntent();
        int number85 = intent844.getIntExtra("background844", 0);
        if(number85 == 0){
            Log.d("あいうえお844", "あいうえお");
        } else if (number85 == 844) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent854 = getIntent();
        int number86 = intent854.getIntExtra("background854", 0);
        if(number86 == 0){
            Log.d("あいうえお854", "あいうえお");
        } else if (number86 == 854) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent864 = getIntent();
        int number87 = intent864.getIntExtra("background864", 0);
        if(number87 == 0){
            Log.d("あいうえお864", "あいうえお");
        } else if (number87 == 864) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent874 = getIntent();
        int number88 = intent874.getIntExtra("background874", 0);
        if(number88 == 0){
            Log.d("あいうえお874", "あいうえお");
        } else if (number88 == 874) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent884 = getIntent();
        int number89 = intent884.getIntExtra("background884", 0);
        if(number89 == 0){
            Log.d("あいうえお884", "あいうえお");
        } else if (number89 == 884) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent894 = getIntent();
        int number90 = intent894.getIntExtra("background894", 0);
        if(number90 == 0){
            Log.d("あいうえお894", "あいうえお");
        } else if (number90 == 894) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent904 = getIntent();
        int number91 = intent904.getIntExtra("background904", 0);
        if(number91 == 0){
            Log.d("あいうえお904", "あいうえお");
        } else if (number91 == 904) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent914 = getIntent();
        int number92 = intent914.getIntExtra("background914", 0);
        if(number92 == 0){
            Log.d("あいうえお914", "あいうえお");
        } else if (number92 == 914) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent924 = getIntent();
        int number93 = intent924.getIntExtra("background924", 0);
        if(number93 == 0){
            Log.d("あいうえお924", "あいうえお");
        } else if (number93 == 924) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent934 = getIntent();
        int number94 = intent934.getIntExtra("background934", 0);
        if(number94 == 0){
            Log.d("あいうえお934", "あいうえお");
        } else if (number94 == 934) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent944 = getIntent();
        int number95 = intent944.getIntExtra("background944", 0);
        if(number95 == 0){
            Log.d("あいうえお944", "あいうえお");
        } else if (number95 == 944) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent954 = getIntent();
        int number96 = intent954.getIntExtra("background954", 0);
        if(number96 == 0){
            Log.d("あいうえお954", "あいうえお");
        } else if (number96 == 954) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent964 = getIntent();
        int number97 = intent964.getIntExtra("background964", 0);
        if(number97 == 0){
            Log.d("あいうえお964", "あいうえお");
        } else if (number97 == 964) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent974 = getIntent();
        int number98 = intent974.getIntExtra("background974", 0);
        if(number98 == 0){
            Log.d("あいうえお974", "あいうえお");
        } else if (number98 == 974) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent984 = getIntent();
        int number99 = intent984.getIntExtra("background984", 0);
        if(number99 == 0){
            Log.d("あいうえお984", "あいうえお");
        } else if (number99 == 984) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent994 = getIntent();
        int number100 = intent994.getIntExtra("background994", 0);
        if(number100 == 0){
            Log.d("あいうえお994", "あいうえお");
        } else if (number100 == 994) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background4(View v){
        Intent intentM4 = new Intent(this, BackGround0Activity.class);
        intentM4.putExtra("M4", 4);
        startActivity(intentM4);
    }

    public void save(View v){
        String memo1Text = editText1.getText().toString();
        String memo2Text = editText2.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("memo1",memo1Text);
        editor.putString("memo2",memo2Text);
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
                Log.d("ああああ", "いいいい");
                // 選択した画像を表示
                if (requestCode == 1){
                    imageView1.setImageBitmap(img);
                } else if(requestCode == 2){
                    imageView2.setImageBitmap(img);
                }

            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }

    //android
    //device monitor

}
