package com.example.manson.uiwidgettest.customWidget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.manson.uiwidgettest.R;

/**
 * Created by Administrator on 2015/11/10.
 */
public class TitleBar extends LinearLayout {

    public TitleBar(Context context,AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);

        findViewById(R.id.title_back_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("ssss", "test");
                ((Activity) getContext()).finish();
            }
        });
    }
}
