package com.julij.arsovreme;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslCertificate;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.webview);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);;
        WebSettings settings = web.getSettings();
        settings.setDomStorageEnabled(true);
        web.setWebViewClient(new Callback());
        web.loadUrl("https://vreme.arso.gov.si/");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}