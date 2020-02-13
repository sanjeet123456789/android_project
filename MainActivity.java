package com.example.sanjeet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
//    ListView mylist;
//    String names[]={"Apple","banana","grapes","Cherry","cherry","cherry","cherry"};
//    int imgs[]={R.drawable.ic_launcher_foreground,
//    R.drawable.ic_launcher_foreground,R.drawable.pal,
//    R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
//    R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};


    //for custom_layout_02
    ListView mylist;

    String ques[]={"full from of CPU","Question 2"};
    String opts1[]={"central processing unit","option 1"};
    String opts2[]={"center processing unit","option 2"};
    String opts3[]={"computer processing unit","optiion 3"};
    String opts4[]={"commom processing unit","option 4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist=findViewById(R.id.mylist);
        MyAdpter adapter=new MyAdpter(this,ques,opts1,opts2,opts3,opts4);
        mylist.setAdapter(adapter);


    }
}

class MyAdpter extends BaseAdapter{
    String q[],op1[],op2[],op3[],op4[];
    int i[];
    Activity c;

    public MyAdpter(Context context, String[] ques,String[] opt1,String[] opt2,String[] opt3,String[] opt4){
        c=(Activity)context;
        q=ques;
        op1=opt1;
        op2=opt2;
        op3=opt3;
        op4=opt4;



    }
    @Override
    public int getCount(){return 2;}
    @Override
    public Object getItem(int position){

        return null;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=c.getLayoutInflater();
        View view= inflater.inflate(R.layout.custom_layout_02,parent,false);
//        ImageView imgz;
//        TextView txtz;
//        imgz=view.findViewById()
//        imgz=view.findViewById(R.id.imgz);
//        txtz=view.findViewById(R.id.txtz);
//        imgz.setImageResource(i[position]);
//        txtz.setText(n[position]);


        TextView txt;
        RadioButton ropt1,ropt2,ropt3,ropt4;
        txt=view.findViewById(R.id.ques);
        ropt1=view.findViewById(R.id.opt1);
        ropt2=view.findViewById(R.id.opt2);
        ropt3=view.findViewById(R.id.opt3);
        ropt4=view.findViewById(R.id.opt4);
        txt.setText((position)+". "+q[position]);
        ropt1.setText(op1[position]);
        ropt2.setText(op2[position]);
        ropt3.setText(op3[position]);
        ropt4.setText(op4[position]);



        return view;
    }
}