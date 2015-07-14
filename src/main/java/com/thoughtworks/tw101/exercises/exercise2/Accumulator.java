package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int accumulator;

    public void increment() {
        this.accumulator ++;
    }

    public void total() {
        System.out.println(this.accumulator);
    }
}
