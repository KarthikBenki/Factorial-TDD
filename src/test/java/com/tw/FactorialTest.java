package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void ShouldReturnOneAsFactorialWhenNumberZeroIsPassed() {
        Factorial factorial = new Factorial(0);

        int result = factorial.getFactorial();

        assertEquals(1,result);
    }

    @Test
    void ShouldReturnOneAsFactorialWhenNumberOneIsPassed() {
        Factorial factorial = new Factorial(1);

        int result = factorial.getFactorial();

        assertEquals(1,result);

    }

    @Test
    void ShouldReturnSixAsFactorialWhenNumberThreeIsPassed() {
        Factorial factorial = new Factorial(3);

        int result = factorial.getFactorial();

        assertEquals(6,result);
    }

    @Test
    void ShouldReturn_3628800_AsFactorialWhenTenIsPassed() {
        Factorial factorial = new Factorial(10);

        int result = factorial.getFactorial();

        assertEquals(3628800,result);
    }
}
