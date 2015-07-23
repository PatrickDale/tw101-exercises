package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(100);
        print(primeFactors);
    }

    private static void print(List<Integer> primeFactors) {
        for (int e : primeFactors) {
            System.out.println(e);
        }
    }

    // Idea based on : http://www.quora.com/Is-there-a-relation-between-a-number-and-its-largest-prime-factor
    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        if (n > 3) {
            int upperPrimeFactorBound = getUpperPrimeFactorBound(n);
            for (int i = 2; i <= upperPrimeFactorBound; i++) {
                if (n % i == 0 && isPrime(i, primeFactors)) {
                    primeFactors.add(i);
                    upperPrimeFactorBound = n / i;
                }
            }
        }
        return primeFactors;
    }

    private static boolean isPrime(int number, List<Integer> primeFactors) {
        for (int n: primeFactors) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getUpperPrimeFactorBound(int n) {
        return n/2;
    }
}
