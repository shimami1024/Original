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


public class Make8Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_make8);

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

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout8);

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

        Intent intent8 = getIntent();
        int number1 = intent8.getIntExtra("background8", 0);
        if(number1 == 0){
            Log.d("あいうえお8", "あいうえお");
        } else if (number1 == 8) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent18 = getIntent();
        int number2 = intent18.getIntExtra("background18", 0);
        if(number2 == 0){
            Log.d("あいうえお18", "あいうえお");
        } else if (number2 == 18) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent28 = getIntent();
        int number3 = intent28.getIntExtra("background28", 0);
        if(number3 == 0){
            Log.d("あいうえお28", "あいうえお");
        } else if (number3 == 28) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent38 = getIntent();
        int number4 = intent38.getIntExtra("background38", 0);
        if(number4 == 0){
            Log.d("あいうえお38", "あいうえお");
        } else if (number4 == 38) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent48 = getIntent();
        int number5 = intent48.getIntExtra("background48", 0);
        if(number5 == 0){
            Log.d("あいうえお48", "あいうえお");
        } else if (number5 == 48) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent58 = getIntent();
        int number6 = intent58.getIntExtra("background58", 0);
        if(number6 == 0){
            Log.d("あいうえお58", "あいうえお");
        } else if (number6 == 58) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent68 = getIntent();
        int number7 = intent68.getIntExtra("background68", 0);
        if(number7 == 0){
            Log.d("あいうえお68", "あいうえお");
        } else if (number7 == 68) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent78 = getIntent();
        int number8 = intent78.getIntExtra("background78", 0);
        if(number8 == 0){
            Log.d("あいうえお78", "あいうえお");
        } else if (number8 == 78) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent88 = getIntent();
        int number9 = intent88.getIntExtra("background88", 0);
        if(number9 == 0){
            Log.d("あいうえお88", "あいうえお");
        } else if (number9 == 88) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent98 = getIntent();
        int number10 = intent98.getIntExtra("background98", 0);
        if(number10 == 0){
            Log.d("あいうえお98", "あいうえお");
        } else if (number10 == 98) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent108 = getIntent();
        int number11 = intent108.getIntExtra("background108", 0);
        if(number11 == 0){
            Log.d("あいうえお108", "あいうえお");
        } else if (number11 == 108) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent118 = getIntent();
        int number12 = intent118.getIntExtra("background118", 0);
        if(number12 == 0){
            Log.d("あいうえお118", "あいうえお");
        } else if (number12 == 118) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent128 = getIntent();
        int number13 = intent128.getIntExtra("background128", 0);
        if(number13 == 0){
            Log.d("あいうえお128", "あいうえお");
        } else if (number13 == 128) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent138 = getIntent();
        int number14 = intent138.getIntExtra("background138", 0);
        if(number14 == 0){
            Log.d("あいうえお138", "あいうえお");
        } else if (number14 == 138) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent148 = getIntent();
        int number15 = intent148.getIntExtra("background148", 0);
        if(number15 == 0){
            Log.d("あいうえお148", "あいうえお");
        } else if (number15 == 148) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent158 = getIntent();
        int number16 = intent158.getIntExtra("background158", 0);
        if(number16 == 0){
            Log.d("あいうえお158", "あいうえお");
        } else if (number16 == 158) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent168 = getIntent();
        int number17 = intent168.getIntExtra("background168", 0);
        if(number17 == 0){
            Log.d("あいうえお168", "あいうえお");
        } else if (number17 == 168) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent178 = getIntent();
        int number18 = intent178.getIntExtra("background178", 0);
        if(number18 == 0){
            Log.d("あいうえお178", "あいうえお");
        } else if (number18 == 178) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent188 = getIntent();
        int number19 = intent188.getIntExtra("background188", 0);
        if(number19 == 0){
            Log.d("あいうえお188", "あいうえお");
        } else if (number19 == 188) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent198 = getIntent();
        int number20 = intent198.getIntExtra("background198", 0);
        if(number20 == 0){
            Log.d("あいうえお198", "あいうえお");
        } else if (number20 == 198) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent208 = getIntent();
        int number21 = intent208.getIntExtra("background208", 0);
        if(number21 == 0){
            Log.d("あいうえお208", "あいうえお");
        } else if (number21 == 208) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent218 = getIntent();
        int number22 = intent218.getIntExtra("background218", 0);
        if(number22 == 0){
            Log.d("あいうえお218", "あいうえお");
        } else if (number22 == 218) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent228 = getIntent();
        int number23 = intent228.getIntExtra("background228", 0);
        if(number23 == 0){
            Log.d("あいうえお228", "あいうえお");
        } else if (number23 == 228) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent238 = getIntent();
        int number24 = intent238.getIntExtra("background238", 0);
        if(number24 == 0){
            Log.d("あいうえお238", "あいうえお");
        } else if (number24 == 238) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent248 = getIntent();
        int number25 = intent248.getIntExtra("background248", 0);
        if(number25 == 0){
            Log.d("あいうえお248", "あいうえお");
        } else if (number25 == 248) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent258 = getIntent();
        int number26 = intent258.getIntExtra("background258", 0);
        if(number26 == 0){
            Log.d("あいうえお258", "あいうえお");
        } else if (number26 == 258) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent268 = getIntent();
        int number27 = intent268.getIntExtra("background268", 0);
        if(number27 == 0){
            Log.d("あいうえお268", "あいうえお");
        } else if (number27 == 268) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent278 = getIntent();
        int number28 = intent278.getIntExtra("background278", 0);
        if(number28 == 0){
            Log.d("あいうえお278", "あいうえお");
        } else if (number28 == 278) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent288 = getIntent();
        int number29 = intent288.getIntExtra("background288", 0);
        if(number29 == 0){
            Log.d("あいうえお288", "あいうえお");
        } else if (number29 == 288) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent298 = getIntent();
        int number30 = intent298.getIntExtra("background298", 0);
        if(number30 == 0){
            Log.d("あいうえお298", "あいうえお");
        } else if (number30 == 298) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent308 = getIntent();
        int number31 = intent308.getIntExtra("background308", 0);
        if(number31 == 0){
            Log.d("あいうえお308", "あいうえお");
        } else if (number31 == 308) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent318 = getIntent();
        int number32 = intent318.getIntExtra("background318", 0);
        if(number32 == 0){
            Log.d("あいうえお318", "あいうえお");
        } else if (number32 == 318) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent328 = getIntent();
        int number33 = intent328.getIntExtra("background328", 0);
        if(number33 == 0){
            Log.d("あいうえお328", "あいうえお");
        } else if (number33 == 328) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent338 = getIntent();
        int number34 = intent338.getIntExtra("background338", 0);
        if(number34 == 0){
            Log.d("あいうえお338", "あいうえお");
        } else if (number34 == 338) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent348 = getIntent();
        int number35 = intent348.getIntExtra("background348", 0);
        if(number35 == 0){
            Log.d("あいうえお348", "あいうえお");
        } else if (number35 == 348) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent358 = getIntent();
        int number36 = intent358.getIntExtra("background358", 0);
        if(number36 == 0){
            Log.d("あいうえお358", "あいうえお");
        } else if (number36 == 358) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent368 = getIntent();
        int number37 = intent368.getIntExtra("background368", 0);
        if(number37 == 0){
            Log.d("あいうえお368", "あいうえお");
        } else if (number37 == 368) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent378 = getIntent();
        int number38 = intent378.getIntExtra("background378", 0);
        if(number38 == 0){
            Log.d("あいうえお378", "あいうえお");
        } else if (number38 == 378) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent388 = getIntent();
        int number39 = intent388.getIntExtra("background388", 0);
        if(number39 == 0){
            Log.d("あいうえお388", "あいうえお");
        } else if (number39 == 388) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent398 = getIntent();
        int number40 = intent398.getIntExtra("background398", 0);
        if(number40 == 0){
            Log.d("あいうえお398", "あいうえお");
        } else if (number40 == 398) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent408 = getIntent();
        int number41 = intent408.getIntExtra("background408", 0);
        if(number41 == 0){
            Log.d("あいうえお408", "あいうえお");
        } else if (number41 == 408) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent418 = getIntent();
        int number42 = intent418.getIntExtra("background418", 0);
        if(number42 == 0){
            Log.d("あいうえお418", "あいうえお");
        } else if (number42 == 418) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent428 = getIntent();
        int number43 = intent428.getIntExtra("background428", 0);
        if(number43 == 0){
            Log.d("あいうえお428", "あいうえお");
        } else if (number43 == 428) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent438 = getIntent();
        int number44 = intent438.getIntExtra("background438", 0);
        if(number44 == 0){
            Log.d("あいうえお438", "あいうえお");
        } else if (number44 == 438) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent448 = getIntent();
        int number45 = intent448.getIntExtra("background448", 0);
        if(number45 == 0){
            Log.d("あいうえお448", "あいうえお");
        } else if (number45 == 448) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent458 = getIntent();
        int number46 = intent458.getIntExtra("background458", 0);
        if(number46 == 0){
            Log.d("あいうえお458", "あいうえお");
        } else if (number46 == 458) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent468 = getIntent();
        int number47 = intent468.getIntExtra("background468", 0);
        if(number47 == 0){
            Log.d("あいうえお468", "あいうえお");
        } else if (number47 == 468) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent478 = getIntent();
        int number48 = intent478.getIntExtra("background478", 0);
        if(number48 == 0){
            Log.d("あいうえお478", "あいうえお");
        } else if (number48 == 478) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent488 = getIntent();
        int number49 = intent488.getIntExtra("background488", 0);
        if(number49 == 0){
            Log.d("あいうえお488", "あいうえお");
        } else if (number49 == 488) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent498 = getIntent();
        int number50 = intent498.getIntExtra("background498", 0);
        if(number50 == 0){
            Log.d("あいうえお498", "あいうえお");
        } else if (number50 == 498) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent508 = getIntent();
        int number51 = intent508.getIntExtra("background508", 0);
        if(number51 == 0){
            Log.d("あいうえお508", "あいうえお");
        } else if (number51 == 508) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent518 = getIntent();
        int number52 = intent518.getIntExtra("background518", 0);
        if(number52 == 0){
            Log.d("あいうえお518", "あいうえお");
        } else if (number52 == 518) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent528 = getIntent();
        int number53 = intent528.getIntExtra("background528", 0);
        if(number53 == 0){
            Log.d("あいうえお528", "あいうえお");
        } else if (number53 == 528) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent538 = getIntent();
        int number54 = intent538.getIntExtra("background538", 0);
        if(number54 == 0){
            Log.d("あいうえお538", "あいうえお");
        } else if (number54 == 538) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent548 = getIntent();
        int number55 = intent548.getIntExtra("background548", 0);
        if(number55 == 0){
            Log.d("あいうえお548", "あいうえお");
        } else if (number55 == 548) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent558 = getIntent();
        int number56 = intent558.getIntExtra("background558", 0);
        if(number56 == 0){
            Log.d("あいうえお558", "あいうえお");
        } else if (number56 == 558) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent568 = getIntent();
        int number57 = intent568.getIntExtra("background568", 0);
        if(number57 == 0){
            Log.d("あいうえお568", "あいうえお");
        } else if (number57 == 568) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent578 = getIntent();
        int number58 = intent578.getIntExtra("background578", 0);
        if(number58 == 0){
            Log.d("あいうえお578", "あいうえお");
        } else if (number58 == 578) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent588 = getIntent();
        int number59 = intent588.getIntExtra("background588", 0);
        if(number59 == 0){
            Log.d("あいうえお588", "あいうえお");
        } else if (number59 == 588) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent598 = getIntent();
        int number60 = intent598.getIntExtra("background598", 0);
        if(number60 == 0){
            Log.d("あいうえお598", "あいうえお");
        } else if (number60 == 598) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent608 = getIntent();
        int number61 = intent608.getIntExtra("background608", 0);
        if(number61 == 0){
            Log.d("あいうえお608", "あいうえお");
        } else if (number61 == 608) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent618 = getIntent();
        int number62 = intent618.getIntExtra("background618", 0);
        if(number62 == 0){
            Log.d("あいうえお618", "あいうえお");
        } else if (number62 == 618) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent628 = getIntent();
        int number63 = intent628.getIntExtra("background628", 0);
        if(number63 == 0){
            Log.d("あいうえお628", "あいうえお");
        } else if (number63 == 628) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent638 = getIntent();
        int number64 = intent638.getIntExtra("background638", 0);
        if(number64 == 0){
            Log.d("あいうえお638", "あいうえお");
        } else if (number64 == 638) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent648 = getIntent();
        int number65 = intent648.getIntExtra("background648", 0);
        if(number65 == 0){
            Log.d("あいうえお648", "あいうえお");
        } else if (number65 == 648) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent658 = getIntent();
        int number66 = intent658.getIntExtra("background658", 0);
        if(number66 == 0){
            Log.d("あいうえお658", "あいうえお");
        } else if (number66 == 658) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent668 = getIntent();
        int number67 = intent668.getIntExtra("background668", 0);
        if(number67 == 0){
            Log.d("あいうえお668", "あいうえお");
        } else if (number67 == 668) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent678 = getIntent();
        int number68 = intent678.getIntExtra("background678", 0);
        if(number68 == 0){
            Log.d("あいうえお678", "あいうえお");
        } else if (number68 == 678) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent688 = getIntent();
        int number69 = intent688.getIntExtra("background688", 0);
        if(number69 == 0){
            Log.d("あいうえお688", "あいうえお");
        } else if (number69 == 688) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent698 = getIntent();
        int number70 = intent698.getIntExtra("background698", 0);
        if(number70 == 0){
            Log.d("あいうえお698", "あいうえお");
        } else if (number70 == 698) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent708 = getIntent();
        int number71 = intent708.getIntExtra("background708", 0);
        if(number71 == 0){
            Log.d("あいうえお708", "あいうえお");
        } else if (number71 == 708) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent718 = getIntent();
        int number72 = intent718.getIntExtra("background718", 0);
        if(number72 == 0){
            Log.d("あいうえお718", "あいうえお");
        } else if (number72 == 718) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent728 = getIntent();
        int number73 = intent728.getIntExtra("background728", 0);
        if(number73 == 0){
            Log.d("あいうえお728", "あいうえお");
        } else if (number73 == 728) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent738 = getIntent();
        int number74 = intent738.getIntExtra("background738", 0);
        if(number74 == 0){
            Log.d("あいうえお738", "あいうえお");
        } else if (number74 == 738) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent748 = getIntent();
        int number75 = intent748.getIntExtra("background748", 0);
        if(number75 == 0){
            Log.d("あいうえお748", "あいうえお");
        } else if (number75 == 748) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent758 = getIntent();
        int number76 = intent758.getIntExtra("background758", 0);
        if(number76 == 0){
            Log.d("あいうえお758", "あいうえお");
        } else if (number76 == 758) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent768 = getIntent();
        int number77 = intent768.getIntExtra("background768", 0);
        if(number77 == 0){
            Log.d("あいうえお768", "あいうえお");
        } else if (number77 == 768) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent778 = getIntent();
        int number78 = intent778.getIntExtra("background778", 0);
        if(number78 == 0){
            Log.d("あいうえお778", "あいうえお");
        } else if (number78 == 778) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent788 = getIntent();
        int number79 = intent788.getIntExtra("background788", 0);
        if(number79 == 0){
            Log.d("あいうえお788", "あいうえお");
        } else if (number79 == 788) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent798 = getIntent();
        int number80 = intent798.getIntExtra("background798", 0);
        if(number80 == 0){
            Log.d("あいうえお798", "あいうえお");
        } else if (number80 == 798) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent808 = getIntent();
        int number81 = intent808.getIntExtra("background808", 0);
        if(number81 == 0){
            Log.d("あいうえお808", "あいうえお");
        } else if (number81 == 808) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent818 = getIntent();
        int number82 = intent818.getIntExtra("background818", 0);
        if(number82 == 0){
            Log.d("あいうえお818", "あいうえお");
        } else if (number82 == 818) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent828 = getIntent();
        int number83 = intent828.getIntExtra("background828", 0);
        if(number83 == 0){
            Log.d("あいうえお828", "あいうえお");
        } else if (number83 == 828) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent838 = getIntent();
        int number84 = intent838.getIntExtra("background838", 0);
        if(number84 == 0){
            Log.d("あいうえお838", "あいうえお");
        } else if (number84 == 838) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent848 = getIntent();
        int number85 = intent848.getIntExtra("background848", 0);
        if(number85 == 0){
            Log.d("あいうえお848", "あいうえお");
        } else if (number85 == 848) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent858 = getIntent();
        int number86 = intent858.getIntExtra("background858", 0);
        if(number86 == 0){
            Log.d("あいうえお858", "あいうえお");
        } else if (number86 == 858) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent868 = getIntent();
        int number87 = intent868.getIntExtra("background868", 0);
        if(number87 == 0){
            Log.d("あいうえお868", "あいうえお");
        } else if (number87 == 868) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent878 = getIntent();
        int number88 = intent878.getIntExtra("background878", 0);
        if(number88 == 0){
            Log.d("あいうえお878", "あいうえお");
        } else if (number88 == 878) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent888 = getIntent();
        int number89 = intent888.getIntExtra("background888", 0);
        if(number89 == 0){
            Log.d("あいうえお888", "あいうえお");
        } else if (number89 == 888) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent898 = getIntent();
        int number90 = intent898.getIntExtra("background898", 0);
        if(number90 == 0){
            Log.d("あいうえお898", "あいうえお");
        } else if (number90 == 898) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent908 = getIntent();
        int number91 = intent908.getIntExtra("background908", 0);
        if(number91 == 0){
            Log.d("あいうえお908", "あいうえお");
        } else if (number91 == 908) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent918 = getIntent();
        int number92 = intent918.getIntExtra("background918", 0);
        if(number92 == 0){
            Log.d("あいうえお918", "あいうえお");
        } else if (number92 == 918) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent928 = getIntent();
        int number93 = intent928.getIntExtra("background928", 0);
        if(number93 == 0){
            Log.d("あいうえお928", "あいうえお");
        } else if (number93 == 928) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent938 = getIntent();
        int number94 = intent938.getIntExtra("background938", 0);
        if(number94 == 0){
            Log.d("あいうえお938", "あいうえお");
        } else if (number94 == 938) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent948 = getIntent();
        int number95 = intent948.getIntExtra("background948", 0);
        if(number95 == 0){
            Log.d("あいうえお948", "あいうえお");
        } else if (number95 == 948) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent958 = getIntent();
        int number96 = intent958.getIntExtra("background958", 0);
        if(number96 == 0){
            Log.d("あいうえお958", "あいうえお");
        } else if (number96 == 958) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent968 = getIntent();
        int number97 = intent968.getIntExtra("background968", 0);
        if(number97 == 0){
            Log.d("あいうえお968", "あいうえお");
        } else if (number97 == 968) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent978 = getIntent();
        int number98 = intent978.getIntExtra("background978", 0);
        if(number98 == 0){
            Log.d("あいうえお978", "あいうえお");
        } else if (number98 == 977) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent988 = getIntent();
        int number99 = intent988.getIntExtra("background988", 0);
        if(number99 == 0){
            Log.d("あいうえお988", "あいうえお");
        } else if (number99 == 988) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent998 = getIntent();
        int number100 = intent998.getIntExtra("background998", 0);
        if(number100 == 0){
            Log.d("あいうえお998", "あいうえお");
        } else if (number100 == 998) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background8(View v){
        Intent intentM8 = new Intent(this, BackGround0Activity.class);
        intentM8.putExtra("M8", 8);
        startActivity(intentM8);
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
                Log.d("ああああああああ", "いいいいいいいい");
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
