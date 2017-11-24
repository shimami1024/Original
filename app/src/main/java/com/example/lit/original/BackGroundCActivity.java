package com.example.lit.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundCActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.backgroundc1,
            R.drawable.backgroundc2,
            R.drawable.backgroundc3,
            R.drawable.backgroundc4,
            R.drawable.backgroundc5,
            R.drawable.backgroundc6,
            R.drawable.backgroundc7,
            R.drawable.backgroundc8
    };

    int page;

    ImageButton topLeft;
    ImageButton topRight;
    ImageButton botLeft;
    ImageButton botRight;
    Button BACK;
    Button NEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground_c);

        topLeft = (ImageButton)findViewById(R.id.imageButton1);
        topRight = (ImageButton)findViewById(R.id.imageButton2);
        botLeft = (ImageButton)findViewById(R.id.imageButton3);
        botRight = (ImageButton) findViewById(R.id.imageButton4);
        BACK = (Button)findViewById(R.id.BACK);
        NEXT = (Button)findViewById(R.id.NEXT);

        page = 1;

        topLeft.setBackgroundResource(images[0]);
        topRight.setBackgroundResource(images[1]);
        botLeft.setBackgroundResource(images[2]);
        botRight.setBackgroundResource(images[3]);
    }

    public void back(View v){
        page--;

        if(page == 1){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow007);
            NEXT.setBackgroundResource(R.drawable.arrow001);
        } else if(page == 0){
            Intent intentM1 = getIntent();
            int make1 = intentM1.getIntExtra("M1", 0);
            Intent intentMM1 = new Intent(this, BackGround0Activity.class);

            Intent intentM2 = getIntent();
            int make2 = intentM2.getIntExtra("M2", 0);
            Intent intentMM2 = new Intent(this, BackGround0Activity.class);

            Intent intentM3 = getIntent();
            int make3 = intentM3.getIntExtra("M3", 0);
            Intent intentMM3 = new Intent(this, BackGround0Activity.class);

            Intent intentM4 = getIntent();
            int make4 = intentM4.getIntExtra("M4", 0);
            Intent intentMM4 = new Intent(this, BackGround0Activity.class);

            Intent intentM5 = getIntent();
            int make5 = intentM5.getIntExtra("M5", 0);
            Intent intentMM5 = new Intent(this, BackGround0Activity.class);

            Intent intentM6 = getIntent();
            int make6 = intentM6.getIntExtra("M6", 0);
            Intent intentMM6 = new Intent(this, BackGround0Activity.class);

            Intent intentM7 = getIntent();
            int make7 = intentM7.getIntExtra("M7", 0);
            Intent intentMM7 = new Intent(this, BackGround0Activity.class);

            Intent intentM8 = getIntent();
            int make8 = intentM8.getIntExtra("M8", 0);
            Intent intentMM8 = new Intent(this, BackGround0Activity.class);

            Intent intentM9 = getIntent();
            int make9 = intentM9.getIntExtra("M9", 0);
            Intent intentMM9 = new Intent(this, BackGround0Activity.class);

            Intent intentM10 = getIntent();
            int make10 = intentM10.getIntExtra("M10", 0);
            Intent intentMM10 = new Intent(this, BackGround0Activity.class);

            if (make1 == 1){
                intentMM1.putExtra("M1", 1);
                startActivity(intentMM1);
            } else if (make2 == 2){
                intentMM2.putExtra("M2", 2);
                startActivity(intentMM2);
            } else if (make3 == 3){
                intentMM3.putExtra("M3", 3);
                startActivity(intentMM3);
            } else if (make4 == 4){
                intentMM4.putExtra("M4", 4);
                startActivity(intentMM4);
            } else if (make5 == 5){
                intentMM5.putExtra("M5", 5);
                startActivity(intentMM5);
            } else if (make6 == 6){
                intentMM6.putExtra("M6", 6);
                startActivity(intentMM6);
            } else if (make7 == 7){
                intentMM7.putExtra("M7", 7);
                startActivity(intentMM7);
            } else if (make8 == 8){
                intentMM8.putExtra("M8", 8);
                startActivity(intentMM8);
            } else if (make9 == 9){
                intentMM9.putExtra("M9", 9);
                startActivity(intentMM2);
            } else if (make10 == 10) {
                intentMM10.putExtra("M10", 10);
                startActivity(intentMM10);
            }
        }
    }

    public void next(View v){
        page++;

        if(page == 2){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow002);
            NEXT.setBackgroundResource(R.drawable.arrow006);
        } else if(page == 3){
            Intent intentM1 = getIntent();
            int make1 = intentM1.getIntExtra("M1", 0);
            Intent intentMM1 = new Intent(this, BackGround0Activity.class);

            Intent intentM2 = getIntent();
            int make2 = intentM2.getIntExtra("M2", 0);
            Intent intentMM2 = new Intent(this, BackGround0Activity.class);

            Intent intentM3 = getIntent();
            int make3 = intentM3.getIntExtra("M3", 0);
            Intent intentMM3 = new Intent(this, BackGround0Activity.class);

            Intent intentM4 = getIntent();
            int make4 = intentM4.getIntExtra("M4", 0);
            Intent intentMM4 = new Intent(this, BackGround0Activity.class);

            Intent intentM5 = getIntent();
            int make5 = intentM5.getIntExtra("M5", 0);
            Intent intentMM5 = new Intent(this, BackGround0Activity.class);

            Intent intentM6 = getIntent();
            int make6 = intentM6.getIntExtra("M6", 0);
            Intent intentMM6 = new Intent(this, BackGround0Activity.class);

            Intent intentM7 = getIntent();
            int make7 = intentM7.getIntExtra("M7", 0);
            Intent intentMM7 = new Intent(this, BackGround0Activity.class);

            Intent intentM8 = getIntent();
            int make8 = intentM8.getIntExtra("M8", 0);
            Intent intentMM8 = new Intent(this, BackGround0Activity.class);

            Intent intentM9 = getIntent();
            int make9 = intentM9.getIntExtra("M9", 0);
            Intent intentMM9 = new Intent(this, BackGround0Activity.class);

            Intent intentM10 = getIntent();
            int make10 = intentM10.getIntExtra("M10", 0);
            Intent intentMM10 = new Intent(this, BackGround0Activity.class);

            if (make1 == 1){
                intentMM1.putExtra("M1", 1);
                startActivity(intentMM1);
            } else if (make2 == 2){
                intentMM2.putExtra("M2", 2);
                startActivity(intentMM2);
            } else if (make3 == 3){
                intentMM3.putExtra("M3", 3);
                startActivity(intentMM3);
            } else if (make4 == 4){
                intentMM4.putExtra("M4", 4);
                startActivity(intentMM4);
            } else if (make5 == 5){
                intentMM5.putExtra("M5", 5);
                startActivity(intentMM5);
            } else if (make6 == 6){
                intentMM6.putExtra("M6", 6);
                startActivity(intentMM6);
            } else if (make7 == 7){
                intentMM7.putExtra("M7", 7);
                startActivity(intentMM7);
            } else if (make8 == 8){
                intentMM8.putExtra("M8", 8);
                startActivity(intentMM8);
            } else if (make9 == 9){
                intentMM9.putExtra("M9", 9);
                startActivity(intentMM2);
            } else if (make10 == 10) {
                intentMM10.putExtra("M10", 10);
                startActivity(intentMM10);
            }
        }
    }

    public void ctl(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if(page == 1){
            if (make1 == 1) {
                Intent intent241 = new Intent(this, Make1Activity.class);
                intent241.putExtra("background241", 241);
                startActivity(intent241);
            } else if (make2 == 2) {
                Intent intent242 = new Intent(this, Make2Activity.class);
                intent242.putExtra("background242", 242);
                startActivity(intent242);
            } else if (make3 == 3) {
                Intent intent243 = new Intent(this, Make3Activity.class);
                intent243.putExtra("background243", 243);
                startActivity(intent243);
            } else if (make4 == 4) {
                Intent intent244 = new Intent(this, Make4Activity.class);
                intent244.putExtra("background244", 244);
                startActivity(intent244);
            } else if (make5 == 5) {
                Intent intent245 = new Intent(this, Make5Activity.class);
                intent245.putExtra("background245", 245);
                startActivity(intent245);
            } else if (make6 == 6) {
                Intent intent246 = new Intent(this, Make6Activity.class);
                intent246.putExtra("background246", 246);
                startActivity(intent246);
            } else if (make7 == 7) {
                Intent intent247 = new Intent(this, Make7Activity.class);
                intent247.putExtra("background247", 247);
                startActivity(intent247);
            } else if (make8 == 8) {
                Intent intent248 = new Intent(this, Make8Activity.class);
                intent248.putExtra("background248", 248);
                startActivity(intent248);
            } else if (make9 == 9) {
                Intent intent249 = new Intent(this, Make9Activity.class);
                intent249.putExtra("background249", 249);
                startActivity(intent249);
            } else if (make10 == 10) {
                Intent intent250 = new Intent(this, Make10Activity.class);
                intent250.putExtra("background250", 250);
                startActivity(intent250);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent281 = new Intent(this, Make1Activity.class);
                intent281.putExtra("background281", 281);
                startActivity(intent281);
            } else if (make2 == 2) {
                Intent intent282 = new Intent(this, Make2Activity.class);
                intent282.putExtra("background282", 282);
                startActivity(intent282);
            } else if (make3 == 3) {
                Intent intent283 = new Intent(this, Make3Activity.class);
                intent283.putExtra("background283", 283);
                startActivity(intent283);
            } else if (make4 == 4) {
                Intent intent284 = new Intent(this, Make4Activity.class);
                intent284.putExtra("background284", 284);
                startActivity(intent284);
            } else if (make5 == 5) {
                Intent intent285 = new Intent(this, Make5Activity.class);
                intent285.putExtra("background285", 285);
                startActivity(intent285);
            } else if (make6 == 6) {
                Intent intent286 = new Intent(this, Make6Activity.class);
                intent286.putExtra("background286", 286);
                startActivity(intent286);
            } else if (make7 == 7) {
                Intent intent287 = new Intent(this, Make7Activity.class);
                intent287.putExtra("background287", 287);
                startActivity(intent287);
            } else if (make8 == 8) {
                Intent intent288 = new Intent(this, Make8Activity.class);
                intent288.putExtra("background288", 288);
                startActivity(intent288);
            } else if (make9 == 9) {
                Intent intent289 = new Intent(this, Make9Activity.class);
                intent289.putExtra("background289", 289);
                startActivity(intent289);
            } else if (make10 == 10) {
                Intent intent290 = new Intent(this, Make10Activity.class);
                intent290.putExtra("background290", 290);
                startActivity(intent290);
            }
        }
    }

    public void ctr(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if(page == 1){
            if (make1 == 1) {
                Intent intent251 = new Intent(this, Make1Activity.class);
                intent251.putExtra("background251", 251);
                startActivity(intent251);
            } else if (make2 == 2) {
                Intent intent252 = new Intent(this, Make2Activity.class);
                intent252.putExtra("background252", 252);
                startActivity(intent252);
            } else if (make3 == 3) {
                Intent intent253 = new Intent(this, Make3Activity.class);
                intent253.putExtra("background253", 253);
                startActivity(intent253);
            } else if (make4 == 4) {
                Intent intent254 = new Intent(this, Make4Activity.class);
                intent254.putExtra("background254", 254);
                startActivity(intent254);
            } else if (make5 == 5) {
                Intent intent255 = new Intent(this, Make5Activity.class);
                intent255.putExtra("background255", 255);
                startActivity(intent255);
            } else if (make6 == 6) {
                Intent intent256 = new Intent(this, Make6Activity.class);
                intent256.putExtra("background256", 256);
                startActivity(intent256);
            } else if (make7 == 7) {
                Intent intent257 = new Intent(this, Make7Activity.class);
                intent257.putExtra("background257", 257);
                startActivity(intent257);
            } else if (make8 == 8) {
                Intent intent258 = new Intent(this, Make8Activity.class);
                intent258.putExtra("background258", 258);
                startActivity(intent258);
            } else if (make9 == 9) {
                Intent intent259 = new Intent(this, Make9Activity.class);
                intent259.putExtra("background259", 259);
                startActivity(intent259);
            } else if (make10 == 10) {
                Intent intent260 = new Intent(this, Make10Activity.class);
                intent260.putExtra("background260", 260);
                startActivity(intent260);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent291 = new Intent(this, Make1Activity.class);
                intent291.putExtra("background291", 291);
                startActivity(intent291);
            } else if (make2 == 2) {
                Intent intent292 = new Intent(this, Make2Activity.class);
                intent292.putExtra("background292", 292);
                startActivity(intent292);
            } else if (make3 == 3) {
                Intent intent293 = new Intent(this, Make3Activity.class);
                intent293.putExtra("background293", 293);
                startActivity(intent293);
            } else if (make4 == 4) {
                Intent intent294 = new Intent(this, Make4Activity.class);
                intent294.putExtra("background294", 294);
                startActivity(intent294);
            } else if (make5 == 5) {
                Intent intent295 = new Intent(this, Make5Activity.class);
                intent295.putExtra("background295", 295);
                startActivity(intent295);
            } else if (make6 == 6) {
                Intent intent296 = new Intent(this, Make6Activity.class);
                intent296.putExtra("background296", 296);
                startActivity(intent296);
            } else if (make7 == 7) {
                Intent intent297 = new Intent(this, Make7Activity.class);
                intent297.putExtra("background297", 297);
                startActivity(intent297);
            } else if (make8 == 8) {
                Intent intent298 = new Intent(this, Make8Activity.class);
                intent298.putExtra("background298", 298);
                startActivity(intent298);
            } else if (make9 == 9) {
                Intent intent299 = new Intent(this, Make9Activity.class);
                intent299.putExtra("background299", 299);
                startActivity(intent299);
            } else if (make10 == 10) {
                Intent intent300 = new Intent(this, Make10Activity.class);
                intent300.putExtra("background300", 300);
                startActivity(intent300);
            }
        }
    }

    public void cbl(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if(page == 1){
            if (make1 == 1) {
                Intent intent261 = new Intent(this, Make1Activity.class);
                intent261.putExtra("background261", 261);
                startActivity(intent261);
            } else if (make2 == 2) {
                Intent intent262 = new Intent(this, Make2Activity.class);
                intent262.putExtra("background262", 262);
                startActivity(intent262);
            } else if (make3 == 3) {
                Intent intent263 = new Intent(this, Make3Activity.class);
                intent263.putExtra("background263", 263);
                startActivity(intent263);
            } else if (make4 == 4) {
                Intent intent264 = new Intent(this, Make4Activity.class);
                intent264.putExtra("background264", 264);
                startActivity(intent264);
            } else if (make5 == 5) {
                Intent intent265 = new Intent(this, Make5Activity.class);
                intent265.putExtra("background265", 265);
                startActivity(intent265);
            } else if (make6 == 6) {
                Intent intent266 = new Intent(this, Make6Activity.class);
                intent266.putExtra("background266", 266);
                startActivity(intent266);
            } else if (make7 == 7) {
                Intent intent267 = new Intent(this, Make7Activity.class);
                intent267.putExtra("background267", 267);
                startActivity(intent267);
            } else if (make8 == 8) {
                Intent intent268 = new Intent(this, Make8Activity.class);
                intent268.putExtra("background268", 268);
                startActivity(intent268);
            } else if (make9 == 9) {
                Intent intent269 = new Intent(this, Make9Activity.class);
                intent269.putExtra("background269", 269);
                startActivity(intent269);
            } else if (make10 == 10) {
                Intent intent270 = new Intent(this, Make10Activity.class);
                intent270.putExtra("background270", 270);
                startActivity(intent270);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent301 = new Intent(this, Make1Activity.class);
                intent301.putExtra("background301", 301);
                startActivity(intent301);
            } else if (make2 == 2) {
                Intent intent302 = new Intent(this, Make2Activity.class);
                intent302.putExtra("background302", 302);
                startActivity(intent302);
            } else if (make3 == 3) {
                Intent intent303 = new Intent(this, Make3Activity.class);
                intent303.putExtra("background303", 303);
                startActivity(intent303);
            } else if (make4 == 4) {
                Intent intent304 = new Intent(this, Make4Activity.class);
                intent304.putExtra("background304", 304);
                startActivity(intent304);
            } else if (make5 == 5) {
                Intent intent305 = new Intent(this, Make5Activity.class);
                intent305.putExtra("background305", 305);
                startActivity(intent305);
            } else if (make6 == 6) {
                Intent intent306 = new Intent(this, Make6Activity.class);
                intent306.putExtra("background306", 306);
                startActivity(intent306);
            } else if (make7 == 7) {
                Intent intent307 = new Intent(this, Make7Activity.class);
                intent307.putExtra("background307", 307);
                startActivity(intent307);
            } else if (make8 == 8) {
                Intent intent308 = new Intent(this, Make8Activity.class);
                intent308.putExtra("background308", 308);
                startActivity(intent308);
            } else if (make9 == 9) {
                Intent intent309 = new Intent(this, Make9Activity.class);
                intent309.putExtra("background309", 309);
                startActivity(intent309);
            } else if (make10 == 10) {
                Intent intent310 = new Intent(this, Make10Activity.class);
                intent310.putExtra("background310", 310);
                startActivity(intent310);
            }
        }
    }

    public void cbr(View v){
        Intent intentMM1 = getIntent();
        int make1 = intentMM1.getIntExtra("M1", 0);

        Intent intentMM2 = getIntent();
        int make2 = intentMM2.getIntExtra("M2", 0);

        Intent intentMM3 = getIntent();
        int make3 = intentMM3.getIntExtra("M3", 0);

        Intent intentMM4 = getIntent();
        int make4 = intentMM4.getIntExtra("M4", 0);

        Intent intentMM5 = getIntent();
        int make5 = intentMM5.getIntExtra("M5", 0);

        Intent intentMM6 = getIntent();
        int make6 = intentMM6.getIntExtra("M6", 0);

        Intent intentMM7 = getIntent();
        int make7 = intentMM7.getIntExtra("M7", 0);

        Intent intentMM8 = getIntent();
        int make8 = intentMM8.getIntExtra("M8", 0);

        Intent intentMM9 = getIntent();
        int make9 = intentMM9.getIntExtra("M9", 0);

        Intent intentMM10 = getIntent();
        int make10 = intentMM10.getIntExtra("M10", 0);

        if(page == 1){
            if (make1 == 1) {
                Intent intent271 = new Intent(this, Make1Activity.class);
                intent271.putExtra("background271", 271);
                startActivity(intent271);
            } else if (make2 == 2) {
                Intent intent272 = new Intent(this, Make2Activity.class);
                intent272.putExtra("background272", 272);
                startActivity(intent272);
            } else if (make3 == 3) {
                Intent intent273 = new Intent(this, Make3Activity.class);
                intent273.putExtra("background273", 273);
                startActivity(intent273);
            } else if (make4 == 4) {
                Intent intent274 = new Intent(this, Make4Activity.class);
                intent274.putExtra("background274", 274);
                startActivity(intent274);
            } else if (make5 == 5) {
                Intent intent275 = new Intent(this, Make5Activity.class);
                intent275.putExtra("background275", 275);
                startActivity(intent275);
            } else if (make6 == 6) {
                Intent intent276 = new Intent(this, Make6Activity.class);
                intent276.putExtra("background276", 276);
                startActivity(intent276);
            } else if (make7 == 7) {
                Intent intent277 = new Intent(this, Make7Activity.class);
                intent277.putExtra("background277", 277);
                startActivity(intent277);
            } else if (make8 == 8) {
                Intent intent278 = new Intent(this, Make8Activity.class);
                intent278.putExtra("background278", 278);
                startActivity(intent278);
            } else if (make9 == 9) {
                Intent intent279 = new Intent(this, Make9Activity.class);
                intent279.putExtra("background279", 279);
                startActivity(intent279);
            } else if (make10 == 10) {
                Intent intent280 = new Intent(this, Make10Activity.class);
                intent280.putExtra("background280", 280);
                startActivity(intent280);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent311 = new Intent(this, Make1Activity.class);
                intent311.putExtra("background311", 311);
                startActivity(intent311);
            } else if (make2 == 2) {
                Intent intent312 = new Intent(this, Make2Activity.class);
                intent312.putExtra("background312", 312);
                startActivity(intent312);
            } else if (make3 == 3) {
                Intent intent313 = new Intent(this, Make3Activity.class);
                intent313.putExtra("background313", 313);
                startActivity(intent313);
            } else if (make4 == 4) {
                Intent intent314 = new Intent(this, Make4Activity.class);
                intent314.putExtra("background314", 314);
                startActivity(intent314);
            } else if (make5 == 5) {
                Intent intent315 = new Intent(this, Make5Activity.class);
                intent315.putExtra("background315", 315);
                startActivity(intent315);
            } else if (make6 == 6) {
                Intent intent316 = new Intent(this, Make6Activity.class);
                intent316.putExtra("background316", 316);
                startActivity(intent316);
            } else if (make7 == 7) {
                Intent intent317 = new Intent(this, Make7Activity.class);
                intent317.putExtra("background317", 317);
                startActivity(intent317);
            } else if (make8 == 8) {
                Intent intent318 = new Intent(this, Make8Activity.class);
                intent318.putExtra("background318", 318);
                startActivity(intent318);
            } else if (make9 == 9) {
                Intent intent319 = new Intent(this, Make9Activity.class);
                intent319.putExtra("background319", 319);
                startActivity(intent319);
            } else if (make10 == 10) {
                Intent intent320 = new Intent(this, Make10Activity.class);
                intent320.putExtra("background320", 320);
                startActivity(intent320);
            }
        }
    }
}
