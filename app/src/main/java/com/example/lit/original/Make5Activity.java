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


public class Make5Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_make5);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText1.setText(preferences.getString("memo1",""));
        editText2.setText(preferences.getString("memo2",""));

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout5);


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

        Intent intent5 = getIntent();
        int number1 = intent5.getIntExtra("background5", 0);
        if(number1 == 0){
            Log.d("あいうえお5", "あいうえお");
        } else if (number1 == 5) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent15 = getIntent();
        int number2 = intent15.getIntExtra("background15", 0);
        if(number2 == 0){
            Log.d("あいうえお15", "あいうえお");
        } else if (number2 == 15) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent25 = getIntent();
        int number3 = intent25.getIntExtra("background25", 0);
        if(number3 == 0){
            Log.d("あいうえお25", "あいうえお");
        } else if (number3 == 25) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent35 = getIntent();
        int number4 = intent35.getIntExtra("background35", 0);
        if(number4 == 0){
            Log.d("あいうえお35", "あいうえお");
        } else if (number4 == 35) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent45 = getIntent();
        int number5 = intent45.getIntExtra("background45", 0);
        if(number5 == 0){
            Log.d("あいうえお45", "あいうえお");
        } else if (number5 == 45) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent55 = getIntent();
        int number6 = intent55.getIntExtra("background55", 0);
        if(number6 == 0){
            Log.d("あいうえお55", "あいうえお");
        } else if (number6 == 55) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent65 = getIntent();
        int number7 = intent65.getIntExtra("background65", 0);
        if(number7 == 0){
            Log.d("あいうえお65", "あいうえお");
        } else if (number7 == 65) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent75 = getIntent();
        int number8 = intent75.getIntExtra("background75", 0);
        if(number8 == 0){
            Log.d("あいうえお75", "あいうえお");
        } else if (number8 == 75) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent85 = getIntent();
        int number9 = intent85.getIntExtra("background85", 0);
        if(number9 == 0){
            Log.d("あいうえお85", "あいうえお");
        } else if (number9 == 85) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent95 = getIntent();
        int number10 = intent95.getIntExtra("background95", 0);
        if(number10 == 0){
            Log.d("あいうえお95", "あいうえお");
        } else if (number10 == 95) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent105 = getIntent();
        int number11 = intent105.getIntExtra("background105", 0);
        if(number11 == 0){
            Log.d("あいうえお105", "あいうえお");
        } else if (number11 == 105) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent115 = getIntent();
        int number12 = intent115.getIntExtra("background115", 0);
        if(number12 == 0){
            Log.d("あいうえお115", "あいうえお");
        } else if (number12 == 115) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent125 = getIntent();
        int number13 = intent125.getIntExtra("background125", 0);
        if(number13 == 0){
            Log.d("あいうえお125", "あいうえお");
        } else if (number13 == 125) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent135 = getIntent();
        int number14 = intent135.getIntExtra("background135", 0);
        if(number14 == 0){
            Log.d("あいうえお135", "あいうえお");
        } else if (number14 == 135) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent145 = getIntent();
        int number15 = intent145.getIntExtra("background145", 0);
        if(number15 == 0){
            Log.d("あいうえお145", "あいうえお");
        } else if (number15 == 145) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent155 = getIntent();
        int number16 = intent155.getIntExtra("background155", 0);
        if(number16 == 0){
            Log.d("あいうえお155", "あいうえお");
        } else if (number16 == 155) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }

        Intent intent165 = getIntent();
        int number17 = intent165.getIntExtra("background165", 0);
        if(number17 == 0){
            Log.d("あいうえお165", "あいうえお");
        } else if (number17 == 165) {
            layout.setBackgroundResource(R.drawable.backgroundb1);
        }

        Intent intent175 = getIntent();
        int number18 = intent175.getIntExtra("background175", 0);
        if(number18 == 0){
            Log.d("あいうえお175", "あいうえお");
        } else if (number18 == 175) {
            layout.setBackgroundResource(R.drawable.backgroundb2);
        }

        Intent intent185 = getIntent();
        int number19 = intent185.getIntExtra("background185", 0);
        if(number19 == 0){
            Log.d("あいうえお185", "あいうえお");
        } else if (number19 == 185) {
            layout.setBackgroundResource(R.drawable.backgroundb3);
        }

        Intent intent195 = getIntent();
        int number20 = intent195.getIntExtra("background195", 0);
        if(number20 == 0){
            Log.d("あいうえお195", "あいうえお");
        } else if (number20 == 195) {
            layout.setBackgroundResource(R.drawable.backgroundb4);
        }

        Intent intent205 = getIntent();
        int number21 = intent205.getIntExtra("background205", 0);
        if(number21 == 0){
            Log.d("あいうえお205", "あいうえお");
        } else if (number21 == 205) {
            layout.setBackgroundResource(R.drawable.backgroundb5);
        }

        Intent intent215 = getIntent();
        int number22 = intent215.getIntExtra("background215", 0);
        if(number22 == 0){
            Log.d("あいうえお215", "あいうえお");
        } else if (number22 == 215) {
            layout.setBackgroundResource(R.drawable.backgroundb6);
        }

        Intent intent225 = getIntent();
        int number23 = intent225.getIntExtra("background225", 0);
        if(number23 == 0){
            Log.d("あいうえお225", "あいうえお");
        } else if (number23 == 225) {
            layout.setBackgroundResource(R.drawable.backgroundb7);
        }

        Intent intent235 = getIntent();
        int number24 = intent235.getIntExtra("background235", 0);
        if(number24 == 0){
            Log.d("あいうえお235", "あいうえお");
        } else if (number24 == 235) {
            layout.setBackgroundResource(R.drawable.backgroundb8);
        }

        Intent intent245 = getIntent();
        int number25 = intent245.getIntExtra("background245", 0);
        if(number25 == 0){
            Log.d("あいうえお245", "あいうえお");
        } else if (number25 == 245) {
            layout.setBackgroundResource(R.drawable.backgroundc1);
        }

        Intent intent255 = getIntent();
        int number26 = intent255.getIntExtra("background255", 0);
        if(number26 == 0){
            Log.d("あいうえお255", "あいうえお");
        } else if (number26 == 255) {
            layout.setBackgroundResource(R.drawable.backgroundc2);
        }

        Intent intent265 = getIntent();
        int number27 = intent265.getIntExtra("background265", 0);
        if(number27 == 0){
            Log.d("あいうえお265", "あいうえお");
        } else if (number27 == 265) {
            layout.setBackgroundResource(R.drawable.backgroundc3);
        }

        Intent intent275 = getIntent();
        int number28 = intent275.getIntExtra("background275", 0);
        if(number28 == 0){
            Log.d("あいうえお275", "あいうえお");
        } else if (number28 == 275) {
            layout.setBackgroundResource(R.drawable.backgroundc4);
        }

        Intent intent285 = getIntent();
        int number29 = intent285.getIntExtra("background285", 0);
        if(number29 == 0){
            Log.d("あいうえお285", "あいうえお");
        } else if (number29 == 285) {
            layout.setBackgroundResource(R.drawable.backgroundc5);
        }

        Intent intent295 = getIntent();
        int number30 = intent295.getIntExtra("background295", 0);
        if(number30 == 0){
            Log.d("あいうえお295", "あいうえお");
        } else if (number30 == 295) {
            layout.setBackgroundResource(R.drawable.backgroundc6);
        }

        Intent intent305 = getIntent();
        int number31 = intent305.getIntExtra("background305", 0);
        if(number31 == 0){
            Log.d("あいうえお305", "あいうえお");
        } else if (number31 == 305) {
            layout.setBackgroundResource(R.drawable.backgroundc7);
        }

        Intent intent315 = getIntent();
        int number32 = intent315.getIntExtra("background315", 0);
        if(number32 == 0){
            Log.d("あいうえお315", "あいうえお");
        } else if (number32 == 315) {
            layout.setBackgroundResource(R.drawable.backgroundc8);
        }

        Intent intent325 = getIntent();
        int number33 = intent325.getIntExtra("background325", 0);
        if(number33 == 0){
            Log.d("あいうえお325", "あいうえお");
        } else if (number33 == 325) {
            layout.setBackgroundResource(R.drawable.backgroundd1);
        }

        Intent intent335 = getIntent();
        int number34 = intent335.getIntExtra("background335", 0);
        if(number34 == 0){
            Log.d("あいうえお335", "あいうえお");
        } else if (number34 == 335) {
            layout.setBackgroundResource(R.drawable.backgroundd2);
        }

        Intent intent345 = getIntent();
        int number35 = intent345.getIntExtra("background345", 0);
        if(number35 == 0){
            Log.d("あいうえお345", "あいうえお");
        } else if (number35 == 345) {
            layout.setBackgroundResource(R.drawable.backgroundd3);
        }

        Intent intent355 = getIntent();
        int number36 = intent355.getIntExtra("background355", 0);
        if(number36 == 0){
            Log.d("あいうえお355", "あいうえお");
        } else if (number36 == 355) {
            layout.setBackgroundResource(R.drawable.backgroundd4);
        }

        Intent intent365 = getIntent();
        int number37 = intent365.getIntExtra("background365", 0);
        if(number37 == 0){
            Log.d("あいうえお365", "あいうえお");
        } else if (number37 == 365) {
            layout.setBackgroundResource(R.drawable.backgroundd5);
        }

        Intent intent375 = getIntent();
        int number38 = intent375.getIntExtra("background375", 0);
        if(number38 == 0){
            Log.d("あいうえお375", "あいうえお");
        } else if (number38 == 375) {
            layout.setBackgroundResource(R.drawable.backgroundd6);
        }

        Intent intent385 = getIntent();
        int number39 = intent385.getIntExtra("background385", 0);
        if(number39 == 0){
            Log.d("あいうえお385", "あいうえお");
        } else if (number39 == 385) {
            layout.setBackgroundResource(R.drawable.backgroundd7);
        }

        Intent intent395 = getIntent();
        int number40 = intent395.getIntExtra("background395", 0);
        if(number40 == 0){
            Log.d("あいうえお395", "あいうえお");
        } else if (number40 == 395) {
            layout.setBackgroundResource(R.drawable.backgroundd8);
        }

        Intent intent405 = getIntent();
        int number41 = intent405.getIntExtra("background405", 0);
        if(number41 == 0){
            Log.d("あいうえお405", "あいうえお");
        } else if (number41 == 405) {
            layout.setBackgroundResource(R.drawable.backgrounde1);
        }

        Intent intent415 = getIntent();
        int number42 = intent415.getIntExtra("background415", 0);
        if(number42 == 0){
            Log.d("あいうえお415", "あいうえお");
        } else if (number42 == 415) {
            layout.setBackgroundResource(R.drawable.backgrounde2);
        }

        Intent intent425 = getIntent();
        int number43 = intent425.getIntExtra("background425", 0);
        if(number43 == 0){
            Log.d("あいうえお425", "あいうえお");
        } else if (number43 == 425) {
            layout.setBackgroundResource(R.drawable.backgrounde3);
        }

        Intent intent435 = getIntent();
        int number44 = intent435.getIntExtra("background435", 0);
        if(number44 == 0){
            Log.d("あいうえお435", "あいうえお");
        } else if (number44 == 435) {
            layout.setBackgroundResource(R.drawable.backgrounde4);
        }

        Intent intent445 = getIntent();
        int number45 = intent445.getIntExtra("background445", 0);
        if(number45 == 0){
            Log.d("あいうえお445", "あいうえお");
        } else if (number45 == 445) {
            layout.setBackgroundResource(R.drawable.backgrounde5);
        }

        Intent intent455 = getIntent();
        int number46 = intent455.getIntExtra("background455", 0);
        if(number46 == 0){
            Log.d("あいうえお455", "あいうえお");
        } else if (number46 == 455) {
            layout.setBackgroundResource(R.drawable.backgrounde6);
        }

        Intent intent465 = getIntent();
        int number47 = intent465.getIntExtra("background465", 0);
        if(number47 == 0){
            Log.d("あいうえお465", "あいうえお");
        } else if (number47 == 465) {
            layout.setBackgroundResource(R.drawable.backgrounde7);
        }

        Intent intent475 = getIntent();
        int number48 = intent475.getIntExtra("background475", 0);
        if(number48 == 0){
            Log.d("あいうえお475", "あいうえお");
        } else if (number48 == 475) {
            layout.setBackgroundResource(R.drawable.backgrounde8);
        }

        Intent intent485 = getIntent();
        int number49 = intent485.getIntExtra("background485", 0);
        if(number49 == 0){
            Log.d("あいうえお485", "あいうえお");
        } else if (number49 == 485) {
            layout.setBackgroundResource(R.drawable.backgroundf1);
        }

        Intent intent495 = getIntent();
        int number50 = intent495.getIntExtra("background495", 0);
        if(number50 == 0){
            Log.d("あいうえお495", "あいうえお");
        } else if (number50 == 495) {
            layout.setBackgroundResource(R.drawable.backgroundf2);
        }

        Intent intent505 = getIntent();
        int number51 = intent505.getIntExtra("background505", 0);
        if(number51 == 0){
            Log.d("あいうえお505", "あいうえお");
        } else if (number51 == 505) {
            layout.setBackgroundResource(R.drawable.backgroundf3);
        }

        Intent intent515 = getIntent();
        int number52 = intent515.getIntExtra("background515", 0);
        if(number52 == 0){
            Log.d("あいうえお515", "あいうえお");
        } else if (number52 == 515) {
            layout.setBackgroundResource(R.drawable.backgroundf4);
        }

        Intent intent525 = getIntent();
        int number53 = intent525.getIntExtra("background525", 0);
        if(number53 == 0){
            Log.d("あいうえお525", "あいうえお");
        } else if (number53 == 525) {
            layout.setBackgroundResource(R.drawable.backgroundf5);
        }

        Intent intent535 = getIntent();
        int number54 = intent535.getIntExtra("background535", 0);
        if(number54 == 0){
            Log.d("あいうえお535", "あいうえお");
        } else if (number54 == 535) {
            layout.setBackgroundResource(R.drawable.backgroundf6);
        }

        Intent intent545 = getIntent();
        int number55 = intent545.getIntExtra("background545", 0);
        if(number55 == 0){
            Log.d("あいうえお545", "あいうえお");
        } else if (number55 == 545) {
            layout.setBackgroundResource(R.drawable.backgroundf7);
        }

        Intent intent555 = getIntent();
        int number56 = intent555.getIntExtra("background555", 0);
        if(number56 == 0){
            Log.d("あいうえお555", "あいうえお");
        } else if (number56 == 555) {
            layout.setBackgroundResource(R.drawable.backgroundf8);
        }

        Intent intent565 = getIntent();
        int number57 = intent565.getIntExtra("background565", 0);
        if(number57 == 0){
            Log.d("あいうえお565", "あいうえお");
        } else if (number57 == 565) {
            layout.setBackgroundResource(R.drawable.backgroundf9);
        }

        Intent intent575 = getIntent();
        int number58 = intent575.getIntExtra("background575", 0);
        if(number58 == 0){
            Log.d("あいうえお575", "あいうえお");
        } else if (number58 == 575) {
            layout.setBackgroundResource(R.drawable.backgroundf10);
        }

        Intent intent585 = getIntent();
        int number59 = intent585.getIntExtra("background585", 0);
        if(number59 == 0){
            Log.d("あいうえお585", "あいうえお");
        } else if (number59 == 585) {
            layout.setBackgroundResource(R.drawable.backgroundf11);
        }

        Intent intent595 = getIntent();
        int number60 = intent595.getIntExtra("background595", 0);
        if(number60 == 0){
            Log.d("あいうえお595", "あいうえお");
        } else if (number60 == 595) {
            layout.setBackgroundResource(R.drawable.backgroundf12);
        }

        Intent intent605 = getIntent();
        int number61 = intent605.getIntExtra("background605", 0);
        if(number61 == 0){
            Log.d("あいうえお605", "あいうえお");
        } else if (number61 == 605) {
            layout.setBackgroundResource(R.drawable.backgroundg1);
        }

        Intent intent615 = getIntent();
        int number62 = intent615.getIntExtra("background615", 0);
        if(number62 == 0){
            Log.d("あいうえお615", "あいうえお");
        } else if (number62 == 615) {
            layout.setBackgroundResource(R.drawable.backgroundg2);
        }
        Intent intent625 = getIntent();
        int number63 = intent625.getIntExtra("background625", 0);
        if(number63 == 0){
            Log.d("あいうえお625", "あいうえお");
        } else if (number63 == 625) {
            layout.setBackgroundResource(R.drawable.backgroundg3);
        }

        Intent intent635 = getIntent();
        int number64 = intent635.getIntExtra("background635", 0);
        if(number64 == 0){
            Log.d("あいうえお635", "あいうえお");
        } else if (number64 == 635) {
            layout.setBackgroundResource(R.drawable.backgroundg4);
        }

        Intent intent645 = getIntent();
        int number65 = intent645.getIntExtra("background645", 0);
        if(number65 == 0){
            Log.d("あいうえお645", "あいうえお");
        } else if (number65 == 645) {
            layout.setBackgroundResource(R.drawable.backgroundh1);
        }
        Intent intent655 = getIntent();
        int number66 = intent655.getIntExtra("background655", 0);
        if(number66 == 0){
            Log.d("あいうえお655", "あいうえお");
        } else if (number66 == 655) {
            layout.setBackgroundResource(R.drawable.backgroundh2);
        }
        Intent intent665 = getIntent();
        int number67 = intent665.getIntExtra("background665", 0);
        if(number67 == 0){
            Log.d("あいうえお665", "あいうえお");
        } else if (number67 == 665) {
            layout.setBackgroundResource(R.drawable.backgroundh3);
        }
        Intent intent675 = getIntent();
        int number68 = intent675.getIntExtra("background675", 0);
        if(number68 == 0){
            Log.d("あいうえお675", "あいうえお");
        } else if (number68 == 675) {
            layout.setBackgroundResource(R.drawable.backgroundh4);
        }

        Intent intent685 = getIntent();
        int number69 = intent685.getIntExtra("background685", 0);
        if(number69 == 0){
            Log.d("あいうえお685", "あいうえお");
        } else if (number69 == 685) {
            layout.setBackgroundResource(R.drawable.backgroundh5);
        }

        Intent intent695 = getIntent();
        int number70 = intent695.getIntExtra("background695", 0);
        if(number70 == 0){
            Log.d("あいうえお695", "あいうえお");
        } else if (number70 == 695) {
            layout.setBackgroundResource(R.drawable.backgroundh6);
        }

        Intent intent705 = getIntent();
        int number71 = intent705.getIntExtra("background705", 0);
        if(number71 == 0){
            Log.d("あいうえお705", "あいうえお");
        } else if (number71 == 705) {
            layout.setBackgroundResource(R.drawable.backgroundh7);
        }

        Intent intent715 = getIntent();
        int number72 = intent715.getIntExtra("background715", 0);
        if(number72 == 0){
            Log.d("あいうえお715", "あいうえお");
        } else if (number72 == 715) {
            layout.setBackgroundResource(R.drawable.backgroundh8);
        }
        Intent intent725 = getIntent();
        int number73 = intent725.getIntExtra("background725", 0);
        if(number73 == 0){
            Log.d("あいうえお725", "あいうえお");
        } else if (number73 == 725) {
            layout.setBackgroundResource(R.drawable.backgroundh9);
        }
        Intent intent735 = getIntent();
        int number74 = intent735.getIntExtra("background735", 0);
        if(number74 == 0){
            Log.d("あいうえお735", "あいうえお");
        } else if (number74 == 735) {
            layout.setBackgroundResource(R.drawable.backgroundh10);
        }
        Intent intent745 = getIntent();
        int number75 = intent745.getIntExtra("background745", 0);
        if(number75 == 0){
            Log.d("あいうえお745", "あいうえお");
        } else if (number75 == 745) {
            layout.setBackgroundResource(R.drawable.backgroundh11);
        }
        Intent intent755 = getIntent();
        int number76 = intent755.getIntExtra("background755", 0);
        if(number76 == 0){
            Log.d("あいうえお755", "あいうえお");
        } else if (number76 == 755) {
            layout.setBackgroundResource(R.drawable.backgroundh12);
        }
        Intent intent765 = getIntent();
        int number77 = intent765.getIntExtra("background765", 0);
        if(number77 == 0){
            Log.d("あいうえお765", "あいうえお");
        } else if (number77 == 765) {
            layout.setBackgroundResource(R.drawable.backgroundi1);
        }
        Intent intent775 = getIntent();
        int number78 = intent775.getIntExtra("background775", 0);
        if(number78 == 0){
            Log.d("あいうえお775", "あいうえお");
        } else if (number78 == 775) {
            layout.setBackgroundResource(R.drawable.backgroundi2);
        }
        Intent intent785 = getIntent();
        int number79 = intent785.getIntExtra("background785", 0);
        if(number79 == 0){
            Log.d("あいうえお785", "あいうえお");
        } else if (number79 == 785) {
            layout.setBackgroundResource(R.drawable.backgroundi3);
        }
        Intent intent795 = getIntent();
        int number80 = intent795.getIntExtra("background795", 0);
        if(number80 == 0){
            Log.d("あいうえお795", "あいうえお");
        } else if (number80 == 795) {
            layout.setBackgroundResource(R.drawable.backgroundi4);
        }
        Intent intent805 = getIntent();
        int number81 = intent805.getIntExtra("background805", 0);
        if(number81 == 0){
            Log.d("あいうえお805", "あいうえお");
        } else if (number81 == 805) {
            layout.setBackgroundResource(R.drawable.backgroundi5);
        }
        Intent intent815 = getIntent();
        int number82 = intent815.getIntExtra("background815", 0);
        if(number82 == 0){
            Log.d("あいうえお815", "あいうえお");
        } else if (number82 == 815) {
            layout.setBackgroundResource(R.drawable.backgroundi6);
        }
        Intent intent825 = getIntent();
        int number83 = intent825.getIntExtra("background825", 0);
        if(number83 == 0){
            Log.d("あいうえお825", "あいうえお");
        } else if (number83 == 825) {
            layout.setBackgroundResource(R.drawable.backgroundi7);
        }
        Intent intent835 = getIntent();
        int number84 = intent835.getIntExtra("background835", 0);
        if(number84 == 0){
            Log.d("あいうえお835", "あいうえお");
        } else if (number84 == 835) {
            layout.setBackgroundResource(R.drawable.backgroundi8);
        }

        Intent intent845 = getIntent();
        int number85 = intent845.getIntExtra("background845", 0);
        if(number85 == 0){
            Log.d("あいうえお845", "あいうえお");
        } else if (number85 == 845) {
            layout.setBackgroundResource(R.drawable.backgroundi9);
        }

        Intent intent855 = getIntent();
        int number86 = intent855.getIntExtra("background855", 0);
        if(number86 == 0){
            Log.d("あいうえお855", "あいうえお");
        } else if (number86 == 855) {
            layout.setBackgroundResource(R.drawable.backgroundi10);
        }

        Intent intent865 = getIntent();
        int number87 = intent865.getIntExtra("background865", 0);
        if(number87 == 0){
            Log.d("あいうえお865", "あいうえお");
        } else if (number87 == 865) {
            layout.setBackgroundResource(R.drawable.backgroundi11);
        }

        Intent intent875 = getIntent();
        int number88 = intent875.getIntExtra("background875", 0);
        if(number88 == 0){
            Log.d("あいうえお875", "あいうえお");
        } else if (number88 == 875) {
            layout.setBackgroundResource(R.drawable.backgroundi12);
        }

        Intent intent885 = getIntent();
        int number89 = intent885.getIntExtra("background885", 0);
        if(number89 == 0){
            Log.d("あいうえお885", "あいうえお");
        } else if (number89 == 885) {
            layout.setBackgroundResource(R.drawable.backgroundj1);
        }

        Intent intent895 = getIntent();
        int number90 = intent895.getIntExtra("background895", 0);
        if(number90 == 0){
            Log.d("あいうえお895", "あいうえお");
        } else if (number90 == 895) {
            layout.setBackgroundResource(R.drawable.backgroundj2);
        }

        Intent intent905 = getIntent();
        int number91 = intent905.getIntExtra("background905", 0);
        if(number91 == 0){
            Log.d("あいうえお905", "あいうえお");
        } else if (number91 == 905) {
            layout.setBackgroundResource(R.drawable.backgroundj3);
        }

        Intent intent915 = getIntent();
        int number92 = intent915.getIntExtra("background915", 0);
        if(number92 == 0){
            Log.d("あいうえお915", "あいうえお");
        } else if (number92 == 915) {
            layout.setBackgroundResource(R.drawable.backgroundj4);
        }

        Intent intent925 = getIntent();
        int number93 = intent925.getIntExtra("background925", 0);
        if(number93 == 0){
            Log.d("あいうえお925", "あいうえお");
        } else if (number93 == 925) {
            layout.setBackgroundResource(R.drawable.backgroundj5);
        }

        Intent intent935 = getIntent();
        int number94 = intent935.getIntExtra("background935", 0);
        if(number94 == 0){
            Log.d("あいうえお935", "あいうえお");
        } else if (number94 == 935) {
            layout.setBackgroundResource(R.drawable.backgroundj6);
        }

        Intent intent945 = getIntent();
        int number95 = intent945.getIntExtra("background945", 0);
        if(number95 == 0){
            Log.d("あいうえお945", "あいうえお");
        } else if (number95 == 945) {
            layout.setBackgroundResource(R.drawable.backgroundj7);
        }

        Intent intent955 = getIntent();
        int number96 = intent955.getIntExtra("background955", 0);
        if(number96 == 0){
            Log.d("あいうえお955", "あいうえお");
        } else if (number96 == 955) {
            layout.setBackgroundResource(R.drawable.backgroundj8);
        }

        Intent intent965 = getIntent();
        int number97 = intent965.getIntExtra("background965", 0);
        if(number97 == 0){
            Log.d("あいうえお965", "あいうえお");
        } else if (number97 == 965) {
            layout.setBackgroundResource(R.drawable.backgroundj9);
        }

        Intent intent975 = getIntent();
        int number98 = intent975.getIntExtra("background975", 0);
        if(number98 == 0){
            Log.d("あいうえお975", "あいうえお");
        } else if (number98 == 975) {
            layout.setBackgroundResource(R.drawable.backgroundj10);
        }

        Intent intent985 = getIntent();
        int number99 = intent985.getIntExtra("background985", 0);
        if(number99 == 0){
            Log.d("あいうえお985", "あいうえお");
        } else if (number99 == 985) {
            layout.setBackgroundResource(R.drawable.backgroundj11);
        }

        Intent intent995 = getIntent();
        int number100 = intent995.getIntExtra("background995", 0);
        if(number100 == 0){
            Log.d("あいうえお995", "あいうえお");
        } else if (number100 == 995) {
            layout.setBackgroundResource(R.drawable.backgroundj12);
        }
    }

    public void background5(View v){
        Intent intentM5 = new Intent(this, BackGround0Activity.class);
        intentM5.putExtra("M5", 5);
        startActivity(intentM5);
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
                Log.d("あああああ", "いいいいい");
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
