package com.example.brandon.woofly;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class CompleteInfo2Activity extends AppCompatActivity {

    Button btn1, btn2, btn_next;
    boolean isSelected = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_info2);

        //Fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn_next = findViewById(R.id.btn_next);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                if(isSelected==false) {
                    btn1.setBackground(getResources().getDrawable(R.drawable.button_age_selected));
                    btn1.setTextColor(Color.parseColor("#FFFFFF"));
                    isSelected = true;
                    loadButton();
                }else{
                    btn1.setBackground(getResources().getDrawable(R.drawable.button_age));
                    btn1.setTextColor(Color.parseColor("#000000"));
                    isSelected = false;
                    hideButton();
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                if(isSelected==false) {
                    btn2.setBackground(getResources().getDrawable(R.drawable.button_age_selected));
                    btn2.setTextColor(Color.parseColor("#FFFFFF"));
                    isSelected = true;
                    loadButton();
                }else{
                    btn2.setBackground(getResources().getDrawable(R.drawable.button_age));
                    btn2.setTextColor(Color.parseColor("#000000"));
                    isSelected = false;
                    hideButton();
                }


            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompleteInfo2Activity.this, CompleteInfo3Activity.class);
                startActivity(intent);
            }
        });

    }


    private void loadButton(){
        btn_next.setVisibility(View.VISIBLE);
    }

    private void hideButton(){
        btn_next.setVisibility(View.INVISIBLE);
    }
}
