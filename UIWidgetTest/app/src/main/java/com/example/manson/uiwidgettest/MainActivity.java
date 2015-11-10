package com.example.manson.uiwidgettest;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_btn(View v){
        Log.d("manson", "btn_click");

        EditText editText = (EditText)findViewById(R.id.edit_text);
        Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();

        ImageView imageView = (ImageView)findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.test_img);

        ProgressBar progressBar = (ProgressBar)findViewById(R.id.process_bar);
        progressBar.setProgress(progressBar.getProgress() + 10);
        /*if(progressBar.getVisibility()==View.GONE){
            progressBar.setVisibility(View.VISIBLE);
        }else{
            progressBar.setVisibility(View.GONE);
        }*/
    }


    public void click_dialog_btn(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("This is a dialog");
        dialog.setMessage("Somethings!");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        dialog.show();
    }

    public void click_process_btn(View view){
        ProgressDialog dialog = new ProgressDialog(MainActivity.this);
        dialog.setTitle("This is a ProgressDialog");
        dialog.setMessage("Loading...");
        dialog.setCancelable(false);

        dialog.show();

    }

}
