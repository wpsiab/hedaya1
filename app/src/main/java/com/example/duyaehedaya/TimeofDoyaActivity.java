package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class TimeofDoyaActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeof_doya);

        webView = findViewById(R.id.timeofDoyaWebViewId);
        webView.loadUrl("file:///android_asset/timeofdoya.html");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}