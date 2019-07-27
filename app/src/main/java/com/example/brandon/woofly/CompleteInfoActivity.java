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

public class CompleteInfoActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, btn_nex;
    int i = 0;
    boolean isSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_info);

//Fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        bt1 = findViewById(R.id.edad1);
        bt2 = findViewById(R.id.edad2);
        bt3 = findViewById(R.id.edad3);
        bt4 = findViewById(R.id.edad4);
        bt5 = findViewById(R.id.edad5);
        btn_nex = findViewById(R.id.btn_next);


        btn_nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompleteInfoActivity.this, CompleteInfo2Activity.class);
                startActivity(intent);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                if(isSelected==false) {
                    bt1.setBackground(getResources().getDrawable(R.drawable.button_age_selected));
                    bt1.setTextColor(Color.parseColor("#FFFFFF"));
                    isSelected = true;
                    loadButton();
                }else{
                    bt1.setBackground(getResources().getDrawable(R.drawable.button_age));
                    bt1.setTextColor(Color.parseColor("#000000"));
                    isSelected = false;
                    hideButton();
                }


            }


        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void loadButton(){
        btn_nex.setVisibility(View.VISIBLE);
    }

    private void hideButton(){
        btn_nex.setVisibility(View.INVISIBLE);
    }
}
