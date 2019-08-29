package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    private ImageButton mLibraryIB;
    private ImageButton mPreviousIB;
    private ImageButton mPlayIB;
    private ImageButton mNextIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        mPreviousIB = findViewById(R.id.previous_song);
        mPlayIB = findViewById(R.id.play_song);
        mNextIB = findViewById(R.id.next_song);
        mLibraryIB = findViewById(R.id.music_library);

        mPreviousIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Previous Song", Toast.LENGTH_SHORT).show();
            }
        });

        mPlayIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Play", Toast.LENGTH_SHORT).show();
            }
        });

        mNextIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Next Song", Toast.LENGTH_SHORT).show();
            }
        });

        mLibraryIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(NowPlayingActivity.this, LibraryActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
