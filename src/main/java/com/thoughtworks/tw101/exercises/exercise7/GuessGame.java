package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by patdale on 7/15/15.
 */
public class GuessGame {
    protected int numberToGuess = (int)(Math.random() * 100.0) + 1;
    protected Player player;

    public GuessGame(Player player) {
        this.player = player;
    }

    protected boolean isCorrectGuess(int guess) {
        return this.numberToGuess == guess;
    }

    public void beginGame() {
        int guess = this.player.getGuess();
        while (!isCorrectGuess(guess)) {
            if (guess < this.numberToGuess) {
                System.out.print("Too low! ");
            } else {
                System.out.print("Too high! ");
            }
            guess = this.player.getGuess();

        }
        System.out.println("Correct!");
    }
}