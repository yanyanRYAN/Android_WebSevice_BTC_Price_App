package com.mybedroom.ryan.webserviceproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button currentBtn = findViewById(R.id.current_btn);
        Button historyBtn = findViewById(R.id.history_btn);
    }

    public void currentButtonClicked(View v){
        //Uri uri = Uri.parse("");
        String url = "http://cs.lewisu.edu/~ryanpecarma/BitcoinWebService/index.html";
        Intent launchCurrentPrice = new Intent(this, Webview.class);
        launchCurrentPrice.putExtra("url", url);
        startActivity(launchCurrentPrice);
    }

    public void historyButtonClicked(View v){
        //Uri uri = Uri.parse("");
        String url = "http://cs.lewisu.edu/~ryanpecarma/BitcoinWebService/history.html";
        Intent launchHistoryPrice = new Intent(this, Webview.class);
        launchHistoryPrice.putExtra("url", url);
        startActivity(launchHistoryPrice);
    }
}
