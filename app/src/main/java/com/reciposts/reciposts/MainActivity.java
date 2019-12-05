package com.reciposts.reciposts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView)findViewById(R.id.webview);
        WebSettings websettings = mywebview.getSettings();
        websettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://s3-us-west-1.amazonaws.com/reciposts.com/index.html");

        mywebview.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (mywebview.canGoBack()){
            mywebview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
