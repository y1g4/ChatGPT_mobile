package com.yfrank.chatgpt_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings= mywebView.getSettings();
        mywebView.getSettings().setJavaScriptEnabled(true);
        mywebView.loadUrl("https://chat.openai.com/");

        mywebView.setWebViewClient(new WebViewClient());

        mywebView.getSettings().setUserAgentString(System.getProperty("http.agent"));
    }

    public void onBackPressed() {
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }

        else{
            super.onBackPressed();
        }
    }
}