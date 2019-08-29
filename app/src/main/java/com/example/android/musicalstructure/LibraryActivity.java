package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        /*
        Used Android launcher as a placeholder for all the album art, so it can be changed in future
        * */
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Song 1", "Song Writer: 1", R.mipmap.ic_launcher));
        songs.add(new Song("Song 2", "Song Writer: 2", R.mipmap.ic_launcher));
        songs.add(new Song("Song 3", "Song Writer: 3", R.mipmap.ic_launcher));
        songs.add(new Song("Song 4", "Song Writer: 4", R.mipmap.ic_launcher));
        songs.add(new Song("Song 5", "Song Writer: 5", R.mipmap.ic_launcher));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(songAdapter);
    }
}
