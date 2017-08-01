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
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, REQUEST_GALLERY);

            }});
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
                imageView.setImageBitmap(img);
            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }

    //android
    //device monitor

}