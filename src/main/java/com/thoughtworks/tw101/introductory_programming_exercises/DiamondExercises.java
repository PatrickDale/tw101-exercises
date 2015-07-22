package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//  Helper Methods
    private static int getNumOfAsteriskForLevel(int level) {
        return (level * 2) + 1;
    }

    private static int getAmountOfPaddingForLevel(int level, int maxLevel) {
        return maxLevel - (level + 1);
    }

    private static void drawAHorizontalLineWithPadding(int numOfAsterisks, int amountOfPadding) {
        printPadding(amountOfPadding);
        TriangleExercises.pubDrawAHorizontalLine(numOfAsterisks);
    }

    private static void printPadding(int amountOfPadding) {
        for (int i = 0; i < amountOfPadding; i++) {
            System.out.print(" ");
        }
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int numOfAsteriskForLevel = getNumOfAsteriskForLevel(i);
            int amountOfPadding = getAmountOfPaddingForLevel(i,n);
            drawAHorizontalLineWithPadding(numOfAsteriskForLevel, amountOfPadding);
        }
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }
}
