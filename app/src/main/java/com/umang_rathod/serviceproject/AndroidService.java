package com.umang_rathod.serviceproject;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;


/*
1: Extend Service (android.app.Service)
2: Implement the methods
3: Override onStart() and onDestroy() methods --> Generate -> Overriding method -> Choose accordingly
*/

public class AndroidService extends Service {

    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY; // Returns the status of program
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop(); //We need to stop the player :)
    }
}
