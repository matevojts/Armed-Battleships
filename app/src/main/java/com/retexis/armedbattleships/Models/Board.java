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

        for (int x = 0; x < BOARD_WIDTH; x++) {

            for (int y = 0; y < BOARD_HEIGHT; y++) {

                fields[x][y] = new Field(getContext(), x, y);
                this.addView(fields[x][y]);
            }
        }
//        Ships ships = new Ships();
    }

//    public void addFieldsToBoard() {
//
//        for (int x = 0; x < BOARD_WIDTH; x++) {
//
//            for (int y = 0; y < BOARD_HEIGHT; y++) {
//
//                Field. param = new LayoutParams();
//                param.height = LayoutParams.WRAP_CONTENT;
//                param.width = LayoutParams.WRAP_CONTENT;
//                param.setGravity(Gravity.CENTER);
//                param.set
//
////                Field c = fields[x][y];
////                c.setLayoutParams(param);
////
////                this.addView(fields[x][y], 100, 100);
//                fields[x][y].setLayoutParams(param);
//                this.addView(fields[x][y]);
//            }
//        }
//    }



}
