package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class IntroActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        webView = findViewById(R.id.introWebViewId);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/introdoya.html");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}