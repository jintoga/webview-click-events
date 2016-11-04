package com.example.dat.twodscrollviewtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends AppCompatActivity {
    WebView webViewMap;
    Button btnCage14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewMap = (WebView) findViewById(R.id.webViewMap);
        webViewMap.getSettings().setLoadsImagesAutomatically(true);
        webViewMap.getSettings().setJavaScriptEnabled(true);
        webViewMap.getSettings().setLoadWithOverviewMode(true);
        webViewMap.getSettings().setUseWideViewPort(true);

        webViewMap.addJavascriptInterface(new WebAppInterface(this), "Android");
        webViewMap.loadUrl("file:///android_asset/map.html");
    }
}
