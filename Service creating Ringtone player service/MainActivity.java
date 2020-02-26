package com.example.a17bca1237;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startPlayer(View view) {
        Intent in=new Intent(this,MyService.class);
        startService(in);
    }

    public void stopPlayer(View view) {
        Intent in=new Intent(this,MyService.class);
        stopService(in);

    }
}

