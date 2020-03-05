package com.example.a17bca1237;

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
        String[] cont = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};
//        String[] cont = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME};
        int[] to = {android.R.id.text1, android.R.id.text2};
        Cursor cr=getContentResolver().query(

                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,cont,null,null,null
        );
        String[] n= new String[cr.getCount()];
        int i=0;
        while (cr.moveToNext()){
            n[i++] = cr.getString(1);
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,
                n
        );
        list.setAdapter(adapter);






    }

}

