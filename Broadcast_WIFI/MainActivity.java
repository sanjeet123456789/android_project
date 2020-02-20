package com.example.sanjeet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  MyInterface {
    MyReceiver receiver;
    IntentFilter filter;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.my_layout);
        receiver=new MyReceiver(this);
        filter=new IntentFilter((WifiManager.WIFI_STATE_CHANGED_ACTION));
    }


    @Override
    protected  void onStart(){
        super.onStart();
        registerReceiver(receiver,filter);
    }

    @Override
    protected  void onStop(){
        super.onStop();
        unregisterReceiver(receiver);
    }


    public void updateUI(boolean flag){
        if(flag){
            layout.setBackgroundColor(Color.GREEN);
        }else{
            layout.setBackgroundColor(Color.RED);

        }

    }
}
