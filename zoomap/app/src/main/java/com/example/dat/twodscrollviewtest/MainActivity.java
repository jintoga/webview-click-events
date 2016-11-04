package com.example.dat.twodscrollviewtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends AppCompatActivity {
    WebView webViewMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewMap = (WebView) findViewById(R.id.webViewMap);
        webViewMap.getSettings().setLoadsImagesAutomatically(true);
        webViewMap.getSettings().setJavaScriptEnabled(true);
        webViewMap.getSettings().setLoadWithOverviewMode(true);
        webViewMap.getSettings().setUseWideViewPort(true);
        webViewMap.getSettings().setBuiltInZoomControls(true);
        webViewMap.getSettings().setDisplayZoomControls(false);
        webViewMap.getSettings().setSupportZoom(true);

        webViewMap.addJavascriptInterface(new WebAppInterface(this), "Android");
        webViewMap.loadUrl("file:///android_asset/map.html");
    }
}
