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
        setContentView(R.layout.hello_world_layout);

        bindEvent();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String data_return = data.getStringExtra("data_return");

        Log.d("onActivityResult", data_return);
        Log.d("onActivityResult", Integer.toString(requestCode));
        Log.d("onActivityResult", Integer.toString(resultCode));
    }

    private void bindEvent(){
       /* Button button1Obj = (Button) findViewById(R.id.button_1);
        button1Obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloWorldActivity.this, "you click button 1", Toast.LENGTH_SHORT).show();
            }
        });*/

        Button button1Obj = (Button) findViewById(R.id.button_1);
        button1Obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelloWorldActivity.this, SecondActivity.class);
                intent.putExtra("extra_data", "Hello SecondActivity");
                startActivityForResult(intent, 10);
                //startActivity(intent);
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
