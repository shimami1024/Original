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

    private View mDraggedView;

    boolean flag;

    int layoutNumber;

    float x;
    float y;

    //imageViewの画像になる変数の宣言
    Bitmap img;
    //Drawable bitmapDrawable;
    BitmapDrawable bitmapDrawable;

    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

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
    ImageView imageViewIn;
    ImageView frameImageView;

    //editTextの背景設定のための変数の宣言
    LinearLayout editTextBackgroundLinearLayout;
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

    DragViewListener listener;

    int tapeNumber;

    ImageView dragTapeView1;
    ImageView dragTapeView2;
    ImageView dragTapeView3;
    ImageView dragTapeView4;
    ImageView dragTapeView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_make1);

        //Intent intent = getIntent();
        //layoutNumber = intent.getIntExtra("L", 0);
        //if (layoutNumber == 0){
          //  setContentView(R.layout.activity_make1);
        //}else if (layoutNumber == 1){
            //setContentView(R.layout.activity_make1);
        //} else if (layoutNumber == 2){
            //setContentView(R.layout.activity_make2);
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
        //relativeLayout.setOnDragListener(dragListener);

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
        //imageViewIn = (ImageView)findViewById(R.id.imageViewIn);
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

        //lp = getWindow().getAttributes();

        tapesLinearLayout = (LinearLayout)findViewById(R.id.tapesLinearLayout);

        //tape1 = (ImageView)findViewById(R.id.imageView10);
        //tape1.setVisibility(View.GONE);

        /* layoutファイルからTextViewを取得 */
        //mDraggedView = findViewById(R.id.imageView10);
        /* OnLongClickListenerをTextViewにセット */
        //mDraggedView.setOnLongClickListener(this);

        tapeNumber = 0;

        String sIV = preferencesPhoto.getString("img","");
        if(sIV == ""){

        } else if(sIV != null){
            byte[] bIV = Base64.decode(sIV, Base64.DEFAULT);
            Bitmap bmpIV = BitmapFactory.decodeByteArray(bIV, 0, bIV.length).copy(Bitmap.Config.ARGB_8888, true);
            //imageView.setImageBitmap(bmpIV);
        }

        String sBG = preferencesBackground.getString("bg", "");
        if(sBG == ""){
            //RelativeLayout.setBackgroundColor(Color.parseColor("#e3e3e3"));
            relativeLayout.setBackgroundColor(Color.parseColor("#b7b6b6"));
        } else if(sBG != null){
            byte[] bBG = Base64.decode(sBG, Base64.DEFAULT);
            Bitmap bmpBG = BitmapFactory.decodeByteArray(bBG, 0, bBG.length).copy(Bitmap.Config.ARGB_8888, true);
            Drawable drawBG = new BitmapDrawable(bmpBG);
            //layout.setBackgroundDrawable(drawBG);
        }

        //imageView.setRotation(preferencesRotation.getFloat("Rotation", 0));
        //editText.setText(preferencesMemo.getString("memo",""));

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
            //imageView.setOnClickListener(imageViewOnClick);
            //imageView.setOnLongClickListener(imageViewOnLongClick);
            //editText.setOnLongClickListener(editTextOnLongClick);
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
                InputStream in = getContentResolver().openInputStream(data.getData());
                img = BitmapFactory.decodeStream(in);
                in.close();
                Log.d("あ", "い");
                // 選択した画像を表示
                if (requestCode == 0) {
                    bitmapDrawable = new BitmapDrawable(getResources(), img);
                    //imageView.setBackgroundDrawable(img);
                    //imageView.setBackgroundResource(getResources().getDrawable(img));
                    imageView.setBackgroundDrawable(bitmapDrawable);
                    //imageView.setImageBitmap(img);
                }

            } catch (Exception e) {
                System.out.println("test");
            }
        }
    }

    private View.OnClickListener imageViewOnClick = new View.OnClickListener() {
        //@Override
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
        //@Override
        public boolean onLongClick(View v) {
            choiceBackgroundOrAngleLinearLayout.setVisibility(View.VISIBLE);

            choiceBackgroundButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    choiceBackgroundOrAngleLinearLayout.setVisibility(View.GONE);
                    imageViewBackgroundLinearLayout.setVisibility(View.VISIBLE);

                    imageViewBackgroundImageButton1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //imageViewIn.setVisibility(View.VISIBLE);
                            frameImageView.setVisibility(View.VISIBLE);
                            frameImageView.setBackgroundResource(R.drawable.frame1);
                            //imageView.setBackgroundResource(R.drawable.frame1);
                            //imageViewIn.setImageBitmap(img);
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

                    directionRightButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ssb = (SpannableStringBuilder)rotationEditText.getText();
                            Degree = ssb.toString();
                            angle = Integer.parseInt(Degree);
                            imageView.setRotation(angle);
                            angleLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    directionLeftButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ssb = (SpannableStringBuilder)rotationEditText.getText();
                            Degree = ssb.toString();
                            angle = Integer.parseInt(Degree);
                            imageView.setRotation(-angle);
                            angleLinearLayout.setVisibility(View.GONE);
                        }
                    });
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
        //@Override
        public boolean onLongClick(View v) {
            choiceBackgroundOrAngleLinearLayout.setVisibility(View.VISIBLE);

            choiceBackgroundButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
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

                    directionRightButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ssb = (SpannableStringBuilder)rotationEditText.getText();
                            Degree = ssb.toString();
                            angle = Integer.parseInt(Degree);
                            editText.setRotation(angle);
                            angleLinearLayout.setVisibility(View.GONE);
                        }
                    });

                    directionLeftButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ssb = (SpannableStringBuilder)rotationEditText.getText();
                            Degree = ssb.toString();
                            angle = Integer.parseInt(Degree);
                            editText.setRotation(-angle);
                            angleLinearLayout.setVisibility(View.GONE);
                        }
                    });
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

    public void background(View v) {
        if (layoutNumber == 0){
            Intent intentM1 = new Intent(this, BackGroundActivity.class);
            intentM1.putExtra("M1", 1);
            startActivity(intentM1);
        }
        if (layoutNumber == 1){
            Intent intentM1 = new Intent(this, BackGroundActivity.class);
            intentM1.putExtra("M1", 1);
            startActivity(intentM1);
        } else if (layoutNumber == 2){
            Intent intentM2 = new Intent(this, BackGroundActivity.class);
            intentM2.putExtra("M2", 2);
            startActivity(intentM2);
        } else if (layoutNumber == 3){
            Intent intentM3 = new Intent(this, BackGroundActivity.class);
            intentM3.putExtra("M3", 3);
            startActivity(intentM3);
        } else if (layoutNumber == 4){
            Intent intentM4 = new Intent(this, BackGroundActivity.class);
            intentM4.putExtra("M4", 4);
            startActivity(intentM4);
        } else if (layoutNumber == 5){
            Intent intentM5 = new Intent(this, BackGroundActivity.class);
            intentM5.putExtra("M5", 5);
            startActivity(intentM5);
        } else if (layoutNumber == 6){
            Intent intentM6 = new Intent(this, BackGroundActivity.class);
            intentM6.putExtra("M6", 6);
            startActivity(intentM6);
        } else if (layoutNumber == 7){
            Intent intentM7 = new Intent(this, BackGroundActivity.class);
            intentM7.putExtra("M7", 7);
            startActivity(intentM7);
        } else if (layoutNumber == 8){
            Intent intentM8 = new Intent(this, BackGroundActivity.class);
            intentM8.putExtra("M8", 8);
            startActivity(intentM8);
        } else if (layoutNumber == 9){
            Intent intentM9 = new Intent(this, BackGroundActivity.class);
            intentM9.putExtra("M9", 9);
            startActivity(intentM9);
        } else if (layoutNumber == 10){
            Intent intentM10 = new Intent(this, BackGroundActivity.class);
            intentM10.putExtra("M10", 10);
            startActivity(intentM10);
        }
    }

    public void tape(View v){
        tapesLinearLayout.setVisibility(View.VISIBLE);
    }

    // ドラッグ対象Viewとイベント処理クラスを紐付ける

    public void tape1(View v){
        tapesLinearLayout.setVisibility(View.GONE);
        tapeNumber++;

        if (tapeNumber == 1){
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape1);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape1);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape1);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape1);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape2);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape2);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape2);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape2);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape3);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape3);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape3);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape3);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape4);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape4);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape4);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape4);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape5);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape5);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape5);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape5);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape6);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape6);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape6);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape6);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape7);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape7);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape7);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape7);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape8);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape8);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape8);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape8);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape9);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape9);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape9);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape9);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape10);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape10);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape10);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape10);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape11);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape11);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape11);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape11);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape12);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape12);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape12);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape12);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape13);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape13);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape13);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape13);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape14);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape14);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape14);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape14);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape15);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape15);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape15);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape15);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape16);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape16);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape16);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape16);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape17);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape17);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape17);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape17);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape18);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape18);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape18);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape18);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape19);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape19);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape19);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape19);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
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
            dragTapeView1 = (ImageView) findViewById(R.id.tapeView1);
            dragTapeView1.setImageResource(R.drawable.tape20);
            dragTapeView1.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView1);
            dragTapeView1.setOnTouchListener(listener);
        } else if (tapeNumber == 2){
            dragTapeView2 = (ImageView) findViewById(R.id.tapeView2);
            dragTapeView2.setImageResource(R.drawable.tape20);
            dragTapeView2.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView2);
            dragTapeView2.setOnTouchListener(listener);
        } else if (tapeNumber == 3){
            dragTapeView3 = (ImageView) findViewById(R.id.tapeView3);
            dragTapeView3.setImageResource(R.drawable.tape20);
            dragTapeView3.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView3);
            dragTapeView3.setOnTouchListener(listener);
        } else if (tapeNumber == 4){
            dragTapeView4 = (ImageView) findViewById(R.id.tapeView4);
            dragTapeView4.setImageResource(R.drawable.tape20);
            dragTapeView4.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView4);
            dragTapeView4.setOnTouchListener(listener);
        } else if (tapeNumber == 5){
            dragTapeView5 = (ImageView) findViewById(R.id.tapeView5);
            dragTapeView5.setImageResource(R.drawable.tape20);
            dragTapeView5.setVisibility(View.VISIBLE);
            listener = new DragViewListener(dragTapeView5);
            dragTapeView5.setOnTouchListener(listener);
        } else if (tapeNumber > 5){
            Toast.makeText(this, "can use 5 tapes", Toast.LENGTH_SHORT).show();
        }
    }

    public class DragViewListener implements View.OnTouchListener {
        // ドラッグ対象のView
        private ImageView dragView;
        // ドラッグ中に移動量を取得するための変数
        private int oldX;
        private int oldY;

        public DragViewListener(ImageView dragView) {
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
                    //if (tapeNumber == 1){}
                    //int left = dragView.getLeft() + (x - oldX);
                    param.leftMargin = dragView.getLeft() + (x - oldX);
                    //int top = dragView.getTop() + (y - oldY);
                    param.topMargin = dragView.getTop() + (y - oldY);
                    // Viewを移動する
                    if (tapeNumber == 1){
                        //dragTapeView1.layout(left, top, left + dragView.getWidth(), top + dragView.getHeight());
                        dragTapeView1.layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                    } else if (tapeNumber == 2){
                        //dragTapeView2.layout(left, top, left + dragView.getWidth(), top + dragView.getHeight());
                        dragTapeView2.layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                    } else if (tapeNumber == 3){
                        //dragTapeView2.layout(left, top, left + dragView.getWidth(), top + dragView.getHeight());
                        dragTapeView3.layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                    } else if (tapeNumber == 4){
                        //dragTapeView2.layout(left, top, left + dragView.getWidth(), top + dragView.getHeight());
                        dragTapeView4.layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                    } else if (tapeNumber == 5){
                        //dragTapeView2.layout(left, top, left + dragView.getWidth(), top + dragView.getHeight());
                        dragTapeView5.layout(param.leftMargin, param.topMargin,
                                param.leftMargin + dragView.getWidth(), param.topMargin + dragView.getHeight());
                    }

                    break;
            }

            // 今回のタッチ位置を保持
            oldX = x;
            oldY = y;
            // イベント処理完了
            return true;
        }
    }

    public void save(View v) {
        String memoText = editText.getText().toString();

        float rotate = imageView.getRotation();

        ByteArrayOutputStream BaOsIV = new ByteArrayOutputStream();
        img.compress(Bitmap.CompressFormat.JPEG, 100, BaOsIV);
        String bitmapStrIV = Base64.encodeToString(BaOsIV.toByteArray(), Base64.DEFAULT);
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

        ByteArrayOutputStream BaOsBG = new ByteArrayOutputStream();
        Drawable layoutBackGround = relativeLayout.getBackground();
        Bitmap bg = ((BitmapDrawable)layoutBackGround).getBitmap();
        bg.compress(Bitmap.CompressFormat.JPEG, 100, BaOsBG);
        //↑エラーあり（自分でもまだよくわかってないから解明する前に一回動かしてみてください）
        String bitmapStrBG = Base64.encodeToString(BaOsBG.toByteArray(), Base64.DEFAULT);

        SharedPreferences.Editor editorMemo = preferencesMemo.edit();
        SharedPreferences.Editor editorRotation = preferencesRotation.edit();
        SharedPreferences.Editor editorPhoto = preferencesPhoto.edit();
        SharedPreferences.Editor editorBackGround = preferencesBackground.edit();

        editorMemo.putString("memo", memoText);
        editorRotation.putFloat("Rotation", rotate);
        editorPhoto.putString("img", bitmapStrIV);
        editorBackGround.putString("bg", bitmapStrBG);

        editorMemo.commit();
        editorRotation.commit();
        editorPhoto.apply();
        editorBackGround.apply();

        finish();

        Intent intentSave = new Intent(this, SaveActivity.class);
        startActivity(intentSave);
    }

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


