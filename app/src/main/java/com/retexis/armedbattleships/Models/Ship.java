package com.retexis.armedbattleships.Models;

/**
 * Created by matev on 2018. 02. 12..
 */

public class Ship {

    private int id;
    private int size;
    private int health;

    public Ship(int id, int size) {
        this.id = id;
        this.size = size;
        this.health = size;
    }
}
