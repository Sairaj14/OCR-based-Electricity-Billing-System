package com.example.dsc.ocrbillingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class popup extends AppCompatActivity {
    private Button btncan,btnpay;
    private TextView err;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;
        getWindow().getAttributes();
        String sc=getIntent().getStringExtra("scn");
        String sb=getIntent().getStringExtra("sbn");
        String error=getIntent().getStringExtra("err");
        btncan=(Button) findViewById(R.id.btnCancel);
        btnpay=(Button) findViewById(R.id.btnpay);
        err=(TextView)findViewById(R.id.txtError);
        err.setText(error);
        btncan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(popup.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(popup.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(popup.this,popup.class);
        startActivity(i);
    }
}