package com.tw;

public class Factorial {

    private final int factor;

    public Factorial(int factor) {
        this.factor=factor;
    }

    public int getFactorial() {
        if(factor==1) return 1;
        return 0;
    }
}
