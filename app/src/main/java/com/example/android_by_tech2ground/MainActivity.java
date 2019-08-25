package com.example.android_by_tech2ground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.DialogInterface;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event){

        if (keyCode==KeyEvent.KEYCODE_BACK){
            AlertDialog.Builder alertbox=new AlertDialog.Builder(MainActivity.this);
            alertbox.setTitle("you Want to Exit");
            alertbox.setCancelable(false);
            alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            alertbox.show();
        }
        return super.onKeyDown(keyCode,event);
    }


    // For Option Menu



}