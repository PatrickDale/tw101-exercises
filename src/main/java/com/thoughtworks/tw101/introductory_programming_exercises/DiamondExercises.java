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

    private static void drawAnIsoscelesTriangleLevel(int level, int maxLevel) {
        int numOfAsteriskForLevel = getNumOfAsteriskForLevel(level);
        int amountOfPadding = getAmountOfPaddingForLevel(level, maxLevel);
        drawAHorizontalLineWithPadding(numOfAsteriskForLevel, amountOfPadding);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            drawAnIsoscelesTriangleLevel(i, n);
        }
    }

//  Helper Method
    private static void drawADiamondTail(int n) {
        int maxTailWidth = n - 2;
        for (int i = maxTailWidth;i >= 0; i--) {
            drawAnIsoscelesTriangleLevel(i, n);
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
        drawAnIsoscelesTriangle(n);
        drawADiamondTail(n);
    }

//  Helper methods
    private static void drawAnIsoscelesTriangleWithYourName(int n) {
        int maxTriangleWidth = n - 1;
        for (int i = 0; i < maxTriangleWidth; i++) {
            drawAnIsoscelesTriangleLevel(i, n);
        }
        drawMyName("Pat");
    }

    private static void drawMyName(String name) {
        System.out.println(name);
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
        drawAnIsoscelesTriangleWithYourName(n);
        drawADiamondTail(n);
    }
}