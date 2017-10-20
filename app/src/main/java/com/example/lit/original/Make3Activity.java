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


public class Make3Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_make3);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText1.setText(preferences.getString("memo1",""));
        editText2.setText(preferences.getString("memo2",""));

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout3);


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

        Intent intent3 = getIntent();
        int number1 = intent3.getIntExtra("background3", 0);
        if(number1 == 0){
            Log.d("あいうえお3", "あいうえお");
        } else if (number1 == 3) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent13 = getIntent();
        int number2 = intent13.getIntExtra("background13", 0);
        if(number2 == 0){
            Log.d("あいうえお13", "あいうえお");
        } else if (number2 == 13) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent23 = getIntent();
        int number3 = intent23.getIntExtra("background23", 0);
        if(number3 == 0){
            Log.d("あいうえお23", "あいうえお");
        } else if (number3 == 23) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent33 = getIntent();
        int number4 = intent33.getIntExtra("background33", 0);
        if(number4 == 0){
            Log.d("あいうえお33", "あいうえお");
        } else if (number4 == 33) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent43 = getIntent();
        int number5 = intent43.getIntExtra("background43", 0);
        if(number5 == 0){
            Log.d("あいうえお43", "あいうえお");
        } else if (number5 == 43) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent53 = getIntent();
        int number6 = intent53.getIntExtra("background53", 0);
        if(number6 == 0){
            Log.d("あいうえお53", "あいうえお");
        } else if (number6 == 53) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent63 = getIntent();
        int number7 = intent63.getIntExtra("background63", 0);
        if(number7 == 0){
            Log.d("あいうえお63", "あいうえお");
        } else if (number7 == 63) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent73 = getIntent();
        int number8 = intent73.getIntExtra("background73", 0);
        if(number8 == 0){
            Log.d("あいうえお73", "あいうえお");
        } else if (number8 == 73) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent83 = getIntent();
        int number9 = intent83.getIntExtra("background83", 0);
        if(number9 == 0){
            Log.d("あいうえお83", "あいうえお");
        } else if (number9 == 83) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent93 = getIntent();
        int number10 = intent93.getIntExtra("background93", 0);
        if(number10 == 0){
            Log.d("あいうえお93", "あいうえお");
        } else if (number10 == 93) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent103 = getIntent();
        int number11 = intent103.getIntExtra("background103", 0);
        if(number11 == 0){
            Log.d("あいうえお103", "あいうえお");
        } else if (number11 == 103) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent113 = getIntent();
        int number12 = intent113.getIntExtra("background113", 0);
        if(number12 == 0){
            Log.d("あいうえお113", "あいうえお");
        } else if (number12 == 113) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent123 = getIntent();
        int number13 = intent123.getIntExtra("background123", 0);
        if(number13 == 0){
            Log.d("あいうえお123", "あいうえお");
        } else if (number13 == 123) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent133 = getIntent();
        int number14 = intent133.getIntExtra("background133", 0);
        if(number14 == 0){
            Log.d("あいうえお133", "あいうえお");
        } else if (number14 == 133) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent143 = getIntent();
        int number15 = intent143.getIntExtra("background143", 0);
        if(number15 == 0){
            Log.d("あいうえお143", "あいうえお");
        } else if (number15 == 143) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent153 = getIntent();
        int number16 = intent153.getIntExtra("background153", 0);
        if(number16 == 0){
            Log.d("あいうえお153", "あいうえお");
        } else if (number16 == 153) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent163 = getIntent();
        int number17 = intent163.getIntExtra("background163", 0);
        if(number17 == 0){
            Log.d("あいうえお163", "あいうえお");
        } else if (number17 == 163) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent173 = getIntent();
        int number18 = intent173.getIntExtra("background173", 0);
        if(number18 == 0){
            Log.d("あいうえお173", "あいうえお");
        } else if (number18 == 173) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent183 = getIntent();
        int number19 = intent183.getIntExtra("background183", 0);
        if(number19 == 0){
            Log.d("あいうえお183", "あいうえお");
        } else if (number19 == 183) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent193 = getIntent();
        int number20 = intent193.getIntExtra("background193", 0);
        if(number20 == 0){
            Log.d("あいうえお193", "あいうえお");
        } else if (number20 == 193) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent203 = getIntent();
        int number21 = intent203.getIntExtra("background203", 0);
        if(number21 == 0){
            Log.d("あいうえお203", "あいうえお");
        } else if (number21 == 203) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent213 = getIntent();
        int number22 = intent213.getIntExtra("background213", 0);
        if(number22 == 0){
            Log.d("あいうえお213", "あいうえお");
        } else if (number22 == 213) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent223 = getIntent();
        int number23 = intent223.getIntExtra("background223", 0);
        if(number23 == 0){
            Log.d("あいうえお223", "あいうえお");
        } else if (number23 == 223) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent233 = getIntent();
        int number24 = intent233.getIntExtra("background233", 0);
        if(number24 == 0){
            Log.d("あいうえお233", "あいうえお");
        } else if (number24 == 233) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent243 = getIntent();
        int number25 = intent243.getIntExtra("background243", 0);
        if(number25 == 0){
            Log.d("あいうえお243", "あいうえお");
        } else if (number25 == 243) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent253 = getIntent();
        int number26 = intent253.getIntExtra("background253", 0);
        if(number26 == 0){
            Log.d("あいうえお253", "あいうえお");
        } else if (number26 == 253) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent263 = getIntent();
        int number27 = intent263.getIntExtra("background263", 0);
        if(number27 == 0){
            Log.d("あいうえお263", "あいうえお");
        } else if (number27 == 263) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent273 = getIntent();
        int number28 = intent273.getIntExtra("background273", 0);
        if(number28 == 0){
            Log.d("あいうえお273", "あいうえお");
        } else if (number28 == 273) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent283 = getIntent();
        int number29 = intent283.getIntExtra("background283", 0);
        if(number29 == 0){
            Log.d("あいうえお283", "あいうえお");
        } else if (number29 == 283) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent293 = getIntent();
        int number30 = intent293.getIntExtra("background293", 0);
        if(number30 == 0){
            Log.d("あいうえお293", "あいうえお");
        } else if (number30 == 293) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent303 = getIntent();
        int number31 = intent303.getIntExtra("background303", 0);
        if(number31 == 0){
            Log.d("あいうえお303", "あいうえお");
        } else if (number31 == 303) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent313 = getIntent();
        int number32 = intent313.getIntExtra("background313", 0);
        if(number32 == 0){
            Log.d("あいうえお313", "あいうえお");
        } else if (number32 == 313) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent323 = getIntent();
        int number33 = intent323.getIntExtra("background323", 0);
        if(number33 == 0){
            Log.d("あいうえお323", "あいうえお");
        } else if (number33 == 323) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent333 = getIntent();
        int number34 = intent333.getIntExtra("background333", 0);
        if(number34 == 0){
            Log.d("あいうえお333", "あいうえお");
        } else if (number34 == 333) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent343 = getIntent();
        int number35 = intent343.getIntExtra("background343", 0);
        if(number35 == 0){
            Log.d("あいうえお343", "あいうえお");
        } else if (number35 == 343) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent353 = getIntent();
        int number36 = intent353.getIntExtra("background353", 0);
        if(number36 == 0){
            Log.d("あいうえお353", "あいうえお");
        } else if (number36 == 353) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent363 = getIntent();
        int number37 = intent363.getIntExtra("background363", 0);
        if(number37 == 0){
            Log.d("あいうえお363", "あいうえお");
        } else if (number37 == 363) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent373 = getIntent();
        int number38 = intent373.getIntExtra("background373", 0);
        if(number38 == 0){
            Log.d("あいうえお373", "あいうえお");
        } else if (number38 == 373) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent383 = getIntent();
        int number39 = intent383.getIntExtra("background383", 0);
        if(number39 == 0){
            Log.d("あいうえお383", "あいうえお");
        } else if (number39 == 383) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent393 = getIntent();
        int number40 = intent393.getIntExtra("background393", 0);
        if(number40 == 0){
            Log.d("あいうえお393", "あいうえお");
        } else if (number40 == 393) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent403 = getIntent();
        int number41 = intent403.getIntExtra("background403", 0);
        if(number41 == 0){
            Log.d("あいうえお403", "あいうえお");
        } else if (number41 == 403) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent413 = getIntent();
        int number42 = intent413.getIntExtra("background413", 0);
        if(number42 == 0){
            Log.d("あいうえお413", "あいうえお");
        } else if (number42 == 413) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent423 = getIntent();
        int number43 = intent423.getIntExtra("background423", 0);
        if(number43 == 0){
            Log.d("あいうえお423", "あいうえお");
        } else if (number43 == 423) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent433 = getIntent();
        int number44 = intent433.getIntExtra("background433", 0);
        if(number44 == 0){
            Log.d("あいうえお433", "あいうえお");
        } else if (number44 == 433) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent443 = getIntent();
        int number45 = intent443.getIntExtra("background443", 0);
        if(number45 == 0){
            Log.d("あいうえお443", "あいうえお");
        } else if (number45 == 443) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent453 = getIntent();
        int number46 = intent453.getIntExtra("background453", 0);
        if(number46 == 0){
            Log.d("あいうえお453", "あいうえお");
        } else if (number46 == 453) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent463 = getIntent();
        int number47 = intent463.getIntExtra("background463", 0);
        if(number47 == 0){
            Log.d("あいうえお463", "あいうえお");
        } else if (number47 == 463) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent473 = getIntent();
        int number48 = intent473.getIntExtra("background473", 0);
        if(number48 == 0){
            Log.d("あいうえお473", "あいうえお");
        } else if (number48 == 473) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent483 = getIntent();
        int number49 = intent483.getIntExtra("background483", 0);
        if(number49 == 0){
            Log.d("あいうえお483", "あいうえお");
        } else if (number49 == 483) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent493 = getIntent();
        int number50 = intent493.getIntExtra("background493", 0);
        if(number50 == 0){
            Log.d("あいうえお493", "あいうえお");
        } else if (number50 == 493) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent503 = getIntent();
        int number51 = intent503.getIntExtra("background503", 0);
        if(number51 == 0){
            Log.d("あいうえお503", "あいうえお");
        } else if (number51 == 503) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent513 = getIntent();
        int number52 = intent513.getIntExtra("background513", 0);
        if(number52 == 0){
            Log.d("あいうえお513", "あいうえお");
        } else if (number52 == 513) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent523 = getIntent();
        int number53 = intent523.getIntExtra("background523", 0);
        if(number53 == 0){
            Log.d("あいうえお523", "あいうえお");
        } else if (number53 == 523) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent533 = getIntent();
        int number54 = intent533.getIntExtra("background533", 0);
        if(number54 == 0){
            Log.d("あいうえお533", "あいうえお");
        } else if (number54 == 533) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent543 = getIntent();
        int number55 = intent543.getIntExtra("background543", 0);
        if(number55 == 0){
            Log.d("あいうえお543", "あいうえお");
        } else if (number55 == 543) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent553 = getIntent();
        int number56 = intent553.getIntExtra("background553", 0);
        if(number56 == 0){
            Log.d("あいうえお553", "あいうえお");
        } else if (number56 == 553) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent563 = getIntent();
        int number57 = intent563.getIntExtra("background563", 0);
        if(number57 == 0){
            Log.d("あいうえお563", "あいうえお");
        } else if (number57 == 563) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent573 = getIntent();
        int number58 = intent573.getIntExtra("background573", 0);
        if(number58 == 0){
            Log.d("あいうえお573", "あいうえお");
        } else if (number58 == 573) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent583 = getIntent();
        int number59 = intent583.getIntExtra("background583", 0);
        if(number59 == 0){
            Log.d("あいうえお583", "あいうえお");
        } else if (number59 == 583) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent593 = getIntent();
        int number60 = intent593.getIntExtra("background593", 0);
        if(number60 == 0){
            Log.d("あいうえお593", "あいうえお");
        } else if (number60 == 593) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent603 = getIntent();
        int number61 = intent603.getIntExtra("background603", 0);
        if(number61 == 0){
            Log.d("あいうえお603", "あいうえお");
        } else if (number61 == 603) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent613 = getIntent();
        int number62 = intent613.getIntExtra("background613", 0);
        if(number62 == 0){
            Log.d("あいうえお613", "あいうえお");
        } else if (number62 == 613) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent623 = getIntent();
        int number63 = intent623.getIntExtra("background623", 0);
        if(number63 == 0){
            Log.d("あいうえお623", "あいうえお");
        } else if (number63 == 623) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent633 = getIntent();
        int number64 = intent633.getIntExtra("background633", 0);
        if(number64 == 0){
            Log.d("あいうえお633", "あいうえお");
        } else if (number64 == 633) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent643 = getIntent();
        int number65 = intent643.getIntExtra("background643", 0);
        if(number65 == 0){
            Log.d("あいうえお643", "あいうえお");
        } else if (number65 == 643) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent653 = getIntent();
        int number66 = intent653.getIntExtra("background653", 0);
        if(number66 == 0){
            Log.d("あいうえお653", "あいうえお");
        } else if (number66 == 653) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent663 = getIntent();
        int number67 = intent663.getIntExtra("background663", 0);
        if(number67 == 0){
            Log.d("あいうえお663", "あいうえお");
        } else if (number67 == 663) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent673 = getIntent();
        int number68 = intent673.getIntExtra("background673", 0);
        if(number68 == 0){
            Log.d("あいうえお673", "あいうえお");
        } else if (number68 == 673) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent683 = getIntent();
        int number69 = intent683.getIntExtra("background683", 0);
        if(number69 == 0){
            Log.d("あいうえお683", "あいうえお");
        } else if (number69 == 683) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent693 = getIntent();
        int number70 = intent693.getIntExtra("background693", 0);
        if(number70 == 0){
            Log.d("あいうえお693", "あいうえお");
        } else if (number70 == 693) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent703 = getIntent();
        int number71 = intent703.getIntExtra("background703", 0);
        if(number71 == 0){
            Log.d("あいうえお703", "あいうえお");
        } else if (number71 == 703) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent713 = getIntent();
        int number72 = intent713.getIntExtra("background713", 0);
        if(number72 == 0){
            Log.d("あいうえお713", "あいうえお");
        } else if (number72 == 713) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent723 = getIntent();
        int number73 = intent723.getIntExtra("background723", 0);
        if(number73 == 0){
            Log.d("あいうえお723", "あいうえお");
        } else if (number73 == 723) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent733 = getIntent();
        int number74 = intent733.getIntExtra("background733", 0);
        if(number74 == 0){
            Log.d("あいうえお733", "あいうえお");
        } else if (number74 == 733) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent743 = getIntent();
        int number75 = intent743.getIntExtra("background743", 0);
        if(number75 == 0){
            Log.d("あいうえお743", "あいうえお");
        } else if (number75 == 743) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent753 = getIntent();
        int number76 = intent753.getIntExtra("background753", 0);
        if(number76 == 0){
            Log.d("あいうえお753", "あいうえお");
        } else if (number76 == 753) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent763 = getIntent();
        int number77 = intent763.getIntExtra("background763", 0);
        if(number77 == 0){
            Log.d("あいうえお763", "あいうえお");
        } else if (number77 == 763) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent773 = getIntent();
        int number78 = intent773.getIntExtra("background773", 0);
        if(number78 == 0){
            Log.d("あいうえお773", "あいうえお");
        } else if (number78 == 773) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent783 = getIntent();
        int number79 = intent783.getIntExtra("background783", 0);
        if(number79 == 0){
            Log.d("あいうえお783", "あいうえお");
        } else if (number79 == 783) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent793 = getIntent();
        int number80 = intent793.getIntExtra("background793", 0);
        if(number80 == 0){
            Log.d("あいうえお793", "あいうえお");
        } else if (number80 == 793) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent803 = getIntent();
        int number81 = intent803.getIntExtra("background803", 0);
        if(number81 == 0){
            Log.d("あいうえお803", "あいうえお");
        } else if (number81 == 803) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent813 = getIntent();
        int number82 = intent813.getIntExtra("background813", 0);
        if(number82 == 0){
            Log.d("あいうえお813", "あいうえお");
        } else if (number82 == 813) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent823 = getIntent();
        int number83 = intent823.getIntExtra("background823", 0);
        if(number83 == 0){
            Log.d("あいうえお823", "あいうえお");
        } else if (number83 == 823) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent833 = getIntent();
        int number84 = intent833.getIntExtra("background833", 0);
        if(number84 == 0){
            Log.d("あいうえお833", "あいうえお");
        } else if (number84 == 833) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent843 = getIntent();
        int number85 = intent843.getIntExtra("background843", 0);
        if(number85 == 0){
            Log.d("あいうえお843", "あいうえお");
        } else if (number85 == 843) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent853 = getIntent();
        int number86 = intent853.getIntExtra("background853", 0);
        if(number86 == 0){
            Log.d("あいうえお853", "あいうえお");
        } else if (number86 == 853) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent863 = getIntent();
        int number87 = intent863.getIntExtra("background863", 0);
        if(number87 == 0){
            Log.d("あいうえお863", "あいうえお");
        } else if (number87 == 863) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent873 = getIntent();
        int number88 = intent873.getIntExtra("background873", 0);
        if(number88 == 0){
            Log.d("あいうえお873", "あいうえお");
        } else if (number88 == 873) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent883 = getIntent();
        int number89 = intent883.getIntExtra("background883", 0);
        if(number89 == 0){
            Log.d("あいうえお883", "あいうえお");
        } else if (number89 == 883) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent893 = getIntent();
        int number90 = intent893.getIntExtra("background893", 0);
        if(number90 == 0){
            Log.d("あいうえお893", "あいうえお");
        } else if (number90 == 893) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent903 = getIntent();
        int number91 = intent903.getIntExtra("background903", 0);
        if(number91 == 0){
            Log.d("あいうえお903", "あいうえお");
        } else if (number91 == 903) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent913 = getIntent();
        int number92 = intent913.getIntExtra("background913", 0);
        if(number92 == 0){
            Log.d("あいうえお913", "あいうえお");
        } else if (number92 == 913) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent923 = getIntent();
        int number93 = intent923.getIntExtra("background923", 0);
        if(number93 == 0){
            Log.d("あいうえお923", "あいうえお");
        } else if (number93 == 923) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent933 = getIntent();
        int number94 = intent933.getIntExtra("background933", 0);
        if(number94 == 0){
            Log.d("あいうえお933", "あいうえお");
        } else if (number94 == 933) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent943 = getIntent();
        int number95 = intent943.getIntExtra("background943", 0);
        if(number95 == 0){
            Log.d("あいうえお943", "あいうえお");
        } else if (number95 == 943) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent953 = getIntent();
        int number96 = intent953.getIntExtra("background953", 0);
        if(number96 == 0){
            Log.d("あいうえお953", "あいうえお");
        } else if (number96 == 953) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent963 = getIntent();
        int number97 = intent963.getIntExtra("background963", 0);
        if(number97 == 0){
            Log.d("あいうえお963", "あいうえお");
        } else if (number97 == 963) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent973 = getIntent();
        int number98 = intent973.getIntExtra("background973", 0);
        if(number98 == 0){
            Log.d("あいうえお973", "あいうえお");
        } else if (number98 == 973) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent983 = getIntent();
        int number99 = intent983.getIntExtra("background983", 0);
        if(number99 == 0){
            Log.d("あいうえお983", "あいうえお");
        } else if (number99 == 983) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent993 = getIntent();
        int number100 = intent993.getIntExtra("background993", 0);
        if(number100 == 0){
            Log.d("あいうえお993", "あいうえお");
        } else if (number100 == 993) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background3(View v){
        Intent intentM3 = new Intent(this, BackGround0Activity.class);
        intentM3.putExtra("M3", 3);
        startActivity(intentM3);
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
                Log.d("あああ", "いいい");
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
