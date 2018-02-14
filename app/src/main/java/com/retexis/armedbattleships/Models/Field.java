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
    private int rowNo;
    private int columnNo;
    private TextView fieldTextView;

    public Field(@NonNull final Context context, int rowNo, int columnNo) {
        super(context);
        this.rowNo = rowNo;
        this.columnNo = columnNo;

        initTextView(context);
        this.addView(fieldTextView);
        fieldTextView.setText(context.getString(R.string.coordinates, rowNo, columnNo));

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ShootingManager.shoot(context, Field.this, new Ships(context));
            }
        });

    }

    public Field(@NonNull Context context, @Nullable AttributeSet attrs, int rowNo, int columnNo) {
        super(context, attrs);
        this.rowNo = rowNo;
        this.columnNo = columnNo;
    }

    public Field(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int rowNo, int columnNo) {
        super(context, attrs, defStyleAttr);
        this.rowNo = rowNo;
        this.columnNo = columnNo;
    }

    public Field(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes, int rowNo, int columnNo) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.rowNo = rowNo;
        this.columnNo = columnNo;
    }

    private void initTextView(Context context) {
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.width = 100;
        params.height = 100;
        int margin = context.getResources().getDimensionPixelSize(R.dimen.field_TextView_padding);
        params.setMargins(margin, margin, margin, margin);

        fieldTextView = new TextView(context);
        fieldTextView.setLayoutParams(params);
        fieldTextView.setTextSize(20);
        fieldTextView.setGravity(Gravity.CENTER);
        fieldTextView.
                setBackgroundColor(context.getResources().getColor(R.color.field_background_default));
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

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public int getColumnNo() {
        return columnNo;
    }

    public void setColumnNo(int columnNo) {
        this.columnNo = columnNo;
    }

    public TextView getFieldsTextView() {
        return fieldTextView;
    }
}
