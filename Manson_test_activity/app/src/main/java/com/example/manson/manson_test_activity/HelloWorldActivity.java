package com.example.manson.manson_test_activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2015/11/3.
 */
public class HelloWorldActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveIns){
        super.onCreate(saveIns);
        setContentView(R.layout.hello_world_layout);
    }
}
