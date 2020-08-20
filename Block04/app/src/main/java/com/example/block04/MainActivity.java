package com.example.block04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer Music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Music = MediaPlayer.create(this, R.raw.song);
        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Music.setLooping(isChecked);
            }
        });
    }
    public void playMusic (View v) {
        Music.start();
    }
    public void pauseMusic (View v){
        if(Music.isPlaying())
        Music.pause();
    }
}