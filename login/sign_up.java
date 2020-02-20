package com.example.sanjeet_pal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void gotosign_in(View view){
        Intent sign_in=new Intent(sign_up.this,MainActivity.class);
        startActivity(sign_in);
    }

    public void palsign_up(View view){
        String name = name_sign_up.getText().toString();
        String uname = user_id.getText().toString();
        Intent in = new Intent(MainActivity.this,home.class);

        in.putExtra("userid",n);
        in.putExtra("pass",p);
        startActivity(in);
    }
}
