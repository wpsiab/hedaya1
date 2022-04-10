package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class InstActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst);

        webView = findViewById(R.id.instWebViewId);
        webView.loadUrl("file:///android_asset/instdoya.html");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}