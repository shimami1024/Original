package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundBActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.backgroundb1,
            R.drawable.backgroundb2,
            R.drawable.backgroundb3,
            R.drawable.backgroundb4,
            R.drawable.backgroundb5,
            R.drawable.backgroundb6,
            R.drawable.backgroundb7,
            R.drawable.backgroundb8
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
        setContentView(R.layout.activity_back_ground_b);

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

    public void btl(View v){
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
                Intent intent161 = new Intent(this, Make1Activity.class);
                intent161.putExtra("background161", 161);
                startActivity(intent161);
            } else if (make2 == 2) {
                Intent intent162 = new Intent(this, Make2Activity.class);
                intent162.putExtra("background162", 162);
                startActivity(intent162);
            } else if (make3 == 3) {
                Intent intent163 = new Intent(this, Make3Activity.class);
                intent163.putExtra("background163", 163);
                startActivity(intent163);
            } else if (make4 == 4) {
                Intent intent164 = new Intent(this, Make4Activity.class);
                intent164.putExtra("background164", 164);
                startActivity(intent164);
            } else if (make5 == 5) {
                Intent intent165 = new Intent(this, Make5Activity.class);
                intent165.putExtra("background165", 165);
                startActivity(intent165);
            } else if (make6 == 6) {
                Intent intent166 = new Intent(this, Make6Activity.class);
                intent166.putExtra("background166", 166);
                startActivity(intent166);
            } else if (make7 == 7) {
                Intent intent167 = new Intent(this, Make7Activity.class);
                intent167.putExtra("background167", 167);
                startActivity(intent167);
            } else if (make8 == 8) {
                Intent intent168 = new Intent(this, Make8Activity.class);
                intent168.putExtra("background168", 168);
                startActivity(intent168);
            } else if (make9 == 9) {
                Intent intent169 = new Intent(this, Make9Activity.class);
                intent169.putExtra("background169", 169);
                startActivity(intent169);
            } else if (make10 == 10) {
                Intent intent170 = new Intent(this, Make10Activity.class);
                intent170.putExtra("background170", 170);
                startActivity(intent170);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent201 = new Intent(this, Make1Activity.class);
                intent201.putExtra("background201", 201);
                startActivity(intent201);
            } else if (make2 == 2) {
                Intent intent202 = new Intent(this, Make2Activity.class);
                intent202.putExtra("background202", 202);
                startActivity(intent202);
            } else if (make3 == 3) {
                Intent intent203 = new Intent(this, Make3Activity.class);
                intent203.putExtra("background203", 203);
                startActivity(intent203);
            } else if (make4 == 4) {
                Intent intent204 = new Intent(this, Make4Activity.class);
                intent204.putExtra("background204", 204);
                startActivity(intent204);
            } else if (make5 == 5) {
                Intent intent205 = new Intent(this, Make5Activity.class);
                intent205.putExtra("background205", 205);
                startActivity(intent205);
            } else if (make6 == 6) {
                Intent intent206 = new Intent(this, Make6Activity.class);
                intent206.putExtra("background206", 206);
                startActivity(intent206);
            } else if (make7 == 7) {
                Intent intent207 = new Intent(this, Make7Activity.class);
                intent207.putExtra("background207", 207);
                startActivity(intent207);
            } else if (make8 == 8) {
                Intent intent208 = new Intent(this, Make8Activity.class);
                intent208.putExtra("background208", 208);
                startActivity(intent208);
            } else if (make9 == 9) {
                Intent intent209 = new Intent(this, Make9Activity.class);
                intent209.putExtra("background209", 209);
                startActivity(intent209);
            } else if (make10 == 10) {
                Intent intent210 = new Intent(this, Make10Activity.class);
                intent210.putExtra("background210", 210);
                startActivity(intent210);
            }
        }
    }

    public void btr(View v){
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
                Intent intent171 = new Intent(this, Make1Activity.class);
                intent171.putExtra("background171", 171);
                startActivity(intent171);
            } else if (make2 == 2) {
                Intent intent172 = new Intent(this, Make2Activity.class);
                intent172.putExtra("background172", 172);
                startActivity(intent172);
            } else if (make3 == 3) {
                Intent intent173 = new Intent(this, Make3Activity.class);
                intent173.putExtra("background173", 173);
                startActivity(intent173);
            } else if (make4 == 4) {
                Intent intent174 = new Intent(this, Make4Activity.class);
                intent174.putExtra("background174", 174);
                startActivity(intent174);
            } else if (make5 == 5) {
                Intent intent175 = new Intent(this, Make5Activity.class);
                intent175.putExtra("background175", 175);
                startActivity(intent175);
            } else if (make6 == 6) {
                Intent intent176 = new Intent(this, Make6Activity.class);
                intent176.putExtra("background176", 176);
                startActivity(intent176);
            } else if (make7 == 7) {
                Intent intent177 = new Intent(this, Make7Activity.class);
                intent177.putExtra("background177", 177);
                startActivity(intent177);
            } else if (make8 == 8) {
                Intent intent178 = new Intent(this, Make8Activity.class);
                intent178.putExtra("background178", 178);
                startActivity(intent178);
            } else if (make9 == 9) {
                Intent intent179 = new Intent(this, Make9Activity.class);
                intent179.putExtra("background179", 179);
                startActivity(intent179);
            } else if (make10 == 10) {
                Intent intent180 = new Intent(this, Make10Activity.class);
                intent180.putExtra("background180", 180);
                startActivity(intent180);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent211 = new Intent(this, Make1Activity.class);
                intent211.putExtra("background211", 211);
                startActivity(intent211);
            } else if (make2 == 2) {
                Intent intent212 = new Intent(this, Make2Activity.class);
                intent212.putExtra("background212", 212);
                startActivity(intent212);
            } else if (make3 == 3) {
                Intent intent213 = new Intent(this, Make3Activity.class);
                intent213.putExtra("background213", 213);
                startActivity(intent213);
            } else if (make4 == 4) {
                Intent intent214 = new Intent(this, Make4Activity.class);
                intent214.putExtra("background214", 214);
                startActivity(intent214);
            } else if (make5 == 5) {
                Intent intent215 = new Intent(this, Make5Activity.class);
                intent215.putExtra("background215", 215);
                startActivity(intent215);
            } else if (make6 == 6) {
                Intent intent216 = new Intent(this, Make6Activity.class);
                intent216.putExtra("background216", 216);
                startActivity(intent216);
            } else if (make7 == 7) {
                Intent intent217 = new Intent(this, Make7Activity.class);
                intent217.putExtra("background217", 217);
                startActivity(intent217);
            } else if (make8 == 8) {
                Intent intent218 = new Intent(this, Make8Activity.class);
                intent218.putExtra("background218", 218);
                startActivity(intent218);
            } else if (make9 == 9) {
                Intent intent219 = new Intent(this, Make9Activity.class);
                intent219.putExtra("background219", 219);
                startActivity(intent219);
            } else if (make10 == 10) {
                Intent intent220 = new Intent(this, Make10Activity.class);
                intent220.putExtra("background220", 220);
                startActivity(intent220);
            }
        }
    }

    public void bbl(View v){
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
                Intent intent181 = new Intent(this, Make1Activity.class);
                intent181.putExtra("background181", 181);
                startActivity(intent181);
            } else if (make2 == 2) {
                Intent intent182 = new Intent(this, Make2Activity.class);
                intent182.putExtra("background182", 182);
                startActivity(intent182);
            } else if (make3 == 3) {
                Intent intent183 = new Intent(this, Make3Activity.class);
                intent183.putExtra("background183", 183);
                startActivity(intent183);
            } else if (make4 == 4) {
                Intent intent184 = new Intent(this, Make4Activity.class);
                intent184.putExtra("background184", 184);
                startActivity(intent184);
            } else if (make5 == 5) {
                Intent intent185 = new Intent(this, Make5Activity.class);
                intent185.putExtra("background185", 185);
                startActivity(intent185);
            } else if (make6 == 6) {
                Intent intent186 = new Intent(this, Make6Activity.class);
                intent186.putExtra("background186", 186);
                startActivity(intent186);
            } else if (make7 == 7) {
                Intent intent187 = new Intent(this, Make7Activity.class);
                intent187.putExtra("background187", 187);
                startActivity(intent187);
            } else if (make8 == 8) {
                Intent intent188 = new Intent(this, Make8Activity.class);
                intent188.putExtra("background188", 188);
                startActivity(intent188);
            } else if (make9 == 9) {
                Intent intent189 = new Intent(this, Make9Activity.class);
                intent189.putExtra("background189", 189);
                startActivity(intent189);
            } else if (make10 == 10) {
                Intent intent190 = new Intent(this, Make10Activity.class);
                intent190.putExtra("background190", 190);
                startActivity(intent190);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent221 = new Intent(this, Make1Activity.class);
                intent221.putExtra("background221", 221);
                startActivity(intent221);
            } else if (make2 == 2) {
                Intent intent222 = new Intent(this, Make2Activity.class);
                intent222.putExtra("background222", 222);
                startActivity(intent222);
            } else if (make3 == 3) {
                Intent intent223 = new Intent(this, Make3Activity.class);
                intent223.putExtra("background223", 223);
                startActivity(intent223);
            } else if (make4 == 4) {
                Intent intent224 = new Intent(this, Make4Activity.class);
                intent224.putExtra("background224", 224);
                startActivity(intent224);
            } else if (make5 == 5) {
                Intent intent225 = new Intent(this, Make5Activity.class);
                intent225.putExtra("background225", 225);
                startActivity(intent225);
            } else if (make6 == 6) {
                Intent intent226 = new Intent(this, Make6Activity.class);
                intent226.putExtra("background226", 226);
                startActivity(intent226);
            } else if (make7 == 7) {
                Intent intent227 = new Intent(this, Make7Activity.class);
                intent227.putExtra("background227", 227);
                startActivity(intent227);
            } else if (make8 == 8) {
                Intent intent228 = new Intent(this, Make8Activity.class);
                intent228.putExtra("background228", 228);
                startActivity(intent228);
            } else if (make9 == 9) {
                Intent intent229 = new Intent(this, Make9Activity.class);
                intent229.putExtra("background229", 229);
                startActivity(intent229);
            } else if (make10 == 10) {
                Intent intent230 = new Intent(this, Make10Activity.class);
                intent230.putExtra("background230", 230);
                startActivity(intent230);
            }
        }
    }

    public void bbr(View v){
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
                Intent intent191 = new Intent(this, Make1Activity.class);
                intent191.putExtra("background191", 191);
                startActivity(intent191);
            } else if (make2 == 2) {
                Intent intent192 = new Intent(this, Make2Activity.class);
                intent192.putExtra("background192", 192);
                startActivity(intent192);
            } else if (make3 == 3) {
                Intent intent193 = new Intent(this, Make3Activity.class);
                intent193.putExtra("background193", 193);
                startActivity(intent193);
            } else if (make4 == 4) {
                Intent intent194 = new Intent(this, Make4Activity.class);
                intent194.putExtra("background194", 194);
                startActivity(intent194);
            } else if (make5 == 5) {
                Intent intent195 = new Intent(this, Make5Activity.class);
                intent195.putExtra("background195", 195);
                startActivity(intent195);
            } else if (make6 == 6) {
                Intent intent196 = new Intent(this, Make6Activity.class);
                intent196.putExtra("background196", 196);
                startActivity(intent196);
            } else if (make7 == 7) {
                Intent intent197 = new Intent(this, Make7Activity.class);
                intent197.putExtra("background197", 197);
                startActivity(intent197);
            } else if (make8 == 8) {
                Intent intent198 = new Intent(this, Make8Activity.class);
                intent198.putExtra("background198", 198);
                startActivity(intent198);
            } else if (make9 == 9) {
                Intent intent199 = new Intent(this, Make9Activity.class);
                intent199.putExtra("background199", 199);
                startActivity(intent199);
            } else if (make10 == 10) {
                Intent intent200 = new Intent(this, Make10Activity.class);
                intent200.putExtra("background200", 200);
                startActivity(intent200);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent231 = new Intent(this, Make1Activity.class);
                intent231.putExtra("background231", 231);
                startActivity(intent231);
            } else if (make2 == 2) {
                Intent intent232 = new Intent(this, Make2Activity.class);
                intent232.putExtra("background232", 232);
                startActivity(intent232);
            } else if (make3 == 3) {
                Intent intent233 = new Intent(this, Make3Activity.class);
                intent233.putExtra("background233", 233);
                startActivity(intent233);
            } else if (make4 == 4) {
                Intent intent234 = new Intent(this, Make4Activity.class);
                intent234.putExtra("background234", 234);
                startActivity(intent234);
            } else if (make5 == 5) {
                Intent intent235 = new Intent(this, Make5Activity.class);
                intent235.putExtra("background235", 235);
                startActivity(intent235);
            } else if (make6 == 6) {
                Intent intent236 = new Intent(this, Make6Activity.class);
                intent236.putExtra("background236", 236);
                startActivity(intent236);
            } else if (make7 == 7) {
                Intent intent237 = new Intent(this, Make7Activity.class);
                intent237.putExtra("background237", 237);
                startActivity(intent237);
            } else if (make8 == 8) {
                Intent intent238 = new Intent(this, Make8Activity.class);
                intent238.putExtra("background238", 238);
                startActivity(intent238);
            } else if (make9 == 9) {
                Intent intent239 = new Intent(this, Make9Activity.class);
                intent239.putExtra("background239", 239);
                startActivity(intent239);
            } else if (make10 == 10) {
                Intent intent240 = new Intent(this, Make10Activity.class);
                intent240.putExtra("background240", 240);
                startActivity(intent240);
            }
        }
    }
}
