package com.example.manson.manson_test_activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/11/5.
 */
public class WebViewTestActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveIns){
        super.onCreate(saveIns);
        //setContentView(R.layout.hello_world_layout);
        setContentView(R.layout.webview_layout);

        WebView test_webview = (WebView)findViewById(R.id.test_webview);
        test_webview.getSettings().setJavaScriptEnabled(true);
        test_webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        test_webview.getSettings().setAppCacheEnabled(false);

        //根据手机的密度，设置webview的密度等级
        /*int screenDensity = getResources().getDisplayMetrics().densityDpi ;
        WebSettings.ZoomDensity zoomDensity = WebSettings.ZoomDensity.MEDIUM ;
        switch (screenDensity){
            case DisplayMetrics.DENSITY_LOW :
                zoomDensity = WebSettings.ZoomDensity.CLOSE;
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                zoomDensity = WebSettings.ZoomDensity.MEDIUM;
                break;
            case DisplayMetrics.DENSITY_HIGH:
                zoomDensity = WebSettings.ZoomDensity.FAR;
                break ;
        }
        test_webview.getSettings().setDefaultZoom(zoomDensity);*/

        test_webview.loadUrl("file:///android_asset/html/drawable_test.html");
    }
}
