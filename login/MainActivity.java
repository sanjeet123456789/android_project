package com.example.sanjeet_pal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userid, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userid = findViewById(R.id.userid);
        pass =  findViewById(R.id.pass);
    }

    public void sendData(View view) {
        String n = userid.getText().toString();
        String p = pass.getText().toString();
        Intent in = new Intent(MainActivity.this,home.class);

        in.putExtra("userid",n);
        in.putExtra("pass",p);
        startActivity(in);
    }

    public void gotosign_up(View view){
        Intent signup = new Intent(MainActivity.this,sign_up.class);
        startActivity(signup);
    }
}