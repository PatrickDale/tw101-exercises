package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by patdale on 7/14/15.
 */
public class Troll implements Monster {
    private int hitpoints;
    private String name;

    public Troll() {
        this.hitpoints = 40;
        this.name = "Troll";
    }

    public int currentHitpoints() {
        return this.hitpoints;
    }

    public String name() {
        return this.name;
    }

    public void reportStatus() {
        System.out.println(name() + ": " + currentHitpoints() + " hitpoints.");
    }

    public void takeDamage(int amount) {
        this.hitpoints -= amount/2;
    }
}