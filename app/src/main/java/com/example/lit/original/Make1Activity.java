package com.example.lit.original;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.InputStream;


public class Make1Activity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 0;

    ImageView imageView;
    EditText editText;

    SharedPreferences preferences;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make1);

        imageView = (ImageView)findViewById(R.id.imageView);
        editText = (EditText)findViewById(R.id.editText);

        preferences = getSharedPreferences("pref_memo", MODE_PRIVATE);

        editText.setText(preferences.getString("memo",""));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");   //←jpegに限定する場合は, "image/jpeg"と指定.
                intent.setAction(Intent.ACTION_GET_CONTENT);//
                startActivityForResult(intent, 0);

            }});

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.RelativeLayout0);

        Intent intent1 = getIntent();
        int number1 = intent1.getIntExtra("background1", 0);
        if(number1 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number1 == 1) {
            layout.setBackgroundResource(R.drawable.backgrounda1);
        }

        Intent intent2 = getIntent();
        int number2 = intent2.getIntExtra("background2", 0);
        if(number2 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number2 == 2) {
            layout.setBackgroundResource(R.drawable.backgrounda2);
        }

        Intent intent3 = getIntent();
        int number3 = intent3.getIntExtra("background3", 0);
        if(number3 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number3 == 3) {
            layout.setBackgroundResource(R.drawable.backgrounda3);
        }

        Intent intent4 = getIntent();
        int number4 = intent4.getIntExtra("background4", 0);
        if(number4 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number4 == 4) {
            layout.setBackgroundResource(R.drawable.backgrounda4);
        }

        Intent intent5 = getIntent();
        int number5 = intent5.getIntExtra("background5", 0);
        if(number5 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number5 == 5) {
            layout.setBackgroundResource(R.drawable.backgrounda5);
        }

        Intent intent6 = getIntent();
        int number6 = intent6.getIntExtra("background6", 0);
        if(number6 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number6 == 6) {
            layout.setBackgroundResource(R.drawable.backgrounda6);
        }

        Intent intent7 = getIntent();
        int number7 = intent7.getIntExtra("background7", 0);
        if(number7 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number7 == 7) {
            layout.setBackgroundResource(R.drawable.backgrounda7);
        }

        Intent intent8 = getIntent();
        int number8 = intent8.getIntExtra("background8", 0);
        if(number8 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number8 == 8) {
            layout.setBackgroundResource(R.drawable.backgrounda8);
        }

        Intent intent9 = getIntent();
        int number9 = intent9.getIntExtra("background9", 0);
        if(number9 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number9 == 9) {
            layout.setBackgroundResource(R.drawable.backgrounda9);
        }

        Intent intent10 = getIntent();
        int number10 = intent10.getIntExtra("background10", 0);
        if(number10 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number10 == 10) {
            layout.setBackgroundResource(R.drawable.backgrounda10);
        }

        Intent intent11 = getIntent();
        int number11 = intent11.getIntExtra("background11", 0);
        if(number11 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number11 == 11) {
            layout.setBackgroundResource(R.drawable.backgrounda11);
        }

        Intent intent12 = getIntent();
        int number12 = intent12.getIntExtra("background12", 0);
        if(number12 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number12 == 12) {
            layout.setBackgroundResource(R.drawable.backgrounda12);
        }

        Intent intent13 = getIntent();
        int number13 = intent13.getIntExtra("background13", 0);
        if(number13 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number13 == 13) {
            layout.setBackgroundResource(R.drawable.backgrounda13);
        }

        Intent intent14 = getIntent();
        int number14 = intent14.getIntExtra("background14", 0);
        if(number14 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number14 == 14) {
            layout.setBackgroundResource(R.drawable.backgrounda14);
        }

        Intent intent15 = getIntent();
        int number15 = intent15.getIntExtra("background15", 0);
        if(number15 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number15 == 15) {
            layout.setBackgroundResource(R.drawable.backgrounda15);
        }

        Intent intent16 = getIntent();
        int number16 = intent16.getIntExtra("background16", 0);
        if(number16 == 0){
            Log.d("あいうえお", "あいうえお");
        } else if (number16 == 16) {
            layout.setBackgroundResource(R.drawable.backgrounda16);
        }
    }

    public void rotate(View v){
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), REQUEST_GALLERY);
        Log.d("か","き");
        int imageWidth = bitmap1.getWidth();
        int imageHeight = bitmap1.getHeight();
        Log.d("かか","きき");

        Matrix matrix = new Matrix();
        matrix.setRotate(90, imageWidth/2 , imageHeight/2);
        Log.d("かかか","ききき");
        Bitmap bitmap2 = Bitmap.createBitmap(bitmap1, 0, 0, imageWidth, imageHeight, matrix, true);
        imageView.setImageBitmap(bitmap2);
    }

    public void background1(View v){
        Intent intent = new Intent(this, BackGroundActivity.class);
        startActivity(intent);
    }

    public void save(View v){
        String memoText = editText.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("memo",memoText);
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
                Log.d("あ", "い");
                // 選択した画像を表示
                if(requestCode == 0){
                    imageView.setImageBitmap(img);
                }

            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }


}


