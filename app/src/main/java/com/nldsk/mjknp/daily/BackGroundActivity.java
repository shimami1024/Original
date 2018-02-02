package com.nldsk.mjknp.daily;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BackGroundActivity extends AppCompatActivity {
    int backgrounds[] ={
            R.drawable.background1,  R.drawable.background2,  R.drawable.background3,  R.drawable.background4,  R.drawable.background5,
            R.drawable.background6,  R.drawable.background7,  R.drawable.background8,  R.drawable.background9,  R.drawable.background10,
            R.drawable.background11, R.drawable.background12, R.drawable.background13, R.drawable.background14, R.drawable.background15,
            R.drawable.background16, R.drawable.background17, R.drawable.background18, R.drawable.background19, R.drawable.background20,
            R.drawable.background21, R.drawable.background22, R.drawable.background23, R.drawable.background24, R.drawable.background25,
            R.drawable.background26, R.drawable.background27, R.drawable.background28, R.drawable.background29, R.drawable.background30,
            R.drawable.background31, R.drawable.background32, R.drawable.background33, R.drawable.background34, R.drawable.background35,
            R.drawable.background36, R.drawable.background37, R.drawable.background38, R.drawable.background39, R.drawable.background40,
    };

    int page;

    ImageButton topLeft;
    ImageButton topRight;
    ImageButton bottomLeft;
    ImageButton bottomRight;
    Button BACK;
    Button NEXT;

    Intent intentFromCreate;
    int makeNumber;
    boolean imageFlag;

    Intent intentBackMake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground);

        page = 1;

        topLeft = (ImageButton)findViewById(R.id.topLeftImageButton);
        topRight = (ImageButton)findViewById(R.id.topRightImageButton);
        bottomLeft = (ImageButton)findViewById(R.id.bottomLeftImageButton);
        bottomRight = (ImageButton)findViewById(R.id.bottomRightImageButton);

        topLeft.setBackgroundResource(backgrounds[(page*4)-4]);
        topRight.setBackgroundResource(backgrounds[(page*4)-3]);
        bottomLeft.setBackgroundResource(backgrounds[(page*4)-2]);
        bottomRight.setBackgroundResource(backgrounds[(page*4)-1]);

        BACK = (Button)findViewById(R.id.backButton);
        NEXT = (Button)findViewById(R.id.nextButton);


        intentFromCreate = getIntent();
        makeNumber = intentFromCreate.getIntExtra("M", 0);
        imageFlag = intentFromCreate.getBooleanExtra("iF", false);

        intentBackMake = new Intent(this, CreateActivity.class);
        intentBackMake.putExtra("imageFlag", imageFlag);
        intentBackMake.putExtra("backgroundFlag", true);
    }

    public void back(View v){
        page--;

        if (page < 1){
            BACK.setVisibility(View.INVISIBLE);
        } else if (1 <= page & page <= 10){
            topLeft.setBackgroundResource(backgrounds[(page*4)-4]);
            topRight.setBackgroundResource(backgrounds[(page*4)-3]);
            bottomLeft.setBackgroundResource(backgrounds[(page*4)-2]);
            bottomRight.setBackgroundResource(backgrounds[(page*4)-1]);

            if (page == 1){
                BACK.setBackgroundResource(R.drawable.arrow007);
            } else if (1 < page & page < 10){
                BACK.setBackgroundResource(R.drawable.arrow002);
                NEXT.setBackgroundResource(R.drawable.arrow001);
            } else if (page == 10){
                NEXT.setBackgroundResource(R.drawable.arrow006);
            }
        } else if (page > 10){
            NEXT.setVisibility(View.INVISIBLE);
        }
    }

    public void next(View v){
        page++;

        if (page < 1){
            BACK.setVisibility(View.INVISIBLE);
        } else if (1 <= page & page <= 10){
            topLeft.setBackgroundResource(backgrounds[(page*4)-4]);
            topRight.setBackgroundResource(backgrounds[(page*4)-3]);
            bottomLeft.setBackgroundResource(backgrounds[(page*4)-2]);
            bottomRight.setBackgroundResource(backgrounds[(page*4)-1]);

            if (page == 1){
                BACK.setBackgroundResource(R.drawable.arrow007);
            } else if (1 < page & page < 10){
                BACK.setBackgroundResource(R.drawable.arrow002);
                NEXT.setBackgroundResource(R.drawable.arrow001);
            } else if (page == 10){
                NEXT.setBackgroundResource(R.drawable.arrow006);
            }
        } else if (page > 10){
            NEXT.setVisibility(View.INVISIBLE);
        }
    }

    public void tl(View v){
        intentBackMake.putExtra("BG", 1 + 4*(page - 1));
        startActivity(intentBackMake);
    }

    public void tr(View v){
        intentBackMake.putExtra("BG", 2 + 4*(page - 1));
        startActivity(intentBackMake);
    }

    public void bl(View v){
        intentBackMake.putExtra("BG", 3 + 4*(page - 1));
        startActivity(intentBackMake);
    }

    public void br(View v){
        intentBackMake.putExtra("BG", 4 + 4*(page - 1));
        startActivity(intentBackMake);
    }
}
