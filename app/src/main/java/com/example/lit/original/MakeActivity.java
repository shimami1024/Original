package com.example.lit.original;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;


public class MakeActivity extends AppCompatActivity {
    //private static final int REQUEST_GALLERY = 0;
    boolean flag;

    int layoutNumber;

    //imageViewの画像になる変数の宣言
    Bitmap img;
    //Drawable bitmapDrawable;
    BitmapDrawable bitmapDrawable;

    ImageView imageView;
    //ImageView imageView1;
    //ImageView imageView2;
    //ImageView imageView3;

    boolean imageFlag;
    boolean imageViewRotateFlag;

    EditText editText;
    //EditText editText1;
    //EditText editText2;
    //EditText editText3;

    boolean editTextRotateFlag;

    FrameLayout frameLayout;

    RelativeLayout relativeLayout;

    //imageViewとeditTextで角度設定か背景設定かを選ぶための変数の宣言
    LinearLayout choiceBackgroundOrAngleLinearLayout;
    Button choiceBackgroundButton;
    Button choiceAngleButton;

    //imageViewの背景設定のための変数の宣言
    LinearLayout imageViewBackgroundLinearLayout;
    ImageButton imageViewBackgroundImageButton1;
    ImageButton imageViewBackgroundImageButton2;
    ImageButton imageViewBackgroundImageButton3;
    ImageButton imageViewBackgroundImageButton4;

    //imageViewのframe
    boolean frameFlag;
    ImageView frameImageView;

    //editTextの背景設定のための変数の宣言
    LinearLayout editTextBackgroundLinearLayout;
    boolean eTbGFlag;
    ImageButton editTextBackgroundImageButton1;
    ImageButton editTextBackgroundImageButton2;
    ImageButton editTextBackgroundImageButton3;
    ImageButton editTextBackgroundImageButton4;

    //角度設定のための変数の宣言
    LinearLayout angleLinearLayout;
    EditText rotationEditText;
    Button directionRightButton;
    Button directionLeftButton;

    //入力された角度を取得するための変数の宣言
    SpannableStringBuilder ssb;
    String Degree;
    int angle;

    //保存するための変数の宣言
    SharedPreferences preferencesBackground;
    SharedPreferences preferencesPhoto;
    SharedPreferences preferencesImageViewRotation;
    SharedPreferences preferencesMemo;

    LinearLayout tapesLinearLayout;
    int tapeNumber;
    int dragTapeDNumber;
    ImageButton tapeButton;
    boolean tapeFlag = false;

    ImageView dragTapeView1;
    //dragTapeView1の保存のための変数の宣言
    SharedPreferences.Editor editorDTV1DNumber;
    SharedPreferences prefDTV1Number;
    SharedPreferences prefDragTapeView1x;
    SharedPreferences prefDragTapeView1y;
    SharedPreferences prefDragTapeView1rotation;

    ImageView dragTapeView2;
    //dragTapeView2の保存のための変数の宣言
    SharedPreferences.Editor editorDTV2DNumber;
    SharedPreferences prefDTV2Number;
    SharedPreferences prefDragTapeView2x;
    SharedPreferences prefDragTapeView2y;
    SharedPreferences prefDragTapeView2rotation;

    ImageView dragTapeView3;
    //dragTapeView3の保存のための変数の宣言
    SharedPreferences.Editor editorDTV3DNumber;
    SharedPreferences prefDTV3Number;
    SharedPreferences prefDragTapeView3x;
    SharedPreferences prefDragTapeView3y;
    SharedPreferences prefDragTapeView3rotation;

    ImageView dragTapeView4;
    //dragTapeView4の保存のための変数の宣言
    SharedPreferences.Editor editorDTV4DNumber;
    SharedPreferences prefDTV4Number;
    SharedPreferences prefDragTapeView4x;
    SharedPreferences prefDragTapeView4y;
    SharedPreferences prefDragTapeView4rotation;

    ImageView dragTapeView5;
    //dragTapeView5の保存のための変数の宣言
    SharedPreferences.Editor editorDTV5DNumber;
    SharedPreferences prefDTV5Number;
    SharedPreferences prefDragTapeView5x;
    SharedPreferences prefDragTapeView5y;
    SharedPreferences prefDragTapeView5rotation;

    LinearLayout ornamentsLinearLayout;
    LinearLayout choiceOrnamentLinearLayout;
    LinearLayout eachOrnamentsLinearLayout;
    LinearLayout pinLinearLayout;
    LinearLayout ribbonLinearLayout;
    LinearLayout buttonLinearLayout;
    LinearLayout the_othersLinearLayout;
    int ornamentNumber;
    int dragOrnamentDNumber;
    ImageButton ornamentButton;
    boolean ornamentFlag = false;

    ImageView dragOrnamentView1;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV1DNumber;
    SharedPreferences prefDOV1Number;
    SharedPreferences prefDragOrnamentView1x;
    SharedPreferences prefDragOrnamentView1y;
    SharedPreferences prefDragOrnamentView1rotation;

    ImageView dragOrnamentView2;
    //dragOrnamentView2の保存のための変数の宣言
    SharedPreferences.Editor editorDOV2DNumber;
    SharedPreferences prefDOV2Number;
    SharedPreferences prefDragOrnamentView2x;
    SharedPreferences prefDragOrnamentView2y;
    SharedPreferences prefDragOrnamentView2rotation;

    ImageView dragOrnamentView3;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV3DNumber;
    SharedPreferences prefDOV3Number;
    SharedPreferences prefDragOrnamentView3x;
    SharedPreferences prefDragOrnamentView3y;
    SharedPreferences prefDragOrnamentView3rotation;

    ImageView dragOrnamentView4;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV4DNumber;
    SharedPreferences prefDOV4Number;
    SharedPreferences prefDragOrnamentView4x;
    SharedPreferences prefDragOrnamentView4y;
    SharedPreferences prefDragOrnamentView4rotation;

    ImageView dragOrnamentView5;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV5DNumber;
    SharedPreferences prefDOV5Number;
    SharedPreferences prefDragOrnamentView5x;
    SharedPreferences prefDragOrnamentView5y;
    SharedPreferences prefDragOrnamentView5rotation;

    ImageView dragOrnamentView6;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV6DNumber;
    SharedPreferences prefDOV6Number;
    SharedPreferences prefDragOrnamentView6x;
    SharedPreferences prefDragOrnamentView6y;
    SharedPreferences prefDragOrnamentView6rotation;

    ImageView dragOrnamentView7;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV7DNumber;
    SharedPreferences prefDOV7Number;
    SharedPreferences prefDragOrnamentView7x;
    SharedPreferences prefDragOrnamentView7y;
    SharedPreferences prefDragOrnamentView7rotation;

    ImageView dragOrnamentView8;
    //dragOrnamentView1の保存のための変数の宣言
    SharedPreferences.Editor editorDOV8DNumber;
    SharedPreferences prefDOV8Number;
    SharedPreferences prefDragOrnamentView8x;
    SharedPreferences prefDragOrnamentView8y;
    SharedPreferences prefDragOrnamentView8rotation;

    LinearLayout dragViewCheckLinearLayout;
    LinearLayout dragViewChoiceLinearLayout;

    DragViewListener listener;

    boolean tapeChoiceFlag1;
    boolean tapeChoiceFlag2;
    boolean tapeChoiceFlag3;
    boolean tapeChoiceFlag4;
    boolean tapeChoiceFlag5;

    boolean ornamentChoiceFlag1;
    boolean ornamentChoiceFlag2;
    boolean ornamentChoiceFlag3;
    boolean ornamentChoiceFlag4;
    boolean ornamentChoiceFlag5;
    boolean ornamentChoiceFlag6;
    boolean ornamentChoiceFlag7;
    boolean ornamentChoiceFlag8;

