package com.retexis.armedbattleships.Models;

import java.util.ArrayList;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Ships {

    private ArrayList<Ship> ships;

    public Ships() {
        ships = generateDefaultShips();
    }

    private ArrayList<Ship> generateDefaultShips() {
        ArrayList<Ship> defaultShips = new ArrayList<>();
        defaultShips.add(new Ship(1, 2));
        defaultShips.add(new Ship(2, 3));
        defaultShips.add(new Ship(3, 3));
        defaultShips.add(new Ship(4, 4));
        defaultShips.add(new Ship(5, 5));
        return defaultShips;
    }
}
