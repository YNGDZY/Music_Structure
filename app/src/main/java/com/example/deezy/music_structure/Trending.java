package com.example.deezy.music_structure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Trending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView description = (TextView) findViewById(R.id.descriptionText);
        description.setText(R.string.trending_desc);
    }
}
