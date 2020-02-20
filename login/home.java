package com.example.sanjeet_pal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {

    TextView uid,wel;
    String pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        uid = findViewById(R.id.uid);
        wel = findViewById(R.id.welcome);
        String userid = getIntent().getStringExtra("userid");
//        uid.setText(userid);
        String pass = getIntent().getStringExtra("pass");
        if (pass.equals("pal") && userid.equals("sanjeet"))
        {
            wel.setText("Welcome!  "+userid);
        }
        else
        {
            wel.setText("Sorry. Wrong Password.");
        }
    }
}
