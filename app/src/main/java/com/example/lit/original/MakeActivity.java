package com.example.lit.original;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    boolean imageFlag;

    EditText editText;
    EditText editText1;
    EditText editText2;
    EditText editText3;

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
    SharedPreferences preferencesMemo;
    SharedPreferences preferencesRotation;
    SharedPreferences preferencesPhoto;
    SharedPreferences preferencesBackground;

    LinearLayout tapesLinearLayout;
    int tapeNumber;
    ImageButton tapeButton;
    boolean tapeFlag = false;
    ImageView dragTapeView1;
    ImageView dragTapeView2;
    ImageView dragTapeView3;
    ImageView dragTapeView4;
    ImageView dragTapeView5;

    LinearLayout ornamentsLinearLayout;
    LinearLayout choiceOrnamentLinearLayout;
    LinearLayout eachOrnamentsLinearLayout;
    LinearLayout pinLinearLayout;
    LinearLayout ribbonLinearLayout;
    LinearLayout buttonLinearLayout;
    LinearLayout the_othersLinearLayout;
    int ornamentNumber;
    ImageButton ornamentButton;
    boolean ornamentFlag = false;
    ImageView dragOrnamentView1;
    ImageView dragOrnamentView2;
    ImageView dragOrnamentView3;
    ImageView dragOrnamentView4;
    ImageView dragOrnamentView5;
    ImageView dragOrnamentView6;
    ImageView dragOrnamentView7;
    ImageView dragOrnamentView8;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_make1);

        //Intent intent = getIntent();
        //layoutNumber = intent.getIntExtra("L", 0);
        //if (layoutNumber == 0){
          //  setContentView(R.layout.activity_make1);
        //}else if (layoutNumber == 1){
          //  setContentView(R.layout.activity_make1);
        //} else if (layoutNumber == 2){
          //  setContentView(R.layout.activity_make2);
        //} else if (layoutNumber == 3){
          //  setContentView(R.layout.activity_make3);
        //} else if (layoutNumber == 4){
          //  setContentView(R.layout.activity_make4);
        //} else if (layoutNumber == 5){
          //  setContentView(R.layout.activity_make5);
        //} else if (layoutNumber == 6){
          //  setContentView(R.layout.activity_make6);
        //} else if (layoutNumber == 7){
          //  setContentView(R.layout.activity_make7);
        //} else if (layoutNumber == 8){
          //  setContentView(R.layout.activity_make8);
        //} else if (layoutNumber == 9){
          //  setContentView(R.layout.activity_make9);
        //} else if (layoutNumber == 10){
          //  setContentView(R.layout.activity_make10);
        //}

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);

        editText = (EditText)findViewById(R.id.editText);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);

        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        relativeLayout = (RelativeLayout)findViewById(R.id.RelativeLayout);

        if(imageFlag == true){
            imageView.setBackgroundDrawable(bitmapDrawable);
        }
        //imageView.setBackgroundDrawable(bitmapDrawable);

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

        //それぞれのpreferenceの倉庫を設定、MODE_PRIVATEはこのアプリのみでデータをいじることができるようにする設定
        preferencesMemo = getSharedPreferences("pref_memo", MODE_PRIVATE);
        preferencesRotation = getSharedPreferences("pref_rotate", MODE_PRIVATE);
        preferencesPhoto = getSharedPreferences("pref_img", Context.MODE_PRIVATE);
        preferencesBackground = getSharedPreferences("pref_bg", Context.MODE_PRIVATE);

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

        String sIV = preferencesPhoto.getString("img","");
        if(sIV == ""){

        } else if(sIV != ""){
            byte[] bIV = Base64.decode(sIV, Base64.DEFAULT);
            Bitmap bmpIV = BitmapFactory.decodeByteArray(bIV, 0, bIV.length).copy(Bitmap.Config.ARGB_8888, true);
            bitmapDrawable = new BitmapDrawable(getResources(), bmpIV);
            imageView.setBackgroundDrawable(bitmapDrawable);
        }

        String sBG = preferencesBackground.getString("bg", "");
        if(sBG == ""){
            relativeLayout.setBackgroundColor(Color.parseColor("#b7b6b6"));
        } else if(sBG != null){
            byte[] bBG = Base64.decode(sBG, Base64.DEFAULT);
            Bitmap bmpBG = BitmapFactory.decodeByteArray(bBG, 0, bBG.length).copy(Bitmap.Config.ARGB_8888, true);
            Drawable drawBG = new BitmapDrawable(bmpBG);
            //layout.setBackgroundDrawable(drawBG);
        }

        choiceBackgroundOrAngleLinearLayout.setVisibility(View.GONE);
        imageViewBackgroundLinearLayout.setVisibility(View.GONE);
        //imageViewIn.setVisibility(View.GONE);
        frameImageView.setVisibility(View.GONE);
        frameImageView.setBackgroundColor(Color.parseColor("#ffffff"));
        editTextBackgroundLinearLayout.setVisibility(View.GONE);
        angleLinearLayout.setVisibility(View.GONE);
        //↑setVisibilityはViewを非表示にするcode
        tapesLinearLayout.setVisibility(View.GONE);

        imageView.setOnClickListener(imageViewOnClick);
        imageView.setOnLongClickListener(imageViewOnLongClick);
        editText.setOnLongClickListener(editTextOnLongClick);

        Intent intentBG = getIntent();
        int backgroundNumber = intentBG.getIntExtra("BG", 0);

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
                Log.d("あ", "い");
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
                    angleLinearLayout.setVisibility(View.VISIBLE);
                    rotationEditText.setText("");
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

        //editText.setRotation(angle);
        if (tapeChoiceFlag1 == true){
            dragTapeView1.setRotation(angle);
            tapeChoiceFlag1 = false;
        } else if (tapeChoiceFlag2 == true){
            dragTapeView2.setRotation(angle);
            tapeChoiceFlag2 = false;
        } else if (tapeChoiceFlag3 == true){
            dragTapeView3.setRotation(angle);
            tapeChoiceFlag3 = false;
        } else if (tapeChoiceFlag4 == true){
            dragTapeView4.setRotation(angle);
            tapeChoiceFlag4 = false;
        } else if (tapeChoiceFlag5 == true){
            dragTapeView5.setRotation(angle);
            tapeChoiceFlag5 = false;
        } else if (ornamentChoiceFlag1 == true){
            dragOrnamentView1.setRotation(angle);
            ornamentChoiceFlag1 = false;
        } else if (ornamentChoiceFlag2 == true){
            dragOrnamentView2.setRotation(angle);
            ornamentChoiceFlag2 = false;
        } else if (ornamentChoiceFlag3 == true){
            dragOrnamentView3.setRotation(angle);
            ornamentChoiceFlag3 = false;
        } else if (ornamentChoiceFlag4 == true){
            dragOrnamentView4.setRotation(angle);
            ornamentChoiceFlag4 = false;
        } else if (ornamentChoiceFlag5 == true){
            dragOrnamentView5.setRotation(angle);
            ornamentChoiceFlag5 = false;
        } else if (ornamentChoiceFlag6 == true){
            dragOrnamentView6.setRotation(angle);
            ornamentChoiceFlag6 = false;
        } else if (ornamentChoiceFlag7 == true){
            dragOrnamentView7.setRotation(angle);
            ornamentChoiceFlag7 = false;
        } else if (ornamentChoiceFlag8 == true){
            dragOrnamentView8.setRotation(angle);
            ornamentChoiceFlag8 = false;
        }

        angleLinearLayout.setVisibility(View.GONE);
    }

    public void left(View v){
        ssb = (SpannableStringBuilder)rotationEditText.getText();
        Degree = ssb.toString();
        angle = Integer.parseInt(Degree);

        //editText.setRotation(-angle);
        if (tapeChoiceFlag1 == true){
            dragTapeView1.setRotation(-angle);
            tapeChoiceFlag1 = false;
        } else if (tapeChoiceFlag2 == true){
            dragTapeView2.setRotation(-angle);
            tapeChoiceFlag2 = false;
        } else if (tapeChoiceFlag3 == true){
            dragTapeView3.setRotation(-angle);
            tapeChoiceFlag3 = false;
        } else if (tapeChoiceFlag4 == true){
            dragTapeView4.setRotation(-angle);
            tapeChoiceFlag4 = false;
        } else if (tapeChoiceFlag5 == true){
            dragTapeView5.setRotation(-angle);
            tapeChoiceFlag5 = false;
        } else if (ornamentChoiceFlag1 == true){
            dragOrnamentView1.setRotation(-angle);
            ornamentChoiceFlag1 = false;
        } else if (ornamentChoiceFlag2 == true){
            dragOrnamentView2.setRotation(-angle);
            ornamentChoiceFlag2 = false;
        } else if (ornamentChoiceFlag3 == true){
            dragOrnamentView3.setRotation(-angle);
            ornamentChoiceFlag3 = false;
        } else if (ornamentChoiceFlag4 == true){
            dragOrnamentView4.setRotation(-angle);
            ornamentChoiceFlag4 = false;
        } else if (ornamentChoiceFlag5 == true){
            dragOrnamentView5.setRotation(-angle);
            ornamentChoiceFlag5 = false;
        } else if (ornamentChoiceFlag6 == true){
            dragOrnamentView6.setRotation(-angle);
            ornamentChoiceFlag6 = false;
        } else if (ornamentChoiceFlag7 == true){
            dragOrnamentView7.setRotation(-angle);
            ornamentChoiceFlag7 = false;
        } else if (ornamentChoiceFlag8 == true){
            dragOrnamentView8.setRotation(-angle);
            ornamentChoiceFlag8 = false;
        }

        angleLinearLayout.setVisibility(View.GONE);
    }

    public void background(View v) {
        if (layoutNumber == 1){
            Intent intentM1 = new Intent(this, BackGroundActivity.class);
            intentM1.putExtra("M", 1);
            startActivity(intentM1);
        } else if (layoutNumber == 2){
            Intent intentM2 = new Intent(this, BackGroundActivity.class);
            intentM2.putExtra("M", 2);
            startActivity(intentM2);
        } else if (layoutNumber == 3){
            Intent intentM3 = new Intent(this, BackGroundActivity.class);
            intentM3.putExtra("M", 3);
            startActivity(intentM3);
        } else if (layoutNumber == 4){
            Intent intentM4 = new Intent(this, BackGroundActivity.class);
            intentM4.putExtra("M", 4);
            startActivity(intentM4);
        } else if (layoutNumber == 5){
            Intent intentM5 = new Intent(this, BackGroundActivity.class);
            intentM5.putExtra("M", 5);
            startActivity(intentM5);
        } else if (layoutNumber == 6){
            Intent intentM6 = new Intent(this, BackGroundActivity.class);
            intentM6.putExtra("M", 6);
            startActivity(intentM6);
        } else if (layoutNumber == 7){
            Intent intentM7 = new Intent(this, BackGroundActivity.class);
            intentM7.putExtra("M", 7);
            startActivity(intentM7);
        } else if (layoutNumber == 8){
            Intent intentM8 = new Intent(this, BackGroundActivity.class);
            intentM8.putExtra("M", 8);
            startActivity(intentM8);
        } else if (layoutNumber == 9){
            Intent intentM9 = new Intent(this, BackGroundActivity.class);
            intentM9.putExtra("M", 9);
            startActivity(intentM9);
        } else if (layoutNumber == 10){
            Intent intentM10 = new Intent(this, BackGroundActivity.class);
            intentM10.putExtra("M", 10);
            startActivity(intentM10);
        }
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

        dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
        dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
        dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
        dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
        dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);

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

        dragOrnamentView1 = (ImageView)findViewById(R.id.ornamentView1);
        dragOrnamentView2 = (ImageView)findViewById(R.id.ornamentView2);
        dragOrnamentView3 = (ImageView)findViewById(R.id.ornamentView3);
        dragOrnamentView4 = (ImageView)findViewById(R.id.ornamentView4);
        dragOrnamentView5 = (ImageView)findViewById(R.id.ornamentView5);
        dragOrnamentView6 = (ImageView)findViewById(R.id.ornamentView6);
        dragOrnamentView7 = (ImageView)findViewById(R.id.ornamentView7);
        dragOrnamentView8 = (ImageView)findViewById(R.id.ornamentView8);

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

    public void test(View v){

    }

    public void yes(View v){
        dragViewCheckLinearLayout.setVisibility(View.GONE);
        dragViewChoiceLinearLayout.setVisibility(View.VISIBLE);

        if(tapeNumber == 1){
            dragTapeView1.setOnTouchListener(dragTapeTouch1);
        } else if (tapeNumber == 2){
            dragTapeView2.setOnTouchListener(dragTapeTouch2);
        } else if (tapeNumber == 3){
            dragTapeView3.setOnTouchListener(dragTapeTouch3);
        } else if (tapeNumber == 4){
            dragTapeView4.setOnTouchListener(dragTapeTouch4);
        } else if (tapeNumber == 5){
            dragTapeView5.setOnTouchListener(dragTapeTouch5);
        } else if (ornamentNumber == 1){
            Log.d("ornament", "call");
            dragOrnamentView1.setOnTouchListener(dragOrnamentTouch1);
        } else if (ornamentNumber == 2){
            dragOrnamentView2.setOnTouchListener(dragOrnamentTouch2);
        } else if (ornamentNumber == 3){
            dragOrnamentView3.setOnTouchListener(dragOrnamentTouch3);
        } else if (ornamentNumber == 4){
            dragOrnamentView4.setOnTouchListener(dragOrnamentTouch4);
        } else if (ornamentNumber == 5){
            dragOrnamentView5.setOnTouchListener(dragOrnamentTouch5);
        } else if (ornamentNumber == 6){
            dragOrnamentView6.setOnTouchListener(dragOrnamentTouch6);
        } else if (ornamentNumber == 7){
            dragOrnamentView7.setOnTouchListener(dragOrnamentTouch7);
        } else if (ornamentNumber == 8){
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

    public void save(View v) {
        //background
        ByteArrayOutputStream BaOsBG = new ByteArrayOutputStream();
        Drawable layoutBackGround = relativeLayout.getBackground();
        Bitmap bg = ((BitmapDrawable)layoutBackGround).getBitmap();
        bg.compress(Bitmap.CompressFormat.JPEG, 100, BaOsBG);
        String bitmapStrBG = Base64.encodeToString(BaOsBG.toByteArray(), Base64.DEFAULT);

        //imageViewのphoto
        //ByteArrayOutputStream BaOsIV = new ByteArrayOutputStream();
        //img.compress(Bitmap.CompressFormat.JPEG, 100, BaOsIV);
        //String bitmapStrIV = Base64.encodeToString(BaOsIV.toByteArray(), Base64.DEFAULT);

        //imageViewのrotation
        float rotate = imageView.getRotation();

        //imageViewのframe

        //editTextのmemo
        String memoText = editText.getText().toString();

        //editTextのrotation

        //editTextの背景


        SharedPreferences.Editor editorMemo = preferencesMemo.edit();
        SharedPreferences.Editor editorRotation = preferencesRotation.edit();
        //SharedPreferences.Editor editorPhoto = preferencesPhoto.edit();
        SharedPreferences.Editor editorBackGround = preferencesBackground.edit();

        editorMemo.putString("memo", memoText);
        editorRotation.putFloat("Rotation", rotate);
        //editorPhoto.putString("img", bitmapStrIV);
        editorBackGround.putString("bg", bitmapStrBG);

        editorMemo.apply();
        editorRotation.apply();
        //editorPhoto.apply();
        editorBackGround.apply();

        finish();

        Intent intentEdit = new Intent(this, EditActivity.class);
        startActivity(intentEdit);
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
            Log.d("ornament1", "true");

            int x = (int) event.getRawX();
            int y = (int) event.getRawY();
            //int x = (int) event.getX();
            //int y = (int) event.getY();

            x = x - 100;
            y = y - 280;

            switch (event.getAction()) {
                case MotionEvent.ACTION_MOVE:
                    Log.d("ornament1", "true");

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


