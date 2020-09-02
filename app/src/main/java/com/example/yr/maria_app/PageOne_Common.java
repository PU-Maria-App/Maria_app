package com.example.yr.maria_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;

/**
 * Created by YR on 2017/6/12.
 */

/* common 常用 */
class PageOne_Common extends PageView{
    public PageOne_Common(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.p1_common, null);

        // match_parent
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(params);

        Button btn_I=(Button)view.findViewById(R.id.btn_I);
        Button btn_you=(Button)view.findViewById(R.id.btn_you);
        Button btn_him=(Button)view.findViewById(R.id.btn_him);
        Button btn_need=(Button)view.findViewById(R.id.btn_need);
        Button btn_noneed=(Button)view.findViewById(R.id.btn_noneed);
        Button btn_dontknow=(Button)view.findViewById(R.id.btn_dontknow);


        btn_I.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.c_i_2);
            }
        });

        btn_you.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.c_you);
            }
        });

        btn_him.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.c_him);
            }
        });

        btn_need.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.c_need);
            }
        });

        btn_noneed.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.c_noneed);
            }
        });

        btn_dontknow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.c_dontknow);
            }
        });

        addView(view);
    }
}
