package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void music(View view)
    {
        Intent music= new Intent(this,MusicActivity.class);
        startActivity(music);
    }
    public void playMusic(View view)
    {
        Intent playMusic= new Intent(this,PlayActivity.class);
        startActivity(playMusic);
    }
    public void onlineMusic(View view)
    {
        Intent onlineMusic= new Intent(this,OnlineMusicActivity.class);
        startActivity(onlineMusic);
    }
    public void favorites(View view)
    {
        Intent favorites = new Intent(this,FavoritesActivity.class);
        startActivity(favorites);
    }
    public void playlists(View view)
    {
        Intent playlists = new Intent(this,PlaylistsActivity.class);
        startActivity(playlists);
    }
    public void downloads(View view)
    {
        Toast.makeText(getApplicationContext(),"No Downloads",Toast.LENGTH_SHORT).show();

    }
    public void details(View view)
    {
        Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
    }
}
