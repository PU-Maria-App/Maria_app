package com.example.yr.maria_app;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.LinearLayout;

/**
 * Created by YR on 2017/6/12.
 */

public class PageView extends LinearLayout {
    public PageView(Context context) {
        super(context);

    }
    public void setMusic(int music){
        MediaPlayer media=new MediaPlayer();
        media=MediaPlayer.create(getContext(),music);
        media.start();
    }
}
