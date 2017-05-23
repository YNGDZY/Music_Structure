package com.example.deezy.music_structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView streaming = (TextView) findViewById(R.id.streaming);
        streaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent streamingIntent = new Intent(MainActivity.this, Streaming.class);
                startActivity(streamingIntent);
            }
        });
        TextView playlist = (TextView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        TextView library = (TextView) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(MainActivity.this, Library.class);
                startActivity(libraryIntent);
            }
        });
        TextView trending = (TextView) findViewById(R.id.trending);
        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trendingIntent = new Intent(MainActivity.this, Trending.class);
                startActivity(trendingIntent);
            }
        });
        TextView store = (TextView) findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(MainActivity.this, Store.class);
                startActivity(storeIntent);
            }
        });
        TextView settings = (TextView) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(settingsIntent);
            }
        });
    }
}
