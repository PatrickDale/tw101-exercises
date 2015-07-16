package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.Player;
import java.util.ArrayList;

/**
 * Created by patdale on 7/15/15.
 */
public class SmartPlayer extends Player {
    private ArrayList<Integer> guessList = new ArrayList<>();

    @Override
    public int getGuess() {
        int guess = super.getGuess();
        this.guessList.add(guess);
        return guess;
    }

    public void printGuessList() {
        System.out.print("Your guesses were: ");
        String toPrint = "";
        for (int guess : this.guessList) {
            toPrint += guess + ", ";
        }
        System.out.print(toPrint.substring(0, toPrint.length() - 2));
    }
}