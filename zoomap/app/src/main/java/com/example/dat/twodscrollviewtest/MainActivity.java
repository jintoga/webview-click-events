package com.example.dat.twodscrollviewtest;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

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

        webViewMap.addJavascriptInterface(new WebAppInterface(this), "Android");
        webViewMap.loadUrl("file:///android_asset/map.html");


    }



}
