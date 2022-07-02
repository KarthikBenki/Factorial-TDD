package com.tw;

public class Factorial {

    private final int factor;

    public Factorial(int factor) {
        this.factor=factor;
    }

    public int getFactorial() {
        int prod=1;
        if(factor==1) return 1;
        for (int factor = this.factor; factor > 1; factor--) {
            prod *= factor;
        }
        return prod;
    }
}
