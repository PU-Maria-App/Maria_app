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

/* physiological 生理 */
public class PageTwo_Physiological extends PageView{
    public PageTwo_Physiological(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.p2_physiological, null);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(params);

        Button btn_cold=(Button)view.findViewById(R.id.btn_cold);
        Button btn_hot=(Button)view.findViewById(R.id.btn_hot);
        Button btn_hungry=(Button)view.findViewById(R.id.btn_hungry);
        Button btn_sleep=(Button)view.findViewById(R.id.btn_sleep);
        Button btn_thirsty=(Button)view.findViewById(R.id.btn_thirsty);
        Button btn_uncomfortable=(Button)view.findViewById(R.id.btn_uncomfortable);

        btn_cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.phy_cold);
            }
        });

        btn_hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.phy_hot);
            }
        });

        btn_hungry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.phy_hungry);
            }
        });

        btn_sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.phy_sleep);
            }
        });

        btn_thirsty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.phy_thirsty);
            }
        });

        btn_uncomfortable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.phy_uncomfortable);
            }
        });

        addView(view);
    }
}
