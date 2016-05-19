package com.fansy.ui;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fansy.R;

public class LoadingActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        TextView tvLoadInfo = (TextView) findViewById(R.id.tv_loading_info);

        AssetManager assetManager = getAssets();
        Typeface fromAsset = Typeface.createFromAsset(assetManager, "fonts/Lobster-1.4.otf");
        tvLoadInfo.setTypeface(fromAsset);
    }


}
