package com.retexis.armedbattleships.Models;

import android.content.Context;

import com.retexis.armedbattleships.R;

import java.util.ArrayList;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Ships {

    private ArrayList<Ship> ships;
    private Context context;

    public Ships(Context context) {
        ships = new ArrayList<>();
        this.context = context;
        generateDefaultShips();
    }

    private void generateDefaultShips() {
        ships.add(new Ship(1, 2, context.getResources().getColor(R.color.ship1)));
        ships.add(new Ship(2, 3, context.getResources().getColor(R.color.ship2)));
        ships.add(new Ship(3, 3, context.getResources().getColor(R.color.ship3)));
        ships.add(new Ship(4, 4, context.getResources().getColor(R.color.ship4)));
        ships.add(new Ship(5, 5, context.getResources().getColor(R.color.ship5)));
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }
}
