package com.retexis.armedbattleships.Models;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.retexis.armedbattleships.R;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Field extends FrameLayout {

    private boolean containsShip = false;
    private boolean hasHit = false;
    private int xID;
    private int yID;
    private TextView fieldTextView;

    public Field(@NonNull Context context, int xID, int yID) {
        super(context);
        this.xID = xID;
        this.yID = yID;

        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        params.width = 100;
        params.height = 100;
        int margin = context.getResources().getDimensionPixelSize(R.dimen.field_TextView_padding);
        params.setMargins(margin, margin, margin, margin);

        fieldTextView = new TextView(context);
        fieldTextView.setTextSize(20);
        fieldTextView.setLayoutParams(params);


        this.addView(fieldTextView);

        fieldTextView.setText(context.getString(R.string.coordinates, xID, yID));
        fieldTextView.setBackgroundColor(context.getResources().getColor(R.color.field_background_default));

    }





}
