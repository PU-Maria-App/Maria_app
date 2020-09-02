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

/* food 食物 */
public class PageThree_Food extends PageView{
    public PageThree_Food(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.p3_food, null);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(params);

        Button btn_fruit=(Button)view.findViewById(R.id.btn_fruit);
        Button btn_noodles=(Button)view.findViewById(R.id.btn_noodles);
        Button btn_rice=(Button)view.findViewById(R.id.btn_rice);
        Button btn_snack=(Button)view.findViewById(R.id.btn_snack);
        Button btn_toast=(Button)view.findViewById(R.id.btn_toast);
        Button btn_vegetable=(Button)view.findViewById(R.id.btn_vegetable);

        btn_fruit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.f_fruit);
            }
        });

        btn_noodles.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.f_noodles);
            }
        });

        btn_rice.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.f_rice);
            }
        });

        btn_snack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.f_snack);
            }
        });

        btn_toast.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.f_toast);
            }
        });

        btn_vegetable.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setMusic(R.raw.f_vegetables);
            }
        });

        addView(view);
    }
}
