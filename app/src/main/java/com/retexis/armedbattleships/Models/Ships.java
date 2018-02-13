package com.retexis.armedbattleships.Models;

import java.util.ArrayList;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Ships {

    private ArrayList<Ship> ships;

    public Ships() {
        generateDefaultShips();
    }

    private void generateDefaultShips() {
        ships.add(new Ship(1, 2));
        ships.add(new Ship(2, 3));
        ships.add(new Ship(3, 3));
        ships.add(new Ship(4, 4));
        ships.add(new Ship(5, 5));
    }
}
