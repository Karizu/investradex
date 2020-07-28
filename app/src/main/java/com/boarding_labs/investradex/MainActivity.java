package com.boarding_labs.investradex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    WebView wb;
    ProgressBar progressBar;
    int PIC_WIDTH = 360;

    @OnClick(R.id.btnHome)
    void onClickbtnHome(){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnIndicate)
    void onClickbtnIndicate(){
        Intent intent = new Intent(MainActivity.this, IndicateActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnLiquid)
    void onClickbtnLiquid(){
        Intent intent = new Intent(MainActivity.this, Liquid45Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnPortofolio)
    void onClickbtnPortofolio(){
        Intent intent = new Intent(MainActivity.this, PortofolioActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
