package com.example.sanjeet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    MyInterface myInterface;
    public MyReceiver(MyInterface myInterface){
        this.myInterface=myInterface;
    }



    @Override
    public void onReceive(Context context, Intent intent){
        int state=intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,-1);
        if(state==WifiManager.WIFI_STATE_ENABLED){
            Toast.makeText(context,"wifi is on",Toast.LENGTH_LONG).show();
    myInterface.updateUI(true);
        }else if(state==WifiManager.WIFI_STATE_DISABLED){
            Toast.makeText(context,"wifi is off",Toast.LENGTH_LONG).show();
            myInterface.updateUI(false);
        }

    }

}
