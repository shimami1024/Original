package com.nldsk.mjknp.daily;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

public class SeeActivity extends AppCompatActivity {

    TextView textViewS;
    FrameLayout frameLayoutS;
    RelativeLayout relativeLayoutS;

    FrameLayout dateLayout;
    LinearLayout taskLayout;

    SharedPreferences preferencesFileNumber;
    int fileNumber;

    SharedPreferences preferencesBackground;

    SharedPreferences preferencesFile;

    int pageNumber;
    Button backButton;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see);

        textViewS = (TextView)findViewById(R.id.textViewS);
        frameLayoutS = (FrameLayout)findViewById(R.id.frameLayoutS);
        relativeLayoutS = (RelativeLayout)findViewById(R.id.relativeLayoutS);

        preferencesFileNumber = getSharedPreferences("preferences_file_number", MODE_PRIVATE);
        fileNumber = preferencesFileNumber.getInt("fN", 0);
        Log.d("number", String.valueOf(fileNumber));

        dateLayout = (FrameLayout)findViewById(R.id.dateLayout);
        taskLayout = (LinearLayout)findViewById(R.id.taskLayout);

        preferencesBackground = getSharedPreferences("pref_bg", MODE_PRIVATE);

        preferencesFile = getSharedPreferences("preferences_file" + String.valueOf(fileNumber), MODE_PRIVATE);
        String sFile = preferencesFile.getString("file" + String.valueOf(fileNumber),"");
        byte[] bFile = Base64.decode(sFile, Base64.DEFAULT);
        Bitmap bmpIV = BitmapFactory.decodeByteArray(bFile, 0, bFile.length).copy(Bitmap.Config.ARGB_8888, true);
        BitmapDrawable bitmapFile = new BitmapDrawable(getResources(), bmpIV);
        frameLayoutS.setBackgroundDrawable(bitmapFile);

        pageNumber = fileNumber;
        backButton = (Button)findViewById(R.id.backButton);
        nextButton = (Button)findViewById(R.id.nextButton);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String date = year + "/" + (month+1) + "/" + day ;
        textViewS.setTextSize(25);
        textViewS.setText(date);

        nextButton.setVisibility(View.INVISIBLE);
    }

    public void back(View v){

        pageNumber--;

        preferencesFile = getSharedPreferences("preferences_file" + String.valueOf(pageNumber), MODE_PRIVATE);
        String sFile = preferencesFile.getString("file" + String.valueOf(pageNumber),"");

        if (sFile != "") {
            byte[] bFile = Base64.decode(sFile, Base64.DEFAULT);
            Bitmap bmpIV = BitmapFactory.decodeByteArray(bFile, 0, bFile.length).copy(Bitmap.Config.ARGB_8888, true);
            BitmapDrawable bitmapFile = new BitmapDrawable(getResources(), bmpIV);
            frameLayoutS.setBackgroundDrawable(bitmapFile);

            if (pageNumber == fileNumber){
                backButton.setVisibility(View.VISIBLE);
                nextButton.setVisibility(View.INVISIBLE);
            } else {
                nextButton.setVisibility(View.VISIBLE);
                backButton.setVisibility(View.VISIBLE);
            }
        }
    }

    public void next(View v){

        pageNumber++;
        preferencesFile = getSharedPreferences("preferences_file" + String.valueOf(pageNumber), MODE_PRIVATE);
        String sFile = preferencesFile.getString("file" + String.valueOf(pageNumber),"");

        if (sFile != "") {
            byte[] bFile = Base64.decode(sFile, Base64.DEFAULT);
            Bitmap bmpIV = BitmapFactory.decodeByteArray(bFile, 0, bFile.length).copy(Bitmap.Config.ARGB_8888, true);
            BitmapDrawable bitmapFile = new BitmapDrawable(getResources(), bmpIV);
            frameLayoutS.setBackgroundDrawable(bitmapFile);

            if (pageNumber == fileNumber) {
                backButton.setVisibility(View.VISIBLE);
                nextButton.setVisibility(View.INVISIBLE);
            } else {
                nextButton.setVisibility(View.VISIBLE);
                backButton.setVisibility(View.VISIBLE);
            }
        }
    }

    public void manage(View v){

    }

    public void trust(View v){
        preferencesFile = getSharedPreferences("preferences_file" + String.valueOf(pageNumber), MODE_PRIVATE);
        SharedPreferences.Editor prefRemove = preferencesFile.edit();
        prefRemove.remove("file" + String.valueOf(pageNumber));
        prefRemove.apply();

        pageNumber--;

        preferencesFile = getSharedPreferences("preferences_file" + String.valueOf(pageNumber), MODE_PRIVATE);
        String sFile = preferencesFile.getString("file" + String.valueOf(pageNumber),"");

        if (sFile != "") {
            byte[] bFile = Base64.decode(sFile, Base64.DEFAULT);
            Bitmap bmpIV = BitmapFactory.decodeByteArray(bFile, 0, bFile.length).copy(Bitmap.Config.ARGB_8888, true);
            BitmapDrawable bitmapFile = new BitmapDrawable(getResources(), bmpIV);
            frameLayoutS.setBackgroundDrawable(bitmapFile);

            if (pageNumber == fileNumber) {
                backButton.setVisibility(View.VISIBLE);
                nextButton.setVisibility(View.INVISIBLE);
            } else {
                nextButton.setVisibility(View.VISIBLE);
                backButton.setVisibility(View.VISIBLE);
            }
        }
    }
}
