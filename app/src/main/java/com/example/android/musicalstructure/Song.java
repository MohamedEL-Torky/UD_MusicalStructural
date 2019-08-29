package com.example.android.musicalstructure;

public class Song {
    private String mSongName;
    private String mWriter;
    /**
     * Image resource ID for the word
     */
    private int mSongCoverID = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Song(String songName, String writerName, int songCover) {
        mSongName = songName;
        mWriter = writerName;
        mSongCoverID = songCover;
    }

    public void setSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    public void setWriter(String mWriter) {
        this.mWriter = mWriter;
    }

    public void setSongCoverID(int mSongCoverID) {
        this.mSongCoverID = mSongCoverID;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getWriter() {
        return mWriter;
    }

    public int getSongCoverID() {
        return mSongCoverID;
    }

    public boolean hasImage() {
        return mSongCoverID != NO_IMAGE_PROVIDED;
    }
}
