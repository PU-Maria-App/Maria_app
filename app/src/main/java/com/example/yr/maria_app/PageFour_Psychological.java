package com.example.yr.maria_app;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;

/**
 * Created by YR on 2017/6/12.
 */

/* psychological 心理 */
public class PageFour_Psychological extends PageView {
    public PageFour_Psychological(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.p4_psychological, null);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(params);

        Button btn_angry=(Button)view.findViewById(R.id.btn_angry);
        Button btn_happy=(Button)view.findViewById(R.id.btn_happy);
        Button btn_hate=(Button)view.findViewById(R.id.btn_hate);
        Button btn_like=(Button)view.findViewById(R.id.btn_like);
        Button btn_sad=(Button)view.findViewById(R.id.btn_sad);
        Button btn_upset=(Button)view.findViewById(R.id.btn_upset);

        btn_angry.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.psy_angry);
            }
        });

        btn_happy.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.psy_happy);
            }
        });

        btn_hate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.psy_hate);
            }
        });

        btn_like.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.psy_like);
            }
        });

        btn_sad.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.psy_sad);
            }
        });

        btn_upset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.psy_upset);
            }
        });

        addView(view);
    }
}
