package com.shawsyu.scrollingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ScrollingView mScrollingView_fore;
    private ScrollingView mScrollingView_bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScrollingView_bg = (ScrollingView) findViewById(R.id.scrollingView_bg);
        mScrollingView_fore = (ScrollingView) findViewById(R.id.scrollingView_fore);
    }
}
