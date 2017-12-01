package com.example.lit.original;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class SaveActivity extends AppCompatActivity {
    ImageView imageViewS;
    EditText editTextS;
    TextView textViewS;
    FrameLayout frameLayoutS;
    RelativeLayout relativeLayoutS;
    Button buttonS;

    SharedPreferences preferencesMemo;
    SharedPreferences preferencesRotate;
    SharedPreferences preferencesPhoto;
    SharedPreferences preferencesBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        imageViewS = (ImageView)findViewById(R.id.imageViewS);
        editTextS = (EditText)findViewById(R.id.editTextS);
        textViewS = (TextView)findViewById(R.id.textViewS);
        frameLayoutS = (FrameLayout)findViewById(R.id.frameLayoutS);
        relativeLayoutS = (RelativeLayout)findViewById(R.id.relativeLayoutS);
        buttonS = (Button)findViewById(R.id.buttonS);

        preferencesMemo = getSharedPreferences("pref_memo", MODE_PRIVATE);
        preferencesRotate = getSharedPreferences("pref_rotate", MODE_PRIVATE);
        preferencesPhoto = getSharedPreferences("pref_img", MODE_PRIVATE);
        preferencesBackground = getSharedPreferences("pref_bg", Context.MODE_PRIVATE);

        String sBG = preferencesBackground.getString("bg", "");
        byte[] bBG = Base64.decode(sBG, Base64.DEFAULT);
        Bitmap bmpBG = BitmapFactory.decodeByteArray(bBG, 0, bBG.length).copy(Bitmap.Config.ARGB_8888, true);
        Drawable drawBG = new BitmapDrawable(bmpBG);

        String s = preferencesPhoto.getString("img","");
        byte[] b = Base64.decode(s, Base64.DEFAULT);
        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length).copy(Bitmap.Config.ARGB_8888, true);

        relativeLayoutS.setBackgroundDrawable(drawBG);
        imageViewS.setImageBitmap(bmp);
        imageViewS.setRotation(preferencesRotate.getFloat("Rotation", 0));
        editTextS.setText(preferencesMemo.getString("memo",""));

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String date = year + "年" + (month+1) + "月" + day + "日　" ;
        textViewS.setTextSize(25);
        textViewS.setText(date);

        Intent intentSS = getIntent();
        int ss = intentSS.getIntExtra("SS", 0);
        if(ss == 0){
            Toast.makeText(this, "保存しました", Toast.LENGTH_LONG).show();
        } else if(ss == 1){
            buttonS.setVisibility(View.GONE);
        }
    }

    public void back(View v){
        Intent intentStart = new Intent(this, StartActivity.class);
        startActivity(intentStart);
    }
}
