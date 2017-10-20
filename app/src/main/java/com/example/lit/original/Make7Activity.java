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


public class Make7Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_make7);

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

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout7);

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

        Intent intent7 = getIntent();
        int number1 = intent7.getIntExtra("background7", 0);
        if(number1 == 0){
            Log.d("あいうえお7", "あいうえお");
        } else if (number1 == 7) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent17 = getIntent();
        int number2 = intent17.getIntExtra("background17", 0);
        if(number2 == 0){
            Log.d("あいうえお17", "あいうえお");
        } else if (number2 == 17) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent27 = getIntent();
        int number3 = intent27.getIntExtra("background27", 0);
        if(number3 == 0){
            Log.d("あいうえお27", "あいうえお");
        } else if (number3 == 27) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent37 = getIntent();
        int number4 = intent37.getIntExtra("background37", 0);
        if(number4 == 0){
            Log.d("あいうえお37", "あいうえお");
        } else if (number4 == 37) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent47 = getIntent();
        int number5 = intent47.getIntExtra("background47", 0);
        if(number5 == 0){
            Log.d("あいうえお47", "あいうえお");
        } else if (number5 == 47) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent57 = getIntent();
        int number6 = intent57.getIntExtra("background57", 0);
        if(number6 == 0){
            Log.d("あいうえお57", "あいうえお");
        } else if (number6 == 57) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent67 = getIntent();
        int number7 = intent67.getIntExtra("background67", 0);
        if(number7 == 0){
            Log.d("あいうえお67", "あいうえお");
        } else if (number7 == 67) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent77 = getIntent();
        int number8 = intent77.getIntExtra("background77", 0);
        if(number8 == 0){
            Log.d("あいうえお77", "あいうえお");
        } else if (number8 == 77) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent87 = getIntent();
        int number9 = intent87.getIntExtra("background87", 0);
        if(number9 == 0){
            Log.d("あいうえお87", "あいうえお");
        } else if (number9 == 87) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent97 = getIntent();
        int number10 = intent97.getIntExtra("background97", 0);
        if(number10 == 0){
            Log.d("あいうえお97", "あいうえお");
        } else if (number10 == 97) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent107 = getIntent();
        int number11 = intent107.getIntExtra("background107", 0);
        if(number11 == 0){
            Log.d("あいうえお107", "あいうえお");
        } else if (number11 == 107) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent117 = getIntent();
        int number12 = intent117.getIntExtra("background117", 0);
        if(number12 == 0){
            Log.d("あいうえお117", "あいうえお");
        } else if (number12 == 117) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent127 = getIntent();
        int number13 = intent127.getIntExtra("background127", 0);
        if(number13 == 0){
            Log.d("あいうえお127", "あいうえお");
        } else if (number13 == 127) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent137 = getIntent();
        int number14 = intent137.getIntExtra("background137", 0);
        if(number14 == 0){
            Log.d("あいうえお137", "あいうえお");
        } else if (number14 == 137) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent147 = getIntent();
        int number15 = intent147.getIntExtra("background147", 0);
        if(number15 == 0){
            Log.d("あいうえお147", "あいうえお");
        } else if (number15 == 147) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent157 = getIntent();
        int number16 = intent157.getIntExtra("background157", 0);
        if(number16 == 0){
            Log.d("あいうえお157", "あいうえお");
        } else if (number16 == 157) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent167 = getIntent();
        int number17 = intent167.getIntExtra("background167", 0);
        if(number17 == 0){
            Log.d("あいうえお167", "あいうえお");
        } else if (number17 == 167) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent177 = getIntent();
        int number18 = intent177.getIntExtra("background177", 0);
        if(number18 == 0){
            Log.d("あいうえお177", "あいうえお");
        } else if (number18 == 177) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent187 = getIntent();
        int number19 = intent187.getIntExtra("background187", 0);
        if(number19 == 0){
            Log.d("あいうえお187", "あいうえお");
        } else if (number19 == 187) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent197 = getIntent();
        int number20 = intent197.getIntExtra("background197", 0);
        if(number20 == 0){
            Log.d("あいうえお197", "あいうえお");
        } else if (number20 == 197) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent207 = getIntent();
        int number21 = intent207.getIntExtra("background207", 0);
        if(number21 == 0){
            Log.d("あいうえお207", "あいうえお");
        } else if (number21 == 207) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent217 = getIntent();
        int number22 = intent217.getIntExtra("background217", 0);
        if(number22 == 0){
            Log.d("あいうえお217", "あいうえお");
        } else if (number22 == 217) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent227 = getIntent();
        int number23 = intent227.getIntExtra("background227", 0);
        if(number23 == 0){
            Log.d("あいうえお227", "あいうえお");
        } else if (number23 == 227) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent237 = getIntent();
        int number24 = intent237.getIntExtra("background237", 0);
        if(number24 == 0){
            Log.d("あいうえお237", "あいうえお");
        } else if (number24 == 237) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent247 = getIntent();
        int number25 = intent247.getIntExtra("background247", 0);
        if(number25 == 0){
            Log.d("あいうえお247", "あいうえお");
        } else if (number25 == 247) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent257 = getIntent();
        int number26 = intent257.getIntExtra("background257", 0);
        if(number26 == 0){
            Log.d("あいうえお257", "あいうえお");
        } else if (number26 == 257) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent267 = getIntent();
        int number27 = intent267.getIntExtra("background267", 0);
        if(number27 == 0){
            Log.d("あいうえお267", "あいうえお");
        } else if (number27 == 267) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent277 = getIntent();
        int number28 = intent277.getIntExtra("background277", 0);
        if(number28 == 0){
            Log.d("あいうえお277", "あいうえお");
        } else if (number28 == 277) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent287 = getIntent();
        int number29 = intent287.getIntExtra("background287", 0);
        if(number29 == 0){
            Log.d("あいうえお287", "あいうえお");
        } else if (number29 == 287) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent297 = getIntent();
        int number30 = intent297.getIntExtra("background297", 0);
        if(number30 == 0){
            Log.d("あいうえお297", "あいうえお");
        } else if (number30 == 297) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent307 = getIntent();
        int number31 = intent307.getIntExtra("background307", 0);
        if(number31 == 0){
            Log.d("あいうえお307", "あいうえお");
        } else if (number31 == 307) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent317 = getIntent();
        int number32 = intent317.getIntExtra("background317", 0);
        if(number32 == 0){
            Log.d("あいうえお317", "あいうえお");
        } else if (number32 == 317) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent327 = getIntent();
        int number33 = intent327.getIntExtra("background327", 0);
        if(number33 == 0){
            Log.d("あいうえお327", "あいうえお");
        } else if (number33 == 327) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent337 = getIntent();
        int number34 = intent337.getIntExtra("background337", 0);
        if(number34 == 0){
            Log.d("あいうえお337", "あいうえお");
        } else if (number34 == 337) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent347 = getIntent();
        int number35 = intent347.getIntExtra("background347", 0);
        if(number35 == 0){
            Log.d("あいうえお347", "あいうえお");
        } else if (number35 == 347) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent357 = getIntent();
        int number36 = intent357.getIntExtra("background357", 0);
        if(number36 == 0){
            Log.d("あいうえお357", "あいうえお");
        } else if (number36 == 357) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent367 = getIntent();
        int number37 = intent367.getIntExtra("background367", 0);
        if(number37 == 0){
            Log.d("あいうえお367", "あいうえお");
        } else if (number37 == 367) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent377 = getIntent();
        int number38 = intent377.getIntExtra("background377", 0);
        if(number38 == 0){
            Log.d("あいうえお377", "あいうえお");
        } else if (number38 == 377) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent387 = getIntent();
        int number39 = intent387.getIntExtra("background387", 0);
        if(number39 == 0){
            Log.d("あいうえお387", "あいうえお");
        } else if (number39 == 387) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent397 = getIntent();
        int number40 = intent397.getIntExtra("background397", 0);
        if(number40 == 0){
            Log.d("あいうえお397", "あいうえお");
        } else if (number40 == 397) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent407 = getIntent();
        int number41 = intent407.getIntExtra("background407", 0);
        if(number41 == 0){
            Log.d("あいうえお407", "あいうえお");
        } else if (number41 == 407) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent417 = getIntent();
        int number42 = intent417.getIntExtra("background417", 0);
        if(number42 == 0){
            Log.d("あいうえお417", "あいうえお");
        } else if (number42 == 417) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent427 = getIntent();
        int number43 = intent427.getIntExtra("background427", 0);
        if(number43 == 0){
            Log.d("あいうえお427", "あいうえお");
        } else if (number43 == 427) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent437 = getIntent();
        int number44 = intent437.getIntExtra("background437", 0);
        if(number44 == 0){
            Log.d("あいうえお437", "あいうえお");
        } else if (number44 == 437) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent447 = getIntent();
        int number45 = intent447.getIntExtra("background447", 0);
        if(number45 == 0){
            Log.d("あいうえお447", "あいうえお");
        } else if (number45 == 447) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent457 = getIntent();
        int number46 = intent457.getIntExtra("background457", 0);
        if(number46 == 0){
            Log.d("あいうえお457", "あいうえお");
        } else if (number46 == 457) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent467 = getIntent();
        int number47 = intent467.getIntExtra("background467", 0);
        if(number47 == 0){
            Log.d("あいうえお467", "あいうえお");
        } else if (number47 == 467) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent477 = getIntent();
        int number48 = intent477.getIntExtra("background477", 0);
        if(number48 == 0){
            Log.d("あいうえお477", "あいうえお");
        } else if (number48 == 477) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent487 = getIntent();
        int number49 = intent487.getIntExtra("background487", 0);
        if(number49 == 0){
            Log.d("あいうえお487", "あいうえお");
        } else if (number49 == 487) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent497 = getIntent();
        int number50 = intent497.getIntExtra("background497", 0);
        if(number50 == 0){
            Log.d("あいうえお497", "あいうえお");
        } else if (number50 == 497) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent507 = getIntent();
        int number51 = intent507.getIntExtra("background507", 0);
        if(number51 == 0){
            Log.d("あいうえお507", "あいうえお");
        } else if (number51 == 507) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent517 = getIntent();
        int number52 = intent517.getIntExtra("background517", 0);
        if(number52 == 0){
            Log.d("あいうえお517", "あいうえお");
        } else if (number52 == 517) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent527 = getIntent();
        int number53 = intent527.getIntExtra("background527", 0);
        if(number53 == 0){
            Log.d("あいうえお527", "あいうえお");
        } else if (number53 == 527) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent537 = getIntent();
        int number54 = intent537.getIntExtra("background537", 0);
        if(number54 == 0){
            Log.d("あいうえお537", "あいうえお");
        } else if (number54 == 537) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent547 = getIntent();
        int number55 = intent547.getIntExtra("background547", 0);
        if(number55 == 0){
            Log.d("あいうえお547", "あいうえお");
        } else if (number55 == 547) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent557 = getIntent();
        int number56 = intent557.getIntExtra("background557", 0);
        if(number56 == 0){
            Log.d("あいうえお557", "あいうえお");
        } else if (number56 == 557) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent567 = getIntent();
        int number57 = intent567.getIntExtra("background567", 0);
        if(number57 == 0){
            Log.d("あいうえお567", "あいうえお");
        } else if (number57 == 567) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent577 = getIntent();
        int number58 = intent577.getIntExtra("background577", 0);
        if(number58 == 0){
            Log.d("あいうえお577", "あいうえお");
        } else if (number58 == 577) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent587 = getIntent();
        int number59 = intent587.getIntExtra("background587", 0);
        if(number59 == 0){
            Log.d("あいうえお587", "あいうえお");
        } else if (number59 == 587) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent597 = getIntent();
        int number60 = intent597.getIntExtra("background597", 0);
        if(number60 == 0){
            Log.d("あいうえお597", "あいうえお");
        } else if (number60 == 597) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent607 = getIntent();
        int number61 = intent607.getIntExtra("background607", 0);
        if(number61 == 0){
            Log.d("あいうえお607", "あいうえお");
        } else if (number61 == 607) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent617 = getIntent();
        int number62 = intent617.getIntExtra("background617", 0);
        if(number62 == 0){
            Log.d("あいうえお617", "あいうえお");
        } else if (number62 == 617) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent627 = getIntent();
        int number63 = intent627.getIntExtra("background627", 0);
        if(number63 == 0){
            Log.d("あいうえお627", "あいうえお");
        } else if (number63 == 627) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent637 = getIntent();
        int number64 = intent637.getIntExtra("background637", 0);
        if(number64 == 0){
            Log.d("あいうえお637", "あいうえお");
        } else if (number64 == 637) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent647 = getIntent();
        int number65 = intent647.getIntExtra("background647", 0);
        if(number65 == 0){
            Log.d("あいうえお647", "あいうえお");
        } else if (number65 == 647) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent657 = getIntent();
        int number66 = intent657.getIntExtra("background657", 0);
        if(number66 == 0){
            Log.d("あいうえお657", "あいうえお");
        } else if (number66 == 657) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent667 = getIntent();
        int number67 = intent667.getIntExtra("background667", 0);
        if(number67 == 0){
            Log.d("あいうえお667", "あいうえお");
        } else if (number67 == 667) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent677 = getIntent();
        int number68 = intent677.getIntExtra("background677", 0);
        if(number68 == 0){
            Log.d("あいうえお677", "あいうえお");
        } else if (number68 == 677) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent687 = getIntent();
        int number69 = intent687.getIntExtra("background687", 0);
        if(number69 == 0){
            Log.d("あいうえお687", "あいうえお");
        } else if (number69 == 687) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent697 = getIntent();
        int number70 = intent697.getIntExtra("background697", 0);
        if(number70 == 0){
            Log.d("あいうえお697", "あいうえお");
        } else if (number70 == 697) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent707 = getIntent();
        int number71 = intent707.getIntExtra("background707", 0);
        if(number71 == 0){
            Log.d("あいうえお707", "あいうえお");
        } else if (number71 == 707) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent717 = getIntent();
        int number72 = intent717.getIntExtra("background717", 0);
        if(number72 == 0){
            Log.d("あいうえお717", "あいうえお");
        } else if (number72 == 717) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent727 = getIntent();
        int number73 = intent727.getIntExtra("background727", 0);
        if(number73 == 0){
            Log.d("あいうえお727", "あいうえお");
        } else if (number73 == 727) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent737 = getIntent();
        int number74 = intent737.getIntExtra("background737", 0);
        if(number74 == 0){
            Log.d("あいうえお737", "あいうえお");
        } else if (number74 == 737) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent747 = getIntent();
        int number75 = intent747.getIntExtra("background747", 0);
        if(number75 == 0){
            Log.d("あいうえお747", "あいうえお");
        } else if (number75 == 747) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent757 = getIntent();
        int number76 = intent757.getIntExtra("background757", 0);
        if(number76 == 0){
            Log.d("あいうえお757", "あいうえお");
        } else if (number76 == 757) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent767 = getIntent();
        int number77 = intent767.getIntExtra("background767", 0);
        if(number77 == 0){
            Log.d("あいうえお767", "あいうえお");
        } else if (number77 == 767) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent777 = getIntent();
        int number78 = intent777.getIntExtra("background777", 0);
        if(number78 == 0){
            Log.d("あいうえお777", "あいうえお");
        } else if (number78 == 777) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent787 = getIntent();
        int number79 = intent787.getIntExtra("background787", 0);
        if(number79 == 0){
            Log.d("あいうえお787", "あいうえお");
        } else if (number79 == 787) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent797 = getIntent();
        int number80 = intent797.getIntExtra("background797", 0);
        if(number80 == 0){
            Log.d("あいうえお797", "あいうえお");
        } else if (number80 == 797) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent807 = getIntent();
        int number81 = intent807.getIntExtra("background807", 0);
        if(number81 == 0){
            Log.d("あいうえお807", "あいうえお");
        } else if (number81 == 807) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent817 = getIntent();
        int number82 = intent817.getIntExtra("background817", 0);
        if(number82 == 0){
            Log.d("あいうえお817", "あいうえお");
        } else if (number82 == 817) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent827 = getIntent();
        int number83 = intent827.getIntExtra("background827", 0);
        if(number83 == 0){
            Log.d("あいうえお827", "あいうえお");
        } else if (number83 == 827) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent837 = getIntent();
        int number84 = intent837.getIntExtra("background837", 0);
        if(number84 == 0){
            Log.d("あいうえお837", "あいうえお");
        } else if (number84 == 837) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent847 = getIntent();
        int number85 = intent847.getIntExtra("background847", 0);
        if(number85 == 0){
            Log.d("あいうえお847", "あいうえお");
        } else if (number85 == 847) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent857 = getIntent();
        int number86 = intent857.getIntExtra("background857", 0);
        if(number86 == 0){
            Log.d("あいうえお857", "あいうえお");
        } else if (number86 == 857) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent867 = getIntent();
        int number87 = intent867.getIntExtra("background867", 0);
        if(number87 == 0){
            Log.d("あいうえお867", "あいうえお");
        } else if (number87 == 867) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent877 = getIntent();
        int number88 = intent877.getIntExtra("background877", 0);
        if(number88 == 0){
            Log.d("あいうえお877", "あいうえお");
        } else if (number88 == 877) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent887 = getIntent();
        int number89 = intent887.getIntExtra("background887", 0);
        if(number89 == 0){
            Log.d("あいうえお887", "あいうえお");
        } else if (number89 == 887) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent897 = getIntent();
        int number90 = intent897.getIntExtra("background897", 0);
        if(number90 == 0){
            Log.d("あいうえお897", "あいうえお");
        } else if (number90 == 897) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent907 = getIntent();
        int number91 = intent907.getIntExtra("background907", 0);
        if(number91 == 0){
            Log.d("あいうえお907", "あいうえお");
        } else if (number91 == 907) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent917 = getIntent();
        int number92 = intent917.getIntExtra("background917", 0);
        if(number92 == 0){
            Log.d("あいうえお917", "あいうえお");
        } else if (number92 == 917) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent927 = getIntent();
        int number93 = intent927.getIntExtra("background927", 0);
        if(number93 == 0){
            Log.d("あいうえお927", "あいうえお");
        } else if (number93 == 927) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent937 = getIntent();
        int number94 = intent937.getIntExtra("background937", 0);
        if(number94 == 0){
            Log.d("あいうえお937", "あいうえお");
        } else if (number94 == 937) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent947 = getIntent();
        int number95 = intent947.getIntExtra("background947", 0);
        if(number95 == 0){
            Log.d("あいうえお947", "あいうえお");
        } else if (number95 == 947) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent957 = getIntent();
        int number96 = intent957.getIntExtra("background957", 0);
        if(number96 == 0){
            Log.d("あいうえお957", "あいうえお");
        } else if (number96 == 957) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent967 = getIntent();
        int number97 = intent967.getIntExtra("background967", 0);
        if(number97 == 0){
            Log.d("あいうえお967", "あいうえお");
        } else if (number97 == 967) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent977 = getIntent();
        int number98 = intent977.getIntExtra("background977", 0);
        if(number98 == 0){
            Log.d("あいうえお977", "あいうえお");
        } else if (number98 == 977) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent987 = getIntent();
        int number99 = intent987.getIntExtra("background987", 0);
        if(number99 == 0){
            Log.d("あいうえお987", "あいうえお");
        } else if (number99 == 987) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent997 = getIntent();
        int number100 = intent997.getIntExtra("background997", 0);
        if(number100 == 0){
            Log.d("あいうえお997", "あいうえお");
        } else if (number100 == 997) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background7(View v){
        Intent intentM7 = new Intent(this, BackGround0Activity.class);
        intentM7.putExtra("M7", 7);
        startActivity(intentM7);
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
                Log.d("あああああああ", "いいいいいいい");
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
