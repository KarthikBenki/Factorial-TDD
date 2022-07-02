package com.tw;

public class Factorial {

    public static final int UNIT = 1;
    private int factorial = 1;
    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if (number == 0) return factorial;
        for (int factor = this.number; factor > UNIT; factor--) {
            factorial *= factor;
        }
        return factorial;
    }
}
