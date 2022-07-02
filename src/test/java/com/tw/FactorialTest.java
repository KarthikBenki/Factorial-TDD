package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void ShouldReturnZeroAsFactorialWhenNumberZeroIsPassed() {
        Factorial factorial = new Factorial(0);

        int result = factorial.getFactorial();

        assertEquals(0,result);
    }
}
