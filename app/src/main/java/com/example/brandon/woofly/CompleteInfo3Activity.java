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

public class CompleteInfo3Activity extends AppCompatActivity {

    Button bt1, bt2, btstarted;
    boolean isSelected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_info3);

        //Fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        btstarted = findViewById(R.id.getStarted);

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
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                if(isSelected==false) {
                    bt2.setBackground(getResources().getDrawable(R.drawable.button_age_selected));
                    bt2.setTextColor(Color.parseColor("#FFFFFF"));
                    isSelected = true;
                    loadButton();
                }else{
                    bt2.setBackground(getResources().getDrawable(R.drawable.button_age));
                    bt2.setTextColor(Color.parseColor("#000000"));
                    isSelected = false;
                    hideButton();
                }


            }
        });

        btstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompleteInfo3Activity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }

    private void loadButton(){
        btstarted.setVisibility(View.VISIBLE);
    }

    private void hideButton(){
        btstarted.setVisibility(View.INVISIBLE);
    }
}
