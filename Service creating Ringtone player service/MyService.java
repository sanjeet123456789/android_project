package com.example.a17bca1237;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyService extends Service {
  MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player =MediaPlayer.create(this,
                Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
        System.out.println("Adsf");
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.print("stop");
        player.stop();
    }
}
