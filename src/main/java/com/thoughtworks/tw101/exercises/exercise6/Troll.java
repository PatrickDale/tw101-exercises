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

    public void reportStatus() {
        System.out.println(this.name + ": " + this.hitpoints + " hitpoints.");
    }

    public void takeDamage(int amount) {
        this.hitpoints -= amount/2;
    }
}