package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

        int sum = 0;
        for (int n = i; n > 0; n--) {
            if (n > 1) {
                int result = n * (n - 1);
                sum += result;
            } else {
                sum = 1;
            }
        }
        return sum;
    }
}
