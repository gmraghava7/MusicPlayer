package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }
    public void previous(View view)
    {
        Toast.makeText(getApplicationContext(),"Previous song",Toast.LENGTH_SHORT).show();
    }
    public void play(View view)
    {
        Toast.makeText(getApplicationContext(),"Play/Pause",Toast.LENGTH_SHORT).show();
    }
    public void next(View view)
    {
        Toast.makeText(getApplicationContext(),"Next song",Toast.LENGTH_SHORT).show();
    }
}
