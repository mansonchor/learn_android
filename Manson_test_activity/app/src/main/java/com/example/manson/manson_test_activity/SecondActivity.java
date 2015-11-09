package com.example.manson.manson_test_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import base.ActivityController;
import base.BaseActivity;

/**
 * Created by Administrator on 2015/11/9.
 */
public class SecondActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle saveIns) {
        super.onCreate(saveIns);
        setContentView(R.layout.second_layout);

        Log.d("secondActivity", this.toString());

        /*Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        TextView second_extra_text = (TextView)findViewById(R.id.second_extra_text);
        second_extra_text.setText(data);*/

        bindEvent();
    }

    private void bindEvent(){
        Button button = (Button)findViewById(R.id.second_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, HelloWorldActivity.class);
                startActivity(intent);
                /*intent.putExtra("data_return","Hello firstActivity");
                setResult(RESULT_OK, intent);
                finish();*/
            }
        });
    }

    /*@Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello firstActivity,come from backpress");
        setResult(RESULT_OK, intent);
        //finish();
    }*/

    @Override
    public void onBackPressed() {
        ActivityController.finishAll();
    }
}
