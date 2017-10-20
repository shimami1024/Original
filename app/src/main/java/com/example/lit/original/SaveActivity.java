package com.example.lit.original;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class SaveActivity extends AppCompatActivity {
    ImageView imageView2;
    EditText editText2;
    TextView textView;
    FrameLayout frameLayout;
    Button button;

    SharedPreferences preferencesMemo;
    SharedPreferences preferencesRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        imageView2 = (ImageView)findViewById(R.id.imageViewS);
        editText2 = (EditText)findViewById(R.id.editTextS);
        textView = (TextView)findViewById(R.id.textView);
        //frameLayout = (FrameLayout)findViewById(R.id.frameLayout);
        //button = (Button)findViewById(R.id.buttonB);

        preferencesMemo = getSharedPreferences("pref_memo", MODE_PRIVATE);
        preferencesRotate = getSharedPreferences("pref_rotate", MODE_PRIVATE);

        editText2.setText(preferencesMemo.getString("memo",""));
        imageView2.setRotation(preferencesRotate.getFloat("Rotation", 0));

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        //int hour = cal.get(Calendar.HOUR_OF_DAY);
        //int minute = cal.get(Calendar.MINUTE);
        //int second = cal.get(Calendar.SECOND);
        String date = year + "年" + (month+1) + "月" + day + "日　" ;
        textView.setText(date);

        Toast.makeText(this, "保存しました", Toast.LENGTH_SHORT).show();
    }
}
