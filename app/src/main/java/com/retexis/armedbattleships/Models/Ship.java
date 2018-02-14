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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void decrementHealth() {
        this.health = health--;
    }
}
