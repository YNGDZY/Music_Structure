package com.example.deezy.music_structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Trending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView description = (TextView) findViewById(R.id.descriptionText);
        description.setText(R.string.trending_desc);
        Button prev = (Button) findViewById(R.id.prevButton);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prevIntent = new Intent(Trending.this, Library.class);
                startActivity(prevIntent);
            }
        });
        Button next = (Button) findViewById(R.id.nextButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent = new Intent(Trending.this, Store.class);
                startActivity(nextIntent);
            }
        });
    }
}
