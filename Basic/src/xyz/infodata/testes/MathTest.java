package xyz.infodata.testes;

import org.junit.jupiter.api.Test;

import xyz.infodata.Math;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

    @Test
    void fatorialRecursivoNegativo() {
        Math math = new Math();
        assertEquals(-1L, math.fatorial(-10L));
    }
    @Test
    void fatorialRecursivo0() {
        Math math = new Math();
        assertEquals(1L, math.fatorial(0L));
    }
    @Test
    void fatorialRecursivo1() {
        Math math = new Math();
        assertEquals(1L, math.fatorial(1L));
    }
    @Test
    void fatorialRecursivo2() {
        Math math = new Math();
        assertEquals(2L, math.fatorial(2L));
    }
    @Test
    void fatorialRecursivo4() {
        Math math = new Math();
        assertEquals(24L, math.fatorial(4L));
    }
    @Test
    void fatorialRecursivo5() {
        Math math = new Math();
        assertEquals(120L, math.fatorial(5L));
    }

    @Test
    void factorialNegativo() {
        Math math = new Math();
        assertEquals(-1L, math.factorial(-10L));
    }
    @Test
    void factorial0() {
        Math math = new Math();
        assertEquals(1L, math.factorial(0L));
    }
    @Test
    void factorial1() {
        Math math = new Math();
        assertEquals(1L, math.factorial(1L));
    }
    @Test
    void factorial2() {
        Math math = new Math();
        assertEquals(2L, math.factorial(2L));
    }
    @Test
    void factorial4() {
        Math math = new Math();
        assertEquals(24L, math.factorial(4L));
    }
    @Test
    void factorial5() {
        Math math = new Math();
        assertEquals(120L, math.factorial(5L));
    }

    @Test
    void fibonacciRecursivoNegativo() {
        Math math = new Math();
        assertEquals(-1L, math.elemFibonacci(-10L));
    }
    @Test
    void fibonacciRecursivo0() {
        Math math = new Math();
        assertEquals(-1L, math.elemFibonacci(0L));
    }
    @Test
    void fibonacciRecursivo1() {
        Math math = new Math();
        assertEquals(0L, math.elemFibonacci(1L));
    }
    @Test
    void fibonacciRecursivo2() {
        Math math = new Math();
        assertEquals(1L, math.elemFibonacci(2L));
    }
    @Test
    void fibonacciRecursivo3() {
        Math math = new Math();
        assertEquals(1L, math.elemFibonacci(3L));
    }
    @Test
    void fibonacciRecursivo6() {
        Math math = new Math();
        assertEquals(5L, math.elemFibonacci(6L));
    }
    @Test
    void fibonacciRecursivo7() {
        Math math = new Math();
        assertEquals(8L, math.elemFibonacci(7L));
    }
    @Test
    void fibonacciRecursivo15() {
        Math math = new Math();
        assertEquals(377L, math.elemFibonacci(15L));
    }

    @Test
    void elementoFibonacciNegativo() {
        Math math = new Math();
        assertEquals(-1L, math.elementoFibonacci(-10L));
    }
    @Test
    void elementoFibonacci0() {
        Math math = new Math();
        assertEquals(-1L, math.elementoFibonacci(0L));
    }
    @Test
    void elementoFibonacci1() {
        Math math = new Math();
        assertEquals(0L, math.elementoFibonacci(1L));
    }
    @Test
    void elementoFibonacci2() {
        Math math = new Math();
        assertEquals(1L, math.elementoFibonacci(2L));
    }
    @Test
    void elementoFibonacci3() {
        Math math = new Math();
        assertEquals(1L, math.elementoFibonacci(3L));
    }
    @Test
    void elementoFibonacci6() {
        Math math = new Math();
        assertEquals(5L, math.elementoFibonacci(6L));
    }
    @Test
    void elementoFibonacci7() {
        Math math = new Math();
        assertEquals(8L, math.elementoFibonacci(7L));
    }

    @Test
    void seqFibonacciNegativa() {
        Math math = new Math();
        assertEquals(Arrays.asList(), math.seqFibonacci(0L));
    }
    @Test
    void seqFibonacci0() {
        Math math = new Math();
        assertEquals(Arrays.asList(), math.seqFibonacci(0L));
    }
    @Test
    void seqFibonacci1() {
        Math math = new Math();
        assertEquals(Arrays.asList(0L), math.seqFibonacci(1L));
    }
    @Test
    void seqFibonacci2() {
        Math math = new Math();
        assertEquals(Arrays.asList(0L, 1L), math.seqFibonacci(2L));
    }
    @Test
    void seqFibonacci8() {
        Math math = new Math();
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L,
                144L, 233L, 377L), math.seqFibonacci(15L));
    }

}