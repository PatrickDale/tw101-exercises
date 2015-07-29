package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by patdale on 7/15/15.
 */
public class Player {
    private Scanner input = new Scanner(System.in);

    private boolean notAValidGuess(int guess) {
        return guess <= 0 || guess > 100;
    }

    public int getGuess() {
        int guess = 0;
        while(notAValidGuess(guess)) {
            System.out.print("Enter a number between 1 and 100: ");
            try {
                guess = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a number!");
            }
        }
        return guess;
    }
}