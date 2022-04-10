package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MonajatActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monajat);
        webView = findViewById(R.id.monajatWebViewId);
        webView.loadUrl("file:///android_asset/monajat/monajat.html");
    }
}