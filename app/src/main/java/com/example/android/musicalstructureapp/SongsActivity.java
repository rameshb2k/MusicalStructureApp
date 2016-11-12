package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        TextView home = (TextView) findViewById(R.id.home_button);

        // Set a click listener on that numbers View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        TextView play = (TextView) findViewById(R.id.play_button);

        // Set a click listener on that numbers View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SongsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });
        TextView artist = (TextView) findViewById(R.id.artist_button);

        // Set a click listener on that numbers View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent plusIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                startActivity(plusIntent);
            }
        });


    }
}
