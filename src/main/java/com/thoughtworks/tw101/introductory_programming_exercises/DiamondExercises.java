package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    //Helper Methods
    private static int getNumOfAsteriskForLevel(int level) {
        return (level * 2) + 1;
    }

    private static String returnAHorizontalLine(int numOfAsteriskForLevel) {
        String line = "";
        for (int i = 0; i < numOfAsteriskForLevel; i++) {
            line += "*";
        }
        return line;
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int charsPerLevel = (n * 2) - 1;

        for (int i = 0; i < n; i++) {
            int numOfAsteriskForLevel = getNumOfAsteriskForLevel(i);
            String line = returnAHorizontalLine(numOfAsteriskForLevel);
            int padding = getPaddingAmountForLevel(charsPerLevel, numOfAsteriskForLevel);
            line = addPaddingToLine(line, padding);
            System.out.println(line);
        }

    }

    private static String addPaddingToLine(String line, int padding) {
        for (int i = 0; i < padding; i++) {
            line = " " + line + " ";
        }
        return line;
    }

    private static int getPaddingAmountForLevel(int charsPerLevel, int numOfAsteriskForLevel) {
        return (charsPerLevel - numOfAsteriskForLevel) / 2;
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
