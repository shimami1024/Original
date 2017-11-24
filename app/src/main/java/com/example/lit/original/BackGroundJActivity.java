package com.example.lit.original;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundJActivity extends AppCompatActivity {

    int images[] ={
            R.drawable.backgroundj1,
            R.drawable.backgroundj2,
            R.drawable.backgroundj3,
            R.drawable.backgroundj4,
            R.drawable.backgroundj5,
            R.drawable.backgroundj6,
            R.drawable.backgroundj7,
            R.drawable.backgroundj8,
            R.drawable.backgroundj9,
            R.drawable.backgroundj10,
            R.drawable.backgroundj11,
            R.drawable.backgroundj12,
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
        setContentView(R.layout.activity_back_ground_j);

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

        if(page == 2){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            NEXT.setBackgroundResource(R.drawable.arrow001);
        } else if(page == 1){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            BACK.setBackgroundResource(R.drawable.arrow007);
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
        } else if(page == 3){
            topLeft.setBackgroundResource(images[(page*4)-4]);
            topRight.setBackgroundResource(images[(page*4)-3]);
            botLeft.setBackgroundResource(images[(page*4)-2]);
            botRight.setBackgroundResource(images[(page*4)-1]);

            NEXT.setBackgroundResource(R.drawable.arrow006);
        } else if(page == 4){
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

    public void jtl(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent881 = new Intent(this, Make1Activity.class);
                intent881.putExtra("background881", 881);
                startActivity(intent881);
            } else if (make2 == 2) {
                Intent intent882 = new Intent(this, Make2Activity.class);
                intent882.putExtra("background882", 882);
                startActivity(intent882);
            } else if (make3 == 3) {
                Intent intent883 = new Intent(this, Make3Activity.class);
                intent883.putExtra("background883", 883);
                startActivity(intent883);
            } else if (make4 == 4) {
                Intent intent884 = new Intent(this, Make4Activity.class);
                intent884.putExtra("background884", 884);
                startActivity(intent884);
            } else if (make5 == 5) {
                Intent intent885 = new Intent(this, Make5Activity.class);
                intent885.putExtra("background885", 885);
                startActivity(intent885);
            } else if (make6 == 6) {
                Intent intent886 = new Intent(this, Make6Activity.class);
                intent886.putExtra("background876", 886);
                startActivity(intent886);
            } else if (make7 == 7) {
                Intent intent887 = new Intent(this, Make7Activity.class);
                intent887.putExtra("background887", 887);
                startActivity(intent887);
            } else if (make8 == 8) {
                Intent intent888 = new Intent(this, Make8Activity.class);
                intent888.putExtra("background888", 888);
                startActivity(intent888);
            } else if (make9 == 9) {
                Intent intent889 = new Intent(this, Make9Activity.class);
                intent889.putExtra("background889", 889);
                startActivity(intent889);
            } else if (make10 == 10) {
                Intent intent890 = new Intent(this, Make10Activity.class);
                intent890.putExtra("background890", 890);
                startActivity(intent890);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent921 = new Intent(this, Make1Activity.class);
                intent921.putExtra("background921", 921);
                startActivity(intent921);
            } else if (make2 == 2) {
                Intent intent922 = new Intent(this, Make2Activity.class);
                intent922.putExtra("background922", 922);
                startActivity(intent922);
            } else if (make3 == 3) {
                Intent intent923 = new Intent(this, Make3Activity.class);
                intent923.putExtra("background923", 923);
                startActivity(intent923);
            } else if (make4 == 4) {
                Intent intent924 = new Intent(this, Make4Activity.class);
                intent924.putExtra("background924", 924);
                startActivity(intent924);
            } else if (make5 == 5) {
                Intent intent925 = new Intent(this, Make5Activity.class);
                intent925.putExtra("background925", 925);
                startActivity(intent925);
            } else if (make6 == 6) {
                Intent intent926 = new Intent(this, Make6Activity.class);
                intent926.putExtra("background926", 926);
                startActivity(intent926);
            } else if (make7 == 7) {
                Intent intent927 = new Intent(this, Make7Activity.class);
                intent927.putExtra("background927", 927);
                startActivity(intent927);
            } else if (make8 == 8) {
                Intent intent928 = new Intent(this, Make8Activity.class);
                intent928.putExtra("background928", 928);
                startActivity(intent928);
            } else if (make9 == 9) {
                Intent intent929 = new Intent(this, Make9Activity.class);
                intent929.putExtra("background929", 929);
                startActivity(intent929);
            } else if (make10 == 10) {
                Intent intent930 = new Intent(this, Make10Activity.class);
                intent930.putExtra("background930", 930);
                startActivity(intent930);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent961 = new Intent(this, Make1Activity.class);
                intent961.putExtra("background961", 961);
                startActivity(intent961);
            } else if (make2 == 2) {
                Intent intent962 = new Intent(this, Make2Activity.class);
                intent962.putExtra("background962", 962);
                startActivity(intent962);
            } else if (make3 == 3) {
                Intent intent963 = new Intent(this, Make3Activity.class);
                intent963.putExtra("background963", 963);
                startActivity(intent963);
            } else if (make4 == 4) {
                Intent intent964 = new Intent(this, Make4Activity.class);
                intent964.putExtra("background964", 964);
                startActivity(intent964);
            } else if (make5 == 5) {
                Intent intent965 = new Intent(this, Make5Activity.class);
                intent965.putExtra("background965", 965);
                startActivity(intent965);
            } else if (make6 == 6) {
                Intent intent966 = new Intent(this, Make6Activity.class);
                intent966.putExtra("background966", 966);
                startActivity(intent966);
            } else if (make7 == 7) {
                Intent intent967 = new Intent(this, Make7Activity.class);
                intent967.putExtra("background967", 967);
                startActivity(intent967);
            } else if (make8 == 8) {
                Intent intent968 = new Intent(this, Make8Activity.class);
                intent968.putExtra("background968", 968);
                startActivity(intent968);
            } else if (make9 == 9) {
                Intent intent969 = new Intent(this, Make9Activity.class);
                intent969.putExtra("background969", 969);
                startActivity(intent969);
            } else if (make10 == 10) {
                Intent intent970 = new Intent(this, Make10Activity.class);
                intent970.putExtra("background970", 970);
                startActivity(intent970);
            }
        }
    }

    public void jtr(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent891 = new Intent(this, Make1Activity.class);
                intent891.putExtra("background891", 891);
                startActivity(intent891);
            } else if (make2 == 2) {
                Intent intent892 = new Intent(this, Make2Activity.class);
                intent892.putExtra("background892", 892);
                startActivity(intent892);
            } else if (make3 == 3) {
                Intent intent893 = new Intent(this, Make3Activity.class);
                intent893.putExtra("background893", 893);
                startActivity(intent893);
            } else if (make4 == 4) {
                Intent intent894 = new Intent(this, Make4Activity.class);
                intent894.putExtra("background894", 894);
                startActivity(intent894);
            } else if (make5 == 5) {
                Intent intent895 = new Intent(this, Make5Activity.class);
                intent895.putExtra("background895", 895);
                startActivity(intent895);
            } else if (make6 == 6) {
                Intent intent896 = new Intent(this, Make6Activity.class);
                intent896.putExtra("background896", 896);
                startActivity(intent896);
            } else if (make7 == 7) {
                Intent intent897 = new Intent(this, Make7Activity.class);
                intent897.putExtra("background897", 897);
                startActivity(intent897);
            } else if (make8 == 8) {
                Intent intent898 = new Intent(this, Make8Activity.class);
                intent898.putExtra("background898", 898);
                startActivity(intent898);
            } else if (make9 == 9) {
                Intent intent899 = new Intent(this, Make9Activity.class);
                intent899.putExtra("background899", 899);
                startActivity(intent899);
            } else if (make10 == 10) {
                Intent intent900 = new Intent(this, Make10Activity.class);
                intent900.putExtra("background900", 900);
                startActivity(intent900);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent931 = new Intent(this, Make1Activity.class);
                intent931.putExtra("background931", 931);
                startActivity(intent931);
            } else if (make2 == 2) {
                Intent intent932 = new Intent(this, Make2Activity.class);
                intent932.putExtra("background932", 932);
                startActivity(intent932);
            } else if (make3 == 3) {
                Intent intent933 = new Intent(this, Make3Activity.class);
                intent933.putExtra("background933", 933);
                startActivity(intent933);
            } else if (make4 == 4) {
                Intent intent934 = new Intent(this, Make4Activity.class);
                intent934.putExtra("background934", 934);
                startActivity(intent934);
            } else if (make5 == 5) {
                Intent intent935 = new Intent(this, Make5Activity.class);
                intent935.putExtra("background935", 935);
                startActivity(intent935);
            } else if (make6 == 6) {
                Intent intent936 = new Intent(this, Make6Activity.class);
                intent936.putExtra("background936", 936);
                startActivity(intent936);
            } else if (make7 == 7) {
                Intent intent937 = new Intent(this, Make7Activity.class);
                intent937.putExtra("background937", 937);
                startActivity(intent937);
            } else if (make8 == 8) {
                Intent intent938 = new Intent(this, Make8Activity.class);
                intent938.putExtra("background938", 938);
                startActivity(intent938);
            } else if (make9 == 9) {
                Intent intent939 = new Intent(this, Make9Activity.class);
                intent939.putExtra("background939", 939);
                startActivity(intent939);
            } else if (make10 == 10) {
                Intent intent940 = new Intent(this, Make10Activity.class);
                intent940.putExtra("background940", 940);
                startActivity(intent940);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent971 = new Intent(this, Make1Activity.class);
                intent971.putExtra("background971", 971);
                startActivity(intent971);
            } else if (make2 == 2) {
                Intent intent972 = new Intent(this, Make2Activity.class);
                intent972.putExtra("background972", 972);
                startActivity(intent972);
            } else if (make3 == 3) {
                Intent intent973 = new Intent(this, Make3Activity.class);
                intent973.putExtra("background973", 973);
                startActivity(intent973);
            } else if (make4 == 4) {
                Intent intent974 = new Intent(this, Make4Activity.class);
                intent974.putExtra("background974", 974);
                startActivity(intent974);
            } else if (make5 == 5) {
                Intent intent975 = new Intent(this, Make5Activity.class);
                intent975.putExtra("background975", 975);
                startActivity(intent975);
            } else if (make6 == 6) {
                Intent intent976 = new Intent(this, Make6Activity.class);
                intent976.putExtra("background976", 976);
                startActivity(intent976);
            } else if (make7 == 7) {
                Intent intent977 = new Intent(this, Make7Activity.class);
                intent977.putExtra("background977", 977);
                startActivity(intent977);
            } else if (make8 == 8) {
                Intent intent978 = new Intent(this, Make8Activity.class);
                intent978.putExtra("background978", 978);
                startActivity(intent978);
            } else if (make9 == 9) {
                Intent intent979 = new Intent(this, Make9Activity.class);
                intent979.putExtra("background979", 979);
                startActivity(intent979);
            } else if (make10 == 10) {
                Intent intent980 = new Intent(this, Make10Activity.class);
                intent980.putExtra("background980", 980);
                startActivity(intent980);
            }
        }
    }

    public void jbl(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent901 = new Intent(this, Make1Activity.class);
                intent901.putExtra("background901", 901);
                startActivity(intent901);
            } else if (make2 == 2) {
                Intent intent902 = new Intent(this, Make2Activity.class);
                intent902.putExtra("background902", 902);
                startActivity(intent902);
            } else if (make3 == 3) {
                Intent intent903 = new Intent(this, Make3Activity.class);
                intent903.putExtra("background903", 903);
                startActivity(intent903);
            } else if (make4 == 4) {
                Intent intent904 = new Intent(this, Make4Activity.class);
                intent904.putExtra("background904", 904);
                startActivity(intent904);
            } else if (make5 == 5) {
                Intent intent905 = new Intent(this, Make5Activity.class);
                intent905.putExtra("background905", 905);
                startActivity(intent905);
            } else if (make6 == 6) {
                Intent intent906 = new Intent(this, Make6Activity.class);
                intent906.putExtra("background906", 906);
                startActivity(intent906);
            } else if (make7 == 7) {
                Intent intent907 = new Intent(this, Make7Activity.class);
                intent907.putExtra("background907", 907);
                startActivity(intent907);
            } else if (make8 == 8) {
                Intent intent908 = new Intent(this, Make8Activity.class);
                intent908.putExtra("background908", 908);
                startActivity(intent908);
            } else if (make9 == 9) {
                Intent intent909 = new Intent(this, Make9Activity.class);
                intent909.putExtra("background909", 909);
                startActivity(intent909);
            } else if (make10 == 10) {
                Intent intent910 = new Intent(this, Make10Activity.class);
                intent910.putExtra("background910", 910);
                startActivity(intent910);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent941 = new Intent(this, Make1Activity.class);
                intent941.putExtra("background941", 941);
                startActivity(intent941);
            } else if (make2 == 2) {
                Intent intent942 = new Intent(this, Make2Activity.class);
                intent942.putExtra("background942", 942);
                startActivity(intent942);
            } else if (make3 == 3) {
                Intent intent943 = new Intent(this, Make3Activity.class);
                intent943.putExtra("background943", 943);
                startActivity(intent943);
            } else if (make4 == 4) {
                Intent intent944 = new Intent(this, Make4Activity.class);
                intent944.putExtra("background944", 944);
                startActivity(intent944);
            } else if (make5 == 5) {
                Intent intent945 = new Intent(this, Make5Activity.class);
                intent945.putExtra("background945", 945);
                startActivity(intent945);
            } else if (make6 == 6) {
                Intent intent946 = new Intent(this, Make6Activity.class);
                intent946.putExtra("background946", 946);
                startActivity(intent946);
            } else if (make7 == 7) {
                Intent intent947 = new Intent(this, Make7Activity.class);
                intent947.putExtra("background947", 947);
                startActivity(intent947);
            } else if (make8 == 8) {
                Intent intent948 = new Intent(this, Make8Activity.class);
                intent948.putExtra("background948", 948);
                startActivity(intent948);
            } else if (make9 == 9) {
                Intent intent949 = new Intent(this, Make9Activity.class);
                intent949.putExtra("background949", 949);
                startActivity(intent949);
            } else if (make10 == 10) {
                Intent intent950 = new Intent(this, Make10Activity.class);
                intent950.putExtra("background950", 950);
                startActivity(intent950);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent981 = new Intent(this, Make1Activity.class);
                intent981.putExtra("background981", 981);
                startActivity(intent981);
            } else if (make2 == 2) {
                Intent intent982 = new Intent(this, Make2Activity.class);
                intent982.putExtra("background982", 982);
                startActivity(intent982);
            } else if (make3 == 3) {
                Intent intent983 = new Intent(this, Make3Activity.class);
                intent983.putExtra("background983", 983);
                startActivity(intent983);
            } else if (make4 == 4) {
                Intent intent984 = new Intent(this, Make4Activity.class);
                intent984.putExtra("background984", 984);
                startActivity(intent984);
            } else if (make5 == 5) {
                Intent intent985 = new Intent(this, Make5Activity.class);
                intent985.putExtra("background985", 985);
                startActivity(intent985);
            } else if (make6 == 6) {
                Intent intent986 = new Intent(this, Make6Activity.class);
                intent986.putExtra("background986", 986);
                startActivity(intent986);
            } else if (make7 == 7) {
                Intent intent987 = new Intent(this, Make7Activity.class);
                intent987.putExtra("background987", 987);
                startActivity(intent987);
            } else if (make8 == 8) {
                Intent intent988 = new Intent(this, Make8Activity.class);
                intent988.putExtra("background988", 988);
                startActivity(intent988);
            } else if (make9 == 9) {
                Intent intent989 = new Intent(this, Make9Activity.class);
                intent989.putExtra("background989", 989);
                startActivity(intent989);
            } else if (make10 == 10) {
                Intent intent990 = new Intent(this, Make10Activity.class);
                intent990.putExtra("background990", 990);
                startActivity(intent990);
            }
        }
    }

    public void jbr(View v){
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

        if(page == 1){
            if (make1 == 1) {
                Intent intent911 = new Intent(this, Make1Activity.class);
                intent911.putExtra("background911", 911);
                startActivity(intent911);
            } else if (make2 == 2) {
                Intent intent912 = new Intent(this, Make2Activity.class);
                intent912.putExtra("background912", 912);
                startActivity(intent912);
            } else if (make3 == 3) {
                Intent intent913 = new Intent(this, Make3Activity.class);
                intent913.putExtra("background913", 913);
                startActivity(intent913);
            } else if (make4 == 4) {
                Intent intent914 = new Intent(this, Make4Activity.class);
                intent914.putExtra("background914", 914);
                startActivity(intent914);
            } else if (make5 == 5) {
                Intent intent915 = new Intent(this, Make5Activity.class);
                intent915.putExtra("background915", 915);
                startActivity(intent915);
            } else if (make6 == 6) {
                Intent intent916 = new Intent(this, Make6Activity.class);
                intent916.putExtra("background916", 916);
                startActivity(intent916);
            } else if (make7 == 7) {
                Intent intent917 = new Intent(this, Make7Activity.class);
                intent917.putExtra("background917", 917);
                startActivity(intent917);
            } else if (make8 == 8) {
                Intent intent918 = new Intent(this, Make8Activity.class);
                intent918.putExtra("background918", 918);
                startActivity(intent918);
            } else if (make9 == 9) {
                Intent intent919 = new Intent(this, Make9Activity.class);
                intent919.putExtra("background919", 919);
                startActivity(intent919);
            } else if (make10 == 10) {
                Intent intent920 = new Intent(this, Make10Activity.class);
                intent920.putExtra("background920", 920);
                startActivity(intent920);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent951 = new Intent(this, Make1Activity.class);
                intent951.putExtra("background951", 951);
                startActivity(intent951);
            } else if (make2 == 2) {
                Intent intent952 = new Intent(this, Make2Activity.class);
                intent952.putExtra("background952", 952);
                startActivity(intent952);
            } else if (make3 == 3) {
                Intent intent953 = new Intent(this, Make3Activity.class);
                intent953.putExtra("background953", 953);
                startActivity(intent953);
            } else if (make4 == 4) {
                Intent intent954 = new Intent(this, Make4Activity.class);
                intent954.putExtra("background954", 954);
                startActivity(intent954);
            } else if (make5 == 5) {
                Intent intent955 = new Intent(this, Make5Activity.class);
                intent955.putExtra("background955", 955);
                startActivity(intent955);
            } else if (make6 == 6) {
                Intent intent956 = new Intent(this, Make6Activity.class);
                intent956.putExtra("background956", 956);
                startActivity(intent956);
            } else if (make7 == 7) {
                Intent intent957 = new Intent(this, Make7Activity.class);
                intent957.putExtra("background957", 957);
                startActivity(intent957);
            } else if (make8 == 8) {
                Intent intent958 = new Intent(this, Make8Activity.class);
                intent958.putExtra("background958", 958);
                startActivity(intent958);
            } else if (make9 == 9) {
                Intent intent959 = new Intent(this, Make9Activity.class);
                intent959.putExtra("background959", 959);
                startActivity(intent959);
            } else if (make10 == 10) {
                Intent intent960 = new Intent(this, Make10Activity.class);
                intent960.putExtra("background960", 960);
                startActivity(intent960);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent991 = new Intent(this, Make1Activity.class);
                intent991.putExtra("background991", 991);
                startActivity(intent991);
            } else if (make2 == 2) {
                Intent intent992 = new Intent(this, Make2Activity.class);
                intent992.putExtra("background992", 992);
                startActivity(intent992);
            } else if (make3 == 3) {
                Intent intent993 = new Intent(this, Make3Activity.class);
                intent993.putExtra("background993", 993);
                startActivity(intent993);
            } else if (make4 == 4) {
                Intent intent994 = new Intent(this, Make4Activity.class);
                intent994.putExtra("background994", 994);
                startActivity(intent994);
            } else if (make5 == 5) {
                Intent intent995 = new Intent(this, Make5Activity.class);
                intent995.putExtra("background995", 995);
                startActivity(intent995);
            } else if (make6 == 6) {
                Intent intent996 = new Intent(this, Make6Activity.class);
                intent996.putExtra("background996", 996);
                startActivity(intent996);
            } else if (make7 == 7) {
                Intent intent997 = new Intent(this, Make7Activity.class);
                intent997.putExtra("background997", 997);
                startActivity(intent997);
            } else if (make8 == 8) {
                Intent intent998 = new Intent(this, Make8Activity.class);
                intent998.putExtra("background998", 998);
                startActivity(intent998);
            } else if (make9 == 9) {
                Intent intent999 = new Intent(this, Make9Activity.class);
                intent999.putExtra("background999", 999);
                startActivity(intent999);
            } else if (make10 == 10) {
                Intent intent1000 = new Intent(this, Make10Activity.class);
                intent1000.putExtra("background1000", 1000);
                startActivity(intent1000);
            }
        }
    }
}
