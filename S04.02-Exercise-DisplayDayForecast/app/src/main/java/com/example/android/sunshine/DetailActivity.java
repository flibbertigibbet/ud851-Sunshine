package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mDetailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDetailText = (TextView) findViewById(R.id.tv_detail);

        Intent launchingIntent = getIntent();
        if (launchingIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String weatherText = launchingIntent.getStringExtra(Intent.EXTRA_TEXT);
            mDetailText.setText(weatherText);
        }
    }
}