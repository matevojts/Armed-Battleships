package com.retexis.armedbattleships.Models;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.retexis.armedbattleships.Managers.ShootingManager;
import com.retexis.armedbattleships.R;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Field extends FrameLayout {

    private int shipID = 0;
    private boolean hasHit = false;
    private int xID;
    private int yID;
    private TextView fieldTextView;

    public Field(@NonNull final Context context, int xID, int yID) {
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

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ShootingManager.shoot(context, Field.this, new Ships());
            }
        });

    }

    public Field(@NonNull Context context, @Nullable AttributeSet attrs, int xID, int yID) {
        super(context, attrs);
        this.xID = xID;
        this.yID = yID;
    }

    public Field(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int xID, int yID) {
        super(context, attrs, defStyleAttr);
        this.xID = xID;
        this.yID = yID;
    }

    public Field(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes, int xID, int yID) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.xID = xID;
        this.yID = yID;
    }



    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public boolean hasHit() {
        return hasHit;
    }

    public void setHasHit(boolean hasHit) {
        this.hasHit = hasHit;
    }

    public int getxID() {
        return xID;
    }

    public void setxID(int xID) {
        this.xID = xID;
    }

    public int getyID() {
        return yID;
    }

    public void setyID(int yID) {
        this.yID = yID;
    }

    public TextView getFieldTextView() {
        return fieldTextView;
    }
}
