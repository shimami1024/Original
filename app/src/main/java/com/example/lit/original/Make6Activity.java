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


public class Make6Activity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 0;

    ImageView imageView1;
    ImageView imageView2;
    EditText editText1;
    EditText editText2;

    SharedPreferences preferences;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make6);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText1.setText(preferences.getString("memo1",""));
        editText2.setText(preferences.getString("memo2",""));

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout6);


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

        Intent intent6 = getIntent();
        int number1 = intent6.getIntExtra("background6", 0);
        if(number1 == 0){
            Log.d("あいうえお6", "あいうえお");
        } else if (number1 == 6) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent16 = getIntent();
        int number2 = intent16.getIntExtra("background16", 0);
        if(number2 == 0){
            Log.d("あいうえお16", "あいうえお");
        } else if (number2 == 16) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent26 = getIntent();
        int number3 = intent26.getIntExtra("background26", 0);
        if(number3 == 0){
            Log.d("あいうえお26", "あいうえお");
        } else if (number3 == 26) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent36 = getIntent();
        int number4 = intent36.getIntExtra("background36", 0);
        if(number4 == 0){
            Log.d("あいうえお36", "あいうえお");
        } else if (number4 == 36) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent46 = getIntent();
        int number5 = intent46.getIntExtra("background46", 0);
        if(number5 == 0){
            Log.d("あいうえお46", "あいうえお");
        } else if (number5 == 46) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent56 = getIntent();
        int number6 = intent56.getIntExtra("background56", 0);
        if(number6 == 0){
            Log.d("あいうえお56", "あいうえお");
        } else if (number6 == 56) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent66 = getIntent();
        int number7 = intent66.getIntExtra("background66", 0);
        if(number7 == 0){
            Log.d("あいうえお66", "あいうえお");
        } else if (number7 == 66) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent76 = getIntent();
        int number8 = intent76.getIntExtra("background76", 0);
        if(number8 == 0){
            Log.d("あいうえお76", "あいうえお");
        } else if (number8 == 76) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent86 = getIntent();
        int number9 = intent86.getIntExtra("background86", 0);
        if(number9 == 0){
            Log.d("あいうえお86", "あいうえお");
        } else if (number9 == 86) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent96 = getIntent();
        int number10 = intent96.getIntExtra("background96", 0);
        if(number10 == 0){
            Log.d("あいうえお96", "あいうえお");
        } else if (number10 == 96) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent106 = getIntent();
        int number11 = intent106.getIntExtra("background106", 0);
        if(number11 == 0){
            Log.d("あいうえお106", "あいうえお");
        } else if (number11 == 106) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent116 = getIntent();
        int number12 = intent116.getIntExtra("background116", 0);
        if(number12 == 0){
            Log.d("あいうえお116", "あいうえお");
        } else if (number12 == 116) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent126 = getIntent();
        int number13 = intent126.getIntExtra("background126", 0);
        if(number13 == 0){
            Log.d("あいうえお126", "あいうえお");
        } else if (number13 == 126) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent136 = getIntent();
        int number14 = intent136.getIntExtra("background136", 0);
        if(number14 == 0){
            Log.d("あいうえお136", "あいうえお");
        } else if (number14 == 136) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent146 = getIntent();
        int number15 = intent146.getIntExtra("background146", 0);
        if(number15 == 0){
            Log.d("あいうえお146", "あいうえお");
        } else if (number15 == 146) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent156 = getIntent();
        int number16 = intent156.getIntExtra("background156", 0);
        if(number16 == 0){
            Log.d("あいうえお156", "あいうえお");
        } else if (number16 == 156) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent166 = getIntent();
        int number17 = intent166.getIntExtra("background166", 0);
        if(number17 == 0){
            Log.d("あいうえお166", "あいうえお");
        } else if (number17 == 166) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent176 = getIntent();
        int number18 = intent176.getIntExtra("background176", 0);
        if(number18 == 0){
            Log.d("あいうえお176", "あいうえお");
        } else if (number18 == 176) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent186 = getIntent();
        int number19 = intent186.getIntExtra("background186", 0);
        if(number19 == 0){
            Log.d("あいうえお186", "あいうえお");
        } else if (number19 == 186) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent196 = getIntent();
        int number20 = intent196.getIntExtra("background196", 0);
        if(number20 == 0){
            Log.d("あいうえお196", "あいうえお");
        } else if (number20 == 196) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent206 = getIntent();
        int number21 = intent206.getIntExtra("background206", 0);
        if(number21 == 0){
            Log.d("あいうえお206", "あいうえお");
        } else if (number21 == 206) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent216 = getIntent();
        int number22 = intent216.getIntExtra("background216", 0);
        if(number22 == 0){
            Log.d("あいうえお216", "あいうえお");
        } else if (number22 == 216) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent226 = getIntent();
        int number23 = intent226.getIntExtra("background226", 0);
        if(number23 == 0){
            Log.d("あいうえお226", "あいうえお");
        } else if (number23 == 226) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent236 = getIntent();
        int number24 = intent236.getIntExtra("background236", 0);
        if(number24 == 0){
            Log.d("あいうえお236", "あいうえお");
        } else if (number24 == 236) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent246 = getIntent();
        int number25 = intent246.getIntExtra("background246", 0);
        if(number25 == 0){
            Log.d("あいうえお246", "あいうえお");
        } else if (number25 == 246) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent256 = getIntent();
        int number26 = intent256.getIntExtra("background256", 0);
        if(number26 == 0){
            Log.d("あいうえお256", "あいうえお");
        } else if (number26 == 256) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent266 = getIntent();
        int number27 = intent266.getIntExtra("background266", 0);
        if(number27 == 0){
            Log.d("あいうえお266", "あいうえお");
        } else if (number27 == 266) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent276 = getIntent();
        int number28 = intent276.getIntExtra("background276", 0);
        if(number28 == 0){
            Log.d("あいうえお276", "あいうえお");
        } else if (number28 == 276) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent286 = getIntent();
        int number29 = intent286.getIntExtra("background286", 0);
        if(number29 == 0){
            Log.d("あいうえお286", "あいうえお");
        } else if (number29 == 286) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent296 = getIntent();
        int number30 = intent296.getIntExtra("background296", 0);
        if(number30 == 0){
            Log.d("あいうえお296", "あいうえお");
        } else if (number30 == 296) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent306 = getIntent();
        int number31 = intent306.getIntExtra("background306", 0);
        if(number31 == 0){
            Log.d("あいうえお306", "あいうえお");
        } else if (number31 == 306) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent316 = getIntent();
        int number32 = intent316.getIntExtra("background316", 0);
        if(number32 == 0){
            Log.d("あいうえお316", "あいうえお");
        } else if (number32 == 316) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent326 = getIntent();
        int number33 = intent326.getIntExtra("background326", 0);
        if(number33 == 0){
            Log.d("あいうえお326", "あいうえお");
        } else if (number33 == 326) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent336 = getIntent();
        int number34 = intent336.getIntExtra("background336", 0);
        if(number34 == 0){
            Log.d("あいうえお336", "あいうえお");
        } else if (number34 == 336) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent346 = getIntent();
        int number35 = intent346.getIntExtra("background346", 0);
        if(number35 == 0){
            Log.d("あいうえお346", "あいうえお");
        } else if (number35 == 346) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent356 = getIntent();
        int number36 = intent356.getIntExtra("background356", 0);
        if(number36 == 0){
            Log.d("あいうえお356", "あいうえお");
        } else if (number36 == 356) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent366 = getIntent();
        int number37 = intent366.getIntExtra("background366", 0);
        if(number37 == 0){
            Log.d("あいうえお366", "あいうえお");
        } else if (number37 == 366) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent376 = getIntent();
        int number38 = intent376.getIntExtra("background376", 0);
        if(number38 == 0){
            Log.d("あいうえお376", "あいうえお");
        } else if (number38 == 376) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent386 = getIntent();
        int number39 = intent386.getIntExtra("background386", 0);
        if(number39 == 0){
            Log.d("あいうえお386", "あいうえお");
        } else if (number39 == 386) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent396 = getIntent();
        int number40 = intent396.getIntExtra("background396", 0);
        if(number40 == 0){
            Log.d("あいうえお396", "あいうえお");
        } else if (number40 == 396) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent406 = getIntent();
        int number41 = intent406.getIntExtra("background406", 0);
        if(number41 == 0){
            Log.d("あいうえお406", "あいうえお");
        } else if (number41 == 406) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent416 = getIntent();
        int number42 = intent416.getIntExtra("background416", 0);
        if(number42 == 0){
            Log.d("あいうえお416", "あいうえお");
        } else if (number42 == 416) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent426 = getIntent();
        int number43 = intent426.getIntExtra("background426", 0);
        if(number43 == 0){
            Log.d("あいうえお426", "あいうえお");
        } else if (number43 == 426) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent436 = getIntent();
        int number44 = intent436.getIntExtra("background436", 0);
        if(number44 == 0){
            Log.d("あいうえお436", "あいうえお");
        } else if (number44 == 436) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent446 = getIntent();
        int number45 = intent446.getIntExtra("background446", 0);
        if(number45 == 0){
            Log.d("あいうえお446", "あいうえお");
        } else if (number45 == 446) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent456 = getIntent();
        int number46 = intent456.getIntExtra("background456", 0);
        if(number46 == 0){
            Log.d("あいうえお456", "あいうえお");
        } else if (number46 == 456) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent466 = getIntent();
        int number47 = intent466.getIntExtra("background466", 0);
        if(number47 == 0){
            Log.d("あいうえお466", "あいうえお");
        } else if (number47 == 466) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent476 = getIntent();
        int number48 = intent476.getIntExtra("background476", 0);
        if(number48 == 0){
            Log.d("あいうえお476", "あいうえお");
        } else if (number48 == 476) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent486 = getIntent();
        int number49 = intent486.getIntExtra("background486", 0);
        if(number49 == 0){
            Log.d("あいうえお486", "あいうえお");
        } else if (number49 == 486) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent496 = getIntent();
        int number50 = intent496.getIntExtra("background496", 0);
        if(number50 == 0){
            Log.d("あいうえお496", "あいうえお");
        } else if (number50 == 496) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent506 = getIntent();
        int number51 = intent506.getIntExtra("background506", 0);
        if(number51 == 0){
            Log.d("あいうえお506", "あいうえお");
        } else if (number51 == 506) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent516 = getIntent();
        int number52 = intent516.getIntExtra("background516", 0);
        if(number52 == 0){
            Log.d("あいうえお516", "あいうえお");
        } else if (number52 == 516) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent526 = getIntent();
        int number53 = intent526.getIntExtra("background526", 0);
        if(number53 == 0){
            Log.d("あいうえお526", "あいうえお");
        } else if (number53 == 526) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent536 = getIntent();
        int number54 = intent536.getIntExtra("background536", 0);
        if(number54 == 0){
            Log.d("あいうえお536", "あいうえお");
        } else if (number54 == 536) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent546 = getIntent();
        int number55 = intent546.getIntExtra("background546", 0);
        if(number55 == 0){
            Log.d("あいうえお546", "あいうえお");
        } else if (number55 == 546) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent556 = getIntent();
        int number56 = intent556.getIntExtra("background556", 0);
        if(number56 == 0){
            Log.d("あいうえお556", "あいうえお");
        } else if (number56 == 556) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent566 = getIntent();
        int number57 = intent566.getIntExtra("background566", 0);
        if(number57 == 0){
            Log.d("あいうえお566", "あいうえお");
        } else if (number57 == 566) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent576 = getIntent();
        int number58 = intent576.getIntExtra("background576", 0);
        if(number58 == 0){
            Log.d("あいうえお576", "あいうえお");
        } else if (number58 == 576) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent586 = getIntent();
        int number59 = intent586.getIntExtra("background586", 0);
        if(number59 == 0){
            Log.d("あいうえお586", "あいうえお");
        } else if (number59 == 586) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent596 = getIntent();
        int number60 = intent596.getIntExtra("background596", 0);
        if(number60 == 0){
            Log.d("あいうえお596", "あいうえお");
        } else if (number60 == 596) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent606 = getIntent();
        int number61 = intent606.getIntExtra("background606", 0);
        if(number61 == 0){
            Log.d("あいうえお606", "あいうえお");
        } else if (number61 == 606) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent616 = getIntent();
        int number62 = intent616.getIntExtra("background616", 0);
        if(number62 == 0){
            Log.d("あいうえお616", "あいうえお");
        } else if (number62 == 616) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent626 = getIntent();
        int number63 = intent626.getIntExtra("background626", 0);
        if(number63 == 0){
            Log.d("あいうえお626", "あいうえお");
        } else if (number63 == 626) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent636 = getIntent();
        int number64 = intent636.getIntExtra("background636", 0);
        if(number64 == 0){
            Log.d("あいうえお636", "あいうえお");
        } else if (number64 == 636) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent646 = getIntent();
        int number65 = intent646.getIntExtra("background646", 0);
        if(number65 == 0){
            Log.d("あいうえお646", "あいうえお");
        } else if (number65 == 646) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent656 = getIntent();
        int number66 = intent656.getIntExtra("background656", 0);
        if(number66 == 0){
            Log.d("あいうえお656", "あいうえお");
        } else if (number66 == 656) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent666 = getIntent();
        int number67 = intent666.getIntExtra("background666", 0);
        if(number67 == 0){
            Log.d("あいうえお666", "あいうえお");
        } else if (number67 == 666) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent676 = getIntent();
        int number68 = intent676.getIntExtra("background676", 0);
        if(number68 == 0){
            Log.d("あいうえお676", "あいうえお");
        } else if (number68 == 676) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent686 = getIntent();
        int number69 = intent686.getIntExtra("background686", 0);
        if(number69 == 0){
            Log.d("あいうえお686", "あいうえお");
        } else if (number69 == 686) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent696 = getIntent();
        int number70 = intent696.getIntExtra("background696", 0);
        if(number70 == 0){
            Log.d("あいうえお696", "あいうえお");
        } else if (number70 == 696) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent706 = getIntent();
        int number71 = intent706.getIntExtra("background706", 0);
        if(number71 == 0){
            Log.d("あいうえお706", "あいうえお");
        } else if (number71 == 706) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent716 = getIntent();
        int number72 = intent716.getIntExtra("background716", 0);
        if(number72 == 0){
            Log.d("あいうえお716", "あいうえお");
        } else if (number72 == 716) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent726 = getIntent();
        int number73 = intent726.getIntExtra("background726", 0);
        if(number73 == 0){
            Log.d("あいうえお726", "あいうえお");
        } else if (number73 == 726) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent736 = getIntent();
        int number74 = intent736.getIntExtra("background736", 0);
        if(number74 == 0){
            Log.d("あいうえお736", "あいうえお");
        } else if (number74 == 736) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent746 = getIntent();
        int number75 = intent746.getIntExtra("background746", 0);
        if(number75 == 0){
            Log.d("あいうえお746", "あいうえお");
        } else if (number75 == 746) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent756 = getIntent();
        int number76 = intent756.getIntExtra("background756", 0);
        if(number76 == 0){
            Log.d("あいうえお756", "あいうえお");
        } else if (number76 == 756) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent766 = getIntent();
        int number77 = intent766.getIntExtra("background766", 0);
        if(number77 == 0){
            Log.d("あいうえお766", "あいうえお");
        } else if (number77 == 766) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent776 = getIntent();
        int number78 = intent776.getIntExtra("background776", 0);
        if(number78 == 0){
            Log.d("あいうえお776", "あいうえお");
        } else if (number78 == 776) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent786 = getIntent();
        int number79 = intent786.getIntExtra("background786", 0);
        if(number79 == 0){
            Log.d("あいうえお786", "あいうえお");
        } else if (number79 == 786) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent796 = getIntent();
        int number80 = intent796.getIntExtra("background796", 0);
        if(number80 == 0){
            Log.d("あいうえお796", "あいうえお");
        } else if (number80 == 796) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent806 = getIntent();
        int number81 = intent806.getIntExtra("background806", 0);
        if(number81 == 0){
            Log.d("あいうえお806", "あいうえお");
        } else if (number81 == 806) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent816 = getIntent();
        int number82 = intent816.getIntExtra("background816", 0);
        if(number82 == 0){
            Log.d("あいうえお816", "あいうえお");
        } else if (number82 == 816) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent826 = getIntent();
        int number83 = intent826.getIntExtra("background826", 0);
        if(number83 == 0){
            Log.d("あいうえお826", "あいうえお");
        } else if (number83 == 826) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent836 = getIntent();
        int number84 = intent836.getIntExtra("background836", 0);
        if(number84 == 0){
            Log.d("あいうえお836", "あいうえお");
        } else if (number84 == 836) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent846 = getIntent();
        int number85 = intent846.getIntExtra("background846", 0);
        if(number85 == 0){
            Log.d("あいうえお846", "あいうえお");
        } else if (number85 == 846) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent856 = getIntent();
        int number86 = intent856.getIntExtra("background856", 0);
        if(number86 == 0){
            Log.d("あいうえお856", "あいうえお");
        } else if (number86 == 856) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent866 = getIntent();
        int number87 = intent866.getIntExtra("background866", 0);
        if(number87 == 0){
            Log.d("あいうえお866", "あいうえお");
        } else if (number87 == 866) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent876 = getIntent();
        int number88 = intent876.getIntExtra("background876", 0);
        if(number88 == 0){
            Log.d("あいうえお876", "あいうえお");
        } else if (number88 == 876) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent886 = getIntent();
        int number89 = intent886.getIntExtra("background886", 0);
        if(number89 == 0){
            Log.d("あいうえお886", "あいうえお");
        } else if (number89 == 886) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent896 = getIntent();
        int number90 = intent896.getIntExtra("background896", 0);
        if(number90 == 0){
            Log.d("あいうえお896", "あいうえお");
        } else if (number90 == 896) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent906 = getIntent();
        int number91 = intent906.getIntExtra("background906", 0);
        if(number91 == 0){
            Log.d("あいうえお906", "あいうえお");
        } else if (number91 == 906) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent916 = getIntent();
        int number92 = intent916.getIntExtra("background916", 0);
        if(number92 == 0){
            Log.d("あいうえお916", "あいうえお");
        } else if (number92 == 916) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent926 = getIntent();
        int number93 = intent926.getIntExtra("background926", 0);
        if(number93 == 0){
            Log.d("あいうえお926", "あいうえお");
        } else if (number93 == 926) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent936 = getIntent();
        int number94 = intent936.getIntExtra("background936", 0);
        if(number94 == 0){
            Log.d("あいうえお936", "あいうえお");
        } else if (number94 == 936) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent946 = getIntent();
        int number95 = intent946.getIntExtra("background946", 0);
        if(number95 == 0){
            Log.d("あいうえお946", "あいうえお");
        } else if (number95 == 946) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent956 = getIntent();
        int number96 = intent956.getIntExtra("background956", 0);
        if(number96 == 0){
            Log.d("あいうえお956", "あいうえお");
        } else if (number96 == 956) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent966 = getIntent();
        int number97 = intent966.getIntExtra("background966", 0);
        if(number97 == 0){
            Log.d("あいうえお966", "あいうえお");
        } else if (number97 == 966) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent976 = getIntent();
        int number98 = intent976.getIntExtra("background976", 0);
        if(number98 == 0){
            Log.d("あいうえお976", "あいうえお");
        } else if (number98 == 976) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent986 = getIntent();
        int number99 = intent986.getIntExtra("background986", 0);
        if(number99 == 0){
            Log.d("あいうえお986", "あいうえお");
        } else if (number99 == 986) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent996 = getIntent();
        int number100 = intent996.getIntExtra("background996", 0);
        if(number100 == 0){
            Log.d("あいうえお996", "あいうえお");
        } else if (number100 == 996) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
}

    public void background6(View v){
        Intent intentM6 = new Intent(this, BackGround0Activity.class);
        intentM6.putExtra("M6", 6);
        startActivity(intentM6);
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
                Log.d("ああああああ", "いいいいいい");
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
