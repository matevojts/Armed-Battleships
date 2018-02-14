package com.retexis.armedbattleships.Models;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;

/**
 * Created by matev on 2018. 02. 13..
 */

public class Board extends GridLayout {

    private final int BOARD_WIDTH = 10;
    private final int BOARD_HEIGHT = 10;
    private Field[][] fields;

    public Board(Context context) {
        super(context);
        initBoard();
    }

    public Board(Context context, AttributeSet attrs) {
        super(context, attrs);
        initBoard();
    }

    public Board(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBoard();
    }

    public Board(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initBoard();
    }

    public void initBoard() {
        this.setRowCount(BOARD_HEIGHT);
        this.setColumnCount(BOARD_WIDTH);
        fields = new Field[BOARD_HEIGHT][BOARD_WIDTH];

        for (int rowNo = 0; rowNo < BOARD_WIDTH; rowNo++) {

            for (int columnNo = 0; columnNo < BOARD_HEIGHT; columnNo++) {

                fields[rowNo][columnNo] = new Field(getContext(), rowNo, columnNo);
                this.addView(fields[rowNo][columnNo]);
            }
        }
    }

    public Field getField(int rowNo, int columnNo) {
        return fields[rowNo][columnNo];
    }
}
