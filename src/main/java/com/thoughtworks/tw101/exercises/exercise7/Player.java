package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by patdale on 7/15/15.
 */
public class Player {
    private Scanner input = new Scanner(System.in);

    public int getGuess() {
        System.out.print("Enter a number between 1 and 100: ");
        int guess;
        while (true) {
            try {
                guess = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Enter a number between 1 and 100: ");
            }
        }
        return guess;
    }
}