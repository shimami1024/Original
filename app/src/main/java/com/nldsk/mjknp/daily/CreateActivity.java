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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class CreateActivity extends AppCompatActivity {

    boolean flag;

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

    SharedPreferences preferences;
    SharedPreferences.Editor editor = preferences.edit();

    LinearLayout tapesLinearLayout;
    int tapeNumber;
    int dragTapeDNumber;
    ImageButton tapeButton;
    boolean tapeFlag = false;

    ImageView dragTapeView1;

    List<Sticky> stickyList = new ArrayList<>();
    //dragTapeView1の保存のための変数の宣言
    SharedPreferences prefDTV1Number;
    SharedPreferences prefDragTapeView1x;
    SharedPreferences prefDragTapeView1y;
    SharedPreferences prefDragTapeView1rotation;

    ImageView dragTapeView2;
    //dragTapeView2の保存のための変数の宣言
    SharedPreferences prefDTV2Number;
    SharedPreferences prefDragTapeView2x;
    SharedPreferences prefDragTapeView2y;
    SharedPreferences prefDragTapeView2rotation;

    ImageView dragTapeView3;
    //dragTapeView3の保存のための変数の宣言
    SharedPreferences prefDTV3Number;
    SharedPreferences prefDragTapeView3x;
    SharedPreferences prefDragTapeView3y;
    SharedPreferences prefDragTapeView3rotation;

    ImageView dragTapeView4;
    //dragTapeView4の保存のための変数の宣言
    SharedPreferences prefDTV4Number;
    SharedPreferences prefDragTapeView4x;
    SharedPreferences prefDragTapeView4y;
    SharedPreferences prefDragTapeView4rotation;

    ImageView dragTapeView5;
    //dragTapeView5の保存のための変数の宣言
    SharedPreferences prefDTV5Number;
    SharedPreferences prefDragTapeView5x;
    SharedPreferences prefDragTapeView5y;
    SharedPreferences prefDragTapeView5rotation;

    ImageView dragTapes [] = {
            dragTapeView1, dragTapeView2, dragTapeView3, dragTapeView4, dragTapeView5
    };

    String keysTapeDN [] = {
            "tp1DN", "tp2DN", "tp3DN", "tp4DN", "tp5DN"
    };

    String keyTapeX [] = {
            "tp1x", "tp2x", "tp3x", "tp4x", "tp5x"
    };

    String keyTapeY [] = {
            "tp1y", "tp2y", "tp3y", "tp4y", "tp5y"
    };

    String keyTapeR [] = {
            "tp1R", "tp2R", "tp3R", "tp4R", "tp5R"
    };

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
    SharedPreferences prefDOV6Number;  // int
    SharedPreferences prefDragOrnamentView6x;  // float
    SharedPreferences prefDragOrnamentView6y; // float
    SharedPreferences prefDragOrnamentView6rotation; // float

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

    ImageView dragOrnaments [] = {
            dragOrnamentView1, dragOrnamentView2, dragOrnamentView3, dragOrnamentView4, dragOrnamentView5
    };

    String keysOrnamentDN [] = {
            "om1DN", "om2DN", "om3DN", "om4DN", "om5DN"
    };

    String keyOrnamentX [] = {
            "om1x", "om2x", "om3x", "om4x", "om5x", "om6x", "om7x", "om8x"
    };

    String keyOrnamentY [] = {
            "om1y", "om2y", "om3y", "om4y", "om5y", "om6y", "om7y", "om8y"
    };

    String keyOrnamentR [] = {
            "om1R", "om2R", "om3R", "om4R", "om5R", "om6R", "om7R", "om8R"
    };

    LinearLayout dragViewCheckLinearLayout;
    LinearLayout dragViewChoiceLinearLayout;

    DragViewListener listener;

    boolean tapeChoiceFlag1;
    boolean tapeChoiceFlag2;
    boolean tapeChoiceFlag3;
    boolean tapeChoiceFlag4;
    boolean tapeChoiceFlag5;

    Boolean tapeChoiceFlag [] = {
            tapeChoiceFlag1, tapeChoiceFlag2, tapeChoiceFlag3, tapeChoiceFlag4, tapeChoiceFlag5
    };

    boolean ornamentChoiceFlag1;
    boolean ornamentChoiceFlag2;
    boolean ornamentChoiceFlag3;
    boolean ornamentChoiceFlag4;
    boolean ornamentChoiceFlag5;
    boolean ornamentChoiceFlag6;
    boolean ornamentChoiceFlag7;
    boolean ornamentChoiceFlag8;

    Boolean ornamentChoiceFlag [] = {
            ornamentChoiceFlag1, ornamentChoiceFlag2, ornamentChoiceFlag3, ornamentChoiceFlag4,
            ornamentChoiceFlag5, ornamentChoiceFlag6, ornamentChoiceFlag7, ornamentChoiceFlag8
    };

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

        preferences = getSharedPreferences("pref_daily", MODE_PRIVATE);


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

            editor.clear();
            editor.apply();

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

            View.OnTouchListener tapeTouch [] = {
                    dragTapeTouch1, dragTapeTouch2, dragTapeTouch3, dragTapeTouch4, dragTapeTouch5
            };

            //dragTapeViewをセット
            for(int i = 0; i < 5; i++){
                dragTapeDNumber = preferences.getInt(keysTapeDN[i], 0);

                if(dragTapeDNumber != 0){
                    //位置
                    dragTapes[i].setX(preferences.getFloat(keyTapeX[i], 0));
                    dragTapes[i].setY(preferences.getFloat(keyTapeY[i], 0));
                    //画像
                    dragTapes[i].setBackgroundResource(tapes[dragTapeDNumber-41]);
                    //角度
                    dragTapes[i].setRotation(preferences.getFloat(keyTapeR[i], 0));

                    dragTapes[i].setOnTouchListener(tapeTouch [i]);
                }
            }

            ornamentNumber = ornamentN.getInt("prefOrnamentN", 0);

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

            View.OnTouchListener ornamentTouch [] = {
                    dragOrnamentTouch1, dragOrnamentTouch2, dragOrnamentTouch3, dragOrnamentTouch4,
                    dragOrnamentTouch5, dragOrnamentTouch6, dragOrnamentTouch7, dragOrnamentTouch8
            };

            //dragOrnamentViewをセット
            for(int i = 0; i < 8; i++){
                dragOrnamentDNumber = preferences.getInt(keysOrnamentDN[i], 0);

                if(dragTapeDNumber != 0){
                    //位置
                    dragOrnaments[i].setX(preferences.getFloat(keyOrnamentX[i], 0));
                    dragOrnaments[i].setY(preferences.getFloat(keyOrnamentY[i], 0));
                    //画像
                    dragOrnaments[i].setBackgroundResource(ornaments[dragOrnamentDNumber-41]);
                    //角度
                    dragOrnaments[i].setRotation(preferences.getFloat(keyOrnamentR[i], 0));

                    dragOrnaments[i].setOnTouchListener(ornamentTouch [i]);
                }
            }

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
        if (flag){
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
            view.setRotation(-angle);
            SharedPreferences.Editor editorPref = pref.edit();
            editorPref.putFloat(key, -angle);
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

        if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        } else {
            dragTapes[tapeNumber-1].setImageResource(tapes[dragTapeDNumber-41]);
            dragTapes[tapeNumber-1].setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapes[tapeNumber-1]);

            //tapeの画像を保存
            editor.putInt(keysTapeDN[tapeNumber-1], dragTapeDNumber);
            editor.apply();

            dragTapes[tapeNumber-1].setOnTouchListener(listener);
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

    public void ornamentKind(View v){
        String tag = v.getTag().toString();

        if (tag.equals("pin")){
            pinLinearLayout.setVisibility(View.VISIBLE);
        } else if (tag.equals("ribbon")) {
            ribbonLinearLayout.setVisibility(View.VISIBLE);
        } else if (tag.equals("button")) {
            buttonLinearLayout.setVisibility(View.VISIBLE);
        } else if (tag.equals("the_others")) {
            the_othersLinearLayout.setVisibility(View.VISIBLE);
        }

        choiceOrnamentLinearLayout.setVisibility(View.GONE);
        eachOrnamentsLinearLayout.setVisibility(View.VISIBLE);

    }

    public void choiceOrnament(View v){
        pinLinearLayout.setVisibility(View.GONE);
        ribbonLinearLayout.setVisibility(View.GONE);
        buttonLinearLayout.setVisibility(View.GONE);
        the_othersLinearLayout.setVisibility(View.GONE);

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

        if (ornamentNumber > 8){
            Toast.makeText(this, "can use 5 ornaments", Toast.LENGTH_SHORT).show();
        } else {
            dragOrnaments[ornamentNumber-1].setImageResource(ornaments[dragOrnamentDNumber-41]);
            dragOrnaments[ornamentNumber-1].setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragOrnaments[ornamentNumber-1]);

            //tapeの画像を保存
            editor.putInt(keysOrnamentDN[ornamentNumber-1], dragOrnamentDNumber);
            editor.apply();

            dragOrnaments[ornamentNumber-1].setOnTouchListener(listener);
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
                        dragTapes[tapeNumber-1].layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                        tapeChoiceFlag[tapeNumber-1] = true;
                    } else if (ornamentFlag == true){
                        dragOrnaments[ornamentNumber-1].layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                        ornamentChoiceFlag[ornamentNumber-1] = true;
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

        //dragTapeViewの保存
        editor.putFloat(keyTapeX[tapeNumber-1], dragTapes[tapeNumber-1].getX());
        editor.putFloat(keyTapeY[tapeNumber-1], dragTapes[tapeNumber-1].getX());
        editor.putFloat(keyTapeR[tapeNumber-1], dragTapes[tapeNumber-1].getRotation());

        editor.apply();

        View.OnTouchListener tapeTouch [] = {
                dragTapeTouch1, dragTapeTouch2, dragTapeTouch3, dragTapeTouch4, dragTapeTouch5
        };

        dragTapes[tapeNumber-1].setOnTouchListener(tapeTouch[tapeNumber-1]);


        //dragOrnamentViewの保存
        editor.putFloat(keyOrnamentX[ornamentNumber-1], dragOrnaments[ornamentNumber-1].getX());
        editor.putFloat(keyOrnamentY[ornamentNumber-1], dragOrnaments[ornamentNumber-1].getX());
        editor.putFloat(keyOrnamentR[ornamentNumber-1], dragOrnaments[ornamentNumber-1].getRotation());

        editor.apply();

        View.OnTouchListener ornamentTouch [] = {
                dragOrnamentTouch1, dragOrnamentTouch2, dragOrnamentTouch3, dragOrnamentTouch4,
                dragOrnamentTouch5, dragOrnamentTouch6, dragOrnamentTouch7, dragOrnamentTouch8
        };

        dragOrnaments[ornamentNumber-1].setOnTouchListener(ornamentTouch[ornamentNumber-1]);


        editor.putInt("prefTapeN", tapeNumber);
        editor.putInt("prefOrnament", ornamentNumber);
        editor.apply();

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

        //dragTapeViewを削除
        if(tapeChoiceFlag[tapeNumber-1] == true){
            dragTapes[tapeNumber-1].setVisibility(View.GONE);
            tapeNumber--;
            tapeChoiceFlag[tapeNumber-1] = false;
        }

        //dragOrnamentViewを削除
        if(ornamentChoiceFlag[ornamentNumber-1] == true){
            dragOrnaments[ornamentNumber-1].setVisibility(View.GONE);
            ornamentNumber--;
            ornamentChoiceFlag[ornamentNumber-1] = false;
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