    int backgroundNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_make1);

        Intent intent = getIntent();
        layoutNumber = intent.getIntExtra("L", 0);

        if (layoutNumber == 0){
            setContentView(R.layout.activity_make1);
        }else if (layoutNumber == 1){
            setContentView(R.layout.activity_make1);
        } else if (layoutNumber == 2){
            setContentView(R.layout.activity_make2);
        } else if (layoutNumber == 3){
            setContentView(R.layout.activity_make3);
        } else if (layoutNumber == 4){
            setContentView(R.layout.activity_make4);
        } else if (layoutNumber == 5){
            setContentView(R.layout.activity_make5);
        } else if (layoutNumber == 6){
            setContentView(R.layout.activity_make6);
        } else if (layoutNumber == 7){
            setContentView(R.layout.activity_make7);
        } else if (layoutNumber == 8){
            setContentView(R.layout.activity_make8);
        } else if (layoutNumber == 9){
            setContentView(R.layout.activity_make9);
        } else if (layoutNumber == 10){
            setContentView(R.layout.activity_make10);
        }

        imageView = (ImageView)findViewById(R.id.imageView);
        //imageView1 = (ImageView)findViewById(R.id.imageView1);
        //imageView2 = (ImageView)findViewById(R.id.imageView2);
        //imageView3 = (ImageView)findViewById(R.id.imageView3);

        editText = (EditText)findViewById(R.id.editText);
        //editText1 = (EditText)findViewById(R.id.editText1);
        //editText2 = (EditText)findViewById(R.id.editText2);
        //editText3 = (EditText)findViewById(R.id.editText3);

        relativeLayout = (RelativeLayout)findViewById(R.id.RelativeLayout);

        dragTapeView1 = (ImageView)findViewById(R.id.tapeView1);
        dragTapeView2 = (ImageView)findViewById(R.id.tapeView2);
        dragTapeView3 = (ImageView)findViewById(R.id.tapeView3);
        dragTapeView4 = (ImageView)findViewById(R.id.tapeView4);
        dragTapeView5 = (ImageView)findViewById(R.id.tapeView5);

        dragOrnamentView1 = (ImageView)findViewById(R.id.ornamentView1);
        dragOrnamentView2 = (ImageView)findViewById(R.id.ornamentView2);
        dragOrnamentView3 = (ImageView)findViewById(R.id.ornamentView3);
        dragOrnamentView4 = (ImageView)findViewById(R.id.ornamentView4);
        dragOrnamentView5 = (ImageView)findViewById(R.id.ornamentView5);
        dragOrnamentView6 = (ImageView)findViewById(R.id.ornamentView6);
        dragOrnamentView7 = (ImageView)findViewById(R.id.ornamentView7);
        dragOrnamentView8 = (ImageView)findViewById(R.id.ornamentView8);

        //倉庫名変えればいくつかeditつくっても多分大丈夫
        //それぞれのpreferenceの倉庫を設定、MODE_PRIVATEはこのアプリのみでデータをいじることができるようにする設定
          //
        preferencesBackground = getSharedPreferences("pref_bg", Context.MODE_PRIVATE);
        preferencesPhoto = getSharedPreferences("pref_img", Context.MODE_PRIVATE);
        preferencesImageViewRotation = getSharedPreferences("pref_rotate", MODE_PRIVATE);
        preferencesMemo = getSharedPreferences("pref_memo", MODE_PRIVATE);

          //dragTapeView
            //dragTape1
        prefDragTapeView1x = getSharedPreferences("pref_tape1_x", MODE_PRIVATE);
        prefDragTapeView1y = getSharedPreferences("pref_tape1_y", MODE_PRIVATE);
        prefDragTapeView1rotation = getSharedPreferences("pref_tape1_rotation", MODE_PRIVATE);
        prefDTV1Number = getSharedPreferences("pref_tape1Drawable", MODE_PRIVATE);
            //dragTape2
        prefDragTapeView2x = getSharedPreferences("pref_tape2_x", MODE_PRIVATE);
        prefDragTapeView2y = getSharedPreferences("pref_tape2_y", MODE_PRIVATE);
        prefDragTapeView2rotation = getSharedPreferences("pref_tape2_rotation", MODE_PRIVATE);
        prefDTV2Number = getSharedPreferences("pref_tape2Drawable", MODE_PRIVATE);
            //dragTape3
        prefDragTapeView3x = getSharedPreferences("pref_tape3_x", MODE_PRIVATE);
        prefDragTapeView3y = getSharedPreferences("pref_tape3_y", MODE_PRIVATE);
        prefDragTapeView3rotation = getSharedPreferences("pref_tape3_rotation", MODE_PRIVATE);
        prefDTV3Number = getSharedPreferences("pref_tape3Drawable", MODE_PRIVATE);
            //dragTape4
        prefDragTapeView4x = getSharedPreferences("pref_tape4_x", MODE_PRIVATE);
        prefDragTapeView4y = getSharedPreferences("pref_tape4_y", MODE_PRIVATE);
        prefDragTapeView4rotation = getSharedPreferences("pref_tape4_rotation", MODE_PRIVATE);
        prefDTV4Number = getSharedPreferences("pref_tape4Drawable", MODE_PRIVATE);
            //dragTape5
        prefDragTapeView5x = getSharedPreferences("pref_tape5_x", MODE_PRIVATE);
        prefDragTapeView5y = getSharedPreferences("pref_tape5_y", MODE_PRIVATE);
        prefDragTapeView5rotation = getSharedPreferences("pref_tape5_rotation", MODE_PRIVATE);
        prefDTV5Number = getSharedPreferences("pref_tape5Drawable", MODE_PRIVATE);

          //dragOrnamentView
            //dragOrnament1
        prefDragOrnamentView1x = getSharedPreferences("pref_ornament1_x", MODE_PRIVATE);
        prefDragOrnamentView1y = getSharedPreferences("pref_ornament1_y", MODE_PRIVATE);
        prefDragOrnamentView1rotation = getSharedPreferences("pref_ornament1_rotation", MODE_PRIVATE);
        prefDOV1Number = getSharedPreferences("pref_ornament1Drawable", MODE_PRIVATE);
            //dragOrnament2
        prefDragOrnamentView2x = getSharedPreferences("pref_ornament2_x", MODE_PRIVATE);
        prefDragOrnamentView2y = getSharedPreferences("pref_ornament2_y", MODE_PRIVATE);
        prefDragOrnamentView2rotation = getSharedPreferences("pref_ornament2_rotation", MODE_PRIVATE);
        prefDOV2Number = getSharedPreferences("pref_ornament2Drawable", MODE_PRIVATE);
            //dragOrnament3
        prefDragOrnamentView3x = getSharedPreferences("pref_ornament3_x", MODE_PRIVATE);
        prefDragOrnamentView3y = getSharedPreferences("pref_ornament3_y", MODE_PRIVATE);
        prefDragOrnamentView3rotation = getSharedPreferences("pref_ornament3_rotation", MODE_PRIVATE);
        prefDOV3Number = getSharedPreferences("pref_ornament3Drawable", MODE_PRIVATE);
            //dragOrnament4
        prefDragOrnamentView4x = getSharedPreferences("pref_ornament4_x", MODE_PRIVATE);
        prefDragOrnamentView4y = getSharedPreferences("pref_ornament4_y", MODE_PRIVATE);
        prefDragOrnamentView4rotation = getSharedPreferences("pref_ornament4_rotation", MODE_PRIVATE);
        prefDOV4Number = getSharedPreferences("pref_ornament4Drawable", MODE_PRIVATE);
            //dragOrnament5
        prefDragOrnamentView5x = getSharedPreferences("pref_ornament5_x", MODE_PRIVATE);
        prefDragOrnamentView5y = getSharedPreferences("pref_ornament5_y", MODE_PRIVATE);
        prefDragOrnamentView5rotation = getSharedPreferences("pref_ornament5_rotation", MODE_PRIVATE);
        prefDOV5Number = getSharedPreferences("pref_ornament5Drawable", MODE_PRIVATE);
            //dragOrnament6
        prefDragOrnamentView6x = getSharedPreferences("pref_ornament6_x", MODE_PRIVATE);
        prefDragOrnamentView6y = getSharedPreferences("pref_ornament6_y", MODE_PRIVATE);
        prefDragOrnamentView6rotation = getSharedPreferences("pref_ornament6_rotation", MODE_PRIVATE);
        prefDOV6Number = getSharedPreferences("pref_ornament6Drawable", MODE_PRIVATE);
            //dragOrnament7
        prefDragOrnamentView7x = getSharedPreferences("pref_ornament7_x", MODE_PRIVATE);
        prefDragOrnamentView7y = getSharedPreferences("pref_ornament7_y", MODE_PRIVATE);
        prefDragOrnamentView7rotation = getSharedPreferences("pref_ornament7_rotation", MODE_PRIVATE);
        prefDOV7Number = getSharedPreferences("pref_ornament7Drawable", MODE_PRIVATE);
            //dragOrnament8
        prefDragOrnamentView8x = getSharedPreferences("pref_ornament8_x", MODE_PRIVATE);
        prefDragOrnamentView8y = getSharedPreferences("pref_ornament8_y", MODE_PRIVATE);
        prefDragOrnamentView8rotation = getSharedPreferences("pref_ornament8_rotation", MODE_PRIVATE);
        prefDOV8Number = getSharedPreferences("pref_ornament8Drawable", MODE_PRIVATE);


        Intent intentMake = getIntent();
        boolean makeFlag = intentMake.getBooleanExtra("MAKE", false);
        imageFlag = intentMake.getBooleanExtra("imageFlag", false);

        if (makeFlag == true){
            //backgroundは灰色、imageViewは白に
            relativeLayout.setBackgroundColor(Color.parseColor("#565656"));
            imageView.setBackgroundColor(Color.parseColor("#ffffff"));

            //保存するための変数の初期化
            SharedPreferences.Editor prefBackgroundDefault = preferencesBackground.edit(); prefBackgroundDefault.clear(); prefBackgroundDefault.commit();
            SharedPreferences.Editor prefPhotoDefault = preferencesPhoto.edit(); prefPhotoDefault.clear(); prefPhotoDefault.commit();
            SharedPreferences.Editor prefImageViewRDefault = preferencesImageViewRotation.edit(); prefImageViewRDefault.clear(); prefImageViewRDefault.commit();
            SharedPreferences.Editor prefMemoDefault = preferencesMemo.edit(); prefMemoDefault.clear(); prefMemoDefault.commit();

            //dragTapeView1の保存のための変数の初期化
            SharedPreferences.Editor prefDTV1NDefault = prefDTV1Number.edit(); prefDTV1NDefault.clear(); prefDTV1NDefault.commit();
            SharedPreferences.Editor prefDTV1xDefault = prefDragTapeView1x.edit(); prefDTV1xDefault.clear(); prefDTV1xDefault.commit();
            SharedPreferences.Editor prefDTV1yDefault = prefDragTapeView1y.edit(); prefDTV1yDefault.clear(); prefDTV1yDefault.commit();
            SharedPreferences.Editor prefDTV1rDefault = prefDragTapeView1rotation.edit(); prefDTV1rDefault.clear(); prefDTV1rDefault.commit();

            //dragTapeView2の保存のための変数の初期化
            SharedPreferences.Editor prefDTV2NDefault = prefDTV2Number.edit(); prefDTV2NDefault.clear(); prefDTV2NDefault.commit();
            SharedPreferences.Editor prefDTV2xDefault = prefDragTapeView2x.edit(); prefDTV2NDefault.clear(); prefDTV2xDefault.commit();
            SharedPreferences.Editor prefDTV2yDefault = prefDragTapeView2y.edit(); prefDTV2yDefault.clear(); prefDTV2yDefault.commit();
            SharedPreferences.Editor prefDTV2rDefault = prefDragTapeView2rotation.edit(); prefDTV2rDefault.clear(); prefDTV2rDefault.commit();

            //dragTapeView3の保存のための変数の初期化
            SharedPreferences.Editor prefDTV3NDefault = prefDTV3Number.edit(); prefDTV3NDefault.clear(); prefDTV3NDefault.commit();
            SharedPreferences.Editor prefDTV3xDefault = prefDragTapeView3x.edit(); prefDTV3xDefault.clear(); prefDTV3xDefault.commit();
            SharedPreferences.Editor prefDTV3yDefault = prefDragTapeView3y.edit(); prefDTV3yDefault.clear(); prefDTV3yDefault.commit();
            SharedPreferences.Editor prefDTV3rDefault = prefDragTapeView3rotation.edit(); prefDTV3rDefault.clear(); prefDTV3rDefault.commit();

            //dragTapeView4の保存のための変数の初期化
            SharedPreferences.Editor prefDTV4NDefault = prefDTV4Number.edit(); prefDTV4NDefault.clear(); prefDTV4NDefault.commit();
            SharedPreferences.Editor prefDTV4xDefault = prefDragTapeView4x.edit(); prefDTV4xDefault.clear(); prefDTV4xDefault.commit();
            SharedPreferences.Editor prefDTV4yDefault = prefDragTapeView4y.edit(); prefDTV4yDefault.clear(); prefDTV4yDefault.commit();
            SharedPreferences.Editor prefDTV4rDefault = prefDragTapeView4rotation.edit(); prefDTV4rDefault.clear(); prefDTV4rDefault.commit();

            //dragTapeView5の保存のための変数の初期化
            SharedPreferences.Editor prefDTV5NDefault = prefDTV5Number.edit(); prefDTV5NDefault.clear(); prefDTV5NDefault.commit();
            SharedPreferences.Editor prefDTV5xDefault = prefDragTapeView5x.edit(); prefDTV5xDefault.clear(); prefDTV5xDefault.commit();
            SharedPreferences.Editor prefDTV5yDefault = prefDragTapeView5y.edit(); prefDTV5yDefault.clear(); prefDTV5yDefault.commit();
            SharedPreferences.Editor prefDTV5rDefault = prefDragTapeView5rotation.edit(); prefDTV5rDefault.clear(); prefDTV5rDefault.commit();


            //dragOrnamentView1の保存のための変数の初期化
            SharedPreferences.Editor prefDOV1NDefault = prefDOV1Number.edit(); prefDOV1NDefault.clear(); prefDOV1NDefault.commit();
            SharedPreferences.Editor prefDOV1xDefault = prefDragOrnamentView1x.edit(); prefDOV1xDefault.clear(); prefDOV1xDefault.commit();
            SharedPreferences.Editor prefDOV1yDefault = prefDragOrnamentView1y.edit(); prefDOV1yDefault.clear(); prefDTV1yDefault.commit();
            SharedPreferences.Editor prefDOV1rDefault = prefDragOrnamentView1rotation.edit(); prefDOV1rDefault.clear(); prefDTV1rDefault.commit();

            //dragOrnamentView2の保存のための変数の初期化
            SharedPreferences.Editor prefDOV2NDefault = prefDOV2Number.edit(); prefDOV2NDefault.clear(); prefDOV2NDefault.commit();
            SharedPreferences.Editor prefDOV2xDefault = prefDragOrnamentView2x.edit(); prefDOV2xDefault.clear(); prefDOV2xDefault.commit();
            SharedPreferences.Editor prefDOV2yDefault = prefDragOrnamentView2y.edit(); prefDOV2yDefault.clear(); prefDOV2yDefault.commit();
            SharedPreferences.Editor prefDOV2rDefault = prefDragOrnamentView2rotation.edit(); prefDOV2rDefault.clear(); prefDOV2rDefault.commit();

            //dragOrnamentView3の保存のための変数の初期化
            SharedPreferences.Editor prefDOV3NDefault = prefDOV3Number.edit(); prefDOV3NDefault.clear(); prefDOV3NDefault.commit();
            SharedPreferences.Editor prefDOV3xDefault = prefDragOrnamentView3x.edit(); prefDOV3xDefault.clear(); prefDOV3xDefault.commit();
            SharedPreferences.Editor prefDOV3yDefault = prefDragOrnamentView3y.edit(); prefDOV3yDefault.clear(); prefDOV3yDefault.commit();
            SharedPreferences.Editor prefDOV3rDefault = prefDragOrnamentView3rotation.edit(); prefDOV3rDefault.clear(); prefDOV3rDefault.commit();

            //dragOrnamentView4の保存のための変数の初期化
            SharedPreferences.Editor prefDOV4NDefault = prefDOV4Number.edit(); prefDOV4NDefault.clear(); prefDOV4NDefault.commit();
            SharedPreferences.Editor prefDOV4xDefault = prefDragOrnamentView4x.edit(); prefDOV4xDefault.clear(); prefDOV4xDefault.commit();
            SharedPreferences.Editor prefDOV4yDefault = prefDragOrnamentView4y.edit(); prefDOV4yDefault.clear(); prefDOV4yDefault.commit();
            SharedPreferences.Editor prefDOV4rDefault = prefDragOrnamentView4rotation.edit(); prefDOV4rDefault.clear(); prefDOV4rDefault.commit();

            //dragOrnamentView5の保存のための変数の初期化
            SharedPreferences.Editor prefDOV5NDefault = prefDOV5Number.edit(); prefDOV5NDefault.clear(); prefDOV5NDefault.commit();
            SharedPreferences.Editor prefDOV5xDefault = prefDragOrnamentView5x.edit(); prefDOV5xDefault.clear(); prefDOV5xDefault.commit();
            SharedPreferences.Editor prefDOV5yDefault = prefDragOrnamentView5y.edit(); prefDOV5yDefault.clear(); prefDOV5yDefault.commit();
            SharedPreferences.Editor prefDOV5rDefault = prefDragOrnamentView5rotation.edit(); prefDOV5rDefault.clear(); prefDOV5rDefault.commit();

            //dragOrnamentView6の保存のための変数の初期化
            SharedPreferences.Editor prefDOV6NDefault = prefDOV6Number.edit(); prefDOV6NDefault.clear(); prefDOV6NDefault.commit();
            SharedPreferences.Editor prefDOV6xDefault = prefDragOrnamentView6x.edit(); prefDOV6xDefault.clear(); prefDOV6xDefault.commit();
            SharedPreferences.Editor prefDOV6yDefault = prefDragOrnamentView6y.edit(); prefDOV6yDefault.clear(); prefDOV6yDefault.commit();
            SharedPreferences.Editor prefDOV6rDefault = prefDragOrnamentView6rotation.edit(); prefDOV6rDefault.clear(); prefDOV6rDefault.commit();

            //dragOrnamentView7の保存のための変数の初期化
            SharedPreferences.Editor prefDOV7NDefault = prefDOV7Number.edit(); prefDOV7NDefault.clear(); prefDOV7NDefault.commit();
            SharedPreferences.Editor prefDOV7xDefault = prefDragOrnamentView7x.edit(); prefDOV7xDefault.clear(); prefDOV7xDefault.commit();
            SharedPreferences.Editor prefDOV7yDefault = prefDragOrnamentView7y.edit(); prefDOV7yDefault.clear(); prefDOV7yDefault.commit();
            SharedPreferences.Editor prefDOV7rDefault = prefDragOrnamentView7rotation.edit(); prefDOV7rDefault.clear(); prefDOV7rDefault.commit();

            //dragOrnamentView8の保存のための変数の初期化
            SharedPreferences.Editor prefDOV8NDefault = prefDOV8Number.edit(); prefDOV8NDefault.clear(); prefDOV8NDefault.commit();
            SharedPreferences.Editor prefDOV8xDefault = prefDragOrnamentView8x.edit(); prefDOV8xDefault.clear(); prefDOV8xDefault.commit();
            SharedPreferences.Editor prefDOV8yDefault = prefDragOrnamentView8y.edit(); prefDOV8yDefault.clear(); prefDOV8yDefault.commit();
            SharedPreferences.Editor prefDOV8rDefault = prefDragOrnamentView8rotation.edit(); prefDOV8rDefault.clear(); prefDOV8rDefault.commit();


        } else if (makeFlag != true){
            //imageViewは写真に
            if (imageFlag == true){
                String sIV = preferencesPhoto.getString("img","");
                byte[] bIV = Base64.decode(sIV, Base64.DEFAULT);
                Bitmap bmpIV = BitmapFactory.decodeByteArray(bIV, 0, bIV.length).copy(Bitmap.Config.ARGB_8888, true);
                bitmapDrawable = new BitmapDrawable(getResources(), bmpIV);
                imageView.setBackgroundDrawable(bitmapDrawable);

                imageFlag = true;
            }

            //dragTapeView1をセット
            dragTapeDNumber = prefDTV1Number.getInt("tp1DN", 0);
            if(dragTapeDNumber == 0){

            } else {
                //位置
                dragTapeView1.setX(prefDragTapeView1x.getFloat("tp1x", 0));
                dragTapeView1.setY(prefDragTapeView1y.getFloat("tp1y", 0));
                //画像
                if (dragTapeDNumber == 41){
                    dragTapeView1.setBackgroundResource(R.drawable.tape1);
                } else if (dragTapeDNumber == 42){
                    dragTapeView1.setBackgroundResource(R.drawable.tape2);
                } else if (dragTapeDNumber == 43){
                    dragTapeView1.setBackgroundResource(R.drawable.tape3);
                } else if (dragTapeDNumber == 44){
                    dragTapeView1.setBackgroundResource(R.drawable.tape4);
                } else if (dragTapeDNumber == 45){
                    dragTapeView1.setBackgroundResource(R.drawable.tape5);
                } else if (dragTapeDNumber == 46){
                    dragTapeView1.setBackgroundResource(R.drawable.tape6);
                } else if (dragTapeDNumber == 47){
                    dragTapeView1.setBackgroundResource(R.drawable.tape7);
                } else if (dragTapeDNumber == 48){
                    dragTapeView1.setBackgroundResource(R.drawable.tape8);
                } else if (dragTapeDNumber == 49){
                    dragTapeView1.setBackgroundResource(R.drawable.tape9);
                } else if (dragTapeDNumber == 50){
                    dragTapeView1.setBackgroundResource(R.drawable.tape10);
                } else if (dragTapeDNumber == 51){
                    dragTapeView1.setBackgroundResource(R.drawable.tape11);
                } else if (dragTapeDNumber == 52){
                    dragTapeView1.setBackgroundResource(R.drawable.tape12);
                } else if (dragTapeDNumber == 53){
                    dragTapeView1.setBackgroundResource(R.drawable.tape13);
                } else if (dragTapeDNumber == 54){
                    dragTapeView1.setBackgroundResource(R.drawable.tape14);
                } else if (dragTapeDNumber == 55){
                    dragTapeView1.setBackgroundResource(R.drawable.tape15);
                } else if (dragTapeDNumber == 56){
                    dragTapeView1.setBackgroundResource(R.drawable.tape16);
                } else if (dragTapeDNumber == 57){
                    dragTapeView1.setBackgroundResource(R.drawable.tape17);
                } else if (dragTapeDNumber == 58){
                    dragTapeView1.setBackgroundResource(R.drawable.tape18);
                } else if (dragTapeDNumber == 59){
                    dragTapeView1.setBackgroundResource(R.drawable.tape19);
                } else if (dragTapeDNumber == 60){
                    dragTapeView1.setBackgroundResource(R.drawable.tape20);
                }
                //角度
                dragTapeView1.setRotation(prefDragTapeView1rotation.getFloat("tp1R", 0));

                dragTapeView1.setOnTouchListener(dragTapeTouch1);
            }

            //dragTapeView2をセット
            dragTapeDNumber = prefDTV2Number.getInt("tp2DN", 0);
            if (dragTapeDNumber == 0){

            } else {
                //位置
                dragTapeView2.setX(prefDragTapeView2x.getFloat("tp2x", 0));
                dragTapeView2.setY(prefDragTapeView2y.getFloat("tp2y", 0));
                //画像
                if (dragTapeDNumber == 41){
                    dragTapeView2.setBackgroundResource(R.drawable.tape1);
                } else if (dragTapeDNumber == 42){
                    dragTapeView2.setBackgroundResource(R.drawable.tape2);
                } else if (dragTapeDNumber == 43){
                    dragTapeView2.setBackgroundResource(R.drawable.tape3);
                } else if (dragTapeDNumber == 44){
                    dragTapeView2.setBackgroundResource(R.drawable.tape4);
                } else if (dragTapeDNumber == 45){
                    dragTapeView2.setBackgroundResource(R.drawable.tape5);
                } else if (dragTapeDNumber == 46){
                    dragTapeView2.setBackgroundResource(R.drawable.tape6);
                } else if (dragTapeDNumber == 47){
                    dragTapeView2.setBackgroundResource(R.drawable.tape7);
                } else if (dragTapeDNumber == 48){
                    dragTapeView2.setBackgroundResource(R.drawable.tape8);
                } else if (dragTapeDNumber == 49){
                    dragTapeView2.setBackgroundResource(R.drawable.tape9);
                } else if (dragTapeDNumber == 50){
                    dragTapeView2.setBackgroundResource(R.drawable.tape10);
                } else if (dragTapeDNumber == 51){
                    dragTapeView2.setBackgroundResource(R.drawable.tape11);
                } else if (dragTapeDNumber == 52){
                    dragTapeView2.setBackgroundResource(R.drawable.tape12);
                } else if (dragTapeDNumber == 53){
                    dragTapeView2.setBackgroundResource(R.drawable.tape13);
                } else if (dragTapeDNumber == 54){
                    dragTapeView2.setBackgroundResource(R.drawable.tape14);
                } else if (dragTapeDNumber == 55){
                    dragTapeView2.setBackgroundResource(R.drawable.tape15);
                } else if (dragTapeDNumber == 56){
                    dragTapeView2.setBackgroundResource(R.drawable.tape16);
                } else if (dragTapeDNumber == 57){
                    dragTapeView2.setBackgroundResource(R.drawable.tape17);
                } else if (dragTapeDNumber == 58){
                    dragTapeView2.setBackgroundResource(R.drawable.tape18);
                } else if (dragTapeDNumber == 59){
                    dragTapeView2.setBackgroundResource(R.drawable.tape19);
                } else if (dragTapeDNumber == 60){
                    dragTapeView2.setBackgroundResource(R.drawable.tape20);
                }
                //角度
                dragTapeView2.setRotation(prefDragTapeView2rotation.getFloat("tp2R", 0));

                dragTapeView2.setOnTouchListener(dragTapeTouch2);
            }

            //dragTapeView3をセット
            dragTapeDNumber = prefDTV3Number.getInt("tp3DN", 0);
            if (dragTapeDNumber == 0){

            } else {
                //位置
                dragTapeView3.setX(prefDragTapeView3x.getFloat("tp3x", 0));
                dragTapeView3.setY(prefDragTapeView3y.getFloat("tp3y", 0));
                //画像
                dragTapeDNumber = prefDTV3Number.getInt("tp3DN", 0);
                if (dragTapeDNumber == 41){
                    dragTapeView3.setBackgroundResource(R.drawable.tape1);
                } else if (dragTapeDNumber == 42){
                    dragTapeView3.setBackgroundResource(R.drawable.tape2);
                } else if (dragTapeDNumber == 43){
                    dragTapeView3.setBackgroundResource(R.drawable.tape3);
                } else if (dragTapeDNumber == 44){
                    dragTapeView3.setBackgroundResource(R.drawable.tape4);
                } else if (dragTapeDNumber == 45){
                    dragTapeView3.setBackgroundResource(R.drawable.tape5);
                } else if (dragTapeDNumber == 46){
                    dragTapeView3.setBackgroundResource(R.drawable.tape6);
                } else if (dragTapeDNumber == 47){
                    dragTapeView3.setBackgroundResource(R.drawable.tape7);
                } else if (dragTapeDNumber == 48){
                    dragTapeView3.setBackgroundResource(R.drawable.tape8);
                } else if (dragTapeDNumber == 49){
                    dragTapeView3.setBackgroundResource(R.drawable.tape9);
                } else if (dragTapeDNumber == 50){
                    dragTapeView3.setBackgroundResource(R.drawable.tape10);
                } else if (dragTapeDNumber == 51){
                    dragTapeView3.setBackgroundResource(R.drawable.tape11);
                } else if (dragTapeDNumber == 52){
                    dragTapeView3.setBackgroundResource(R.drawable.tape12);
                } else if (dragTapeDNumber == 53){
                    dragTapeView3.setBackgroundResource(R.drawable.tape13);
                } else if (dragTapeDNumber == 54){
                    dragTapeView3.setBackgroundResource(R.drawable.tape14);
                } else if (dragTapeDNumber == 55){
                    dragTapeView3.setBackgroundResource(R.drawable.tape15);
                } else if (dragTapeDNumber == 56){
                    dragTapeView3.setBackgroundResource(R.drawable.tape16);
                } else if (dragTapeDNumber == 57){
                    dragTapeView3.setBackgroundResource(R.drawable.tape17);
                } else if (dragTapeDNumber == 58){
                    dragTapeView3.setBackgroundResource(R.drawable.tape18);
                } else if (dragTapeDNumber == 59){
                    dragTapeView3.setBackgroundResource(R.drawable.tape19);
                } else if (dragTapeDNumber == 60){
                    dragTapeView3.setBackgroundResource(R.drawable.tape20);
                }
                //角度
                dragTapeView3.setRotation(prefDragTapeView3rotation.getFloat("tp3R", 0));

                dragTapeView3.setOnTouchListener(dragTapeTouch3);
            }

            //dragTapeView4をセット
            dragTapeDNumber = prefDTV4Number.getInt("tp4DN", 0);
            if (dragTapeDNumber == 0){

            } else {
                //位置
                dragTapeView4.setX(prefDragTapeView4x.getFloat("tp4x", 0));
                dragTapeView4.setY(prefDragTapeView4y.getFloat("tp4y", 0));
                //画像
                if (dragTapeDNumber == 41){
                    dragTapeView4.setBackgroundResource(R.drawable.tape1);
                } else if (dragTapeDNumber == 42){
                    dragTapeView4.setBackgroundResource(R.drawable.tape2);
                } else if (dragTapeDNumber == 43){
                    dragTapeView4.setBackgroundResource(R.drawable.tape3);
                } else if (dragTapeDNumber == 44){
                    dragTapeView4.setBackgroundResource(R.drawable.tape4);
                } else if (dragTapeDNumber == 45){
                    dragTapeView4.setBackgroundResource(R.drawable.tape5);
                } else if (dragTapeDNumber == 46){
                    dragTapeView4.setBackgroundResource(R.drawable.tape6);
                } else if (dragTapeDNumber == 47){
                    dragTapeView4.setBackgroundResource(R.drawable.tape7);
                } else if (dragTapeDNumber == 48){
                    dragTapeView4.setBackgroundResource(R.drawable.tape8);
                } else if (dragTapeDNumber == 49){
                    dragTapeView4.setBackgroundResource(R.drawable.tape9);
                } else if (dragTapeDNumber == 50){
                    dragTapeView4.setBackgroundResource(R.drawable.tape10);
                } else if (dragTapeDNumber == 51){
                    dragTapeView4.setBackgroundResource(R.drawable.tape11);
                } else if (dragTapeDNumber == 52){
                    dragTapeView4.setBackgroundResource(R.drawable.tape12);
                } else if (dragTapeDNumber == 53){
                    dragTapeView4.setBackgroundResource(R.drawable.tape13);
                } else if (dragTapeDNumber == 54){
                    dragTapeView4.setBackgroundResource(R.drawable.tape14);
                } else if (dragTapeDNumber == 55){
                    dragTapeView4.setBackgroundResource(R.drawable.tape15);
                } else if (dragTapeDNumber == 56){
                    dragTapeView4.setBackgroundResource(R.drawable.tape16);
                } else if (dragTapeDNumber == 57){
                    dragTapeView4.setBackgroundResource(R.drawable.tape17);
                } else if (dragTapeDNumber == 58){
                    dragTapeView4.setBackgroundResource(R.drawable.tape18);
                } else if (dragTapeDNumber == 59){
                    dragTapeView4.setBackgroundResource(R.drawable.tape19);
                } else if (dragTapeDNumber == 60){
                    dragTapeView4.setBackgroundResource(R.drawable.tape20);
                }
                //角度
                dragTapeView4.setRotation(prefDragTapeView4rotation.getFloat("tp4R", 0));

                dragTapeView4.setOnTouchListener(dragTapeTouch4);
            }

            //dragTapeView5をセット
            dragTapeDNumber = prefDTV5Number.getInt("tp5DN", 0);
            if (dragTapeDNumber == 0){

            } else {
                //位置
                dragTapeView5.setX(prefDragTapeView5x.getFloat("tp5x", 0));
                dragTapeView5.setY(prefDragTapeView5y.getFloat("tp5y", 0));
                //画像
                if (dragTapeDNumber == 41){
                    dragTapeView5.setBackgroundResource(R.drawable.tape1);
                } else if (dragTapeDNumber == 42){
                    dragTapeView5.setBackgroundResource(R.drawable.tape2);
                } else if (dragTapeDNumber == 43){
                    dragTapeView5.setBackgroundResource(R.drawable.tape3);
                } else if (dragTapeDNumber == 44){
                    dragTapeView5.setBackgroundResource(R.drawable.tape4);
                } else if (dragTapeDNumber == 45){
                    dragTapeView5.setBackgroundResource(R.drawable.tape5);
                } else if (dragTapeDNumber == 46){
                    dragTapeView5.setBackgroundResource(R.drawable.tape6);
                } else if (dragTapeDNumber == 47){
                    dragTapeView5.setBackgroundResource(R.drawable.tape7);
                } else if (dragTapeDNumber == 48){
                    dragTapeView5.setBackgroundResource(R.drawable.tape8);
                } else if (dragTapeDNumber == 49){
                    dragTapeView5.setBackgroundResource(R.drawable.tape9);
                } else if (dragTapeDNumber == 50){
                    dragTapeView5.setBackgroundResource(R.drawable.tape10);
                } else if (dragTapeDNumber == 51){
                    dragTapeView5.setBackgroundResource(R.drawable.tape11);
                } else if (dragTapeDNumber == 52){
                    dragTapeView5.setBackgroundResource(R.drawable.tape12);
                } else if (dragTapeDNumber == 53){
                    dragTapeView5.setBackgroundResource(R.drawable.tape13);
                } else if (dragTapeDNumber == 54){
                    dragTapeView5.setBackgroundResource(R.drawable.tape14);
                } else if (dragTapeDNumber == 55){
                    dragTapeView5.setBackgroundResource(R.drawable.tape15);
                } else if (dragTapeDNumber == 56){
                    dragTapeView5.setBackgroundResource(R.drawable.tape16);
                } else if (dragTapeDNumber == 57){
                    dragTapeView5.setBackgroundResource(R.drawable.tape17);
                } else if (dragTapeDNumber == 58){
                    dragTapeView5.setBackgroundResource(R.drawable.tape18);
                } else if (dragTapeDNumber == 59){
                    dragTapeView5.setBackgroundResource(R.drawable.tape19);
                } else if (dragTapeDNumber == 60){
                    dragTapeView5.setBackgroundResource(R.drawable.tape20);
                }
                //角度
                dragTapeView5.setRotation(prefDragTapeView5rotation.getFloat("tp5R", 0));

                dragTapeView5.setOnTouchListener(dragTapeTouch5);
            }

            //dragOrnamentView1をセット
            dragOrnamentDNumber = prefDOV1Number.getInt("om1DN", 0);
            Log.d("ornamentDNumber", String.valueOf(dragOrnamentDNumber));

            if(dragOrnamentDNumber == 0){
                Log.d("01", "0");
            } else {
                //位置
                dragOrnamentView1.setX(prefDragOrnamentView1x.getFloat("om1x", 0));
                dragOrnamentView1.setY(prefDragOrnamentView1y.getFloat("om1y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録1", "完了");
                    dragOrnamentView1.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView1.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView1.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView1.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView1.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView1.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView1.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView1.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView1.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView1.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView1.setRotation(prefDragOrnamentView1rotation.getFloat("om1R", 0));

                dragOrnamentView1.setOnTouchListener(dragOrnamentTouch1);
            }

            //dragOrnamentView2をセット
            dragOrnamentDNumber = prefDOV2Number.getInt("om2DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("02", "0");
            } else {
                //位置
                dragOrnamentView2.setX(prefDragOrnamentView2x.getFloat("om2x", 0));
                dragOrnamentView2.setY(prefDragOrnamentView2y.getFloat("om2y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録2", "完了");
                    dragOrnamentView2.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView2.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView2.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView2.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView2.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView2.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView2.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView2.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView2.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView2.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView2.setRotation(prefDragOrnamentView2rotation.getFloat("om2R", 0));

                dragOrnamentView2.setOnTouchListener(dragOrnamentTouch2);
            }

            //dragOrnamentView3をセット
            dragOrnamentDNumber = prefDOV3Number.getInt("om3DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("03", "0");
            } else {
                //位置
                dragOrnamentView3.setX(prefDragOrnamentView3x.getFloat("om3x", 0));
                dragOrnamentView3.setY(prefDragOrnamentView3y.getFloat("om3y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録3", "完了");
                    dragOrnamentView3.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView3.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView3.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView3.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView3.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView3.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView3.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView3.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView3.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView3.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView3.setRotation(prefDragOrnamentView3rotation.getFloat("om3R", 0));

                dragOrnamentView3.setOnTouchListener(dragOrnamentTouch3);
            }

            //dragOrnamentView4をセット
            dragOrnamentDNumber = prefDOV4Number.getInt("om4DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("04", "0");
            } else {
                //位置
                dragOrnamentView4.setX(prefDragOrnamentView4x.getFloat("om4x", 0));
                dragOrnamentView4.setY(prefDragOrnamentView4y.getFloat("om4y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録4", "完了");
                    dragOrnamentView4.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView4.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView4.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView4.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView4.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView4.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView4.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView4.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView4.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView4.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView4.setRotation(prefDragOrnamentView4rotation.getFloat("om4R", 0));

                dragOrnamentView4.setOnTouchListener(dragOrnamentTouch4);
            }

            //dragOrnamentView5をセット
            dragOrnamentDNumber = prefDOV5Number.getInt("om5DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("05", "0");
            } else {
                //位置
                dragOrnamentView5.setX(prefDragOrnamentView5x.getFloat("om5x", 0));
                dragOrnamentView5.setY(prefDragOrnamentView5y.getFloat("om5y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録5", "完了");
                    dragOrnamentView5.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView5.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView5.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView5.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView5.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView5.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView5.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView5.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView5.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView5.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView5.setRotation(prefDragOrnamentView5rotation.getFloat("om5R", 0));

                dragOrnamentView5.setOnTouchListener(dragOrnamentTouch5);
            }

            //dragOrnamentView6をセット
            dragOrnamentDNumber = prefDOV6Number.getInt("om6DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("06", "0");
            } else {
                //位置
                dragOrnamentView6.setX(prefDragOrnamentView6x.getFloat("om6x", 0));
                dragOrnamentView6.setY(prefDragOrnamentView6y.getFloat("om6y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録6", "完了");
                    dragOrnamentView6.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView6.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView6.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView6.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView6.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView6.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView6.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView6.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView6.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView6.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView6.setRotation(prefDragOrnamentView6rotation.getFloat("om6R", 0));

                dragOrnamentView6.setOnTouchListener(dragOrnamentTouch6);
            }

            //dragOrnamentView7をセット
            dragOrnamentDNumber = prefDOV7Number.getInt("om7DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("07", "0");
            } else {
                //位置
                dragOrnamentView7.setX(prefDragOrnamentView7x.getFloat("om7x", 0));
                dragOrnamentView7.setY(prefDragOrnamentView7y.getFloat("om7y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録7", "完了");
                    dragOrnamentView7.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView7.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView7.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView7.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView7.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView7.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView7.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView7.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView7.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView7.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView7.setRotation(prefDragOrnamentView7rotation.getFloat("om7R", 0));

                dragOrnamentView7.setOnTouchListener(dragOrnamentTouch7);
            }

            //dragOrnamentView8をセット
            dragOrnamentDNumber = prefDOV8Number.getInt("om8DN", 0);
            if(dragOrnamentDNumber == 0){
                Log.d("08", "0");
            } else {
                //位置
                dragOrnamentView8.setX(prefDragOrnamentView8x.getFloat("om8x", 0));
                dragOrnamentView8.setY(prefDragOrnamentView8y.getFloat("om8y", 0));
                //画像
                if (dragOrnamentDNumber == 61){
                    Log.d("画像登録8", "完了");
                    dragOrnamentView8.setBackgroundResource(R.drawable.pin1);
                } else if (dragOrnamentDNumber == 62){
                    dragOrnamentView8.setBackgroundResource(R.drawable.pin2);
                } else if (dragOrnamentDNumber == 63){
                    dragOrnamentView8.setBackgroundResource(R.drawable.pin3);
                } else if (dragOrnamentDNumber == 64){
                    dragOrnamentView8.setBackgroundResource(R.drawable.pin4);
                } else if (dragOrnamentDNumber == 65){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon1);
                } else if (dragOrnamentDNumber == 66){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon2);
                } else if (dragOrnamentDNumber == 67){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon3);
                } else if (dragOrnamentDNumber == 68){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon4);
                } else if (dragOrnamentDNumber == 69){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon5);
                } else if (dragOrnamentDNumber == 70){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon6);
                } else if (dragOrnamentDNumber == 71){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon7);
                } else if (dragOrnamentDNumber == 72){
                    dragOrnamentView8.setBackgroundResource(R.drawable.ribbon8);
                } else if (dragOrnamentDNumber == 73){
                    dragOrnamentView8.setBackgroundResource(R.drawable.button1);
                } else if (dragOrnamentDNumber == 74){
                    dragOrnamentView8.setBackgroundResource(R.drawable.button2);
                } else if (dragOrnamentDNumber == 75){
                    dragOrnamentView8.setBackgroundResource(R.drawable.button3);
                } else if (dragOrnamentDNumber == 76){
                    dragOrnamentView8.setBackgroundResource(R.drawable.button4);
                } else if (dragOrnamentDNumber == 77){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others1);
                } else if (dragOrnamentDNumber == 78){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others2);
                } else if (dragOrnamentDNumber == 79){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others3);
                } else if (dragOrnamentDNumber == 80){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others4);
                } else if (dragOrnamentDNumber == 81){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others5);
                } else if (dragOrnamentDNumber == 82){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others6);
                } else if (dragOrnamentDNumber == 83){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others7);
                } else if (dragOrnamentDNumber == 84){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others8);
                } else if (dragOrnamentDNumber == 85){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others9);
                } else if (dragOrnamentDNumber == 86){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others10);
                } else if (dragOrnamentDNumber == 87){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others11);
                } else if (dragOrnamentDNumber == 88){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others12);
                } else if (dragOrnamentDNumber == 89){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others13);
                } else if (dragOrnamentDNumber == 90){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others14);
                } else if (dragOrnamentDNumber == 91){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others15);
                } else if (dragOrnamentDNumber == 92){
                    dragOrnamentView8.setBackgroundResource(R.drawable.the_others16);
                }
                //角度
                dragOrnamentView8.setRotation(prefDragOrnamentView8rotation.getFloat("om8R", 0));

                dragOrnamentView8.setOnTouchListener(dragOrnamentTouch8);
            }

            backgroundNumber = preferencesBackground.getInt("background", 0);

            if (backgroundNumber == 0) {

            } else if (backgroundNumber == 1){
                relativeLayout.setBackgroundResource(R.drawable.background1);
            } else if (backgroundNumber == 2){
                relativeLayout.setBackgroundResource(R.drawable.background2);
            } else if (backgroundNumber == 3){
                relativeLayout.setBackgroundResource(R.drawable.background3);
            } else if (backgroundNumber == 4){
                relativeLayout.setBackgroundResource(R.drawable.background4);
            } else if (backgroundNumber == 5){
                relativeLayout.setBackgroundResource(R.drawable.background5);
            } else if (backgroundNumber == 6){
                relativeLayout.setBackgroundResource(R.drawable.background6);
            } else if (backgroundNumber == 7){
                relativeLayout.setBackgroundResource(R.drawable.background7);
            } else if (backgroundNumber == 8){
                relativeLayout.setBackgroundResource(R.drawable.background8);
            } else if (backgroundNumber == 9){
                relativeLayout.setBackgroundResource(R.drawable.background9);
            } else if (backgroundNumber == 10){
                relativeLayout.setBackgroundResource(R.drawable.background10);
            } else if (backgroundNumber == 11){
                relativeLayout.setBackgroundResource(R.drawable.background11);
            } else if (backgroundNumber == 12){
                relativeLayout.setBackgroundResource(R.drawable.background12);
            } else if (backgroundNumber == 13){
                relativeLayout.setBackgroundResource(R.drawable.background13);
            } else if (backgroundNumber == 14){
                relativeLayout.setBackgroundResource(R.drawable.background14);
            } else if (backgroundNumber == 15){
                relativeLayout.setBackgroundResource(R.drawable.background15);
            } else if (backgroundNumber == 16){
                relativeLayout.setBackgroundResource(R.drawable.background16);
            } else if (backgroundNumber == 17){
                relativeLayout.setBackgroundResource(R.drawable.background17);
            } else if (backgroundNumber == 18){
                relativeLayout.setBackgroundResource(R.drawable.background18);
            } else if (backgroundNumber == 19){
                relativeLayout.setBackgroundResource(R.drawable.background19);
            } else if (backgroundNumber == 20){
                relativeLayout.setBackgroundResource(R.drawable.background20);
            } else if (backgroundNumber == 21){
                relativeLayout.setBackgroundResource(R.drawable.background21);
            } else if (backgroundNumber == 22){
                relativeLayout.setBackgroundResource(R.drawable.background22);
            } else if (backgroundNumber == 23){
                relativeLayout.setBackgroundResource(R.drawable.background23);
            } else if (backgroundNumber == 24){
                relativeLayout.setBackgroundResource(R.drawable.background24);
            } else if (backgroundNumber == 25){
                relativeLayout.setBackgroundResource(R.drawable.background25);
            } else if (backgroundNumber == 26){
                relativeLayout.setBackgroundResource(R.drawable.background26);
            } else if (backgroundNumber == 27){
                relativeLayout.setBackgroundResource(R.drawable.background27);
            } else if (backgroundNumber == 28){
                relativeLayout.setBackgroundResource(R.drawable.background28);
            } else if (backgroundNumber == 29){
                relativeLayout.setBackgroundResource(R.drawable.background29);
            } else if (backgroundNumber == 30){
                relativeLayout.setBackgroundResource(R.drawable.background30);
            } else if (backgroundNumber == 31){
                relativeLayout.setBackgroundResource(R.drawable.background31);
            } else if (backgroundNumber == 32){
                relativeLayout.setBackgroundResource(R.drawable.background32);
            } else if (backgroundNumber == 33){
                relativeLayout.setBackgroundResource(R.drawable.background33);
            } else if (backgroundNumber == 34){
                relativeLayout.setBackgroundResource(R.drawable.background34);
            } else if (backgroundNumber == 35){
                relativeLayout.setBackgroundResource(R.drawable.background35);
            } else if (backgroundNumber == 36){
                relativeLayout.setBackgroundResource(R.drawable.background36);
            } else if (backgroundNumber == 37){
                relativeLayout.setBackgroundResource(R.drawable.background37);
            } else if (backgroundNumber == 38){
                relativeLayout.setBackgroundResource(R.drawable.background38);
            } else if (backgroundNumber == 39){
                relativeLayout.setBackgroundResource(R.drawable.background39);
            } else if (backgroundNumber == 40){
                relativeLayout.setBackgroundResource(R.drawable.background40);
            }
        }


        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        //imageViewとeditTextで角度設定か背景設定かを選ぶための変数の関連付け
        choiceBackgroundOrAngleLinearLayout = (LinearLayout)findViewById(R.id.choiceBackgroundOrAngleLinearLayout);
        choiceBackgroundButton = (Button)findViewById(R.id.choiceBackgrondButton);
        choiceAngleButton = (Button)findViewById(R.id.choiceAngleButton);

        //imageViewの背景設定のための変数の関連付け
        imageViewBackgroundLinearLayout = (LinearLayout)findViewById(R.id.imageViewBackgroundLinearLayout);
        imageViewBackgroundImageButton1 = (ImageButton)findViewById(R.id.imageViewBackgroundImageButton1);
        imageViewBackgroundImageButton2 = (ImageButton)findViewById(R.id.imageViewBackgroundImageButton2);
        imageViewBackgroundImageButton3 = (ImageButton)findViewById(R.id.imageViewBackgroundImageButton3);
        imageViewBackgroundImageButton4 = (ImageButton)findViewById(R.id.imageViewBackgroundImageButton4);

        frameImageView = (ImageView)findViewById(R.id.frameImageView);

        //editTextの背景設定のための変数の関連付け
        editTextBackgroundLinearLayout = (LinearLayout)findViewById(R.id.editTextBackgroundLinearLayout);
        editTextBackgroundImageButton1 = (ImageButton)findViewById(R.id.editTextBackgroundImageButton1);
        editTextBackgroundImageButton2 = (ImageButton)findViewById(R.id.editTextBackgroundImageButton2);
        editTextBackgroundImageButton3 = (ImageButton)findViewById(R.id.editTextBackgroundImageButton3);
        editTextBackgroundImageButton4 = (ImageButton)findViewById(R.id.editTextBackgroundImageButton4);

        //角度設定に用いる部品と変数の関連付け
        angleLinearLayout = (LinearLayout)findViewById(R.id.angleLinearLayout);
        rotationEditText = (EditText)findViewById(R.id.rotationEditText);
        directionRightButton = (Button)findViewById(R.id.directionRightButton);
        directionLeftButton = (Button)findViewById(R.id.directionLeftButton);


        tapesLinearLayout = (LinearLayout)findViewById(R.id.tapesLinearLayout);
        tapeButton = (ImageButton)findViewById(R.id.tapeButton);
        tapeNumber = 0;

        ornamentsLinearLayout = (LinearLayout)findViewById(R.id.ornamentsLinearLayout);
        ornamentButton = (ImageButton)findViewById(R.id.ornamentButton);
        choiceOrnamentLinearLayout = (LinearLayout)findViewById(R.id.choiceOrnamentsLinearLayout);
        eachOrnamentsLinearLayout = (LinearLayout)findViewById(R.id.eachOrnamentsLinearLayout);
        pinLinearLayout = (LinearLayout)findViewById(R.id.pinLinearLayout);
        ribbonLinearLayout = (LinearLayout)findViewById(R.id.ribbonLinearLayout);
        buttonLinearLayout = (LinearLayout)findViewById(R.id.buttonLinearLayout);
        the_othersLinearLayout = (LinearLayout)findViewById(R.id.the_othersLinearLayout);
        ornamentNumber = 0;

        dragViewCheckLinearLayout = (LinearLayout)findViewById(R.id.dragViewCheckLinearLayout);
        dragViewChoiceLinearLayout = (LinearLayout)findViewById(R.id.dragViewChoiceLinearLayout);

        imageView.setOnClickListener(imageViewOnClick);
        imageView.setOnLongClickListener(imageViewOnLongClick);
        editText.setOnLongClickListener(editTextOnLongClick);

        //backgroundに背景画像をセット
        Intent intentBG = getIntent();
        backgroundNumber = intentBG.getIntExtra("BG", 0);
        boolean backgroundFlag = intentBG.getBooleanExtra("backgroundFlag", false);

        if (backgroundFlag == true){
            if (backgroundNumber == 0) {

            } else if (backgroundNumber == 1){
                relativeLayout.setBackgroundResource(R.drawable.background1);
            } else if (backgroundNumber == 2){
                relativeLayout.setBackgroundResource(R.drawable.background2);
            } else if (backgroundNumber == 3){
                relativeLayout.setBackgroundResource(R.drawable.background3);
            } else if (backgroundNumber == 4){
                relativeLayout.setBackgroundResource(R.drawable.background4);
            } else if (backgroundNumber == 5){
                relativeLayout.setBackgroundResource(R.drawable.background5);
            } else if (backgroundNumber == 6){
                relativeLayout.setBackgroundResource(R.drawable.background6);
            } else if (backgroundNumber == 7){
                relativeLayout.setBackgroundResource(R.drawable.background7);
            } else if (backgroundNumber == 8){
                relativeLayout.setBackgroundResource(R.drawable.background8);
            } else if (backgroundNumber == 9){
                relativeLayout.setBackgroundResource(R.drawable.background9);
            } else if (backgroundNumber == 10){
                relativeLayout.setBackgroundResource(R.drawable.background10);
            } else if (backgroundNumber == 11){
                relativeLayout.setBackgroundResource(R.drawable.background11);
            } else if (backgroundNumber == 12){
                relativeLayout.setBackgroundResource(R.drawable.background12);
            } else if (backgroundNumber == 13){
                relativeLayout.setBackgroundResource(R.drawable.background13);
            } else if (backgroundNumber == 14){
                relativeLayout.setBackgroundResource(R.drawable.background14);
            } else if (backgroundNumber == 15){
                relativeLayout.setBackgroundResource(R.drawable.background15);
            } else if (backgroundNumber == 16){
                relativeLayout.setBackgroundResource(R.drawable.background16);
            } else if (backgroundNumber == 17){
                relativeLayout.setBackgroundResource(R.drawable.background17);
            } else if (backgroundNumber == 18){
                relativeLayout.setBackgroundResource(R.drawable.background18);
            } else if (backgroundNumber == 19){
                relativeLayout.setBackgroundResource(R.drawable.background19);
            } else if (backgroundNumber == 20){
                relativeLayout.setBackgroundResource(R.drawable.background20);
            } else if (backgroundNumber == 21){
                relativeLayout.setBackgroundResource(R.drawable.background21);
            } else if (backgroundNumber == 22){
                relativeLayout.setBackgroundResource(R.drawable.background22);
            } else if (backgroundNumber == 23){
                relativeLayout.setBackgroundResource(R.drawable.background23);
            } else if (backgroundNumber == 24){
                relativeLayout.setBackgroundResource(R.drawable.background24);
            } else if (backgroundNumber == 25){
                relativeLayout.setBackgroundResource(R.drawable.background25);
            } else if (backgroundNumber == 26){
                relativeLayout.setBackgroundResource(R.drawable.background26);
            } else if (backgroundNumber == 27){
                relativeLayout.setBackgroundResource(R.drawable.background27);
            } else if (backgroundNumber == 28){
                relativeLayout.setBackgroundResource(R.drawable.background28);
            } else if (backgroundNumber == 29){
                relativeLayout.setBackgroundResource(R.drawable.background29);
            } else if (backgroundNumber == 30){
                relativeLayout.setBackgroundResource(R.drawable.background30);
            } else if (backgroundNumber == 31){
                relativeLayout.setBackgroundResource(R.drawable.background31);
            } else if (backgroundNumber == 32){
                relativeLayout.setBackgroundResource(R.drawable.background32);
            } else if (backgroundNumber == 33){
                relativeLayout.setBackgroundResource(R.drawable.background33);
            } else if (backgroundNumber == 34){
                relativeLayout.setBackgroundResource(R.drawable.background34);
            } else if (backgroundNumber == 35){
                relativeLayout.setBackgroundResource(R.drawable.background35);
            } else if (backgroundNumber == 36){
                relativeLayout.setBackgroundResource(R.drawable.background36);
            } else if (backgroundNumber == 37){
                relativeLayout.setBackgroundResource(R.drawable.background37);
            } else if (backgroundNumber == 38){
                relativeLayout.setBackgroundResource(R.drawable.background38);
            } else if (backgroundNumber == 39){
                relativeLayout.setBackgroundResource(R.drawable.background39);
            } else if (backgroundNumber == 40){
                relativeLayout.setBackgroundResource(R.drawable.background40);
            }

            SharedPreferences.Editor editorBackground = preferencesBackground.edit();
            editorBackground.putInt("background", backgroundNumber);
            editorBackground.apply();
        }

    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        // TODO Auto-generated method stub
        if (resultCode == RESULT_OK) {
            //ギャラリーから画像を選択してくる
            try {
                imageFlag = true;
                InputStream in = getContentResolver().openInputStream(data.getData());
                img = BitmapFactory.decodeStream(in);
                in.close();

                // 選択した画像を表示
                if (requestCode == 0) {
                    bitmapDrawable = new BitmapDrawable(getResources(), img);
                    imageView.setBackgroundDrawable(bitmapDrawable);

                    //imageViewのphoto
                    ByteArrayOutputStream BaOsIV = new ByteArrayOutputStream();
                    img.compress(Bitmap.CompressFormat.JPEG, 100, BaOsIV);
                    String bitmapStrIV = Base64.encodeToString(BaOsIV.toByteArray(), Base64.DEFAULT);

                    SharedPreferences.Editor editorPhoto = preferencesPhoto.edit();
                    editorPhoto.putString("img", bitmapStrIV);
                    editorPhoto.apply();

                    imageFlag = true;
                    //finish();
                }

            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }

    private View.OnClickListener imageViewOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (flag != true) {
                //flagがtrueでなかったら(flagは常に３つの可能性(true, null, false))
                // ギャラリー呼び出し
                Intent intent = new Intent();
                intent.setType("image/*");   //←jpegに限定する場合は, "image/jpeg"と指定.
                //↑imageのtypeの選択
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 0);
                imageFlag = true;
            }
            flag = false;
        }
    };

    private View.OnLongClickListener imageViewOnLongClick = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            choiceBackgroundOrAngleLinearLayout.setVisibility(View.VISIBLE);

            choiceBackgroundButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    choiceBackgroundOrAngleLinearLayout.setVisibility(View.GONE);
                    imageViewBackgroundLinearLayout.setVisibility(View.VISIBLE);

                    frameFlag = true;

                    imageViewBackgroundImageButton1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            frameImageView.setVisibility(View.VISIBLE);
                            frameImageView.setBackgroundResource(R.drawable.frame1);
                            imageViewBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    imageViewBackgroundImageButton2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            frameImageView.setVisibility(View.VISIBLE);
                            frameImageView.setBackgroundResource(R.drawable.frame2);
                            imageViewBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    imageViewBackgroundImageButton3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            frameImageView.setVisibility(View.VISIBLE);
                            frameImageView.setBackgroundResource(R.drawable.frame3);
                            imageViewBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    imageViewBackgroundImageButton4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            frameImageView.setVisibility(View.VISIBLE);
                            frameImageView.setBackgroundResource(R.drawable.frame4);
                            imageViewBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });
                }
            });

            choiceAngleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    choiceBackgroundOrAngleLinearLayout.setVisibility(View.GONE);
                    angleLinearLayout.setVisibility(View.VISIBLE);
                    rotationEditText.setText("");

                    imageViewRotateFlag = true;
                }
            });

            //このままだとonLongClickも反応してしまうのでonClickが反応しないようにflag = trueにしておく
            flag = true;
            //onLongClickではflagの真偽値は関係ない

            return false;
            //onLongClickが無効になる(もうbooleanは長押しと判断してない)
            //flagの値も無効になる（nullにもどる）
        }
    };

    private View.OnLongClickListener editTextOnLongClick = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            choiceBackgroundOrAngleLinearLayout.setVisibility(View.VISIBLE);

            choiceBackgroundButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    eTbGFlag = true;

                    choiceBackgroundOrAngleLinearLayout.setVisibility(View.GONE);
                    editTextBackgroundLinearLayout.setVisibility(View.VISIBLE);

                    editTextBackgroundImageButton1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            editText.setBackgroundResource(R.drawable.memo1);
                            editTextBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    editTextBackgroundImageButton2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            editText.setBackgroundResource(R.drawable.memo2);
                            editTextBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    editTextBackgroundImageButton3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            editText.setBackgroundResource(R.drawable.memo3);
                            editTextBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    editTextBackgroundImageButton4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            editText.setBackgroundResource(R.drawable.memo4);
                            editTextBackgroundLinearLayout.setVisibility(View.GONE);
                        }
                    });
                }
            });

            choiceAngleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    choiceBackgroundOrAngleLinearLayout.setVisibility(View.GONE);
                    angleLinearLayout.setVisibility(View.VISIBLE);
                    rotationEditText.setText("");

                    editTextRotateFlag = true;
                }
            });

            //このままだとonLongClickも反応してしまうのでonClickが反応しないようにflag = trueにしておく
            flag = true;
            //onLongClickではflagの真偽値は関係ない

            return false;
            //onLongClickが無効になる(もうbooleanは長押しと判断してない)
            //flagの値も無効になる（nullにもどる）
        }
    };

    public void right(View v){
        ssb = (SpannableStringBuilder)rotationEditText.getText();
        Degree = ssb.toString();
        angle = Integer.parseInt(Degree);

        if (imageViewRotateFlag == true){
            imageView.setRotation(angle);
            imageViewRotateFlag = false;
        } else if (editTextRotateFlag == true){
            editText.setRotation(angle);
            editTextRotateFlag = false;
        } else if (tapeChoiceFlag1 == true){
            dragTapeView1.setRotation(angle);
            SharedPreferences.Editor tape1r = prefDragTapeView1rotation.edit();
            tape1r.putFloat("tp1R", angle); tape1r.apply();
            tapeChoiceFlag1 = false;
        } else if (tapeChoiceFlag2 == true){
            dragTapeView2.setRotation(angle);
            SharedPreferences.Editor tape2r = prefDragTapeView2rotation.edit();
            tape2r.putFloat("tp2R", angle); tape2r.apply();
            tapeChoiceFlag2 = false;
        } else if (tapeChoiceFlag3 == true){
            dragTapeView3.setRotation(angle);
            SharedPreferences.Editor tape3r = prefDragTapeView3rotation.edit();
            tape3r.putFloat("tp3R", angle); tape3r.apply();
            tapeChoiceFlag3 = false;
        } else if (tapeChoiceFlag4 == true){
            dragTapeView4.setRotation(angle);
            SharedPreferences.Editor tape4r = prefDragTapeView4rotation.edit();
            tape4r.putFloat("tp4R", angle); tape4r.apply();
            tapeChoiceFlag4 = false;
        } else if (tapeChoiceFlag5 == true){
            dragTapeView5.setRotation(angle);
            SharedPreferences.Editor tape5r = prefDragTapeView5rotation.edit();
            tape5r.putFloat("tp5R", angle); tape5r.apply();
            tapeChoiceFlag5 = false;
        } else if (ornamentChoiceFlag1 == true){
            dragOrnamentView1.setRotation(angle);
            SharedPreferences.Editor ornament1r = prefDragOrnamentView1rotation.edit();
            ornament1r.putFloat("om1R", angle); ornament1r.apply();
            ornamentChoiceFlag1 = false;
        } else if (ornamentChoiceFlag2 == true){
            dragOrnamentView2.setRotation(angle);
            SharedPreferences.Editor ornament2r = prefDragOrnamentView2rotation.edit();
            ornament2r.putFloat("om2R", angle); ornament2r.apply();
            ornamentChoiceFlag2 = false;
        } else if (ornamentChoiceFlag3 == true){
            dragOrnamentView3.setRotation(angle);
            SharedPreferences.Editor ornament3r = prefDragOrnamentView3rotation.edit();
            ornament3r.putFloat("om3R", angle); ornament3r.apply();
            ornamentChoiceFlag3 = false;
        } else if (ornamentChoiceFlag4 == true){
            dragOrnamentView4.setRotation(angle);
            SharedPreferences.Editor ornament4r = prefDragOrnamentView4rotation.edit();
            ornament4r.putFloat("om2R", angle); ornament4r.apply();
            ornamentChoiceFlag4 = false;
        } else if (ornamentChoiceFlag5 == true){
            dragOrnamentView5.setRotation(angle);
            SharedPreferences.Editor ornament5r = prefDragOrnamentView5rotation.edit();
            ornament5r.putFloat("om2R", angle); ornament5r.apply();
            ornamentChoiceFlag5 = false;
        } else if (ornamentChoiceFlag6 == true){
            dragOrnamentView6.setRotation(angle);
            SharedPreferences.Editor ornament6r = prefDragOrnamentView6rotation.edit();
            ornament6r.putFloat("om6R", angle); ornament6r.apply();
            ornamentChoiceFlag6 = false;
        } else if (ornamentChoiceFlag7 == true){
            dragOrnamentView7.setRotation(angle);
            SharedPreferences.Editor ornament7r = prefDragOrnamentView7rotation.edit();
            ornament7r.putFloat("om7R", angle); ornament7r.apply();
            ornamentChoiceFlag7 = false;
        } else if (ornamentChoiceFlag8 == true){
            dragOrnamentView8.setRotation(angle);
            SharedPreferences.Editor ornament8r = prefDragOrnamentView8rotation.edit();
            ornament8r.putFloat("om8R", angle); ornament8r.apply();
            ornamentChoiceFlag8 = false;
        }

        angleLinearLayout.setVisibility(View.GONE);
    }

    public void left(View v){
        ssb = (SpannableStringBuilder)rotationEditText.getText();
        Degree = ssb.toString();
        angle = Integer.parseInt(Degree);

        if (imageViewRotateFlag == true){
            imageView.setRotation(-angle);
            imageViewRotateFlag = false;
        } else if (editTextRotateFlag == true){
            editText.setRotation(-angle);
            editTextRotateFlag = false;
        } else if (tapeChoiceFlag1 == true){
            dragTapeView1.setRotation(-angle);
            SharedPreferences.Editor tape1r = prefDragTapeView1rotation.edit();
            tape1r.putFloat("tp1R", -angle); tape1r.apply();
            tapeChoiceFlag1 = false;
        } else if (tapeChoiceFlag2 == true){
            dragTapeView2.setRotation(-angle);
            SharedPreferences.Editor tape2r = prefDragTapeView2rotation.edit();
            tape2r.putFloat("tp2R", -angle); tape2r.apply();
            tapeChoiceFlag2 = false;
        } else if (tapeChoiceFlag3 == true){
            dragTapeView3.setRotation(-angle);
            SharedPreferences.Editor tape3r = prefDragTapeView3rotation.edit();
            tape3r.putFloat("tp3R", -angle); tape3r.apply();
            tapeChoiceFlag3 = false;
        } else if (tapeChoiceFlag4 == true){
            dragTapeView4.setRotation(-angle);
            SharedPreferences.Editor tape4r = prefDragTapeView4rotation.edit();
            tape4r.putFloat("tp4R", -angle); tape4r.apply();
            tapeChoiceFlag4 = false;
        } else if (tapeChoiceFlag5 == true){
            dragTapeView5.setRotation(-angle);
            SharedPreferences.Editor tape5r = prefDragTapeView5rotation.edit();
            tape5r.putFloat("tp5R", -angle); tape5r.apply();
            tapeChoiceFlag5 = false;
        } else if (ornamentChoiceFlag1 == true){
            dragOrnamentView1.setRotation(-angle);
            SharedPreferences.Editor ornament1r = prefDragOrnamentView1rotation.edit();
            ornament1r.putFloat("om1R", -angle); ornament1r.apply();
            ornamentChoiceFlag1 = false;
        } else if (ornamentChoiceFlag2 == true){
            dragOrnamentView2.setRotation(-angle);
            SharedPreferences.Editor ornament2r = prefDragOrnamentView2rotation.edit();
            ornament2r.putFloat("om2R", -angle); ornament2r.apply();
            ornamentChoiceFlag2 = false;
        } else if (ornamentChoiceFlag3 == true){
            dragOrnamentView3.setRotation(-angle);
            SharedPreferences.Editor ornament3r = prefDragOrnamentView3rotation.edit();
            ornament3r.putFloat("om3R", -angle); ornament3r.apply();
            ornamentChoiceFlag3 = false;
        } else if (ornamentChoiceFlag4 == true){
            dragOrnamentView4.setRotation(-angle);
            SharedPreferences.Editor ornament4r = prefDragOrnamentView4rotation.edit();
            ornament4r.putFloat("om4R", -angle); ornament4r.apply();
            ornamentChoiceFlag4 = false;
        } else if (ornamentChoiceFlag5 == true){
            dragOrnamentView5.setRotation(-angle);
            SharedPreferences.Editor ornament5r = prefDragOrnamentView5rotation.edit();
            ornament5r.putFloat("om5R", -angle); ornament5r.apply();
            ornamentChoiceFlag5 = false;
        } else if (ornamentChoiceFlag6 == true){
            dragOrnamentView6.setRotation(-angle);
            SharedPreferences.Editor ornament6r = prefDragOrnamentView6rotation.edit();
            ornament6r.putFloat("om6R", -angle); ornament6r.apply();
            ornamentChoiceFlag6 = false;
        } else if (ornamentChoiceFlag7 == true){
            dragOrnamentView7.setRotation(-angle);
            SharedPreferences.Editor ornament7r = prefDragOrnamentView7rotation.edit();
            ornament7r.putFloat("om7R", -angle); ornament7r.apply();
            ornamentChoiceFlag7 = false;
        } else if (ornamentChoiceFlag8 == true){
            dragOrnamentView8.setRotation(-angle);
            SharedPreferences.Editor ornament8r = prefDragOrnamentView8rotation.edit();
            ornament8r.putFloat("om8R", -angle); ornament8r.apply();
            ornamentChoiceFlag8 = false;
        }

        angleLinearLayout.setVisibility(View.GONE);
    }


    //背景選択画面へ

    public void background(View v) {
        Intent intentBackground = new Intent(this, BackGroundActivity.class);
        intentBackground.putExtra("iF", imageFlag);

        if (layoutNumber == 1){
            intentBackground.putExtra("M", 1);
        } else if (layoutNumber == 2){
            intentBackground.putExtra("M", 2);
        } else if (layoutNumber == 3){
            intentBackground.putExtra("M", 3);
        } else if (layoutNumber == 4){
            intentBackground.putExtra("M", 4);
        } else if (layoutNumber == 5){
            intentBackground.putExtra("M", 5);
        } else if (layoutNumber == 6){
            intentBackground.putExtra("M", 6);
        } else if (layoutNumber == 7){
            intentBackground.putExtra("M", 7);
        } else if (layoutNumber == 8){
            intentBackground.putExtra("M", 8);
        } else if (layoutNumber == 9){
            intentBackground.putExtra("M", 9);
        } else if (layoutNumber == 10){
            intentBackground.putExtra("M", 10);
        }

        startActivity(intentBackground);
    }


    // ドラッグ対象Viewとイベント処理クラスを紐付ける

    public void tape(View v){
        if (tapeFlag == false){
            tapeFlag = true;
            tapesLinearLayout.setVisibility(View.VISIBLE);
        } else if (tapeFlag == true){
            tapeFlag = false;
            tapesLinearLayout.setVisibility(View.GONE);
        }

        ornamentFlag = false;

        if (dragTapeView1.getVisibility() == View.GONE){
            tapeNumber = 0;
        } else if (dragTapeView2.getVisibility() == View.GONE){
            tapeNumber = 1;
        } else if (dragTapeView3.getVisibility() == View.GONE){
            tapeNumber = 2;
        } else if (dragTapeView4.getVisibility() == View.GONE){
            tapeNumber = 3;
        } else if (dragTapeView5.getVisibility() == View.GONE){
            tapeNumber = 4;
        }
    }

    public void tape1(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 41;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape1);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape1);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape1);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape1);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape1);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape2(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 42;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape2);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape2);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape2);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape2);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape2);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape3(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 43;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape3);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape3);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape3);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape3);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape3);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape4(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 44;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape4);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape4);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape4);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape4);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape4);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape5(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 45;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape5);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape5);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape5);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape5);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape5);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape6(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 46;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape6);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape6);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape6);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape6);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape6);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape7(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 47;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape7);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape7);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape7);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape7);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape7);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape8(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 48;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape8);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape8);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape8);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape8);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape8);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape9(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 49;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape9);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape9);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape9);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape9);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape9);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape10(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 50;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape10);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape10);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape10);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape10);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape10);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape11(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 51;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape11);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape11);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape11);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape11);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape11);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape12(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 52;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape12);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape12);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape12);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape12);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape12);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape13(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 53;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape13);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape13);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape13);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape13);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape13);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape14(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 54;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape14);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape14);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape14);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape14);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape14);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape15(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 55;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape15);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape15);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape15);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape15);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape15);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape16(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 56;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape16);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape16);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape16);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape16);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape16);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape17(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 57;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape17);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape17);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape17);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape17);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape17);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape18(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 58;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape18);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape18);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape18);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape18);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape18);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape19(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 59;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape19);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape19);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape19);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape19);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape19);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public void tape20(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = 60;

        if (tapeNumber == 1){
            dragTapeView1.setImageResource(R.drawable.tape20);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2.setImageResource(R.drawable.tape20);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3.setImageResource(R.drawable.tape20);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4.setImageResource(R.drawable.tape20);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5.setImageResource(R.drawable.tape20);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can't use more than 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }


    public void ornament(View v){
        if (ornamentFlag == false){
            ornamentFlag = true;
            choiceOrnamentLinearLayout.setVisibility(View.VISIBLE);
        } else if (ornamentFlag == true){
            ornamentFlag = false;
            choiceOrnamentLinearLayout.setVisibility(View.GONE);
        }

        tapeFlag = false;

        if (dragOrnamentView1.getVisibility() == View.GONE){
            ornamentNumber = 0;
        } else if (dragOrnamentView2.getVisibility() == View.GONE){
            ornamentNumber = 1;
        } else if (dragOrnamentView3.getVisibility() == View.GONE){
            ornamentNumber = 2;
        } else if (dragOrnamentView4.getVisibility() == View.GONE){
            ornamentNumber = 3;
        } else if (dragOrnamentView5.getVisibility() == View.GONE){
            ornamentNumber = 4;
        } else if (dragOrnamentView6.getVisibility() == View.GONE){
            ornamentNumber = 5;
        } else if (dragOrnamentView7.getVisibility() == View.GONE){
            ornamentNumber = 6;
        } else if (dragOrnamentView8.getVisibility() == View.GONE) {
            ornamentNumber = 7;
        }
    }

    public void pin(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        pinLinearLayout.setVisibility(View.VISIBLE);
    }

    public void pin1(View v){
        pinLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 61;

        if (ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.pin1);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.pin1);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.pin1);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.pin1);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.pin1);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.pin1);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.pin1);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.pin1);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void pin2(View v){
        pinLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 62;

        if (ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.pin2);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.pin2);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.pin2);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.pin2);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.pin2);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.pin2);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.pin2);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.pin2);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void pin3(View v){
        pinLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 63;

        if (ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.pin3);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.pin3);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.pin3);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.pin3);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.pin3);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.pin3);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.pin3);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.pin3);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void pin4(View v){
        pinLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 64;

        if (ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.pin4);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.pin4);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.pin4);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.pin4);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.pin4);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.pin4);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.pin4);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.pin4);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        ribbonLinearLayout.setVisibility(View.VISIBLE);
    }

    public void ribbon1(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 65;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon1);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon1);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon1);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon1);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon1);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon1);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon1);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon1);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon2(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 66;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon2);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon2);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon2);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon2);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon2);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon2);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon2);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon2);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon3(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 67;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon3);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon3);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon3);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon3);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon3);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon3);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon3);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon3);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon4(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 68;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon4);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon4);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon4);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon4);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon4);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon4);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon4);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon4);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon5(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 69;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon5);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon5);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon5);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon5);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon5);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon5);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon5);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon5);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon6(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 70;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon6);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon6);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon6);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon6);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon6);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon6);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon6);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon6);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon7(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 71;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon7);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon7);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon7);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon7);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon7);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon7);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon7);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon7);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void ribbon8(View v){
        ribbonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 72;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.ribbon8);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.ribbon8);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.ribbon8);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.ribbon8);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.ribbon8);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.ribbon8);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.ribbon8);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.ribbon8);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void button(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        buttonLinearLayout.setVisibility(View.VISIBLE);
    }

    public void button1(View v){
        buttonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 73;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.button1);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.button1);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.button1);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.button1);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.button1);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.button1);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.button1);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.button1);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void button2(View v){
        buttonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 74;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.button2);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.button2);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.button2);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.button2);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.button2);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.button2);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.button2);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.button2);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void button3(View v){
        buttonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 75;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.button3);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.button3);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.button3);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.button3);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.button3);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.button3);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.button3);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.button3);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void button4(View v){
        buttonLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 76;

        if(ornamentNumber == 1){
            dragOrnamentView1.setImageResource(R.drawable.button4);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setImageResource(R.drawable.button4);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setImageResource(R.drawable.button4);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setImageResource(R.drawable.button4);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setImageResource(R.drawable.button4);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setImageResource(R.drawable.button4);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setImageResource(R.drawable.button4);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8){
            dragOrnamentView8.setImageResource(R.drawable.button4);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8){
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        the_othersLinearLayout.setVisibility(View.VISIBLE);
    }

    public void the_others1(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 77;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others1);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others1);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others1);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others1);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others1);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others1);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others1);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others1);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others2(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 78;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others2);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others2);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others2);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others2);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others2);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others2);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others2);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others2);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others3(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 79;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others3);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others3);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others3);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others3);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others3);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others3);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others3);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others3);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others4(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 80;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others4);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others4);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others4);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others4);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others4);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others4);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others4);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others4);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others5(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 81;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others5);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others5);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others5);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others5);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others5);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others5);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others5);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others5);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others6(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 82;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others6);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others6);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others6);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others6);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others6);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others6);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others6);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others6);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others7(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 83;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others7);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others7);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others7);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others7);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others7);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others7);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others7);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others7);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others8(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 84;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others8);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others8);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others8);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others8);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others8);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others8);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others8);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others8);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others9(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 85;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others9);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others9);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others9);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others9);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others9);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others9);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others9);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others9);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others10(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 86;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others10);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others10);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others10);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others10);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others10);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others10);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others10);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others10);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others11(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 87;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others11);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others11);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others11);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others11);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others11);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others11);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others11);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others11);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others12(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 88;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others12);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others12);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others12);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others12);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others12);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others12);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others12);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others12);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others13(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 89;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others13);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others13);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others13);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others13);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others13);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others13);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others13);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others13);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others14(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 90;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others14);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others14);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others14);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others14);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others14);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others14);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others14);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others14);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others15(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 91;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others15);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others15);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others15);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others15);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others15);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others15);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others15);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others15);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }

    public void the_others16(View v) {
        the_othersLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;
        dragOrnamentDNumber = 92;

        if (ornamentNumber == 1) {
            dragOrnamentView1.setImageResource(R.drawable.the_others16);
            dragOrnamentView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView1);
            dragOrnamentView1.setOnTouchListener(listener);
        } else if (ornamentNumber == 2) {
            dragOrnamentView2.setImageResource(R.drawable.the_others16);
            dragOrnamentView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView2);
            dragOrnamentView2.setOnTouchListener(listener);
        } else if (ornamentNumber == 3) {
            dragOrnamentView3.setImageResource(R.drawable.the_others16);
            dragOrnamentView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView3);
            dragOrnamentView3.setOnTouchListener(listener);
        } else if (ornamentNumber == 4) {
            dragOrnamentView4.setImageResource(R.drawable.the_others16);
            dragOrnamentView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView4);
            dragOrnamentView4.setOnTouchListener(listener);
        } else if (ornamentNumber == 5) {
            dragOrnamentView5.setImageResource(R.drawable.the_others16);
            dragOrnamentView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView5);
            dragOrnamentView5.setOnTouchListener(listener);
        } else if (ornamentNumber == 6) {
            dragOrnamentView6.setImageResource(R.drawable.the_others16);
            dragOrnamentView6.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView6);
            dragOrnamentView6.setOnTouchListener(listener);
        } else if (ornamentNumber == 7) {
            dragOrnamentView7.setImageResource(R.drawable.the_others16);
            dragOrnamentView7.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView7);
            dragOrnamentView7.setOnTouchListener(listener);
        } else if (ornamentNumber == 8) {
            dragOrnamentView8.setImageResource(R.drawable.the_others16);
            dragOrnamentView8.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnamentView8);
            dragOrnamentView8.setOnTouchListener(listener);
        } else if (ornamentNumber > 8) {
            Toast.makeText(this, "can't use more than 8 ornaments", Toast.LENGTH_LONG).show();
        }
    }


    public class DragViewListener implements View.OnTouchListener {
        // ドラッグ対象のView
        private ImageView dragView;
        // ドラッグ中に移動量を取得するための変数
        private int oldX;
        private int oldY;

        public DragViewListener(ImageView dragView) {
            if (tapeFlag == true){
                if (tapeNumber == 1){
                    this.dragView = dragTapeView1;
                } else if (tapeNumber == 2){
                    this.dragView = dragTapeView2;
                } else if (tapeNumber == 3){
                    this.dragView = dragTapeView3;
                } else if (tapeNumber == 4){
                    this.dragView = dragTapeView4;
                } else if (tapeNumber == 5){
                    this.dragView = dragTapeView5;
                }
            } else if (ornamentFlag == true) {
                if (ornamentNumber == 1){
                    this.dragView = dragOrnamentView1;
                } else if (ornamentNumber == 2){
                    this.dragView = dragOrnamentView2;
                } else if (ornamentNumber == 3){
                    this.dragView = dragOrnamentView3;
                } else if (ornamentNumber == 4){
                    this.dragView = dragOrnamentView4;
                } else if (ornamentNumber == 5){
                    this.dragView = dragOrnamentView5;
                } else if (ornamentNumber == 6){
                    this.dragView = dragOrnamentView6;
                } else if (ornamentNumber == 7){
                    this.dragView = dragOrnamentView7;
                } else if (ornamentNumber == 8){
                    this.dragView = dragOrnamentView8;
                }
            }
        }

        @Override
        public boolean onTouch(View view, MotionEvent event) {
            // タッチしている位置取得
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            // ViewGroup.MarginLayoutParamsでキャストすることで
            // FrameLayoutの子要素であっても同様に扱える。
            final ViewGroup.MarginLayoutParams param = (ViewGroup.MarginLayoutParams)dragView.getLayoutParams();

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    // 今回イベントでのView移動先の位置
                    param.leftMargin = dragView.getLeft() + (x - oldX);
                    param.topMargin = dragView.getTop() + (y - oldY);
                    // Viewを移動する
                    if (tapeFlag == true){
                        if (tapeNumber == 1){
                            dragTapeView1.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            tapeChoiceFlag1 = true;
                        } else if (tapeNumber == 2){
                            dragTapeView2.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            tapeChoiceFlag2 = true;
                        } else if (tapeNumber == 3){
                            dragTapeView3.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            tapeChoiceFlag3 = true;
                        } else if (tapeNumber == 4){
                            dragTapeView4.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            tapeChoiceFlag4 = true;
                        } else if (tapeNumber == 5){
                            dragTapeView5.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            tapeChoiceFlag5 = true;
                        }
                    } else if (ornamentFlag == true){
                        if (ornamentNumber == 1){
                            dragOrnamentView1.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag1 = true;
                        } else if (ornamentNumber == 2){
                            dragOrnamentView2.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag2 = true;
                        } else if (ornamentNumber == 3){
                            dragOrnamentView3.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag3 = true;
                        } else if (ornamentNumber == 4){
                            dragOrnamentView4.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag4 = true;
                        } else if (ornamentNumber == 5){
                            dragOrnamentView5.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag5 = true;
                        } else if (ornamentNumber == 6){
                            dragOrnamentView6.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag6 = true;
                        } else if (ornamentNumber == 7){
                            dragOrnamentView7.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag7 = true;
                        } else if (ornamentNumber == 8){
                            dragOrnamentView8.layout(param.leftMargin, param.topMargin,
                                    param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                            ornamentChoiceFlag8 = true;
                        }
                    }

                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);

            // 今回のタッチ位置を保持
            oldX = x;
            oldY = y;

            // イベント処理完了
            return true;
        }
    }


    public void yes(View v){
        dragViewCheckLinearLayout.setVisibility(View.GONE);
        dragViewChoiceLinearLayout.setVisibility(View.VISIBLE);

        if(tapeNumber == 1){
            //dragTapeView1の位置を保存
            float dragTapeView1x = dragTapeView1.getX();
            float dragTapeView1y = dragTapeView1.getY();
            SharedPreferences.Editor tape1x = prefDragTapeView1x.edit();
            SharedPreferences.Editor tape1y = prefDragTapeView1y.edit();
            tape1x.putFloat("tp1x", dragTapeView1x); tape1x.apply();
            tape1y.putFloat("tp1y", dragTapeView1y); tape1y.apply();

            //dragTapeView1の画像を保存
            editorDTV1DNumber = prefDTV1Number.edit();
            editorDTV1DNumber.putInt("tp1DN", dragTapeDNumber);
            editorDTV1DNumber.apply();

            //dragTapeView1の角度を保存
            float dragTapeView1rotation = dragTapeView1.getRotation();
            SharedPreferences.Editor tape1r = prefDragTapeView1rotation.edit();
            tape1r.putFloat("tp1R", dragTapeView1rotation); tape1r.apply();

            dragTapeView1.setOnTouchListener(dragTapeTouch1);

        } else if (tapeNumber == 2){
            //dragTapeView2の位置を保存
            float dragTapeView2x = dragTapeView2.getX();
            float dragTapeView2y = dragTapeView2.getY();
            SharedPreferences.Editor tape2x = prefDragTapeView2x.edit();
            SharedPreferences.Editor tape2y = prefDragTapeView2y.edit();
            tape2x.putFloat("tp2x", dragTapeView2x); tape2x.apply();
            tape2y.putFloat("tp2y", dragTapeView2y); tape2y.apply();

            //dragTapeView2の画像を保存
            editorDTV2DNumber = prefDTV2Number.edit();
            editorDTV2DNumber.putInt("tp2DN", dragTapeDNumber);
            editorDTV2DNumber.apply();

            //dragTapeView2の角度を保存
            float dragTapeView2rotation = dragTapeView2.getRotation();
            SharedPreferences.Editor tape2r = prefDragTapeView2rotation.edit();
            tape2r.putFloat("tp2R", dragTapeView2rotation); tape2r.apply();

            dragTapeView2.setOnTouchListener(dragTapeTouch2);

        } else if (tapeNumber == 3){
            //dragTapeView3の位置を保存
            float dragTapeView3x = dragTapeView3.getX();
            float dragTapeView3y = dragTapeView3.getY();
            SharedPreferences.Editor tape3x = prefDragTapeView3x.edit();
            SharedPreferences.Editor tape3y = prefDragTapeView3y.edit();
            tape3x.putFloat("tp3x", dragTapeView3x); tape3x.apply();
            tape3y.putFloat("tp3y", dragTapeView3y); tape3y.apply();

            //dragTapeView3の画像を保存
            editorDTV3DNumber = prefDTV3Number.edit();
            editorDTV3DNumber.putInt("tp3DN", dragTapeDNumber);
            editorDTV3DNumber.apply();

            //dragTapeView3の角度を保存
            float dragTapeView3rotation = dragTapeView3.getRotation();
            SharedPreferences.Editor tape3r = prefDragTapeView3rotation.edit();
            tape3r.putFloat("tp3R", dragTapeView3rotation); tape3r.apply();

            dragTapeView3.setOnTouchListener(dragTapeTouch3);

        } else if (tapeNumber == 4){
            //dragTapeView4の位置を保存
            float dragTapeView4x = dragTapeView4.getX();
            float dragTapeView4y = dragTapeView4.getY();
            SharedPreferences.Editor tape4x = prefDragTapeView4x.edit();
            SharedPreferences.Editor tape4y = prefDragTapeView4y.edit();
            tape4x.putFloat("tp4x", dragTapeView4x); tape4x.apply();
            tape4y.putFloat("tp4y", dragTapeView4y); tape4y.apply();

            //dragTapeView4の画像を保存
            editorDTV4DNumber = prefDTV4Number.edit();
            editorDTV4DNumber.putInt("tp4DN", dragTapeDNumber);
            editorDTV4DNumber.apply();

            //dragTapeView4の角度を保存
            float dragTapeView4rotation = dragTapeView4.getRotation();
            SharedPreferences.Editor tape4r = prefDragTapeView4rotation.edit();
            tape4r.putFloat("tp4R", dragTapeView4rotation); tape4r.apply();

            dragTapeView4.setOnTouchListener(dragTapeTouch4);

        } else if (tapeNumber == 5){
            //dragTapeView5の位置を保存
            float dragTapeView5x = dragTapeView5.getX();
            float dragTapeView5y = dragTapeView5.getY();
            SharedPreferences.Editor tape5x = prefDragTapeView5x.edit();
            SharedPreferences.Editor tape5y = prefDragTapeView5y.edit();
            tape5x.putFloat("tp5x", dragTapeView5x); tape5x.apply();
            tape5y.putFloat("tp5y", dragTapeView5y); tape5y.apply();

            //dragTapeView5の画像を保存
            editorDTV5DNumber = prefDTV5Number.edit();
            editorDTV5DNumber.putInt("tp5DN", dragTapeDNumber);
            editorDTV5DNumber.apply();

            //dragTapeView5の角度を保存
            float dragTapeView5rotation = dragTapeView5.getRotation();
            SharedPreferences.Editor tape5r = prefDragTapeView5rotation.edit();
            tape5r.putFloat("tp5R", dragTapeView5rotation); tape5r.apply();

            dragTapeView5.setOnTouchListener(dragTapeTouch5);

        } else if (ornamentNumber == 1){
            //dragOrnamentView1の位置を保存
            float dragOrnamentView1x = dragOrnamentView1.getX();
            float dragOrnamentView1y = dragOrnamentView1.getY();
            SharedPreferences.Editor ornament1x = prefDragOrnamentView1x.edit();
            SharedPreferences.Editor ornament1y = prefDragOrnamentView1y.edit();
            ornament1x.putFloat("om1x", dragOrnamentView1x); ornament1x.apply();
            ornament1y.putFloat("om1y", dragOrnamentView1y); ornament1y.apply();

            //dragTapeView1の画像を保存
            editorDOV1DNumber = prefDOV1Number.edit();
            editorDOV1DNumber.putInt("om1DN", dragOrnamentDNumber);
            editorDOV1DNumber.apply();

            //dragTapeView1の角度を保存
            float dragOrnamentView1rotation = dragOrnamentView1.getRotation();
            SharedPreferences.Editor ornament1r = prefDragOrnamentView1rotation.edit();
            ornament1r.putFloat("om1R", dragOrnamentView1rotation); ornament1r.apply();

            dragOrnamentView1.setOnTouchListener(dragOrnamentTouch1);

        } else if (ornamentNumber == 2){
            //dragOrnamentView2の位置を保存
            float dragOrnamentView2x = dragOrnamentView2.getX();
            float dragOrnamentView2y = dragOrnamentView2.getY();
            SharedPreferences.Editor ornament2x = prefDragOrnamentView2x.edit();
            SharedPreferences.Editor ornament2y = prefDragOrnamentView2y.edit();
            ornament2x.putFloat("om2x", dragOrnamentView2x); ornament2x.apply();
            ornament2y.putFloat("om2y", dragOrnamentView2y); ornament2y.apply();

            //dragTapeView2の画像を保存
            editorDOV2DNumber = prefDOV2Number.edit();
            editorDOV2DNumber.putInt("om2DN", dragOrnamentDNumber);
            editorDOV2DNumber.apply();

            //dragTapeView2の角度を保存
            float dragOrnamentView2rotation = dragOrnamentView2.getRotation();
            SharedPreferences.Editor ornament2r = prefDragOrnamentView2rotation.edit();
            ornament2r.putFloat("om2R", dragOrnamentView2rotation); ornament2r.apply();

            dragOrnamentView2.setOnTouchListener(dragOrnamentTouch2);

        } else if (ornamentNumber == 3){
            //dragOrnamentView3の位置を保存
            float dragOrnamentView3x = dragOrnamentView3.getX();
            float dragOrnamentView3y = dragOrnamentView3.getY();
            SharedPreferences.Editor ornament3x = prefDragOrnamentView3x.edit();
            SharedPreferences.Editor ornament3y = prefDragOrnamentView3y.edit();
            ornament3x.putFloat("om3x", dragOrnamentView3x); ornament3x.apply();
            ornament3y.putFloat("om3y", dragOrnamentView3y); ornament3y.apply();

            //dragTapeView3の画像を保存
            editorDOV3DNumber = prefDOV3Number.edit();
            editorDOV3DNumber.putInt("om3DN", dragOrnamentDNumber);
            editorDOV3DNumber.apply();

            //dragTapeView3の角度を保存
            float dragOrnamentView3rotation = dragOrnamentView3.getRotation();
            SharedPreferences.Editor ornament3r = prefDragOrnamentView3rotation.edit();
            ornament3r.putFloat("om3R", dragOrnamentView3rotation); ornament3r.apply();

            dragOrnamentView3.setOnTouchListener(dragOrnamentTouch3);

        } else if (ornamentNumber == 4){
            //dragOrnamentView4の位置を保存
            float dragOrnamentView4x = dragOrnamentView4.getX();
            float dragOrnamentView4y = dragOrnamentView4.getY();
            SharedPreferences.Editor ornament4x = prefDragOrnamentView4x.edit();
            SharedPreferences.Editor ornament4y = prefDragOrnamentView4y.edit();
            ornament4x.putFloat("om4x", dragOrnamentView4x); ornament4x.apply();
            ornament4y.putFloat("om4y", dragOrnamentView4y); ornament4y.apply();

            //dragTapeView4の画像を保存
            editorDOV4DNumber = prefDOV4Number.edit();
            editorDOV4DNumber.putInt("om4DN", dragOrnamentDNumber);
            editorDOV4DNumber.apply();

            //dragTapeView4の角度を保存
            float dragOrnamentView4rotation = dragOrnamentView4.getRotation();
            SharedPreferences.Editor ornament4r = prefDragOrnamentView4rotation.edit();
            ornament4r.putFloat("om4R", dragOrnamentView4rotation); ornament4r.apply();

            dragOrnamentView4.setOnTouchListener(dragOrnamentTouch4);

        } else if (ornamentNumber == 5){
            //dragOrnamentView5の位置を保存
            float dragOrnamentView5x = dragOrnamentView5.getX();
            float dragOrnamentView5y = dragOrnamentView5.getY();
            SharedPreferences.Editor ornament5x = prefDragOrnamentView5x.edit();
            SharedPreferences.Editor ornament5y = prefDragOrnamentView5y.edit();
            ornament5x.putFloat("om5x", dragOrnamentView5x); ornament5x.apply();
            ornament5y.putFloat("om5y", dragOrnamentView5y); ornament5y.apply();

            //dragTapeView5の画像を保存
            editorDOV5DNumber = prefDOV5Number.edit();
            editorDOV5DNumber.putInt("om5DN", dragOrnamentDNumber);
            editorDOV5DNumber.apply();

            //dragTapeView5の角度を保存
            float dragOrnamentView5rotation = dragOrnamentView5.getRotation();
            SharedPreferences.Editor ornament5r = prefDragOrnamentView5rotation.edit();
            ornament5r.putFloat("om5R", dragOrnamentView5rotation); ornament5r.apply();

            dragOrnamentView5.setOnTouchListener(dragOrnamentTouch5);

        } else if (ornamentNumber == 6){
            //dragOrnamentView6の位置を保存
            float dragOrnamentView6x = dragOrnamentView6.getX();
            float dragOrnamentView6y = dragOrnamentView6.getY();
            SharedPreferences.Editor ornament6x = prefDragOrnamentView6x.edit();
            SharedPreferences.Editor ornament6y = prefDragOrnamentView6y.edit();
            ornament6x.putFloat("om6x", dragOrnamentView6x); ornament6x.apply();
            ornament6y.putFloat("om6y", dragOrnamentView6y); ornament6y.apply();

            //dragTapeView6の画像を保存
            editorDOV6DNumber = prefDOV6Number.edit();
            editorDOV6DNumber.putInt("om6DN", dragOrnamentDNumber);
            editorDOV6DNumber.apply();

            //dragTapeView6の角度を保存
            float dragOrnamentView6rotation = dragOrnamentView6.getRotation();
            SharedPreferences.Editor ornament6r = prefDragOrnamentView6rotation.edit();
            ornament6r.putFloat("om6R", dragOrnamentView6rotation); ornament6r.apply();

            dragOrnamentView6.setOnTouchListener(dragOrnamentTouch6);

        } else if (ornamentNumber == 7){
            //dragOrnamentView7の位置を保存
            float dragOrnamentView7x = dragOrnamentView7.getX();
            float dragOrnamentView7y = dragOrnamentView7.getY();
            SharedPreferences.Editor ornament7x = prefDragOrnamentView7x.edit();
            SharedPreferences.Editor ornament7y = prefDragOrnamentView7y.edit();
            ornament7x.putFloat("om7x", dragOrnamentView7x); ornament7x.apply();
            ornament7y.putFloat("om7y", dragOrnamentView7y); ornament7y.apply();

            //dragTapeView7の画像を保存
            editorDOV7DNumber = prefDOV7Number.edit();
            editorDOV7DNumber.putInt("om7DN", dragOrnamentDNumber);
            editorDOV7DNumber.apply();

            //dragTapeView7の角度を保存
            float dragOrnamentView7rotation = dragOrnamentView7.getRotation();
            SharedPreferences.Editor ornament7r = prefDragOrnamentView7rotation.edit();
            ornament7r.putFloat("om7R", dragOrnamentView7rotation); ornament7r.apply();

            dragOrnamentView7.setOnTouchListener(dragOrnamentTouch7);

        } else if (ornamentNumber == 8){
            //dragOrnamentView8の位置を保存
            float dragOrnamentView8x = dragOrnamentView8.getX();
            float dragOrnamentView8y = dragOrnamentView8.getY();
            SharedPreferences.Editor ornament8x = prefDragOrnamentView8x.edit();
            SharedPreferences.Editor ornament8y = prefDragOrnamentView8y.edit();
            ornament8x.putFloat("om8x", dragOrnamentView8x); ornament8x.apply();
            ornament8y.putFloat("om8y", dragOrnamentView8y); ornament8y.apply();

            //dragTapeView8の画像を保存
            editorDOV8DNumber = prefDOV8Number.edit();
            editorDOV8DNumber.putInt("om8DN", dragOrnamentDNumber);
            editorDOV8DNumber.apply();

            //dragTapeView8の角度を保存
            float dragOrnamentView8rotation = dragOrnamentView8.getRotation();
            SharedPreferences.Editor ornament8r = prefDragOrnamentView8rotation.edit();
            ornament8r.putFloat("om8R", dragOrnamentView8rotation); ornament8r.apply();

            dragOrnamentView8.setOnTouchListener(dragOrnamentTouch8);

        }

        tapeFlag = false;
        ornamentFlag = false;
    }

    public void no(View v){
        dragViewCheckLinearLayout.setVisibility(View.GONE);
    }

    public void rotate(View v){
        dragViewChoiceLinearLayout.setVisibility(View.GONE);
        angleLinearLayout.setVisibility(View.VISIBLE);
        rotationEditText.setText("");
    }

    public void delete(View v){
        dragViewChoiceLinearLayout.setVisibility(View.GONE);
        if(tapeChoiceFlag1 == true){
            dragTapeView1.setVisibility(View.GONE);
            tapeChoiceFlag1 = false;
        } else if (tapeChoiceFlag2 == true){
            dragTapeView2.setVisibility(View.GONE);
            tapeChoiceFlag2 = false;
        } else if (tapeChoiceFlag3 == true){
            dragTapeView3.setVisibility(View.GONE);
            tapeChoiceFlag3 = false;
        } else if (tapeChoiceFlag4 == true){
            dragTapeView4.setVisibility(View.GONE);
            tapeChoiceFlag4 = false;
        } else if (tapeChoiceFlag5 == true){
            dragTapeView5.setVisibility(View.GONE);
            tapeChoiceFlag5 = false;
        } else if (ornamentChoiceFlag1 == true){
            dragOrnamentView1.setVisibility(View.GONE);
            ornamentChoiceFlag1 = false;
        } else if (ornamentChoiceFlag2 == true){
            dragOrnamentView2.setVisibility(View.GONE);
            ornamentChoiceFlag2 = false;
        } else if (ornamentChoiceFlag3 == true){
            dragOrnamentView3.setVisibility(View.GONE);
            ornamentChoiceFlag3 = false;
        } else if (ornamentChoiceFlag4 == true){
            dragOrnamentView4.setVisibility(View.GONE);
            ornamentChoiceFlag4 = false;
        } else if (ornamentChoiceFlag5 == true){
            dragOrnamentView5.setVisibility(View.GONE);
            ornamentChoiceFlag5 = false;
        } else if (ornamentChoiceFlag6 == true){
            dragOrnamentView6.setVisibility(View.GONE);
            ornamentChoiceFlag6 = false;
        } else if (ornamentChoiceFlag7 == true){
            dragOrnamentView7.setVisibility(View.GONE);
            ornamentChoiceFlag7 = false;
        } else if (ornamentChoiceFlag8 == true){
            dragOrnamentView8.setVisibility(View.GONE);
            ornamentChoiceFlag8 = false;
        }
    }

    public void not(View v){
        dragViewChoiceLinearLayout.setVisibility(View.GONE);
        tapeChoiceFlag1 = false;
        tapeChoiceFlag2 = false;
        tapeChoiceFlag3 = false;
        tapeChoiceFlag4 = false;
        tapeChoiceFlag5 = false;
        ornamentChoiceFlag1 = false;
        ornamentChoiceFlag2 = false;
        ornamentChoiceFlag3 = false;
        ornamentChoiceFlag4 = false;
        ornamentChoiceFlag5 = false;
        ornamentChoiceFlag6 = false;
        ornamentChoiceFlag7 = false;
        ornamentChoiceFlag8 = false;
    }

    public void save(View v){

    }

    public void test(View v) {
        //imageViewのrotation
        float imageViewRotation = imageView.getRotation();
        SharedPreferences.Editor editorImageViewRotation = preferencesImageViewRotation.edit();
        editorImageViewRotation.putFloat("Rotation", imageViewRotation);
        editorImageViewRotation.apply();

        //imageViewのframe

        //editTextのmemo
        String memoText = editText.getText().toString();
        SharedPreferences.Editor editorMemo = preferencesMemo.edit();
        editorMemo.putString("memo", memoText);
        editorMemo.apply();

        //editTextのrotation

        //editTextの背景

        Toast.makeText(this, "finish save", Toast.LENGTH_LONG).show();

        finish();
        //Intent intentSave = new Intent(this, SaveActivity.class);
        //startActivity(intentSave);


    }


    private View.OnTouchListener dragTapeTouch1 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 140;
            y = y - 230;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    Log.d("dragTape1", "true");
                    dragTapeView1.setX(x);
                    dragTapeView1.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            tapeChoiceFlag1 = true;

            return true;
        }
    };

    private View.OnTouchListener dragTapeTouch2 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 140;
            y = y - 230;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragTapeView2.setX(x);
                    dragTapeView2.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            tapeChoiceFlag2 = true;

            return true;
        }
    };

    private View.OnTouchListener dragTapeTouch3 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 140;
            y = y - 230;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragTapeView3.setX(x);
                    dragTapeView3.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            tapeChoiceFlag3 = true;

            return true;
        }
    };

    private View.OnTouchListener dragTapeTouch4 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 140;
            y = y - 230;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragTapeView4.setX(x);
                    dragTapeView4.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            tapeChoiceFlag4 = true;

            return true;
        }
    };

    private View.OnTouchListener dragTapeTouch5 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 140;
            y = y - 230;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragTapeView5.setX(x);
                    dragTapeView5.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            tapeChoiceFlag5 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch1 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            Log.d("OnTouchのところ", "完了");

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView1.setX(x);
                    dragOrnamentView1.setY(y);
                    Log.d("ActionMoveのところ", "完了");
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag1 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch2 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView2.setX(x);
                    dragOrnamentView2.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag2 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch3 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView3.setX(x);
                    dragOrnamentView3.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag3 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch4 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView4.setX(x);
                    dragOrnamentView4.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag4 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch5 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView5.setX(x);
                    dragOrnamentView5.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag5 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch6 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView6.setX(x);
                    dragOrnamentView6.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag6 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch7 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView7.setX(x);
                    dragOrnamentView7.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag7 = true;

            return true;
        }
    };

    private View.OnTouchListener dragOrnamentTouch8 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView8.setX(x);
                    dragOrnamentView8.setY(y);
                    break;
            }

            dragViewCheckLinearLayout.setVisibility(View.VISIBLE);
            ornamentChoiceFlag8 = true;

            return true;
        }
    };

    //ByteArrayOutputStream:String型のデータを保存できるbyte配列の変数
    //output:出力（入力を受けた機械が仕事として外部に送るデータ（エネルギーや信号、情報）
    //input:入力（外部から機械にデータ（エネルギーや信号、情報など）を供給すること（例:ボタンを押す））
    //inputStream,outputStreamは大まかに言うと入出力の可能範囲を広げたもの
    //（→どんなデータ（エネルギーでも信号でも情報でも）でも入出力可能にしている）
    //※streamは「流れ」という意味（様々なデータを同じものになるまで分解して流してそして再構築していく感じ）
    //                                    ↑人や物も原子単位まで分解したら同じですよ～　ってやつ
    //byte型:bitmapを配列にできる変数の一つ
    //           .compress(Bitmap.compressFormat.ほにゃらら, 　int quality　, ByteArrayOutputStream型の変数)
    //pngなのかjpegなのかみたいな…（ようは画像の型）↑       　　　↑
    // 圧縮率:画像のデータ容量 (ファイルサイズともいう) を小さくすること
    //Base64:64進数（ここでは、すべてのデータをアルファベット(a~z, A~Z)と数字(0~9)、一部の記号(+,/)の64文字で表す
    // 　　　　　　　エンコード方式のことを指す）　
    //encode:（暗号などに）書き直すこと　→ここではString型に書き直す
    //Base64.DEFAULT:初期値からBase64にされていることを表すもの（flagに近い）

    //gitHub
    //VCSのCommitChangesでコメントを書いてCommit, Commitしたら再びVCSのGitHubのPush

    //valuesのdimens.xml見てみて

    //フレーム機能設定
    //画鋲をおけるようにする
    //背景の画像(その他とか…　ちょっと再検討して)
    //影がつけられるようにする
    //editTextに背景つけられるように
    //画鋲やボタンの画像集め
    //画鋲やボタンおくときのパレットつくらんと
    //Dailyに写真をのせて、そのあとギャラリーから移した写真を消してもきちんとDailyでは保存できてるようにする
    //（→アルバム整理みたいなのに役に立てるように！！）
    //（→追記　bitmapにしてるので後で消しても大丈夫っぽい）
    //レイアウト選ぶところからmakeに飛ぶときに、背景選択画面みたいに配列つくってmakeは1つにしてhtmlだけ変えればいい！　アイデアbyゴディバ
    //エミュレータのDeveloper Optionsのshow layout boundsでレイアウトの細かいのみれるよ‼
    //スマホだと画像の比は3:4か1:1
}


