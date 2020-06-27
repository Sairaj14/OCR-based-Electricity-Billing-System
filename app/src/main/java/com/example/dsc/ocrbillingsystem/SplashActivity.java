package com.example.dsc.ocrbillingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar=findViewById(R.id.progressBar2);
        textView=findViewById(R.id.tv_progress);

        progressBar.setMax(100);
        progressBar.setScaleY(1f);
        progressBar.setX(1f);


        progressAnimation();
    }

    public void progressAnimation(){
        ProgressBarAnimation anim=new ProgressBarAnimation(this,progressBar,textView,0f,100f);
        anim.setDuration(1000);
        progressBar.setAnimation(anim);
    }
}
