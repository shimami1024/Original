package com.example.lit.original;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.io.InputStream;


public class Make1Activity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 0;

    boolean flag;

    ImageView imageView;
    EditText editText;
    FrameLayout frameLayout;

    SharedPreferences preferencesMemo;
    SharedPreferences preferencesRotate;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make1);

        imageView = (ImageView)findViewById(R.id.imageView);
        editText = (EditText)findViewById(R.id.editText);
        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        //preferencesMemo = getSharedPreferences("pref_memo", MODE_PRIVATE);
        //preferencesRotate = getSharedPreferences("pref_rotate", MODE_PRIVATE);

        //editText.setText(preferencesMemo.getString("memo",""));
        //imageView.setRotation(preferencesRotate.getFloat("Rotation", 0));


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag != true){
                    //flagがtrueでなかったら(flagは常に３つの可能性(true, null, false))
                    // ギャラリー呼び出し
                    Intent intent = new Intent();
                    intent.setType("image/*");   //←jpegに限定する場合は, "image/jpeg"と指定.
                    //imageのtypeの選択
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    startActivityForResult(intent, REQUEST_GALLERY);
                }
                flag = false;
            }});

        final Button buttonR = new Button(this);
        final EditText rotation = new EditText(this);
        final LinearLayout linearLayoutR = new LinearLayout(this);

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //onLongClickが有効になる(booleanが長押しと判断したら)

                linearLayoutR.setOrientation(LinearLayout.HORIZONTAL);
                linearLayoutR.setX(320);
                linearLayoutR.setY(250);
                linearLayoutR.setBackgroundColor(Color.parseColor("#000000"));
                frameLayout.addView(linearLayoutR, 200, 100);
                rotation.setBackgroundColor(Color.parseColor("#ffffff"));
                LinearLayout.LayoutParams rLP = new LinearLayout.LayoutParams
                        (80, 80);
                rLP.setMargins(10, 10, 10, 10);
                rotation.setLayoutParams(rLP);
                rotation.setGravity(Gravity.TOP);
                rotation.setTextSize(20);
                buttonR.setBackgroundColor(Color.parseColor("#ffffff"));
                LinearLayout.LayoutParams bRLP = new LinearLayout.LayoutParams
                        (80, 80);
                bRLP.setMargins(10, 10, 10, 10);
                buttonR.setLayoutParams(bRLP);
                linearLayoutR.addView(rotation, 80, 80);
                linearLayoutR.addView(buttonR, 80, 80);
                Log.d("editText/button", "完了");
                rotation.setInputType(InputType.TYPE_CLASS_NUMBER);

                buttonR.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int degree;
                        SpannableStringBuilder ssb;
                        String Degree;
                        Log.d("D", "D");;
                        ssb = (SpannableStringBuilder)rotation.getText();
                        Log.d("if", "完了");
                        Degree = ssb.toString();
                        degree = Integer.parseInt(Degree);
                        Log.d("入力", "完了");
                        frameLayout.removeView(linearLayoutR);
                        frameLayout.removeView(rotation);
                        frameLayout.removeView(buttonR);
                        Log.d("削除", "完了");
                        imageView.setRotation(degree);
                    }
                });

                //このままだとonLongClickも反応してしまうのでonClickが反応しないようにflag = trueにしておく
                flag = true;
                //onLongClickではflagの真偽値は関係ない

                return false;
                //onLongClickが無効になる(もうbooleanは長押しと判断してない)
                //flagの値も無効になる（nullにもどる）
            }
        });


        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout1);

        Log.d("完了", "最終段階！");

        Intent intent1 = getIntent();
        int number1 = intent1.getIntExtra("background1", 0);
        if(number1 == 0){
            Log.d("あいうえお1", "あいうえお");
        } else if (number1 == 1) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent11 = getIntent();
        int number2 = intent11.getIntExtra("background11", 0);
        if(number2 == 0){
            Log.d("あいうえお11", "あいうえお");
        } else if (number2 == 11) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent21 = getIntent();
        int number3 = intent21.getIntExtra("background21", 0);
        if(number3 == 0){
            Log.d("あいうえお21", "あいうえお");
        } else if (number3 == 21) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent31 = getIntent();
        int number4 = intent31.getIntExtra("background31", 0);
        if(number4 == 0){
            Log.d("あいうえお31", "あいうえお");
        } else if (number4 == 31) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent41 = getIntent();
        int number5 = intent41.getIntExtra("background41", 0);
        if(number5 == 0){
            Log.d("あいうえお41", "あいうえお");
        } else if (number5 == 41) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent51 = getIntent();
        int number6 = intent51.getIntExtra("background51", 0);
        if(number6 == 0){
            Log.d("あいうえお51", "あいうえお");
        } else if (number6 == 51) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent61 = getIntent();
        int number7 = intent61.getIntExtra("background61", 0);
        if(number7 == 0){
            Log.d("あいうえお61", "あいうえお");
        } else if (number7 == 61) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent71 = getIntent();
        int number8 = intent71.getIntExtra("background71", 0);
        if(number8 == 0){
            Log.d("あいうえお71", "あいうえお");
        } else if (number8 == 71) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent81 = getIntent();
        int number9 = intent81.getIntExtra("background81", 0);
        if(number9 == 0){
            Log.d("あいうえお81", "あいうえお");
        } else if (number9 == 81) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent91 = getIntent();
        int number10 = intent91.getIntExtra("background91", 0);
        if(number10 == 0){
            Log.d("あいうえお91", "あいうえお");
        } else if (number10 == 91) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent101 = getIntent();
        int number11 = intent101.getIntExtra("background101", 0);
        if(number11 == 0){
            Log.d("あいうえお101", "あいうえお");
        } else if (number11 == 101) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent111 = getIntent();
        int number12 = intent111.getIntExtra("background111", 0);
        if(number12 == 0){
            Log.d("あいうえお111", "あいうえお");
        } else if (number12 == 111) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent121 = getIntent();
        int number13 = intent121.getIntExtra("background121", 0);
        if(number13 == 0){
            Log.d("あいうえお121", "あいうえお");
        } else if (number13 == 121) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent131 = getIntent();
        int number14 = intent131.getIntExtra("background131", 0);
        if(number14 == 0){
            Log.d("あいうえお131", "あいうえお");
        } else if (number14 == 131) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent141 = getIntent();
        int number15 = intent141.getIntExtra("background141", 0);
        if(number15 == 0){
            Log.d("あいうえお141", "あいうえお");
        } else if (number15 == 141) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent151 = getIntent();
        int number16 = intent151.getIntExtra("background151", 0);
        if(number16 == 0){
            Log.d("あいうえお151", "あいうえお");
        } else if (number16 == 151) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent161 = getIntent();
        int number17 = intent161.getIntExtra("background161", 0);
        if(number17 == 0){
            Log.d("あいうえお161", "あいうえお");
        } else if (number17 == 161) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent171 = getIntent();
        int number18 = intent171.getIntExtra("background171", 0);
        if(number18 == 0){
            Log.d("あいうえお171", "あいうえお");
        } else if (number18 == 171) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent181 = getIntent();
        int number19 = intent181.getIntExtra("background181", 0);
        if(number19 == 0){
            Log.d("あいうえお181", "あいうえお");
        } else if (number19 == 181) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent191 = getIntent();
        int number20 = intent191.getIntExtra("background191", 0);
        if(number20 == 0){
            Log.d("あいうえお191", "あいうえお");
        } else if (number20 == 191) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent201 = getIntent();
        int number21 = intent201.getIntExtra("background201", 0);
        if(number21 == 0){
            Log.d("あいうえお201", "あいうえお");
        } else if (number21 == 201) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent211 = getIntent();
        int number22 = intent211.getIntExtra("background211", 0);
        if(number22 == 0){
            Log.d("あいうえお211", "あいうえお");
        } else if (number22 == 211) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent221 = getIntent();
        int number23 = intent221.getIntExtra("background221", 0);
        if(number23 == 0){
            Log.d("あいうえお221", "あいうえお");
        } else if (number23 == 221) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent231 = getIntent();
        int number24 = intent231.getIntExtra("background231", 0);
        if(number24 == 0){
            Log.d("あいうえお231", "あいうえお");
        } else if (number24 == 231) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent241 = getIntent();
        int number25 = intent241.getIntExtra("background241", 0);
        if(number25 == 0){
            Log.d("あいうえお241", "あいうえお");
        } else if (number25 == 241) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent251 = getIntent();
        int number26 = intent251.getIntExtra("background251", 0);
        if(number26 == 0){
            Log.d("あいうえお251", "あいうえお");
        } else if (number26 == 251) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent261 = getIntent();
        int number27 = intent261.getIntExtra("background261", 0);
        if(number27 == 0){
            Log.d("あいうえお261", "あいうえお");
        } else if (number27 == 261) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent271 = getIntent();
        int number28 = intent271.getIntExtra("background271", 0);
        if(number28 == 0){
            Log.d("あいうえお271", "あいうえお");
        } else if (number28 == 271) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent281 = getIntent();
        int number29 = intent281.getIntExtra("background281", 0);
        if(number29 == 0){
            Log.d("あいうえお281", "あいうえお");
        } else if (number29 == 281) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent291 = getIntent();
        int number30 = intent291.getIntExtra("background291", 0);
        if(number30 == 0){
            Log.d("あいうえお291", "あいうえお");
        } else if (number30 == 291) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent301 = getIntent();
        int number31 = intent301.getIntExtra("background301", 0);
        if(number31 == 0){
            Log.d("あいうえお301", "あいうえお");
        } else if (number31 == 301) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent311 = getIntent();
        int number32 = intent311.getIntExtra("background311", 0);
        if(number32 == 0){
            Log.d("あいうえお311", "あいうえお");
        } else if (number32 == 311) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent321 = getIntent();
        int number33 = intent321.getIntExtra("background321", 0);
        if(number33 == 0){
            Log.d("あいうえお321", "あいうえお");
        } else if (number33 == 321) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent331 = getIntent();
        int number34 = intent331.getIntExtra("background331", 0);
        if(number34 == 0){
            Log.d("あいうえお331", "あいうえお");
        } else if (number34 == 331) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent341 = getIntent();
        int number35 = intent341.getIntExtra("background341", 0);
        if(number35 == 0){
            Log.d("あいうえお341", "あいうえお");
        } else if (number35 == 341) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent351 = getIntent();
        int number36 = intent351.getIntExtra("background351", 0);
        if(number36 == 0){
            Log.d("あいうえお351", "あいうえお");
        } else if (number36 == 351) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent361 = getIntent();
        int number37 = intent361.getIntExtra("background361", 0);
        if(number37 == 0){
            Log.d("あいうえお361", "あいうえお");
        } else if (number37 == 361) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent371 = getIntent();
        int number38 = intent371.getIntExtra("background371", 0);
        if(number38 == 0){
            Log.d("あいうえお371", "あいうえお");
        } else if (number38 == 371) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent381 = getIntent();
        int number39 = intent381.getIntExtra("background381", 0);
        if(number39 == 0){
            Log.d("あいうえお381", "あいうえお");
        } else if (number39 == 381) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent391 = getIntent();
        int number40 = intent391.getIntExtra("background391", 0);
        if(number40 == 0){
            Log.d("あいうえお391", "あいうえお");
        } else if (number40 == 391) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent401 = getIntent();
        int number41 = intent401.getIntExtra("background401", 0);
        if(number41 == 0){
            Log.d("あいうえお401", "あいうえお");
        } else if (number41 == 401) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent411 = getIntent();
        int number42 = intent411.getIntExtra("background411", 0);
        if(number42 == 0){
            Log.d("あいうえお411", "あいうえお");
        } else if (number42 == 411) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent421 = getIntent();
        int number43 = intent421.getIntExtra("background421", 0);
        if(number43 == 0){
            Log.d("あいうえお421", "あいうえお");
        } else if (number43 == 421) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent431 = getIntent();
        int number44 = intent431.getIntExtra("background431", 0);
        if(number44 == 0){
            Log.d("あいうえお431", "あいうえお");
        } else if (number44 == 431) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent441 = getIntent();
        int number45 = intent441.getIntExtra("background441", 0);
        if(number45 == 0){
            Log.d("あいうえお441", "あいうえお");
        } else if (number45 == 441) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent451 = getIntent();
        int number46 = intent451.getIntExtra("background451", 0);
        if(number46 == 0){
            Log.d("あいうえお451", "あいうえお");
        } else if (number46 == 451) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent461 = getIntent();
        int number47 = intent461.getIntExtra("background461", 0);
        if(number47 == 0){
            Log.d("あいうえお461", "あいうえお");
        } else if (number47 == 461) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent471 = getIntent();
        int number48 = intent471.getIntExtra("background471", 0);
        if(number48 == 0){
            Log.d("あいうえお471", "あいうえお");
        } else if (number48 == 471) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent481 = getIntent();
        int number49 = intent481.getIntExtra("background481", 0);
        if(number49 == 0){
            Log.d("あいうえお481", "あいうえお");
        } else if (number49 == 481) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent491 = getIntent();
        int number50 = intent491.getIntExtra("background491", 0);
        if(number50 == 0){
            Log.d("あいうえお491", "あいうえお");
        } else if (number50 == 491) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent501 = getIntent();
        int number51 = intent501.getIntExtra("background501", 0);
        if(number51 == 0){
            Log.d("あいうえお501", "あいうえお");
        } else if (number51 == 501) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent511 = getIntent();
        int number52 = intent511.getIntExtra("background511", 0);
        if(number52 == 0){
            Log.d("あいうえお511", "あいうえお");
        } else if (number52 == 511) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent521 = getIntent();
        int number53 = intent521.getIntExtra("background521", 0);
        if(number53 == 0){
            Log.d("あいうえお521", "あいうえお");
        } else if (number53 == 521) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent531 = getIntent();
        int number54 = intent531.getIntExtra("background531", 0);
        if(number54 == 0){
            Log.d("あいうえお531", "あいうえお");
        } else if (number54 == 531) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent541 = getIntent();
        int number55 = intent541.getIntExtra("background541", 0);
        if(number55 == 0){
            Log.d("あいうえお541", "あいうえお");
        } else if (number55 == 541) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent551 = getIntent();
        int number56 = intent551.getIntExtra("background551", 0);
        if(number56 == 0){
            Log.d("あいうえお551", "あいうえお");
        } else if (number56 == 551) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent561 = getIntent();
        int number57 = intent561.getIntExtra("background561", 0);
        if(number57 == 0){
            Log.d("あいうえお561", "あいうえお");
        } else if (number57 == 561) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent571 = getIntent();
        int number58 = intent571.getIntExtra("background571", 0);
        if(number58 == 0){
            Log.d("あいうえお571", "あいうえお");
        } else if (number58 == 571) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent581 = getIntent();
        int number59 = intent581.getIntExtra("background581", 0);
        if(number59 == 0){
            Log.d("あいうえお581", "あいうえお");
        } else if (number59 == 581) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent591 = getIntent();
        int number60 = intent591.getIntExtra("background591", 0);
        if(number60 == 0){
            Log.d("あいうえお591", "あいうえお");
        } else if (number60 == 591) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent601 = getIntent();
        int number61 = intent601.getIntExtra("background601", 0);
        if(number61 == 0){
            Log.d("あいうえお601", "あいうえお");
        } else if (number61 == 601) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent611 = getIntent();
        int number62 = intent611.getIntExtra("background611", 0);
        if(number62 == 0){
            Log.d("あいうえお611", "あいうえお");
        } else if (number62 == 611) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent621 = getIntent();
        int number63 = intent621.getIntExtra("background621", 0);
        if(number63 == 0){
            Log.d("あいうえお621", "あいうえお");
        } else if (number63 == 621) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent631 = getIntent();
        int number64 = intent631.getIntExtra("background631", 0);
        if(number64 == 0){
            Log.d("あいうえお631", "あいうえお");
        } else if (number64 == 631) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent641 = getIntent();
        int number65 = intent641.getIntExtra("background641", 0);
        if(number65 == 0){
            Log.d("あいうえお641", "あいうえお");
        } else if (number65 == 641) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent651 = getIntent();
        int number66 = intent651.getIntExtra("background651", 0);
        if(number66 == 0){
            Log.d("あいうえお651", "あいうえお");
        } else if (number66 == 651) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent661 = getIntent();
        int number67 = intent661.getIntExtra("background661", 0);
        if(number67 == 0){
            Log.d("あいうえお661", "あいうえお");
        } else if (number67 == 661) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent671 = getIntent();
        int number68 = intent671.getIntExtra("background671", 0);
        if(number68 == 0){
            Log.d("あいうえお671", "あいうえお");
        } else if (number68 == 671) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent681 = getIntent();
        int number69 = intent681.getIntExtra("background681", 0);
        if(number69 == 0){
            Log.d("あいうえお681", "あいうえお");
        } else if (number69 == 681) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }
        Intent intent691 = getIntent();
        int number70 = intent691.getIntExtra("background691", 0);
        if(number70 == 0){
            Log.d("あいうえお691", "あいうえお");
        } else if (number70 == 691) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }
        Intent intent701 = getIntent();
        int number71 = intent701.getIntExtra("background701", 0);
        if(number71 == 0){
            Log.d("あいうえお701", "あいうえお");
        } else if (number71 == 701) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }
        Intent intent711 = getIntent();
        int number72 = intent711.getIntExtra("background711", 0);
        if(number72 == 0){
            Log.d("あいうえお72", "あいうえお");
        } else if (number72 == 711) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent721 = getIntent();
        int number73 = intent721.getIntExtra("background721", 0);
        if(number73 == 0){
            Log.d("あいうえお721", "あいうえお");
        } else if (number73 == 721) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent731 = getIntent();
        int number74 = intent731.getIntExtra("background731", 0);
        if(number74 == 0){
            Log.d("あいうえお731", "あいうえお");
        } else if (number74 == 731) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent741 = getIntent();
        int number75 = intent741.getIntExtra("background741", 0);
        if(number75 == 0){
            Log.d("あいうえお741", "あいうえお");
        } else if (number75 == 741) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent751 = getIntent();
        int number76 = intent751.getIntExtra("background751", 0);
        if(number76 == 0){
            Log.d("あいうえお751", "あいうえお");
        } else if (number76 == 751) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent761 = getIntent();
        int number77 = intent761.getIntExtra("background761", 0);
        if(number77 == 0){
            Log.d("あいうえお761", "あいうえお");
        } else if (number77 == 761) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent771 = getIntent();
        int number78 = intent771.getIntExtra("background771", 0);
        if(number78 == 0){
            Log.d("あいうえお771", "あいうえお");
        } else if (number78 == 771) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent781 = getIntent();
        int number79 = intent781.getIntExtra("background781", 0);
        if(number79 == 0){
            Log.d("あいうえお781", "あいうえお");
        } else if (number79 == 781) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent791 = getIntent();
        int number80 = intent791.getIntExtra("background791", 0);
        if(number80 == 0){
            Log.d("あいうえお791", "あいうえお");
        } else if (number80 == 791) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent801 = getIntent();
        int number81 = intent801.getIntExtra("background801", 0);
        if(number81 == 0){
            Log.d("あいうえお801", "あいうえお");
        } else if (number81 == 801) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent811 = getIntent();
        int number82 = intent811.getIntExtra("background811", 0);
        if(number82 == 0){
            Log.d("あいうえお811", "あいうえお");
        } else if (number82 == 811) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent821 = getIntent();
        int number83 = intent821.getIntExtra("background821", 0);
        if(number83 == 0){
            Log.d("あいうえお821", "あいうえお");
        } else if (number83 == 821) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent831 = getIntent();
        int number84 = intent831.getIntExtra("background831", 0);
        if(number84 == 0){
            Log.d("あいうえお831", "あいうえお");
        } else if (number84 == 831) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent841 = getIntent();
        int number85 = intent841.getIntExtra("background841", 0);
        if(number85 == 0){
            Log.d("あいうえお841", "あいうえお");
        } else if (number85 == 841) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent851 = getIntent();
        int number86 = intent851.getIntExtra("background851", 0);
        if(number86 == 0){
            Log.d("あいうえお851", "あいうえお");
        } else if (number86 == 851) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent861 = getIntent();
        int number87 = intent861.getIntExtra("background861", 0);
        if(number87 == 0){
            Log.d("あいうえお861", "あいうえお");
        } else if (number87 == 861) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent871 = getIntent();
        int number88 = intent871.getIntExtra("background871", 0);
        if(number88 == 0){
            Log.d("あいうえお871", "あいうえお");
        } else if (number88 == 871) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent881 = getIntent();
        int number89 = intent881.getIntExtra("background881", 0);
        if(number89 == 0){
            Log.d("あいうえお881", "あいうえお");
        } else if (number89 == 881) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent891 = getIntent();
        int number90 = intent891.getIntExtra("background891", 0);
        if(number90 == 0){
            Log.d("あいうえお891", "あいうえお");
        } else if (number90 == 891) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent901 = getIntent();
        int number91 = intent901.getIntExtra("background901", 0);
        if(number91 == 0){
            Log.d("あいうえお901", "あいうえお");
        } else if (number91 == 901) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent911 = getIntent();
        int number92 = intent911.getIntExtra("background911", 0);
        if(number92 == 0){
            Log.d("あいうえお911", "あいうえお");
        } else if (number92 == 911) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent921 = getIntent();
        int number93 = intent921.getIntExtra("background921", 0);
        if(number93 == 0){
            Log.d("あいうえお921", "あいうえお");
        } else if (number93 == 921) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent931 = getIntent();
        int number94 = intent931.getIntExtra("background931", 0);
        if(number94 == 0){
            Log.d("あいうえお931", "あいうえお");
        } else if (number94 == 931) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent941 = getIntent();
        int number95 = intent941.getIntExtra("background941", 0);
        if(number95 == 0){
            Log.d("あいうえお941", "あいうえお");
        } else if (number95 == 941) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent951 = getIntent();
        int number96 = intent951.getIntExtra("background951", 0);
        if(number96 == 0){
            Log.d("あいうえお951", "あいうえお");
        } else if (number96 == 951) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent961 = getIntent();
        int number97 = intent961.getIntExtra("background961", 0);
        if(number97 == 0){
            Log.d("あいうえお961", "あいうえお");
        } else if (number97 == 961) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent971 = getIntent();
        int number98 = intent971.getIntExtra("background971", 0);
        if(number98 == 0){
            Log.d("あいうえお971", "あいうえお");
        } else if (number98 == 971) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent981 = getIntent();
        int number99 = intent981.getIntExtra("background981", 0);
        if(number99 == 0){
            Log.d("あいうえお981", "あいうえお");
        } else if (number99 == 981) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent991 = getIntent();
        int number100 = intent991.getIntExtra("background991", 0);
        if(number100 == 0){
            Log.d("あいうえお991", "あいうえお");
        } else if (number100 == 991) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
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
                Log.d("あ", "い");
                // 選択した画像を表示
                if(requestCode == 0){
                    imageView.setImageBitmap(img);
                }

            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        float x = event.getX();
        float y = event.getY();
        String action = "";

        switch(event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                action = "Touch Down";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "Touch Move";
                break;
            case MotionEvent.ACTION_UP:
                action = "Touch Up";

            Intent intentPin = getIntent();
            int PIN = intentPin.getIntExtra("Test", 0);
            Log.d("値", String.valueOf(PIN));
            if(PIN == 1){
                ImageView Pin = new ImageView(this);

                float PinX = x - 64;
                float PinY = y - 256;
                Pin.setX(PinX);
                Pin.setY(PinY);
                Pin.setBackgroundResource(R.drawable.pin1);
                frameLayout.addView(Pin, 100, 100);
            } else {
                Log.d("error", "エラー");
            }
                break;

            case MotionEvent.ACTION_CANCEL:
                action = "Touch Cancel";
                break;
        }

        Log.v("Touch", action + " x=" + x + ", y=" + y);
        return super.onTouchEvent(event);

    }


    public void background(View v){
        Intent intentM1 = new Intent(this, BackGround0Activity.class);
        intentM1.putExtra("M1", 1);
        startActivity(intentM1);
    }


    public void pin(View v){
        Intent intent1  = new Intent(this, PinActivity.class);
        startActivity(intent1);
    }


    public void save(View v){
        String memoText = editText.getText().toString();
        float rotate = imageView.getRotation();

        SharedPreferences.Editor editor = preferencesMemo.edit();
        SharedPreferences.Editor editor1 = preferencesRotate.edit();
        editor.putString("memo",memoText);
        editor1.putFloat("Rotation", rotate);
        editor.commit();
        editor1.commit();

        finish();

        Intent intentSave = new Intent(this, SaveActivity.class);
        startActivity(intentSave);
    }
}


