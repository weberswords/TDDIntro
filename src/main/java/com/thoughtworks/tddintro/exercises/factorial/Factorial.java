package com.thoughtworks.tddintro.exercises.factorial;

import java.lang.IllegalArgumentException;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException {

        if (i < 0) {
            throw new IllegalArgumentException("Negative numbers are not acceptable. Try to be more positive.");
        } else {
            if (i == 0) {
                return 1;
            } else {
                return findFactorial(i);
            }
        }
    }

    public Integer findFactorial(Integer i) {
        Integer sum = 0;
        if (i<=1) {
            sum = 1; }
        else {
        sum = i*findFactorial(i-1);
        }
        return sum;
    }
}
