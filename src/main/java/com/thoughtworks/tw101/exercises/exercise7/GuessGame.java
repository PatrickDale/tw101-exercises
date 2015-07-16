package com.thoughtworks.tw101.exercises.exercise7;

import javax.sound.midi.Soundbank;

/**
 * Created by patdale on 7/15/15.
 */
public class GuessGame {
    private int numberToGuess = (int)(Math.random() * 100.0) + 1;

    private boolean isCorrectGuess(int guess) {
        return this.numberToGuess == guess;
    }

    public void beginGame() {
        Player player = new Player();
        int guess = player.getGuess();
        while (!isCorrectGuess(guess)) {
            if (guess < this.numberToGuess) {
                System.out.print("Too low! ");
            } else {
                System.out.print("Too high! ");
            }
            guess = player.getGuess();

        }
        System.out.println("Correct!");
    }
}