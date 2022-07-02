package com.tw;

public class Factorial {

    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if (number == 0) return 1;
        int prod = 1;
        for (int factor = this.number; factor > 1; factor--) {
            prod *= factor;
        }
        return prod;
    }
}
