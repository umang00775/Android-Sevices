package com.umang_rathod.serviceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // start onclick-lister
        if (v == start){
            startService(new Intent(this, AndroidService.class));
        }
        else if(v == stop){
            stopService(new Intent(this, AndroidService.class));
        }
    }
}