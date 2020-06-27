package com.example.dsc.ocrbillingsystem;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarAnimation extends Animation {
    private Context context;
    private ProgressBar progressBar;
    private TextView textView;
    private float from;
    private float to;

    public ProgressBarAnimation(Context context,ProgressBar progressBar,TextView textView,float from,float to)
    {
        this.context=context;
        this.progressBar=progressBar;
        this.textView=textView;
        this.from=from;
        this.to=to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);

        float value=from+(to-from)*interpolatedTime;
        progressBar.setProgress((int) value);
        textView.setText((int) value+"%");

        if(value==to)
        {
            context.startActivity(new Intent(context,popup.class));
        }
    }
}

