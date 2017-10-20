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


public class Make9Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_make9);

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

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout9);

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

        Intent intent9 = getIntent();
        int number1 = intent9.getIntExtra("background9", 0);
        if(number1 == 0){
            Log.d("あいうえお9", "あいうえお");
        } else if (number1 == 9) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent19 = getIntent();
        int number2 = intent19.getIntExtra("background19", 0);
        if(number2 == 0){
            Log.d("あいうえお19", "あいうえお");
        } else if (number2 == 19) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent29 = getIntent();
        int number3 = intent29.getIntExtra("background29", 0);
        if(number3 == 0){
            Log.d("あいうえお29", "あいうえお");
        } else if (number3 == 29) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent39 = getIntent();
        int number4 = intent39.getIntExtra("background39", 0);
        if(number4 == 0){
            Log.d("あいうえお39", "あいうえお");
        } else if (number4 == 39) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent49 = getIntent();
        int number5 = intent49.getIntExtra("background49", 0);
        if(number5 == 0){
            Log.d("あいうえお49", "あいうえお");
        } else if (number5 == 49) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent59 = getIntent();
        int number6 = intent59.getIntExtra("background59", 0);
        if(number6 == 0){
            Log.d("あいうえお59", "あいうえお");
        } else if (number6 == 59) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent69 = getIntent();
        int number7 = intent69.getIntExtra("background69", 0);
        if(number7 == 0){
            Log.d("あいうえお69", "あいうえお");
        } else if (number7 == 69) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent79 = getIntent();
        int number8 = intent79.getIntExtra("background79", 0);
        if(number8 == 0){
            Log.d("あいうえお79", "あいうえお");
        } else if (number8 == 79) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent89 = getIntent();
        int number9 = intent89.getIntExtra("background89", 0);
        if(number9 == 0){
            Log.d("あいうえお89", "あいうえお");
        } else if (number9 == 89) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent99 = getIntent();
        int number10 = intent99.getIntExtra("background99", 0);
        if(number10 == 0){
            Log.d("あいうえお99", "あいうえお");
        } else if (number10 == 99) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent109 = getIntent();
        int number11 = intent109.getIntExtra("background109", 0);
        if(number11 == 0){
            Log.d("あいうえお109", "あいうえお");
        } else if (number11 == 109) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent119 = getIntent();
        int number12 = intent119.getIntExtra("background119", 0);
        if(number12 == 0){
            Log.d("あいうえお119", "あいうえお");
        } else if (number12 == 119) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent129 = getIntent();
        int number13 = intent129.getIntExtra("background129", 0);
        if(number13 == 0){
            Log.d("あいうえお129", "あいうえお");
        } else if (number13 == 129) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent139 = getIntent();
        int number14 = intent139.getIntExtra("background139", 0);
        if(number14 == 0){
            Log.d("あいうえお139", "あいうえお");
        } else if (number14 == 139) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent149 = getIntent();
        int number15 = intent149.getIntExtra("background149", 0);
        if(number15 == 0){
            Log.d("あいうえお149", "あいうえお");
        } else if (number15 == 149) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent159 = getIntent();
        int number16 = intent159.getIntExtra("background159", 0);
        if(number16 == 0){
            Log.d("あいうえお159", "あいうえお");
        } else if (number16 == 159) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent169 = getIntent();
        int number17 = intent169.getIntExtra("background169", 0);
        if(number17 == 0){
            Log.d("あいうえお169", "あいうえお");
        } else if (number17 == 169) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent179 = getIntent();
        int number18 = intent179.getIntExtra("background179", 0);
        if(number18 == 0){
            Log.d("あいうえお179", "あいうえお");
        } else if (number18 == 179) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent189 = getIntent();
        int number19 = intent189.getIntExtra("background189", 0);
        if(number19 == 0){
            Log.d("あいうえお189", "あいうえお");
        } else if (number19 == 189) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent199 = getIntent();
        int number20 = intent199.getIntExtra("background199", 0);
        if(number20 == 0){
            Log.d("あいうえお199", "あいうえお");
        } else if (number20 == 199) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent209 = getIntent();
        int number21 = intent209.getIntExtra("background209", 0);
        if(number21 == 0){
            Log.d("あいうえお209", "あいうえお");
        } else if (number21 == 209) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent219 = getIntent();
        int number22 = intent219.getIntExtra("background219", 0);
        if(number22 == 0){
            Log.d("あいうえお219", "あいうえお");
        } else if (number22 == 219) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent229 = getIntent();
        int number23 = intent229.getIntExtra("background229", 0);
        if(number23 == 0){
            Log.d("あいうえお229", "あいうえお");
        } else if (number23 == 229) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent239 = getIntent();
        int number24 = intent239.getIntExtra("background239", 0);
        if(number24 == 0){
            Log.d("あいうえお239", "あいうえお");
        } else if (number24 == 239) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent249 = getIntent();
        int number25 = intent249.getIntExtra("background249", 0);
        if(number25 == 0){
            Log.d("あいうえお249", "あいうえお");
        } else if (number25 == 249) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent259 = getIntent();
        int number26 = intent259.getIntExtra("background259", 0);
        if(number26 == 0){
            Log.d("あいうえお259", "あいうえお");
        } else if (number26 == 259) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent269 = getIntent();
        int number27 = intent269.getIntExtra("background269", 0);
        if(number27 == 0){
            Log.d("あいうえお269", "あいうえお");
        } else if (number27 == 269) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent279 = getIntent();
        int number28 = intent279.getIntExtra("background279", 0);
        if(number28 == 0){
            Log.d("あいうえお279", "あいうえお");
        } else if (number28 == 279) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent289 = getIntent();
        int number29 = intent289.getIntExtra("background289", 0);
        if(number29 == 0){
            Log.d("あいうえお289", "あいうえお");
        } else if (number29 == 289) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent299 = getIntent();
        int number30 = intent299.getIntExtra("background299", 0);
        if(number30 == 0){
            Log.d("あいうえお299", "あいうえお");
        } else if (number30 == 299) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent309 = getIntent();
        int number31 = intent309.getIntExtra("background309", 0);
        if(number31 == 0){
            Log.d("あいうえお309", "あいうえお");
        } else if (number31 == 309) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent319 = getIntent();
        int number32 = intent319.getIntExtra("background319", 0);
        if(number32 == 0){
            Log.d("あいうえお319", "あいうえお");
        } else if (number32 == 319) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent329 = getIntent();
        int number33 = intent329.getIntExtra("background329", 0);
        if(number33 == 0){
            Log.d("あいうえお329", "あいうえお");
        } else if (number33 == 329) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent339 = getIntent();
        int number34 = intent339.getIntExtra("background339", 0);
        if(number34 == 0){
            Log.d("あいうえお339", "あいうえお");
        } else if (number34 == 339) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent349 = getIntent();
        int number35 = intent349.getIntExtra("background349", 0);
        if(number35 == 0){
            Log.d("あいうえお349", "あいうえお");
        } else if (number35 == 349) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent359 = getIntent();
        int number36 = intent359.getIntExtra("background359", 0);
        if(number36 == 0){
            Log.d("あいうえお359", "あいうえお");
        } else if (number36 == 359) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent369 = getIntent();
        int number37 = intent369.getIntExtra("background369", 0);
        if(number37 == 0){
            Log.d("あいうえお369", "あいうえお");
        } else if (number37 == 369) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent379 = getIntent();
        int number38 = intent379.getIntExtra("background379", 0);
        if(number38 == 0){
            Log.d("あいうえお379", "あいうえお");
        } else if (number38 == 379) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent389 = getIntent();
        int number39 = intent389.getIntExtra("background389", 0);
        if(number39 == 0){
            Log.d("あいうえお389", "あいうえお");
        } else if (number39 == 389) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent399 = getIntent();
        int number40 = intent399.getIntExtra("background399", 0);
        if(number40 == 0){
            Log.d("あいうえお399", "あいうえお");
        } else if (number40 == 399) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent409 = getIntent();
        int number41 = intent409.getIntExtra("background409", 0);
        if(number41 == 0){
            Log.d("あいうえお409", "あいうえお");
        } else if (number41 == 409) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent419 = getIntent();
        int number42 = intent419.getIntExtra("background419", 0);
        if(number42 == 0){
            Log.d("あいうえお419", "あいうえお");
        } else if (number42 == 419) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent429 = getIntent();
        int number43 = intent429.getIntExtra("background429", 0);
        if(number43 == 0){
            Log.d("あいうえお429", "あいうえお");
        } else if (number43 == 429) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent439 = getIntent();
        int number44 = intent439.getIntExtra("background439", 0);
        if(number44 == 0){
            Log.d("あいうえお439", "あいうえお");
        } else if (number44 == 439) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent449 = getIntent();
        int number45 = intent449.getIntExtra("background449", 0);
        if(number45 == 0){
            Log.d("あいうえお449", "あいうえお");
        } else if (number45 == 449) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent459 = getIntent();
        int number46 = intent459.getIntExtra("background459", 0);
        if(number46 == 0){
            Log.d("あいうえお459", "あいうえお");
        } else if (number46 == 459) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent469 = getIntent();
        int number47 = intent469.getIntExtra("background469", 0);
        if(number47 == 0){
            Log.d("あいうえお469", "あいうえお");
        } else if (number47 == 469) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent479 = getIntent();
        int number48 = intent479.getIntExtra("background479", 0);
        if(number48 == 0){
            Log.d("あいうえお479", "あいうえお");
        } else if (number48 == 479) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent489 = getIntent();
        int number49 = intent489.getIntExtra("background489", 0);
        if(number49 == 0){
            Log.d("あいうえお489", "あいうえお");
        } else if (number49 == 489) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent499 = getIntent();
        int number50 = intent499.getIntExtra("background499", 0);
        if(number50 == 0){
            Log.d("あいうえお499", "あいうえお");
        } else if (number50 == 499) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent509 = getIntent();
        int number51 = intent509.getIntExtra("background509", 0);
        if(number51 == 0){
            Log.d("あいうえお509", "あいうえお");
        } else if (number51 == 509) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent519 = getIntent();
        int number52 = intent519.getIntExtra("background519", 0);
        if(number52 == 0){
            Log.d("あいうえお519", "あいうえお");
        } else if (number52 == 519) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent529 = getIntent();
        int number53 = intent529.getIntExtra("background529", 0);
        if(number53 == 0){
            Log.d("あいうえお529", "あいうえお");
        } else if (number53 == 529) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent539 = getIntent();
        int number54 = intent539.getIntExtra("background539", 0);
        if(number54 == 0){
            Log.d("あいうえお539", "あいうえお");
        } else if (number54 == 539) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent549 = getIntent();
        int number55 = intent549.getIntExtra("background549", 0);
        if(number55 == 0){
            Log.d("あいうえお549", "あいうえお");
        } else if (number55 == 549) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent559 = getIntent();
        int number56 = intent559.getIntExtra("background559", 0);
        if(number56 == 0){
            Log.d("あいうえお559", "あいうえお");
        } else if (number56 == 559) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent569 = getIntent();
        int number57 = intent569.getIntExtra("background569", 0);
        if(number57 == 0){
            Log.d("あいうえお569", "あいうえお");
        } else if (number57 == 569) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent579 = getIntent();
        int number58 = intent579.getIntExtra("background579", 0);
        if(number58 == 0){
            Log.d("あいうえお579", "あいうえお");
        } else if (number58 == 579) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent589 = getIntent();
        int number59 = intent589.getIntExtra("background589", 0);
        if(number59 == 0){
            Log.d("あいうえお589", "あいうえお");
        } else if (number59 == 589) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent599 = getIntent();
        int number60 = intent599.getIntExtra("background599", 0);
        if(number60 == 0){
            Log.d("あいうえお599", "あいうえお");
        } else if (number60 == 599) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent609 = getIntent();
        int number61 = intent609.getIntExtra("background609", 0);
        if(number61 == 0){
            Log.d("あいうえお609", "あいうえお");
        } else if (number61 == 609) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent619 = getIntent();
        int number62 = intent619.getIntExtra("background619", 0);
        if(number62 == 0){
            Log.d("あいうえお619", "あいうえお");
        } else if (number62 == 619) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent629 = getIntent();
        int number63 = intent629.getIntExtra("background629", 0);
        if(number63 == 0){
            Log.d("あいうえお629", "あいうえお");
        } else if (number63 == 629) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent639 = getIntent();
        int number64 = intent639.getIntExtra("background639", 0);
        if(number64 == 0){
            Log.d("あいうえお639", "あいうえお");
        } else if (number64 == 639) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent649 = getIntent();
        int number65 = intent649.getIntExtra("background649", 0);
        if(number65 == 0){
            Log.d("あいうえお649", "あいうえお");
        } else if (number65 == 649) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent659 = getIntent();
        int number66 = intent659.getIntExtra("background659", 0);
        if(number66 == 0){
            Log.d("あいうえお659", "あいうえお");
        } else if (number66 == 659) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent669 = getIntent();
        int number67 = intent669.getIntExtra("background669", 0);
        if(number67 == 0){
            Log.d("あいうえお669", "あいうえお");
        } else if (number67 == 669) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent679 = getIntent();
        int number68 = intent679.getIntExtra("background679", 0);
        if(number68 == 0){
            Log.d("あいうえお679", "あいうえお");
        } else if (number68 == 679) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent689 = getIntent();
        int number69 = intent689.getIntExtra("background689", 0);
        if(number69 == 0){
            Log.d("あいうえお689", "あいうえお");
        } else if (number69 == 689) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent699 = getIntent();
        int number70 = intent699.getIntExtra("background699", 0);
        if(number70 == 0){
            Log.d("あいうえお699", "あいうえお");
        } else if (number70 == 699) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent709 = getIntent();
        int number71 = intent709.getIntExtra("background709", 0);
        if(number71 == 0){
            Log.d("あいうえお709", "あいうえお");
        } else if (number71 == 709) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent719 = getIntent();
        int number72 = intent719.getIntExtra("background719", 0);
        if(number72 == 0){
            Log.d("あいうえお719", "あいうえお");
        } else if (number72 == 719) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent729 = getIntent();
        int number73 = intent729.getIntExtra("background729", 0);
        if(number73 == 0){
            Log.d("あいうえお729", "あいうえお");
        } else if (number73 == 729) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent739 = getIntent();
        int number74 = intent739.getIntExtra("background739", 0);
        if(number74 == 0){
            Log.d("あいうえお739", "あいうえお");
        } else if (number74 == 739) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent749 = getIntent();
        int number75 = intent749.getIntExtra("background749", 0);
        if(number75 == 0){
            Log.d("あいうえお749", "あいうえお");
        } else if (number75 == 749) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent759 = getIntent();
        int number76 = intent759.getIntExtra("background759", 0);
        if(number76 == 0){
            Log.d("あいうえお759", "あいうえお");
        } else if (number76 == 759) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent769 = getIntent();
        int number77 = intent769.getIntExtra("background769", 0);
        if(number77 == 0){
            Log.d("あいうえお769", "あいうえお");
        } else if (number77 == 769) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent779 = getIntent();
        int number78 = intent779.getIntExtra("background779", 0);
        if(number78 == 0){
            Log.d("あいうえお779", "あいうえお");
        } else if (number78 == 779) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent789 = getIntent();
        int number79 = intent789.getIntExtra("background789", 0);
        if(number79 == 0){
            Log.d("あいうえお789", "あいうえお");
        } else if (number79 == 789) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent799 = getIntent();
        int number80 = intent799.getIntExtra("background799", 0);
        if(number80 == 0){
            Log.d("あいうえお799", "あいうえお");
        } else if (number80 == 799) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent809 = getIntent();
        int number81 = intent809.getIntExtra("background809", 0);
        if(number81 == 0){
            Log.d("あいうえお809", "あいうえお");
        } else if (number81 == 809) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent819 = getIntent();
        int number82 = intent819.getIntExtra("background819", 0);
        if(number82 == 0){
            Log.d("あいうえお819", "あいうえお");
        } else if (number82 == 819) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent829 = getIntent();
        int number83 = intent829.getIntExtra("background829", 0);
        if(number83 == 0){
            Log.d("あいうえお829", "あいうえお");
        } else if (number83 == 829) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent839 = getIntent();
        int number84 = intent839.getIntExtra("background839", 0);
        if(number84 == 0){
            Log.d("あいうえお839", "あいうえお");
        } else if (number84 == 839) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent849 = getIntent();
        int number85 = intent849.getIntExtra("background849", 0);
        if(number85 == 0){
            Log.d("あいうえお849", "あいうえお");
        } else if (number85 == 849) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent859 = getIntent();
        int number86 = intent859.getIntExtra("background859", 0);
        if(number86 == 0){
            Log.d("あいうえお859", "あいうえお");
        } else if (number86 == 859) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent869 = getIntent();
        int number87 = intent869.getIntExtra("background869", 0);
        if(number87 == 0){
            Log.d("あいうえお869", "あいうえお");
        } else if (number87 == 869) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent879 = getIntent();
        int number88 = intent879.getIntExtra("background879", 0);
        if(number88 == 0){
            Log.d("あいうえお879", "あいうえお");
        } else if (number88 == 879) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent889 = getIntent();
        int number89 = intent889.getIntExtra("background889", 0);
        if(number89 == 0){
            Log.d("あいうえお889", "あいうえお");
        } else if (number89 == 889) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent899 = getIntent();
        int number90 = intent899.getIntExtra("background899", 0);
        if(number90 == 0){
            Log.d("あいうえお899", "あいうえお");
        } else if (number90 == 899) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent909 = getIntent();
        int number91 = intent909.getIntExtra("background909", 0);
        if(number91 == 0){
            Log.d("あいうえお909", "あいうえお");
        } else if (number91 == 909) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent919 = getIntent();
        int number92 = intent919.getIntExtra("background919", 0);
        if(number92 == 0){
            Log.d("あいうえお919", "あいうえお");
        } else if (number92 == 919) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent929 = getIntent();
        int number93 = intent929.getIntExtra("background929", 0);
        if(number93 == 0){
            Log.d("あいうえお929", "あいうえお");
        } else if (number93 == 929) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent939 = getIntent();
        int number94 = intent939.getIntExtra("background939", 0);
        if(number94 == 0){
            Log.d("あいうえお939", "あいうえお");
        } else if (number94 == 939) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent949 = getIntent();
        int number95 = intent949.getIntExtra("background949", 0);
        if(number95 == 0){
            Log.d("あいうえお949", "あいうえお");
        } else if (number95 == 949) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent959 = getIntent();
        int number96 = intent959.getIntExtra("background959", 0);
        if(number96 == 0){
            Log.d("あいうえお959", "あいうえお");
        } else if (number96 == 959) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent969 = getIntent();
        int number97 = intent969.getIntExtra("background969", 0);
        if(number97 == 0){
            Log.d("あいうえお969", "あいうえお");
        } else if (number97 == 969) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent979 = getIntent();
        int number98 = intent979.getIntExtra("background979", 0);
        if(number98 == 0){
            Log.d("あいうえお979", "あいうえお");
        } else if (number98 == 979) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent989 = getIntent();
        int number99 = intent989.getIntExtra("background989", 0);
        if(number99 == 0){
            Log.d("あいうえお989", "あいうえお");
        } else if (number99 == 989) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent999 = getIntent();
        int number100 = intent999.getIntExtra("background999", 0);
        if(number100 == 0){
            Log.d("あいうえお999", "あいうえお");
        } else if (number100 == 999) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background9(View v){
        Intent intentM9 = new Intent(this, BackGround0Activity.class);
        intentM9.putExtra("M9", 9);
        startActivity(intentM9);
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
                Log.d("あああああああああ", "いいいいいいいいい");
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
