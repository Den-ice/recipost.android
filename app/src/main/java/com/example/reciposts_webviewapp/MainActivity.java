package com.example.reciposts_webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());//loads website to app
        webView.loadUrl("https://reciposts.com/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    //method requires to use back button to go to previous webpage
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        }else{
            super.onBackPressed();
        }

    }
}
