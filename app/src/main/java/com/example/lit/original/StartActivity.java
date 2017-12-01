package com.example.lit.original;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class StartActivity extends AppCompatActivity {
    LinearLayout rectangle;
    ImageView imageViewTL;
    ImageView imageViewTR;
    ImageView imageViewBL;
    ImageView imageViewBR;
    FrameLayout frame;
    RelativeLayout relative;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //rectangle = (LinearLayout)findViewById(R.id.rectangle);
        //imageViewTL = (ImageView)findViewById(R.id.imageView4);
        //imageViewTR = (ImageView)findViewById(R.id.imageView5);
        //imageViewBL = (ImageView)findViewById(R.id.imageView6);
        //imageViewBR = (ImageView)findViewById(R.id.imageView7);
        frame = (FrameLayout)findViewById(R.id.frame);
        relative = (RelativeLayout)findViewById(R.id.relative);

        imageViewTL = new ImageView(this);
        imageViewTR = new ImageView(this);
        imageViewBL = new ImageView(this);
        imageViewBR = new ImageView(this);

        //AnimatorSet rotate = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.rotate);
        //rotate.setTarget(imageView);
        //rotate.start();

        //Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.backgroundh13);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.zz);
        Bitmap circleBitmap1 = Bitmap.createBitmap(bitmap1.getWidth(), bitmap1.getHeight(), Bitmap.Config.ARGB_8888);

        //Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.backgroundh14);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.zzz);
        Bitmap circleBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);

        //Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.backgroundh15);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.zzzz);
        Bitmap circleBitmap3 = Bitmap.createBitmap(bitmap3.getWidth(), bitmap3.getHeight(), Bitmap.Config.ARGB_8888);

        //Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.backgroundh16);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.zzzzz);
        Bitmap circleBitmap4 = Bitmap.createBitmap(bitmap4.getWidth(), bitmap4.getHeight(), Bitmap.Config.ARGB_8888);


        //background13のbitmapを作成（.decodeResource:resource型の変数をbitmap型の変数に変換する）
        //config:設定ファイル（動作するプログラムやオペレーションシステムなどを記述したファイル）
        //ARGB_8888:ARGBはカラーコードのやつ（A:alpha（「alpha」じゃなくてalpha係数とかalpha値という言い方をする、透明度を表す）　　　　　　　　　
        // 　　　　　　　　　　　　　　　　　 R:red, G:green, B:blue ）
        //で、それぞれのアルファベットで0～255の数字で設定できるようになっている（0～255→つまり256個の数字）
        //8888は、4444とか1234とかにすることもできて、1あたり32段階
        //（つまり　8888→256段階、256段階、256段階、256段階　　4444→128段階、128段階、128段階、128段階   みたいな感じで、
        //  数が増えるごとに細かくなっていく（←キレイにできるってことね）、ただその代わりメモリの容量が大きくなる
        //　8888が最高段階（これ以上は無理）であとは4444、実はこの2つしかない（笑））

        BitmapShader shader1;
        shader1 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        BitmapShader shader2;
        shader2 = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        BitmapShader shader3;
        shader3 = new BitmapShader(bitmap3, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        BitmapShader shader4;
        shader4 = new BitmapShader(bitmap4, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        //shader:陰影やグラデーションをつけるコンピュータープログラムのこと
        //BitmapShaderという変数はそのbitmap版というだけ
        //BitmapShader(bitmap型の変数, Shader.TileMode（X軸の加工）, Shader.TileMode（Y軸の加工）)
        //※この時点でbitmapの画像が丸くなってるわけではない
        //tileModeはその名とおり「タイルのモード」、
        //clampは…　蝶番とか端喰（読み方:はしばみ）とか、そういう意味があるけど、基本日常生活で使う単語ではありません（笑）
        //　　　　　 まあなんというか端と端をつなぐみたいな意味の言葉をあらわしていて、
        //　　　　　 ここではエッジカラー（edge color、端っことか枠の色）をbitmapの画像の色に合わせる、
        //　　　　　 つまり枠がない感じに見せるための加工です

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(shader1);
        //paint:描画する際に使われるペンのようなものの設定ができる変数（canvasで使う）
        //.setAntiAlias:文字やラインを滑らかに見せるための処理を有効（true）にするか無効（false）にするかの設定ができる

        //int circleCenter = bitmap.getWidth() / 2;
        //canvas.drawCircle(circleCenter, circleCenter, circleCenter, paint);
        //.drawCircle:特定の点（この場合はbitmapの中心）を中心に、元の画像の半分のサイズの半径で円を描く処理
        //.drawCircle(中心の座標（X軸）, 中心の座標（Y軸）, 半径, paint)

        float density = getResources().getDisplayMetrics().density;

        RotateAnimation rotation = new RotateAnimation(0, 360, 1024, 0);
        rotation.setRepeatCount(10);
        rotation.setDuration(10000);

        RectF rectf = new RectF(0, 0, 1000, 1000);
        Canvas canvas = new Canvas(circleBitmap1);
        canvas.drawArc(rectf, 50, 90, true, paint);

        //LinearLayout.LayoutParams IV = new LinearLayout.LayoutParams(1000, 1000);
        LinearLayout.LayoutParams IV = new LinearLayout.LayoutParams(100, 100);
        imageViewTL.setLayoutParams(IV);
        imageViewTL.setImageBitmap(circleBitmap1);
        //imageViewTL.setX(400);
        //imageViewTL.setY(-320);
        //imageViewTL.startAnimation(rotation);
        relative.addView(imageViewTL);

        paint.setShader(shader2);
        //rectf.offset(-20, -20);
        canvas.drawArc(rectf, 140, 90, true, paint);
        imageViewTR.setLayoutParams(IV);
        imageViewTR.setImageBitmap(circleBitmap2);
        relative.addView(imageViewTR);
        //imageViewTR.startAnimation(rotation);

        paint.setShader(shader3);
        //rectf.offset(20, -20);
        canvas.drawArc(rectf, 230, 90, true, paint);
        imageViewBL.setLayoutParams(IV);
        imageViewBL.setImageBitmap(circleBitmap3);
        relative.addView(imageViewBL);
        //imageViewBL.startAnimation(rotation);

        paint.setShader(shader4);
        //rectf.offset(20, 20);
        canvas.drawArc(rectf, 320, 90, true, paint);
        imageViewBR.setLayoutParams(IV);
        imageViewBR.setImageBitmap(circleBitmap4);
        relative.addView(imageViewBR);
        //imageViewBR.startAnimation(rotation);

        //frame.setX(550);
        //frame.setY(-340);
        //RotateAnimation rotate = new RotateAnimation(0, 360, frame.getWidth()/2, frame.getHeight()/2);
        // frameの中心を軸に、0度から360度にかけて回転
        //rotate.setDuration(4000);
        //frame.startAnimation(rotate);

    }

    public void make(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void see(View v){
        Intent intentS = new Intent(this, SaveActivity.class);
        intentS.putExtra("SS", 1);
        startActivity(intentS);
    }

    //スタート画面を素敵に！！(Animation)

}
