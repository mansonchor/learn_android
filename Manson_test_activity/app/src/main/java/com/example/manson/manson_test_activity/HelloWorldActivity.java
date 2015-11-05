package com.example.manson.manson_test_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/11/3.
 */
public class HelloWorldActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveIns){
        super.onCreate(saveIns);
        //setContentView(R.layout.hello_world_layout);
        setContentView(R.layout.drawable_scrale_test_layout);

        bindEvent(true);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void bindEvent(){
        Button button1Obj = (Button) findViewById(R.id.button_1);
        button1Obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorldActivity.this, "you click button 1", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void bindEvent(Boolean goToWebView){
        Button button1Obj = (Button) findViewById(R.id.go_webview_btn);
        button1Obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, WebViewTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
