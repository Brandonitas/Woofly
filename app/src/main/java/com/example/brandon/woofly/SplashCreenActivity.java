package com.example.brandon.woofly;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashCreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_creen);

        //Fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        new Handler().postDelayed(new Runnable() {//hilos
            @Override
            public void run() {
                Intent intent = new Intent(SplashCreenActivity.this, HowWorks1Activity.class);
                startActivity(intent);
                finish();//Matamos la actividad para que no pueda regresar
            }
        },3000);
    }
}
