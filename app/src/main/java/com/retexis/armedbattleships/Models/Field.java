package com.retexis.armedbattleships.Models;

import android.content.Context;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Field extends android.support.v7.widget.AppCompatTextView {

    private boolean containsShip;
    private boolean hasHit;
    private int xID;
    private int yID;


    public Field(Context context, int xIndex, int yIndex) {
        super(context);
        containsShip = false;
        hasHit = false;
        xID = xIndex;
        yID = yIndex;
    }
}
