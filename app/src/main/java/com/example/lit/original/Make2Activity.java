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


public class Make2Activity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 0;

    ImageView imageView;
    EditText editText;

    SharedPreferences preferences;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make2);

        imageView = (ImageView)findViewById(R.id.imageView);
        editText = (EditText)findViewById(R.id.editText);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText.setText(preferences.getString("memo",""));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, REQUEST_GALLERY);

            }});

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout2);

        Intent intent2 = getIntent();
        int number1 = intent2.getIntExtra("background2", 0);
        if(number1 == 0){
                Log.d("あいうえお2", "あいうえお");
            } else if (number1 == 2) {
                layout.setBackgroundResource(R.drawable.backgrounda1);
            }

        Intent intent12 = getIntent();
        int number2 = intent12.getIntExtra("background12", 0);
        if(number2 == 0){
            Log.d("あいうえお12", "あいうえお");
        } else if (number2 == 12) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent22 = getIntent();
        int number3 = intent22.getIntExtra("background22", 0);
        if(number3 == 0){
            Log.d("あいうえお22", "あいうえお");
        } else if (number3 == 22) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent32 = getIntent();
        int number4 = intent32.getIntExtra("background32", 0);
        if(number4 == 0){
            Log.d("あいうえお32", "あいうえお");
        } else if (number4 == 32) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent42 = getIntent();
        int number5 = intent42.getIntExtra("background42", 0);
        if(number5 == 0){
            Log.d("あいうえお42", "あいうえお");
        } else if (number5 == 42) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent52 = getIntent();
        int number6 = intent52.getIntExtra("background52", 0);
        if(number6 == 0){
            Log.d("あいうえお52", "あいうえお");
        } else if (number6 == 52) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent62 = getIntent();
        int number7 = intent62.getIntExtra("background62", 0);
        if(number7 == 0){
            Log.d("あいうえお62", "あいうえお");
        } else if (number7 == 62) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent72 = getIntent();
        int number8 = intent72.getIntExtra("background72", 0);
        if(number8 == 0){
            Log.d("あいうえお72", "あいうえお");
        } else if (number8 == 72) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent82 = getIntent();
        int number9 = intent82.getIntExtra("background82", 0);
        if(number9 == 0){
            Log.d("あいうえお82", "あいうえお");
        } else if (number9 == 82) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent92 = getIntent();
        int number10 = intent92.getIntExtra("background92", 0);
        if(number10 == 0){
            Log.d("あいうえお92", "あいうえお");
        } else if (number10 == 92) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent102 = getIntent();
        int number11 = intent102.getIntExtra("background102", 0);
        if(number11 == 0){
            Log.d("あいうえお102", "あいうえお");
        } else if (number11 == 102) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent112 = getIntent();
        int number12 = intent112.getIntExtra("background112", 0);
        if(number12 == 0){
            Log.d("あいうえお112", "あいうえお");
        } else if (number12 == 112) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent122 = getIntent();
        int number13 = intent122.getIntExtra("background122", 0);
        if(number13 == 0){
            Log.d("あいうえお122", "あいうえお");
        } else if (number13 == 122) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent132 = getIntent();
        int number14 = intent132.getIntExtra("background132", 0);
        if(number14 == 0){
            Log.d("あいうえお132", "あいうえお");
        } else if (number14 == 132) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent142 = getIntent();
        int number15 = intent142.getIntExtra("background142", 0);
        if(number15 == 0){
            Log.d("あいうえお142", "あいうえお");
        } else if (number15 == 142) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent152 = getIntent();
        int number16 = intent152.getIntExtra("background152", 0);
        if(number16 == 0){
            Log.d("あいうえお152", "あいうえお");
        } else if (number16 == 152) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent162 = getIntent();
        int number17 = intent162.getIntExtra("background162", 0);
        if(number17 == 0){
            Log.d("あいうえお162", "あいうえお");
        } else if (number17 == 162) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent172 = getIntent();
        int number18 = intent172.getIntExtra("background172", 0);
        if(number18 == 0){
            Log.d("あいうえお172", "あいうえお");
        } else if (number18 == 172) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent182 = getIntent();
        int number19 = intent182.getIntExtra("background182", 0);
        if(number19 == 0){
            Log.d("あいうえお182", "あいうえお");
        } else if (number19 == 182) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent192 = getIntent();
        int number20 = intent192.getIntExtra("background192", 0);
        if(number20 == 0){
            Log.d("あいうえお192", "あいうえお");
        } else if (number20 == 192) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent202 = getIntent();
        int number21 = intent202.getIntExtra("background202", 0);
        if(number21 == 0){
            Log.d("あいうえお202", "あいうえお");
        } else if (number21 == 202) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent212 = getIntent();
        int number22 = intent212.getIntExtra("background212", 0);
        if(number22 == 0){
            Log.d("あいうえお212", "あいうえお");
        } else if (number22 == 212) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent222 = getIntent();
        int number23 = intent222.getIntExtra("background222", 0);
        if(number23 == 0){
            Log.d("あいうえお222", "あいうえお");
        } else if (number23 == 222) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent232 = getIntent();
        int number24 = intent232.getIntExtra("background232", 0);
        if(number24 == 0){
            Log.d("あいうえお232", "あいうえお");
        } else if (number24 == 232) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent242 = getIntent();
        int number25 = intent242.getIntExtra("background242", 0);
        if(number25 == 0){
            Log.d("あいうえお242", "あいうえお");
        } else if (number25 == 242) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent252 = getIntent();
        int number26 = intent252.getIntExtra("background252", 0);
        if(number26 == 0){
            Log.d("あいうえお252", "あいうえお");
        } else if (number26 == 252) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent262 = getIntent();
        int number27 = intent262.getIntExtra("background262", 0);
        if(number27 == 0){
            Log.d("あいうえお262", "あいうえお");
        } else if (number27 == 262) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent272 = getIntent();
        int number28 = intent272.getIntExtra("background272", 0);
        if(number28 == 0){
            Log.d("あいうえお272", "あいうえお");
        } else if (number28 == 272) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent282 = getIntent();
        int number29 = intent282.getIntExtra("background282", 0);
        if(number29 == 0){
            Log.d("あいうえお282", "あいうえお");
        } else if (number29 == 282) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent292 = getIntent();
        int number30 = intent292.getIntExtra("background292", 0);
        if(number30 == 0){
            Log.d("あいうえお292", "あいうえお");
        } else if (number30 == 292) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent302 = getIntent();
        int number31 = intent302.getIntExtra("background302", 0);
        if(number31 == 0){
            Log.d("あいうえお302", "あいうえお");
        } else if (number31 == 302) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent312 = getIntent();
        int number32 = intent312.getIntExtra("background312", 0);
        if(number32 == 0){
            Log.d("あいうえお312", "あいうえお");
        } else if (number32 == 312) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent322 = getIntent();
        int number33 = intent322.getIntExtra("background322", 0);
        if(number33 == 0){
            Log.d("あいうえお322", "あいうえお");
        } else if (number33 == 322) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent332 = getIntent();
        int number34 = intent332.getIntExtra("background332", 0);
        if(number34 == 0){
            Log.d("あいうえお332", "あいうえお");
        } else if (number34 == 332) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent342 = getIntent();
        int number35 = intent342.getIntExtra("background342", 0);
        if(number35 == 0){
            Log.d("あいうえお342", "あいうえお");
        } else if (number35 == 342) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent352 = getIntent();
        int number36 = intent352.getIntExtra("background352", 0);
        if(number36 == 0){
            Log.d("あいうえお352", "あいうえお");
        } else if (number36 == 352) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent362 = getIntent();
        int number37 = intent362.getIntExtra("background362", 0);
        if(number37 == 0){
            Log.d("あいうえお362", "あいうえお");
        } else if (number37 == 362) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent372 = getIntent();
        int number38 = intent372.getIntExtra("background372", 0);
        if(number38 == 0){
            Log.d("あいうえお372", "あいうえお");
        } else if (number38 == 372) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent382 = getIntent();
        int number39 = intent382.getIntExtra("background382", 0);
        if(number39 == 0){
            Log.d("あいうえお382", "あいうえお");
        } else if (number39 == 382) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent392 = getIntent();
        int number40 = intent392.getIntExtra("background392", 0);
        if(number40 == 0){
            Log.d("あいうえお392", "あいうえお");
        } else if (number40 == 392) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent402 = getIntent();
        int number41 = intent402.getIntExtra("background402", 0);
        if(number41 == 0){
            Log.d("あいうえお402", "あいうえお");
        } else if (number41 == 402) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent412 = getIntent();
        int number42 = intent412.getIntExtra("background412", 0);
        if(number42 == 0){
            Log.d("あいうえお412", "あいうえお");
        } else if (number42 == 412) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent422 = getIntent();
        int number43 = intent422.getIntExtra("background422", 0);
        if(number43 == 0){
            Log.d("あいうえお422", "あいうえお");
        } else if (number43 == 422) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent432 = getIntent();
        int number44 = intent432.getIntExtra("background432", 0);
        if(number44 == 0){
            Log.d("あいうえお432", "あいうえお");
        } else if (number44 == 432) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent442 = getIntent();
        int number45 = intent442.getIntExtra("background442", 0);
        if(number45 == 0){
            Log.d("あいうえお442", "あいうえお");
        } else if (number45 == 442) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent452 = getIntent();
        int number46 = intent452.getIntExtra("background452", 0);
        if(number46 == 0){
            Log.d("あいうえお452", "あいうえお");
        } else if (number46 == 452) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent462 = getIntent();
        int number47 = intent462.getIntExtra("background462", 0);
        if(number47 == 0){
            Log.d("あいうえお462", "あいうえお");
        } else if (number47 == 462) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent472 = getIntent();
        int number48 = intent472.getIntExtra("background472", 0);
        if(number48 == 0){
            Log.d("あいうえお472", "あいうえお");
        } else if (number48 == 472) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent482 = getIntent();
        int number49 = intent482.getIntExtra("background482", 0);
        if(number49 == 0){
            Log.d("あいうえお482", "あいうえお");
        } else if (number49 == 482) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent492 = getIntent();
        int number50 = intent492.getIntExtra("background492", 0);
        if(number50 == 0){
            Log.d("あいうえお492", "あいうえお");
        } else if (number50 == 492) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent502 = getIntent();
        int number51 = intent502.getIntExtra("background502", 0);
        if(number51 == 0){
            Log.d("あいうえお502", "あいうえお");
        } else if (number51 == 502) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent512 = getIntent();
        int number52 = intent512.getIntExtra("background512", 0);
        if(number52 == 0){
            Log.d("あいうえお512", "あいうえお");
        } else if (number52 == 512) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent522 = getIntent();
        int number53 = intent522.getIntExtra("background522", 0);
        if(number53 == 0){
            Log.d("あいうえお522", "あいうえお");
        } else if (number53 == 522) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent532 = getIntent();
        int number54 = intent532.getIntExtra("background532", 0);
        if(number54 == 0){
            Log.d("あいうえお532", "あいうえお");
        } else if (number54 == 532) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent542 = getIntent();
        int number55 = intent542.getIntExtra("background542", 0);
        if(number55 == 0){
            Log.d("あいうえお542", "あいうえお");
        } else if (number55 == 542) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent552 = getIntent();
        int number56 = intent552.getIntExtra("background552", 0);
        if(number56 == 0){
            Log.d("あいうえお552", "あいうえお");
        } else if (number56 == 552) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent562 = getIntent();
        int number57 = intent562.getIntExtra("background562", 0);
        if(number57 == 0){
            Log.d("あいうえお562", "あいうえお");
        } else if (number57 == 562) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent572 = getIntent();
        int number58 = intent572.getIntExtra("background572", 0);
        if(number58 == 0){
            Log.d("あいうえお572", "あいうえお");
        } else if (number58 == 572) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }

        Intent intent582 = getIntent();
        int number59 = intent582.getIntExtra("background582", 0);
        if(number59 == 0){
            Log.d("あいうえお582", "あいうえお");
        } else if (number59 == 582) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent592 = getIntent();
        int number60 = intent592.getIntExtra("background592", 0);
        if(number60 == 0){
            Log.d("あいうえお592", "あいうえお");
        } else if (number60 == 592) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent602 = getIntent();
        int number61 = intent602.getIntExtra("background602", 0);
        if(number61 == 0){
            Log.d("あいうえお602", "あいうえお");
        } else if (number61 == 602) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }

        Intent intent612 = getIntent();
        int number62 = intent612.getIntExtra("background612", 0);
        if(number62 == 0){
            Log.d("あいうえお612", "あいうえお");
        } else if (number62 == 612) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }

        Intent intent622 = getIntent();
        int number63 = intent622.getIntExtra("background622", 0);
        if(number63 == 0){
            Log.d("あいうえお622", "あいうえお");
        } else if (number63 == 622) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }

        Intent intent632 = getIntent();
        int number64 = intent632.getIntExtra("background632", 0);
        if(number64 == 0){
            Log.d("あいうえお632", "あいうえお");
        } else if (number64 == 632) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent642 = getIntent();
        int number65 = intent642.getIntExtra("background642", 0);
        if(number65 == 0){
            Log.d("あいうえお642", "あいうえお");
        } else if (number65 == 642) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent652 = getIntent();
        int number66 = intent652.getIntExtra("background652", 0);
        if(number66 == 0){
            Log.d("あいうえお652", "あいうえお");
        } else if (number66 == 652) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent662 = getIntent();
        int number67 = intent662.getIntExtra("background662", 0);
        if(number67 == 0){
            Log.d("あいうえお662", "あいうえお");
        } else if (number67 == 662) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent672 = getIntent();
        int number68 = intent672.getIntExtra("background672", 0);
        if(number68 == 0){
            Log.d("あいうえお672", "あいうえお");
        } else if (number68 == 672) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }

        Intent intent682 = getIntent();
        int number69 = intent682.getIntExtra("background682", 0);
        if(number69 == 0){
            Log.d("あいうえお682", "あいうえお");
        } else if (number69 == 682) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }

        Intent intent692 = getIntent();
        int number70 = intent692.getIntExtra("background692", 0);
        if(number70 == 0){
            Log.d("あいうえお692", "あいうえお");
        } else if (number70 == 692) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }

        Intent intent702 = getIntent();
        int number71 = intent702.getIntExtra("background702", 0);
        if(number71 == 0){
            Log.d("あいうえお702", "あいうえお");
        } else if (number71 == 702) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }

        Intent intent712 = getIntent();
        int number72 = intent712.getIntExtra("background712", 0);
        if(number72 == 0){
            Log.d("あいうえお712", "あいうえお");
        } else if (number72 == 712) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }

        Intent intent722 = getIntent();
        int number73 = intent722.getIntExtra("background722", 0);
        if(number73 == 0){
            Log.d("あいうえお722", "あいうえお");
        } else if (number73 == 722) {
            layout.setBackgroundResource(R.drawable.backgroundh13);
        }

        Intent intent732 = getIntent();
        int number74 = intent732.getIntExtra("background732", 0);
        if(number74 == 0){
            Log.d("あいうえお732", "あいうえお");
        } else if (number74 == 732) {
            layout.setBackgroundResource(R.drawable.backgroundh14);
        }

        Intent intent742 = getIntent();
        int number75 = intent742.getIntExtra("background742", 0);
        if(number75 == 0){
            Log.d("あいうえお742", "あいうえお");
        } else if (number75 == 742) {
            layout.setBackgroundResource(R.drawable.backgroundh15);
        }

        Intent intent752 = getIntent();
        int number76 = intent752.getIntExtra("background752", 0);
        if(number76 == 0){
            Log.d("あいうえお752", "あいうえお");
        } else if (number76 == 752) {
            layout.setBackgroundResource(R.drawable.backgroundh16);
        }

        Intent intent762 = getIntent();
        int number77 = intent762.getIntExtra("background762", 0);
        if(number77 == 0){
            Log.d("あいうえお762", "あいうえお");
        } else if (number77 == 762) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }

        Intent intent772 = getIntent();
        int number78 = intent772.getIntExtra("background772", 0);
        if(number78 == 0){
            Log.d("あいうえお772", "あいうえお");
        } else if (number78 == 772) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }

        Intent intent782 = getIntent();
        int number79 = intent782.getIntExtra("background782", 0);
        if(number79 == 0){
            Log.d("あいうえお782", "あいうえお");
        } else if (number79 == 782) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }

        Intent intent792 = getIntent();
        int number80 = intent792.getIntExtra("background792", 0);
        if(number80 == 0){
            Log.d("あいうえお792", "あいうえお");
        } else if (number80 == 792) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }

        Intent intent802 = getIntent();
        int number81 = intent802.getIntExtra("background802", 0);
        if(number81 == 0){
            Log.d("あいうえお802", "あいうえお");
        } else if (number81 == 802) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }

        Intent intent812 = getIntent();
        int number82 = intent812.getIntExtra("background812", 0);
        if(number82 == 0){
            Log.d("あいうえお812", "あいうえお");
        } else if (number82 == 812) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }

        Intent intent822 = getIntent();
        int number83 = intent822.getIntExtra("background822", 0);
        if(number83 == 0){
            Log.d("あいうえお822", "あいうえお");
        } else if (number83 == 822) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }

        Intent intent832 = getIntent();
        int number84 = intent832.getIntExtra("background832", 0);
        if(number84 == 0){
            Log.d("あいうえお832", "あいうえお");
        } else if (number84 == 832) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent842 = getIntent();
        int number85 = intent842.getIntExtra("background842", 0);
        if(number85 == 0){
            Log.d("あいうえお842", "あいうえお");
        } else if (number85 == 842) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent852 = getIntent();
        int number86 = intent852.getIntExtra("background852", 0);
        if(number86 == 0){
            Log.d("あいうえお852", "あいうえお");
        } else if (number86 == 852) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent862 = getIntent();
        int number87 = intent862.getIntExtra("background862", 0);
        if(number87 == 0){
            Log.d("あいうえお862", "あいうえお");
        } else if (number87 == 862) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent872 = getIntent();
        int number88 = intent872.getIntExtra("background872", 0);
        if(number88 == 0){
            Log.d("あいうえお872", "あいうえお");
        } else if (number88 == 872) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent882 = getIntent();
        int number89 = intent882.getIntExtra("background882", 0);
        if(number89 == 0){
            Log.d("あいうえお882", "あいうえお");
        } else if (number89 == 882) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent892 = getIntent();
        int number90 = intent892.getIntExtra("background892", 0);
        if(number90 == 0){
            Log.d("あいうえお892", "あいうえお");
        } else if (number90 == 892) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent902 = getIntent();
        int number91 = intent902.getIntExtra("background902", 0);
        if(number91 == 0){
            Log.d("あいうえお902", "あいうえお");
        } else if (number91 == 902) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent912 = getIntent();
        int number92 = intent912.getIntExtra("background912", 0);
        if(number92 == 0){
            Log.d("あいうえお912", "あいうえお");
        } else if (number92 == 912) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent922 = getIntent();
        int number93 = intent922.getIntExtra("background922", 0);
        if(number93 == 0){
            Log.d("あいうえお922", "あいうえお");
        } else if (number93 == 922) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent932 = getIntent();
        int number94 = intent932.getIntExtra("background932", 0);
        if(number94 == 0){
            Log.d("あいうえお932", "あいうえお");
        } else if (number94 == 932) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent942 = getIntent();
        int number95 = intent942.getIntExtra("background942", 0);
        if(number95 == 0){
            Log.d("あいうえお942", "あいうえお");
        } else if (number95 == 942) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent952 = getIntent();
        int number96 = intent952.getIntExtra("background952", 0);
        if(number96 == 0){
            Log.d("あいうえお952", "あいうえお");
        } else if (number96 == 952) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent962 = getIntent();
        int number97 = intent962.getIntExtra("background962", 0);
        if(number97 == 0){
            Log.d("あいうえお962", "あいうえお");
        } else if (number97 == 962) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent972 = getIntent();
        int number98 = intent972.getIntExtra("background972", 0);
        if(number98 == 0){
            Log.d("あいうえお972", "あいうえお");
        } else if (number98 == 972) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent982 = getIntent();
        int number99 = intent982.getIntExtra("background982", 0);
        if(number99 == 0){
            Log.d("あいうえお982", "あいうえお");
        } else if (number99 == 982) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent992 = getIntent();
        int number100 = intent992.getIntExtra("background992", 0);
        if(number100 == 0){
            Log.d("あいうえお992", "あいうえお");
        } else if (number100 == 992) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background2(View v){
        Intent intentM2 = new Intent(this, BackGround0Activity.class);
        intentM2.putExtra("M2", 2);
        startActivity(intentM2);
    }

    public void save(View v){
        String memoText = editText.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("memo",memoText);
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
                Log.d("ああ", "いい");
                // 選択した画像を表示
                imageView.setImageBitmap(img);
            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }

    //android
    //device monitor

}