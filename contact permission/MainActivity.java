package com.example.sanejet_pal_contact;
//Retrieving contact name and displaying it in an list view
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Uri uri= ContactsContract.Contacts.CONTENT_URI;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.pal);
        getContacts();
    }

    public void getContacts(){
        Cursor cr=getContentResolver().query(
                uri,null,null,null,null
        );
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,
                cr.getColumnNames()

        );
        list.setAdapter(adapter);


    }

}
