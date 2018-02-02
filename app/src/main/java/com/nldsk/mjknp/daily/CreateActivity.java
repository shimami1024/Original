package com.nldsk.mjknp.daily;

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
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Calendar;


public class CreateActivity extends AppCompatActivity {

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

    FrameLayout relativeLayout;

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
    SharedPreferences preferencesEditTextRotation;

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

    SharedPreferences tapeN;

    SharedPreferences ornamentN;

    LinearLayout choiceManageLinearLayout;
    Boolean manageFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_make);

        imageView = (ImageView)findViewById(R.id.imageView);
        //imageView1 = (ImageView)findViewById(R.id.imageView1);
        //imageView2 = (ImageView)findViewById(R.id.imageView2);
        //imageView3 = (ImageView)findViewById(R.id.imageView3);

        editText = (EditText)findViewById(R.id.editText);
        //editText1 = (EditText)findViewById(R.id.editText1);
        //editText2 = (EditText)findViewById(R.id.editText2);
        //editText3 = (EditText)findViewById(R.id.editText3);

        relativeLayout = (FrameLayout)findViewById(R.id.relativeLayout);

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
        preferencesBackground = getSharedPreferences("pref_bg", MODE_PRIVATE);
        preferencesPhoto = getSharedPreferences("pref_img", MODE_PRIVATE);
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

        tapeN = getSharedPreferences("pref_tape_number", MODE_PRIVATE);

        ornamentN = getSharedPreferences("pref_ornament_number", MODE_PRIVATE);


        choiceManageLinearLayout = (LinearLayout)findViewById(R.id.choiceManageLayout);
        manageFlag = false;

        Intent intentMake = getIntent();
        boolean makeFlag = intentMake.getBooleanExtra("MAKE", false);
        imageFlag = intentMake.getBooleanExtra("imageFlag", false);

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

        if (makeFlag == true){
            //backgroundは灰色、imageViewは白に
            relativeLayout.setBackgroundColor(Color.parseColor("#565656"));
            imageView.setBackgroundColor(Color.parseColor("#ffffff"));

            tapeNumber = 0;
            ornamentNumber = 0;

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

            tapeNumber = tapeN.getInt("prefTapeN", 0);

            int tapes[] ={
                    R.drawable.tape1,  R.drawable.tape2,  R.drawable.tape3,  R.drawable.tape4,
                    R.drawable.tape5,  R.drawable.tape6,  R.drawable.tape7,  R.drawable.tape8,
                    R.drawable.tape9,  R.drawable.tape10, R.drawable.tape11, R.drawable.tape12,
                    R.drawable.tape13, R.drawable.tape14, R.drawable.tape15, R.drawable.tape16,
                    R.drawable.tape17, R.drawable.tape18, R.drawable.tape19, R.drawable.tape20,
            };


            //dragTapeView1をセット
            dragTapeDNumber = prefDTV1Number.getInt("tp1DN", 0);
            if(dragTapeDNumber == 0){

            } else {
                //位置
                dragTapeView1.setX(prefDragTapeView1x.getFloat("tp1x", 0));
                dragTapeView1.setY(prefDragTapeView1y.getFloat("tp1y", 0));
                //画像
                dragTapeView1.setBackgroundResource(tapes[dragTapeDNumber-41]);
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
                dragTapeView2.setBackgroundResource(tapes[dragTapeDNumber-41]);
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
                dragTapeView3.setBackgroundResource(tapes[dragTapeDNumber-41]);
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
                dragTapeView4.setBackgroundResource(tapes[dragTapeDNumber-41]);
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
                dragTapeView5.setBackgroundResource(tapes[dragTapeDNumber-41]);
                //角度
                dragTapeView5.setRotation(prefDragTapeView5rotation.getFloat("tp5R", 0));

                dragTapeView5.setOnTouchListener(dragTapeTouch5);
            }

            ornamentNumber = ornamentN.getInt("prefOrnamentN", 0);

            //dragOrnamentView1をセット
            dragOrnamentDNumber = prefDOV1Number.getInt("om1DN", 0);

            int ornaments[] ={
                    R.drawable.pin1,         R.drawable.pin2,         R.drawable.pin3,             R.drawable.pin4,
                    R.drawable.ribbon1,      R.drawable.ribbon2,      R.drawable.ribbon3,     R.drawable.ribbon4,
                    R.drawable.ribbon5,      R.drawable.ribbon6,      R.drawable.ribbon7,     R.drawable.ribbon8,
                    R.drawable.button1,      R.drawable.button2,      R.drawable.button3,     R.drawable.button4,
                    R.drawable.the_others1,  R.drawable.the_others2, R.drawable.the_others3, R.drawable.the_others4,
                    R.drawable.the_others5,  R.drawable.the_others6, R.drawable.the_others7, R.drawable.the_others8,
                    R.drawable.the_others9,  R.drawable.the_others10, R.drawable.the_others11, R.drawable.the_others12,
                    R.drawable.the_others13, R.drawable.the_others14, R.drawable.the_others15, R.drawable.the_others16,
            };

            dragOrnamentView1.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);

            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView1.setX(prefDragOrnamentView1x.getFloat("om1x", 0));
                dragOrnamentView1.setY(prefDragOrnamentView1y.getFloat("om1y", 0));
                //画像
                dragOrnamentView1.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView1.setRotation(prefDragOrnamentView1rotation.getFloat("om1R", 0));

                dragOrnamentView1.setOnTouchListener(dragOrnamentTouch1);
            }

            //dragOrnamentView2をセット
            dragOrnamentDNumber = prefDOV2Number.getInt("om2DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView2.setX(prefDragOrnamentView2x.getFloat("om2x", 0));
                dragOrnamentView2.setY(prefDragOrnamentView2y.getFloat("om2y", 0));
                //画像
                dragOrnamentView2.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView2.setRotation(prefDragOrnamentView2rotation.getFloat("om2R", 0));

                dragOrnamentView2.setOnTouchListener(dragOrnamentTouch2);
            }

            //dragOrnamentView3をセット
            dragOrnamentDNumber = prefDOV3Number.getInt("om3DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView3.setX(prefDragOrnamentView3x.getFloat("om3x", 0));
                dragOrnamentView3.setY(prefDragOrnamentView3y.getFloat("om3y", 0));
                //画像
                dragOrnamentView3.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView3.setRotation(prefDragOrnamentView3rotation.getFloat("om3R", 0));

                dragOrnamentView3.setOnTouchListener(dragOrnamentTouch3);
            }

            //dragOrnamentView4をセット
            dragOrnamentDNumber = prefDOV4Number.getInt("om4DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView4.setX(prefDragOrnamentView4x.getFloat("om4x", 0));
                dragOrnamentView4.setY(prefDragOrnamentView4y.getFloat("om4y", 0));
                //画像
                dragOrnamentView4.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView4.setRotation(prefDragOrnamentView4rotation.getFloat("om4R", 0));

                dragOrnamentView4.setOnTouchListener(dragOrnamentTouch4);
            }

            //dragOrnamentView5をセット
            dragOrnamentDNumber = prefDOV5Number.getInt("om5DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView5.setX(prefDragOrnamentView5x.getFloat("om5x", 0));
                dragOrnamentView5.setY(prefDragOrnamentView5y.getFloat("om5y", 0));
                //画像
                dragOrnamentView5.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView5.setRotation(prefDragOrnamentView5rotation.getFloat("om5R", 0));

                dragOrnamentView5.setOnTouchListener(dragOrnamentTouch5);
            }

            //dragOrnamentView6をセット
            dragOrnamentDNumber = prefDOV6Number.getInt("om6DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView6.setX(prefDragOrnamentView6x.getFloat("om6x", 0));
                dragOrnamentView6.setY(prefDragOrnamentView6y.getFloat("om6y", 0));
                //画像
                dragOrnamentView6.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView6.setRotation(prefDragOrnamentView6rotation.getFloat("om6R", 0));

                dragOrnamentView6.setOnTouchListener(dragOrnamentTouch6);
            }

            //dragOrnamentView7をセット
            dragOrnamentDNumber = prefDOV7Number.getInt("om7DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView7.setX(prefDragOrnamentView7x.getFloat("om7x", 0));
                dragOrnamentView7.setY(prefDragOrnamentView7y.getFloat("om7y", 0));
                //画像
                dragOrnamentView7.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView7.setRotation(prefDragOrnamentView7rotation.getFloat("om7R", 0));

                dragOrnamentView7.setOnTouchListener(dragOrnamentTouch7);
            }

            //dragOrnamentView8をセット
            dragOrnamentDNumber = prefDOV8Number.getInt("om8DN", 0);
            if(dragOrnamentDNumber == 0){

            } else {
                //位置
                dragOrnamentView8.setX(prefDragOrnamentView8x.getFloat("om8x", 0));
                dragOrnamentView8.setY(prefDragOrnamentView8y.getFloat("om8y", 0));
                //画像
                dragOrnamentView8.setBackgroundResource(ornaments[dragOrnamentDNumber-61]);
                //角度
                dragOrnamentView8.setRotation(prefDragOrnamentView8rotation.getFloat("om8R", 0));

                dragOrnamentView8.setOnTouchListener(dragOrnamentTouch8);
            }

            backgroundNumber = preferencesBackground.getInt("background", 0);

            relativeLayout.setBackgroundResource(backgrounds[backgroundNumber-1]);
        }


        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        //角度設定に用いる部品と変数の関連付け
        angleLinearLayout = (LinearLayout)findViewById(R.id.angleLinearLayout);
        rotationEditText = (EditText)findViewById(R.id.rotationEditText);
        directionRightButton = (Button)findViewById(R.id.directionRightButton);
        directionLeftButton = (Button)findViewById(R.id.directionLeftButton);


        tapesLinearLayout = (LinearLayout)findViewById(R.id.tapesLinearLayout);
        tapeButton = (ImageButton)findViewById(R.id.tapeButton);

        ornamentsLinearLayout = (LinearLayout)findViewById(R.id.ornamentsLinearLayout);
        ornamentButton = (ImageButton)findViewById(R.id.ornamentButton);
        choiceOrnamentLinearLayout = (LinearLayout)findViewById(R.id.choiceOrnamentsLinearLayout);
        eachOrnamentsLinearLayout = (LinearLayout)findViewById(R.id.eachOrnamentsLinearLayout);
        pinLinearLayout = (LinearLayout)findViewById(R.id.pinLinearLayout);
        ribbonLinearLayout = (LinearLayout)findViewById(R.id.ribbonLinearLayout);
        buttonLinearLayout = (LinearLayout)findViewById(R.id.buttonLinearLayout);
        the_othersLinearLayout = (LinearLayout)findViewById(R.id.the_othersLinearLayout);

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
            relativeLayout.setBackgroundResource(backgrounds[backgroundNumber-1]);

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

            angleLinearLayout.setVisibility(View.VISIBLE);
            rotationEditText.setText("");

            imageViewRotateFlag = true;


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

            angleLinearLayout.setVisibility(View.VISIBLE);
            rotationEditText.setText("");

            editTextRotateFlag = true;


            //このままだとonLongClickも反応してしまうのでonClickが反応しないようにflag = trueにしておく
            flag = true;
            //onLongClickではflagの真偽値は関係ない

            return false;
            //onLongClickが無効になる(もうbooleanは長押しと判断してない)
            //flagの値も無効になる（nullにもどる）
        }
    };

    public boolean setRightAngle(Boolean flag, View view, SharedPreferences pref, String key){
        if (flag == true){
            view.setRotation(angle);
            SharedPreferences.Editor editorPref = pref.edit();
            editorPref.putFloat(key, angle);
            editorPref.apply();

            flag = false;
        }

        return false;
    }

    public void right(View v){
        ssb = (SpannableStringBuilder)rotationEditText.getText();
        Degree = ssb.toString();
        angle = Integer.parseInt(Degree);

        setRightAngle(imageViewRotateFlag, imageView, preferencesImageViewRotation, "iRotation");
        setRightAngle(editTextRotateFlag, editText, preferencesEditTextRotation, "eRotation");
        setRightAngle(tapeChoiceFlag1, dragTapeView1, prefDragTapeView1rotation, "tp1R");
        setRightAngle(tapeChoiceFlag2, dragTapeView2, prefDragTapeView2rotation, "tp2R");
        setRightAngle(tapeChoiceFlag3, dragTapeView3, prefDragTapeView3rotation, "tp3R");
        setRightAngle(tapeChoiceFlag4, dragTapeView4, prefDragTapeView4rotation, "tp4R");
        setRightAngle(tapeChoiceFlag5, dragTapeView5, prefDragTapeView5rotation, "tp5R");
        setRightAngle(ornamentChoiceFlag1, dragOrnamentView1, prefDragOrnamentView1rotation, "om1R");
        setRightAngle(ornamentChoiceFlag2, dragOrnamentView2, prefDragOrnamentView2rotation, "om2R");
        setRightAngle(ornamentChoiceFlag3, dragOrnamentView3, prefDragOrnamentView3rotation, "om3R");
        setRightAngle(ornamentChoiceFlag4, dragOrnamentView4, prefDragOrnamentView4rotation, "om4R");
        setRightAngle(ornamentChoiceFlag5, dragOrnamentView5, prefDragOrnamentView5rotation, "om5R");
        setRightAngle(ornamentChoiceFlag6, dragOrnamentView6, prefDragOrnamentView6rotation, "om6R");
        setRightAngle(ornamentChoiceFlag7, dragOrnamentView7, prefDragOrnamentView7rotation, "om7R");
        setRightAngle(ornamentChoiceFlag8, dragOrnamentView8, prefDragOrnamentView8rotation, "om8R");

        angleLinearLayout.setVisibility(View.GONE);
    }

    public boolean setLeftAngle(Boolean flag, View view,SharedPreferences pref, String key){
        if (flag == true){
            view.setRotation(angle);
            SharedPreferences.Editor editorPref = pref.edit();
            editorPref.putFloat(key, angle);
            editorPref.apply();

            flag = false;
        }

        return false;
    }

    public void left(View v){
        ssb = (SpannableStringBuilder)rotationEditText.getText();
        Degree = ssb.toString();
        angle = Integer.parseInt(Degree);

        setLeftAngle(imageViewRotateFlag, imageView, preferencesImageViewRotation, "iRotation");
        setLeftAngle(editTextRotateFlag, editText, preferencesEditTextRotation, "eRotation");
        setLeftAngle(tapeChoiceFlag1, dragTapeView1, prefDragTapeView1rotation, "tp1R");
        setLeftAngle(tapeChoiceFlag2, dragTapeView2, prefDragTapeView2rotation, "tp2R");
        setLeftAngle(tapeChoiceFlag3, dragTapeView3, prefDragTapeView3rotation, "tp3R");
        setLeftAngle(tapeChoiceFlag4, dragTapeView4, prefDragTapeView4rotation, "tp4R");
        setLeftAngle(tapeChoiceFlag5, dragTapeView5, prefDragTapeView5rotation, "tp5R");
        setLeftAngle(ornamentChoiceFlag1, dragOrnamentView1, prefDragOrnamentView1rotation, "om1R");
        setLeftAngle(ornamentChoiceFlag2, dragOrnamentView2, prefDragOrnamentView2rotation, "om2R");
        setLeftAngle(ornamentChoiceFlag3, dragOrnamentView3, prefDragOrnamentView3rotation, "om3R");
        setLeftAngle(ornamentChoiceFlag4, dragOrnamentView4, prefDragOrnamentView4rotation, "om4R");
        setLeftAngle(ornamentChoiceFlag5, dragOrnamentView5, prefDragOrnamentView5rotation, "om5R");
        setLeftAngle(ornamentChoiceFlag6, dragOrnamentView6, prefDragOrnamentView6rotation, "om6R");
        setLeftAngle(ornamentChoiceFlag7, dragOrnamentView7, prefDragOrnamentView7rotation, "om7R");
        setLeftAngle(ornamentChoiceFlag8, dragOrnamentView8, prefDragOrnamentView8rotation, "om8R");

        angleLinearLayout.setVisibility(View.GONE);
    }


    //背景選択画面へ

    public void background(View v) {
        Intent intentBackground = new Intent(this, BackGroundActivity.class);
        intentBackground.putExtra("iF", imageFlag);
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

    public void choiceTape(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;
        dragTapeDNumber = Integer.parseInt(v.getTag().toString())+40;

        int tapes[] ={
                R.drawable.tape1,  R.drawable.tape2,  R.drawable.tape3,  R.drawable.tape4,
                R.drawable.tape5,  R.drawable.tape6,  R.drawable.tape7,  R.drawable.tape8,
                R.drawable.tape9,  R.drawable.tape10, R.drawable.tape11, R.drawable.tape12,
                R.drawable.tape13, R.drawable.tape14, R.drawable.tape15, R.drawable.tape16,
                R.drawable.tape17, R.drawable.tape18, R.drawable.tape19, R.drawable.tape20,
        };

        ImageView dragTapes [] = {
                dragTapeView1, dragTapeView2, dragTapeView3, dragTapeView4, dragTapeView5
        };

        SharedPreferences prefDTVNumbers [] = {
                prefDTV1Number, prefDTV2Number, prefDTV3Number, prefDTV4Number, prefDTV5Number
        };

        String prefDTVDNKeys [] = {
                "tp1DN", "tp2DN", "tp3DN", "tp4DN", "tp5DN"
        };

        if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        } else {
            dragTapes[tapeNumber].setImageResource(tapes[dragTapeDNumber-41]);
            dragTapes[tapeNumber].setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapes[tapeNumber]);

            //tapeの画像を保存
            SharedPreferences.Editor prefTapeDrawableNumber = prefDTVNumbers[tapeNumber].edit();
            prefTapeDrawableNumber.putInt(prefDTVDNKeys[tapeNumber], dragTapeDNumber);
            prefTapeDrawableNumber.apply();

            dragTapes[tapeNumber].setOnTouchListener(listener);
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

        SharedPreferences.Editor editorOrnamentN = ornamentN.edit();
        editorOrnamentN.putInt("prefOrnamentN", ornamentNumber);
        editorOrnamentN.apply();

    }

    public void pin(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        pinLinearLayout.setVisibility(View.VISIBLE);
    }

    public void ribbon(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        ribbonLinearLayout.setVisibility(View.VISIBLE);
    }

    public void button(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        buttonLinearLayout.setVisibility(View.VISIBLE);
    }

    public void the_others(View v){
        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);
        the_othersLinearLayout.setVisibility(View.VISIBLE);
    }

    public void choiceOrnament(View v){
        pinLinearLayout.setVisibility(View.GONE);
        ornamentNumber++;

        dragOrnamentDNumber = Integer.parseInt(v.getTag().toString())+40;

        int ornaments[] ={
                R.drawable.pin1,         R.drawable.pin2,         R.drawable.pin3,             R.drawable.pin4,
                R.drawable.ribbon1,      R.drawable.ribbon2,      R.drawable.ribbon3,     R.drawable.ribbon4,
                R.drawable.ribbon5,      R.drawable.ribbon6,      R.drawable.ribbon7,     R.drawable.ribbon8,
                R.drawable.button1,      R.drawable.button2,      R.drawable.button3,     R.drawable.button4,
                R.drawable.the_others1,  R.drawable.the_others2, R.drawable.the_others3, R.drawable.the_others4,
                R.drawable.the_others5,  R.drawable.the_others6, R.drawable.the_others7, R.drawable.the_others8,
                R.drawable.the_others9,  R.drawable.the_others10, R.drawable.the_others11, R.drawable.the_others12,
                R.drawable.the_others13, R.drawable.the_others14, R.drawable.the_others15, R.drawable.the_others16,
        };

        ImageView dragOrnaments [] = {
                dragOrnamentView1, dragOrnamentView2, dragOrnamentView3, dragOrnamentView4, dragOrnamentView5
        };

        SharedPreferences prefDOVNumbers [] = {
                prefDOV1Number, prefDOV2Number, prefDOV3Number, prefDOV4Number, prefDOV5Number
        };

        String prefDTVDNKeys [] = {
                "om1DN", "om2DN", "om3DN", "om4DN", "om5DN"
        };

        if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        } else {
            dragOrnaments[tapeNumber].setImageResource(ornaments[dragTapeDNumber-41]);
            dragOrnaments[tapeNumber].setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnaments[tapeNumber]);

            //tapeの画像を保存
            SharedPreferences.Editor prefTapeDrawableNumber = prefDOVNumbers[tapeNumber].edit();
            prefTapeDrawableNumber.putInt(prefDTVDNKeys[tapeNumber], dragTapeDNumber);
            prefTapeDrawableNumber.apply();

            dragOrnaments[tapeNumber].setOnTouchListener(listener);
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

        SharedPreferences.Editor editorTapeN = tapeN.edit();
        editorTapeN.putInt("prefTapeN", tapeNumber);
        Log.d("tN", String.valueOf(tapeNumber));
        editorTapeN.apply();

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
            tapeNumber = 0;
            tapeChoiceFlag1 = false;
        } else if (tapeChoiceFlag2 == true){
            dragTapeView2.setVisibility(View.GONE);
            tapeNumber = 1;
            tapeChoiceFlag2 = false;
        } else if (tapeChoiceFlag3 == true){
            dragTapeView3.setVisibility(View.GONE);
            tapeNumber = 2;
            tapeChoiceFlag3 = false;
        } else if (tapeChoiceFlag4 == true){
            dragTapeView4.setVisibility(View.GONE);
            tapeNumber = 3;
            tapeChoiceFlag4 = false;
        } else if (tapeChoiceFlag5 == true){
            dragTapeView5.setVisibility(View.GONE);
            tapeNumber = 4;
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

        SharedPreferences.Editor editorTapeN = tapeN.edit();
        editorTapeN.putInt("prefTapeN", tapeNumber);
        editorTapeN.apply();

        SharedPreferences.Editor editorOrnamentN = ornamentN.edit();
        editorOrnamentN.putInt("prefOrnamentN", ornamentNumber);
        editorOrnamentN.apply();
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

    public void manage(View v){
        if (manageFlag == false){
            manageFlag = true;
            choiceManageLinearLayout.setVisibility(View.VISIBLE);
        } else if (manageFlag == true){
            manageFlag = false;
            choiceManageLinearLayout.setVisibility(View.GONE);
        }

    }

    public void save(View v) {

        String memoText = editText.getText().toString();
        SharedPreferences.Editor editorMemo = preferencesMemo.edit();
        editorMemo.putString("memo", memoText);
        editorMemo.apply();

        //tapeNumberの保存

        //imageViewのframe

        //editTextの背景

        Toast.makeText(this, "finish save", Toast.LENGTH_LONG).show();

        finish();
    }

    public void add(View v){
        choiceManageLinearLayout.setVisibility(View.GONE);

        TextView dateView = (TextView)findViewById(R.id.dateView);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String date = year + "/" + (month+1) + "/" + day ;
        dateView.setTextSize(25);
        dateView.setText(date);

        LinearLayout taskLinearLayout = (LinearLayout)findViewById(R.id.taskLinearLayout);
        taskLinearLayout.setVisibility(View.GONE);

        dateView.setVisibility(View.VISIBLE);


        relativeLayout.setDrawingCacheEnabled(true);

        Bitmap save_bmp = Bitmap.createBitmap(relativeLayout.getDrawingCache());

        try {

            SharedPreferences preferencesFileNumber = getSharedPreferences("preferences_file_number", MODE_PRIVATE);

            int fileNumber = preferencesFileNumber.getInt("fN", 0);
            fileNumber = fileNumber + 1;
            Log.d("fileNumber", String.valueOf(fileNumber));

            //fileごと保存
            SharedPreferences preferencesFile = getSharedPreferences("preferences_file" + String.valueOf(fileNumber), MODE_PRIVATE);
            ByteArrayOutputStream BaOsFile = new ByteArrayOutputStream();
            save_bmp.compress(Bitmap.CompressFormat.JPEG, 100, BaOsFile);
            String bitmapStrFile = Base64.encodeToString(BaOsFile.toByteArray(), Base64.DEFAULT);

            SharedPreferences.Editor editorFile = preferencesFile.edit();
            editorFile.putString("file" + String.valueOf(fileNumber), bitmapStrFile);
            editorFile.apply();

            SharedPreferences.Editor prefFN = preferencesFileNumber.edit();
            prefFN.putInt("fN", fileNumber);
            prefFN.apply();


            Toast.makeText(this, "finish save", Toast.LENGTH_SHORT).show();

            relativeLayout.setDrawingCacheEnabled(false);

        } catch (Exception e) {

            Toast.makeText(this, "エラー", Toast.LENGTH_SHORT).show();

        }

    }

    public void explain(View v){
        SharedPreferences.Editor prefDTV3NDefault = prefDTV3Number.edit(); prefDTV3NDefault.clear(); prefDTV3NDefault.commit();
        SharedPreferences.Editor prefDTV3xDefault = prefDragTapeView3x.edit(); prefDTV3xDefault.clear(); prefDTV3xDefault.commit();
        SharedPreferences.Editor prefDTV3yDefault = prefDragTapeView3y.edit(); prefDTV3yDefault.clear(); prefDTV3yDefault.commit();
        SharedPreferences.Editor prefDTV3rDefault = prefDragTapeView3rotation.edit(); prefDTV3rDefault.clear(); prefDTV3rDefault.commit();
    }


    private View.OnTouchListener dragTapeTouch1 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x = (int) event.getRawX();
            int y = (int) event.getRawY();

            dragTapeDNumber = prefDTV1Number.getInt("tp1DN", 0);

            if (41 <= dragTapeDNumber&dragTapeDNumber <= 48|dragTapeDNumber == 53) {
                x = x - 250;
                y = y - 250;
            } else if (49 <= dragTapeDNumber&dragTapeDNumber <= 52|57 <= dragTapeDNumber&dragTapeDNumber <= 60) {
                x = x - 500;
                y = y - 320;
            } else if (54 <= dragTapeDNumber&dragTapeDNumber <= 56) {
                x = x - 320;
                y = y - 320;
            }

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
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

            dragTapeDNumber = prefDTV2Number.getInt("tp2DN", 0);

            if (41 <= dragTapeDNumber&dragTapeDNumber <= 48|dragTapeDNumber == 53) {
                x = x - 250;
                y = y - 250;
            } else if (49 <= dragTapeDNumber&dragTapeDNumber <= 52|57 <= dragTapeDNumber&dragTapeDNumber <= 60) {
                x = x - 500;
                y = y - 320;
            } else if (54 <= dragTapeDNumber&dragTapeDNumber <= 56) {
                x = x - 320;
                y = y - 320;
            }

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

            dragTapeDNumber = prefDTV3Number.getInt("tp3DN", 0);

            if (41 <= dragTapeDNumber&dragTapeDNumber <= 48|dragTapeDNumber == 53) {
                x = x - 250;
                y = y - 250;
            } else if (49 <= dragTapeDNumber&dragTapeDNumber <= 52|57 <= dragTapeDNumber&dragTapeDNumber <= 60) {
                x = x - 500;
                y = y - 320;
            } else if (54 <= dragTapeDNumber&dragTapeDNumber <= 56) {
                x = x - 320;
                y = y - 320;
            }

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

            dragTapeDNumber = prefDTV4Number.getInt("tp4DN", 0);

            if (41 <= dragTapeDNumber&dragTapeDNumber <= 48|dragTapeDNumber == 53) {
                x = x - 250;
                y = y - 250;
            } else if (49 <= dragTapeDNumber&dragTapeDNumber <= 52|57 <= dragTapeDNumber&dragTapeDNumber <= 60) {
                x = x - 500;
                y = y - 320;
            } else if (54 <= dragTapeDNumber&dragTapeDNumber <= 56) {
                x = x - 320;
                y = y - 320;
            }

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

            dragTapeDNumber = prefDTV5Number.getInt("tp5DN", 0);

            if (41 <= dragTapeDNumber&dragTapeDNumber <= 48|dragTapeDNumber == 53) {
                x = x - 250;
                y = y - 250;
            } else if (49 <= dragTapeDNumber&dragTapeDNumber <= 52|57 <= dragTapeDNumber&dragTapeDNumber <= 60) {
                x = x - 500;
                y = y - 320;
            } else if (54 <= dragTapeDNumber&dragTapeDNumber <= 56) {
                x = x - 320;
                y = y - 320;
            }

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

            x = x - 100;
            y = y - 250;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    dragOrnamentView1.setX(x);
                    dragOrnamentView1.setY(y);
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

    //gitHub
    //VCSのCommitChangesでコメントを書いてCommit, Commitしたら再びVCSのGitHubのPush

    //valuesのdimens.xml見てみて

    //フレーム機能設定
    //背景の画像(その他とか…　ちょっと再検討して)
    //影がつけられるようにする
    //editTextに背景つけられるように
    //レイアウト選ぶところからmakeに飛ぶときに、背景選択画面みたいに配列つくってmakeは1つにしてhtmlだけ変えればいい！　アイデアbyゴディバ
    //エミュレータのDeveloper Optionsのshow layout boundsでレイアウトの細かいのみれるよ‼
    //スマホだと画像の比は3:4か1:1
}


