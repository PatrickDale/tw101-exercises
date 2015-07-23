package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static final int SMALLEST_PRIME_FACTOR = 2;
    public static final int SMALLEST_COMPOSITE_NUMBER = 4;

    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
//        print(primeFactors);
    }

    private static void print(List<Integer> primeFactors) {
        for (int e : primeFactors) {
            System.out.println(e);
        }
    }

    private static boolean isAtLeastSmallestCompositeNumber(int n) {
        return n >= SMALLEST_COMPOSITE_NUMBER;
    }

    private static int getUpperPrimeFactorBound(int n) {
        return n / SMALLEST_PRIME_FACTOR;
    }

    private static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    private static boolean isPrime(int number, List<Integer> primeFactors) {
        for (int primeFactor: primeFactors) {
            if (isDivisible(number, primeFactor)) {
                return false;
            }
        }
        return true;
    }

    private static int lowerUpperPrimeFactorBound(int currentUpperBound, int numberToBeFactored) {
        return numberToBeFactored / currentUpperBound;
    }

    // Idea based on : http://www.quora.com/Is-there-a-relation-between-a-number-and-its-largest-prime-factor
    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        if (isAtLeastSmallestCompositeNumber(n)) {
            int upperPrimeFactorBound = getUpperPrimeFactorBound(n);
            for (int i = SMALLEST_PRIME_FACTOR; i <= upperPrimeFactorBound; i++) {
                if (isDivisible(n, i) && isPrime(i, primeFactors)) {
                    primeFactors.add(i);
                    upperPrimeFactorBound = lowerUpperPrimeFactorBound(i, n);
                }
            }
        }
        return primeFactors;
    }
}
