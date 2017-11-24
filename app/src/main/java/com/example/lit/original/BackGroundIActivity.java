package com.example.lit.original;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundIActivity extends AppCompatActivity {

    int images[] ={
            R.drawable.backgroundi1,
            R.drawable.backgroundi2,
            R.drawable.backgroundi3,
            R.drawable.backgroundi4,
            R.drawable.backgroundi5,
            R.drawable.backgroundi6,
            R.drawable.backgroundi7,
            R.drawable.backgroundi8,
            R.drawable.backgroundi9,
            R.drawable.backgroundi10,
            R.drawable.backgroundi11,
            R.drawable.backgroundi12,
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
        setContentView(R.layout.activity_back_ground_i);

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

    public void itl(View v){
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
                Intent intent761 = new Intent(this, Make1Activity.class);
                intent761.putExtra("background761", 761);
                startActivity(intent761);
            } else if (make2 == 2) {
                Intent intent762 = new Intent(this, Make2Activity.class);
                intent762.putExtra("background762", 762);
                startActivity(intent762);
            } else if (make3 == 3) {
                Intent intent763 = new Intent(this, Make3Activity.class);
                intent763.putExtra("background763", 763);
                startActivity(intent763);
            } else if (make4 == 4) {
                Intent intent764 = new Intent(this, Make4Activity.class);
                intent764.putExtra("background764", 764);
                startActivity(intent764);
            } else if (make5 == 5) {
                Intent intent765 = new Intent(this, Make5Activity.class);
                intent765.putExtra("background765", 765);
                startActivity(intent765);
            } else if (make6 == 6) {
                Intent intent766 = new Intent(this, Make6Activity.class);
                intent766.putExtra("background766", 766);
                startActivity(intent766);
            } else if (make7 == 7) {
                Intent intent767 = new Intent(this, Make7Activity.class);
                intent767.putExtra("background767", 767);
                startActivity(intent767);
            } else if (make8 == 8) {
                Intent intent768 = new Intent(this, Make8Activity.class);
                intent768.putExtra("background768", 768);
                startActivity(intent768);
            } else if (make9 == 9) {
                Intent intent769 = new Intent(this, Make9Activity.class);
                intent769.putExtra("background769", 769);
                startActivity(intent769);
            } else if (make10 == 10) {
                Intent intent770 = new Intent(this, Make10Activity.class);
                intent770.putExtra("background770", 770);
                startActivity(intent770);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent801 = new Intent(this, Make1Activity.class);
                intent801.putExtra("background801", 801);
                startActivity(intent801);
            } else if (make2 == 2) {
                Intent intent802 = new Intent(this, Make2Activity.class);
                intent802.putExtra("background802", 802);
                startActivity(intent802);
            } else if (make3 == 3) {
                Intent intent803 = new Intent(this, Make3Activity.class);
                intent803.putExtra("background803", 803);
                startActivity(intent803);
            } else if (make4 == 4) {
                Intent intent804 = new Intent(this, Make4Activity.class);
                intent804.putExtra("background804", 804);
                startActivity(intent804);
            } else if (make5 == 5) {
                Intent intent805 = new Intent(this, Make5Activity.class);
                intent805.putExtra("background805", 805);
                startActivity(intent805);
            } else if (make6 == 6) {
                Intent intent806 = new Intent(this, Make6Activity.class);
                intent806.putExtra("background806", 806);
                startActivity(intent806);
            } else if (make7 == 7) {
                Intent intent807 = new Intent(this, Make7Activity.class);
                intent807.putExtra("background807", 807);
                startActivity(intent807);
            } else if (make8 == 8) {
                Intent intent808 = new Intent(this, Make8Activity.class);
                intent808.putExtra("background808", 808);
                startActivity(intent808);
            } else if (make9 == 9) {
                Intent intent809 = new Intent(this, Make9Activity.class);
                intent809.putExtra("background809", 809);
                startActivity(intent809);
            } else if (make10 == 10) {
                Intent intent810 = new Intent(this, Make10Activity.class);
                intent810.putExtra("background810", 810);
                startActivity(intent810);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent841 = new Intent(this, Make1Activity.class);
                intent841.putExtra("background841", 841);
                startActivity(intent841);
            } else if (make2 == 2) {
                Intent intent842 = new Intent(this, Make2Activity.class);
                intent842.putExtra("background842", 842);
                startActivity(intent842);
            } else if (make3 == 3) {
                Intent intent843 = new Intent(this, Make3Activity.class);
                intent843.putExtra("background843", 843);
                startActivity(intent843);
            } else if (make4 == 4) {
                Intent intent844 = new Intent(this, Make4Activity.class);
                intent844.putExtra("background844", 844);
                startActivity(intent844);
            } else if (make5 == 5) {
                Intent intent845 = new Intent(this, Make5Activity.class);
                intent845.putExtra("background845", 845);
                startActivity(intent845);
            } else if (make6 == 6) {
                Intent intent846 = new Intent(this, Make6Activity.class);
                intent846.putExtra("background846", 846);
                startActivity(intent846);
            } else if (make7 == 7) {
                Intent intent847 = new Intent(this, Make7Activity.class);
                intent847.putExtra("background847", 847);
                startActivity(intent847);
            } else if (make8 == 8) {
                Intent intent848 = new Intent(this, Make8Activity.class);
                intent848.putExtra("background848", 848);
                startActivity(intent848);
            } else if (make9 == 9) {
                Intent intent849 = new Intent(this, Make9Activity.class);
                intent849.putExtra("background849", 849);
                startActivity(intent849);
            } else if (make10 == 10) {
                Intent intent850 = new Intent(this, Make10Activity.class);
                intent850.putExtra("background850", 850);
                startActivity(intent850);
            }
        }
    }

    public void itr(View v){
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
                Intent intent771 = new Intent(this, Make1Activity.class);
                intent771.putExtra("background771", 771);
                startActivity(intent771);
            } else if (make2 == 2) {
                Intent intent772 = new Intent(this, Make2Activity.class);
                intent772.putExtra("background772", 772);
                startActivity(intent772);
            } else if (make3 == 3) {
                Intent intent773 = new Intent(this, Make3Activity.class);
                intent773.putExtra("background773", 773);
                startActivity(intent773);
            } else if (make4 == 4) {
                Intent intent774 = new Intent(this, Make4Activity.class);
                intent774.putExtra("background774", 774);
                startActivity(intent774);
            } else if (make5 == 5) {
                Intent intent775 = new Intent(this, Make5Activity.class);
                intent775.putExtra("background775", 775);
                startActivity(intent775);
            } else if (make6 == 6) {
                Intent intent776 = new Intent(this, Make6Activity.class);
                intent776.putExtra("background776", 776);
                startActivity(intent776);
            } else if (make7 == 7) {
                Intent intent777 = new Intent(this, Make7Activity.class);
                intent777.putExtra("background777", 777);
                startActivity(intent777);
            } else if (make8 == 8) {
                Intent intent778 = new Intent(this, Make8Activity.class);
                intent778.putExtra("background778", 778);
                startActivity(intent778);
            } else if (make9 == 9) {
                Intent intent779 = new Intent(this, Make9Activity.class);
                intent779.putExtra("background779", 779);
                startActivity(intent779);
            } else if (make10 == 10) {
                Intent intent780 = new Intent(this, Make10Activity.class);
                intent780.putExtra("background780", 780);
                startActivity(intent780);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent811 = new Intent(this, Make1Activity.class);
                intent811.putExtra("background811", 811);
                startActivity(intent811);
            } else if (make2 == 2) {
                Intent intent812 = new Intent(this, Make2Activity.class);
                intent812.putExtra("background812", 812);
                startActivity(intent812);
            } else if (make3 == 3) {
                Intent intent813 = new Intent(this, Make3Activity.class);
                intent813.putExtra("background813", 813);
                startActivity(intent813);
            } else if (make4 == 4) {
                Intent intent814 = new Intent(this, Make4Activity.class);
                intent814.putExtra("background814", 814);
                startActivity(intent814);
            } else if (make5 == 5) {
                Intent intent815 = new Intent(this, Make5Activity.class);
                intent815.putExtra("background815", 815);
                startActivity(intent815);
            } else if (make6 == 6) {
                Intent intent816 = new Intent(this, Make6Activity.class);
                intent816.putExtra("background816", 816);
                startActivity(intent816);
            } else if (make7 == 7) {
                Intent intent817 = new Intent(this, Make7Activity.class);
                intent817.putExtra("background817", 817);
                startActivity(intent817);
            } else if (make8 == 8) {
                Intent intent818 = new Intent(this, Make8Activity.class);
                intent818.putExtra("background818", 818);
                startActivity(intent818);
            } else if (make9 == 9) {
                Intent intent819 = new Intent(this, Make9Activity.class);
                intent819.putExtra("background819", 819);
                startActivity(intent819);
            } else if (make10 == 10) {
                Intent intent820 = new Intent(this, Make10Activity.class);
                intent820.putExtra("background820", 820);
                startActivity(intent820);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent851 = new Intent(this, Make1Activity.class);
                intent851.putExtra("background851", 851);
                startActivity(intent851);
            } else if (make2 == 2) {
                Intent intent852 = new Intent(this, Make2Activity.class);
                intent852.putExtra("background852", 852);
                startActivity(intent852);
            } else if (make3 == 3) {
                Intent intent853 = new Intent(this, Make3Activity.class);
                intent853.putExtra("background853", 853);
                startActivity(intent853);
            } else if (make4 == 4) {
                Intent intent854 = new Intent(this, Make4Activity.class);
                intent854.putExtra("background854", 854);
                startActivity(intent854);
            } else if (make5 == 5) {
                Intent intent855 = new Intent(this, Make5Activity.class);
                intent855.putExtra("background855", 855);
                startActivity(intent855);
            } else if (make6 == 6) {
                Intent intent856 = new Intent(this, Make6Activity.class);
                intent856.putExtra("background856", 856);
                startActivity(intent856);
            } else if (make7 == 7) {
                Intent intent857 = new Intent(this, Make7Activity.class);
                intent857.putExtra("background857", 857);
                startActivity(intent857);
            } else if (make8 == 8) {
                Intent intent858 = new Intent(this, Make8Activity.class);
                intent858.putExtra("background858", 858);
                startActivity(intent858);
            } else if (make9 == 9) {
                Intent intent859 = new Intent(this, Make9Activity.class);
                intent859.putExtra("background859", 859);
                startActivity(intent859);
            } else if (make10 == 10) {
                Intent intent860 = new Intent(this, Make10Activity.class);
                intent860.putExtra("background860", 860);
                startActivity(intent860);
            }
        }
    }

    public void ibl(View v){
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
                Intent intent781 = new Intent(this, Make1Activity.class);
                intent781.putExtra("background781", 781);
                startActivity(intent781);
            } else if (make2 == 2) {
                Intent intent782 = new Intent(this, Make2Activity.class);
                intent782.putExtra("background782", 782);
                startActivity(intent782);
            } else if (make3 == 3) {
                Intent intent783 = new Intent(this, Make3Activity.class);
                intent783.putExtra("background783", 783);
                startActivity(intent783);
            } else if (make4 == 4) {
                Intent intent784 = new Intent(this, Make4Activity.class);
                intent784.putExtra("background784", 784);
                startActivity(intent784);
            } else if (make5 == 5) {
                Intent intent785 = new Intent(this, Make5Activity.class);
                intent785.putExtra("background785", 785);
                startActivity(intent785);
            } else if (make6 == 6) {
                Intent intent786 = new Intent(this, Make6Activity.class);
                intent786.putExtra("background786", 786);
                startActivity(intent786);
            } else if (make7 == 7) {
                Intent intent787 = new Intent(this, Make7Activity.class);
                intent787.putExtra("background787", 787);
                startActivity(intent787);
            } else if (make8 == 8) {
                Intent intent788 = new Intent(this, Make8Activity.class);
                intent788.putExtra("background788", 788);
                startActivity(intent788);
            } else if (make9 == 9) {
                Intent intent789 = new Intent(this, Make9Activity.class);
                intent789.putExtra("background789", 789);
                startActivity(intent789);
            } else if (make10 == 10) {
                Intent intent790 = new Intent(this, Make10Activity.class);
                intent790.putExtra("background790", 790);
                startActivity(intent790);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent821 = new Intent(this, Make1Activity.class);
                intent821.putExtra("background821", 821);
                startActivity(intent821);
            } else if (make2 == 2) {
                Intent intent822 = new Intent(this, Make2Activity.class);
                intent822.putExtra("background822", 822);
                startActivity(intent822);
            } else if (make3 == 3) {
                Intent intent823 = new Intent(this, Make3Activity.class);
                intent823.putExtra("background823", 823);
                startActivity(intent823);
            } else if (make4 == 4) {
                Intent intent824 = new Intent(this, Make4Activity.class);
                intent824.putExtra("background824", 824);
                startActivity(intent824);
            } else if (make5 == 5) {
                Intent intent825 = new Intent(this, Make5Activity.class);
                intent825.putExtra("background825", 825);
                startActivity(intent825);
            } else if (make6 == 6) {
                Intent intent826 = new Intent(this, Make6Activity.class);
                intent826.putExtra("background826", 826);
                startActivity(intent826);
            } else if (make7 == 7) {
                Intent intent827 = new Intent(this, Make7Activity.class);
                intent827.putExtra("background827", 827);
                startActivity(intent827);
            } else if (make8 == 8) {
                Intent intent828 = new Intent(this, Make8Activity.class);
                intent828.putExtra("background828", 828);
                startActivity(intent828);
            } else if (make9 == 9) {
                Intent intent829 = new Intent(this, Make9Activity.class);
                intent829.putExtra("background829", 829);
                startActivity(intent829);
            } else if (make10 == 10) {
                Intent intent830 = new Intent(this, Make10Activity.class);
                intent830.putExtra("background830", 830);
                startActivity(intent830);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent861 = new Intent(this, Make1Activity.class);
                intent861.putExtra("background861", 861);
                startActivity(intent861);
            } else if (make2 == 2) {
                Intent intent862 = new Intent(this, Make2Activity.class);
                intent862.putExtra("background862", 862);
                startActivity(intent862);
            } else if (make3 == 3) {
                Intent intent863 = new Intent(this, Make3Activity.class);
                intent863.putExtra("background863", 863);
                startActivity(intent863);
            } else if (make4 == 4) {
                Intent intent864 = new Intent(this, Make4Activity.class);
                intent864.putExtra("background864", 864);
                startActivity(intent864);
            } else if (make5 == 5) {
                Intent intent865 = new Intent(this, Make5Activity.class);
                intent865.putExtra("background865", 865);
                startActivity(intent865);
            } else if (make6 == 6) {
                Intent intent866 = new Intent(this, Make6Activity.class);
                intent866.putExtra("background866", 866);
                startActivity(intent866);
            } else if (make7 == 7) {
                Intent intent867 = new Intent(this, Make7Activity.class);
                intent867.putExtra("background867", 867);
                startActivity(intent867);
            } else if (make8 == 8) {
                Intent intent868 = new Intent(this, Make8Activity.class);
                intent868.putExtra("background868", 868);
                startActivity(intent868);
            } else if (make9 == 9) {
                Intent intent869 = new Intent(this, Make9Activity.class);
                intent869.putExtra("background869", 869);
                startActivity(intent869);
            } else if (make10 == 10) {
                Intent intent870 = new Intent(this, Make10Activity.class);
                intent870.putExtra("background870", 870);
                startActivity(intent870);
            }
        }
    }

    public void ibr(View v){
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
                Intent intent791 = new Intent(this, Make1Activity.class);
                intent791.putExtra("background791", 791);
                startActivity(intent791);
            } else if (make2 == 2) {
                Intent intent792 = new Intent(this, Make2Activity.class);
                intent792.putExtra("background792", 792);
                startActivity(intent792);
            } else if (make3 == 3) {
                Intent intent793 = new Intent(this, Make3Activity.class);
                intent793.putExtra("background793", 793);
                startActivity(intent793);
            } else if (make4 == 4) {
                Intent intent794 = new Intent(this, Make4Activity.class);
                intent794.putExtra("background794", 794);
                startActivity(intent794);
            } else if (make5 == 5) {
                Intent intent795 = new Intent(this, Make5Activity.class);
                intent795.putExtra("background795", 795);
                startActivity(intent795);
            } else if (make6 == 6) {
                Intent intent796 = new Intent(this, Make6Activity.class);
                intent796.putExtra("background796", 796);
                startActivity(intent796);
            } else if (make7 == 7) {
                Intent intent797 = new Intent(this, Make7Activity.class);
                intent797.putExtra("background797", 797);
                startActivity(intent797);
            } else if (make8 == 8) {
                Intent intent798 = new Intent(this, Make8Activity.class);
                intent798.putExtra("background798", 798);
                startActivity(intent798);
            } else if (make9 == 9) {
                Intent intent799 = new Intent(this, Make9Activity.class);
                intent799.putExtra("background799", 799);
                startActivity(intent799);
            } else if (make10 == 10) {
                Intent intent800 = new Intent(this, Make10Activity.class);
                intent800.putExtra("background800", 800);
                startActivity(intent800);
            }
        } else if(page == 2){
            if (make1 == 1) {
                Intent intent831 = new Intent(this, Make1Activity.class);
                intent831.putExtra("background831", 831);
                startActivity(intent831);
            } else if (make2 == 2) {
                Intent intent832 = new Intent(this, Make2Activity.class);
                intent832.putExtra("background832", 832);
                startActivity(intent832);
            } else if (make3 == 3) {
                Intent intent833 = new Intent(this, Make3Activity.class);
                intent833.putExtra("background833", 833);
                startActivity(intent833);
            } else if (make4 == 4) {
                Intent intent834 = new Intent(this, Make4Activity.class);
                intent834.putExtra("background834", 834);
                startActivity(intent834);
            } else if (make5 == 5) {
                Intent intent835 = new Intent(this, Make5Activity.class);
                intent835.putExtra("background835", 835);
                startActivity(intent835);
            } else if (make6 == 6) {
                Intent intent836 = new Intent(this, Make6Activity.class);
                intent836.putExtra("background836", 836);
                startActivity(intent836);
            } else if (make7 == 7) {
                Intent intent837 = new Intent(this, Make7Activity.class);
                intent837.putExtra("background837", 837);
                startActivity(intent837);
            } else if (make8 == 8) {
                Intent intent838 = new Intent(this, Make8Activity.class);
                intent838.putExtra("background838", 838);
                startActivity(intent838);
            } else if (make9 == 9) {
                Intent intent839 = new Intent(this, Make9Activity.class);
                intent839.putExtra("background839", 839);
                startActivity(intent839);
            } else if (make10 == 10) {
                Intent intent840 = new Intent(this, Make10Activity.class);
                intent840.putExtra("background840", 840);
                startActivity(intent840);
            }
        } else if(page == 3){
            if (make1 == 1) {
                Intent intent871 = new Intent(this, Make1Activity.class);
                intent871.putExtra("background871", 871);
                startActivity(intent871);
            } else if (make2 == 2) {
                Intent intent872 = new Intent(this, Make2Activity.class);
                intent872.putExtra("background872", 872);
                startActivity(intent872);
            } else if (make3 == 3) {
                Intent intent873 = new Intent(this, Make3Activity.class);
                intent873.putExtra("background873", 873);
                startActivity(intent873);
            } else if (make4 == 4) {
                Intent intent874 = new Intent(this, Make4Activity.class);
                intent874.putExtra("background874", 874);
                startActivity(intent874);
            } else if (make5 == 5) {
                Intent intent875 = new Intent(this, Make5Activity.class);
                intent875.putExtra("background875", 875);
                startActivity(intent875);
            } else if (make6 == 6) {
                Intent intent876 = new Intent(this, Make6Activity.class);
                intent876.putExtra("background876", 876);
                startActivity(intent876);
            } else if (make7 == 7) {
                Intent intent877 = new Intent(this, Make7Activity.class);
                intent877.putExtra("background877", 877);
                startActivity(intent877);
            } else if (make8 == 8) {
                Intent intent878 = new Intent(this, Make8Activity.class);
                intent878.putExtra("background878", 878);
                startActivity(intent878);
            } else if (make9 == 9) {
                Intent intent879 = new Intent(this, Make9Activity.class);
                intent879.putExtra("background879", 879);
                startActivity(intent879);
            } else if (make10 == 10) {
                Intent intent880 = new Intent(this, Make10Activity.class);
                intent880.putExtra("background880", 880);
                startActivity(intent880);
            }
        }
    }
}
