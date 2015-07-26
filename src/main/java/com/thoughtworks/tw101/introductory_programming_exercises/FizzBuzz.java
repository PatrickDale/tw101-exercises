package com.thoughtworks.tw101.introductory_programming_exercises;

//FizzBuzz Exercise
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to
//        certain rules.
//
//        Create a fizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".
//
//        Sample Output:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        for (int i = 1; i < 101; i ++) {
            fizzBuzzPrint(i);
        }
    }

    private static void fizzBuzzPrint(int number) {
        if (numberIsDivisibleByThreeAndFive(number)) {
            System.out.println("FizzBuzz");
        } else if (numberIsDivisibleByThree(number)) {
            System.out.println("Fizz");
        } else if (numberIsDivisibleByFive(number)) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

    private static boolean isDivisibleBy(int number, int divisor) {
        return (number % divisor) == 0;
    }

    private static boolean numberIsDivisibleByFive(int number) {
        return isDivisibleBy(number, 5);
    }

    private static boolean numberIsDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

    private static boolean numberIsDivisibleByThreeAndFive(int number) {
        return numberIsDivisibleByThree(number) && numberIsDivisibleByFive(number);
    }
}
