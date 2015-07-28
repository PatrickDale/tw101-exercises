package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by patdale on 7/14/15.
 */
public class Orc implements Monster {
    private int hitpoints;
    private String name;

    public Orc() {
        this.hitpoints = 20;
        this.name = "Orc";
    }

    public void reportStatus() {
        System.out.println(this.name + ": " + this.hitpoints + " hitpoints.");
    }

    public void takeDamage(int amount) {
        this.hitpoints -= amount;
    }
}