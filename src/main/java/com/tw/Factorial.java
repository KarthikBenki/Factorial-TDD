package com.tw;

public class Factorial {

    private final int number;

    public Factorial(int number) {
        this.number =number;
    }

    public int getFactorial() {
        int prod=1;
        if(number ==1) return 1;
        for (int factor = this.number; factor > 1; factor--) {
            prod *= factor;
        }
        return prod;
    }
}
