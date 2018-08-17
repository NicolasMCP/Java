package xyz.infodata.testes;

import org.junit.jupiter.api.Test;

import xyz.infodata.Math;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

    @Test
    void sequenciaFibonacci() {
        Math math = new Math();
        // seqFibonacci(15)
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L,
                144L, 233L, 377L), math.seqFibonacci(15L));
        // seqFibonacci(2)
        assertEquals(Arrays.asList(0L, 1L), math.seqFibonacci(2L));
        // seqFibonacci(1)
        assertEquals(Arrays.asList(0L), math.seqFibonacci(1L));
    }
    @Test
    void sequenciaFibonacciVazia() {
        Math math = new Math();
        // seqFibonacci(0)
        assertEquals(Arrays.asList(), math.seqFibonacci(0L));
        // seqFibonacci(-10)
        assertEquals(Arrays.asList(), math.seqFibonacci(-10L));
    }

    @Test
    void elementoFibonacci() {
        Math math = new Math();
        // elementoFibonacci(-10)
        assertEquals(-1L, math.elementoFibonacci(-10L));
        // elementoFibonacci(0)
        assertEquals(-1L, math.elementoFibonacci(0L));
        // elementoFibonacci(15)
        assertEquals(377L, math.elementoFibonacci(15L));
        // elementoFibonacci(3)
        assertEquals(1L, math.elementoFibonacci(3L));
        // elementoFibonacci(2)
        assertEquals(1L, math.elementoFibonacci(2L));
        // elementoFibonacci(1)
        assertEquals(0L, math.elementoFibonacci(1L));
    }

    @Test
    void recursivoElemFibonacci() {
        Math math = new Math();
        // elemFibonacci(-10)
        assertEquals(-1L, math.elemFibonacci(-10L));
        // elemFibonacci(15)
        assertEquals(377L, math.elemFibonacci(15L));
        // elemFibonacci(3)
        assertEquals(1L, math.elemFibonacci(3L));
        // elemFibonacci(2)
        assertEquals(1L, math.elemFibonacci(2L));
        // elemFibonacci(1)
        assertEquals(0L, math.elemFibonacci(1L));
        // elemFibonacci(0)
        assertEquals(-1L, math.elemFibonacci(0L));
    }

    @Test
    void fatorialRecursivo() {
        Math math = new Math();
        // fatorial(-10)
        assertEquals(-1L, math.fatorial(-10L));
        // fatorial(5)
        assertEquals(120L, math.fatorial(5L));
        // fatorial(4)
        assertEquals(24L, math.fatorial(4L));
        // fatorial(2)
        assertEquals(2L, math.fatorial(2L));
        // fatorial(1)
        assertEquals(1L, math.fatorial(1L));
        // fatorial(0)
        assertEquals(1L, math.fatorial(0L));
    }

    @Test
    void factorial() {
        Math math = new Math();
        // factorial(-10)
        assertEquals(-1L, math.factorial(-10L));
        // factorial(5)
        assertEquals(120L, math.factorial(5L));
        // factorial(4)
        assertEquals(24L, math.factorial(4L));
        // factorial(2)
        assertEquals(2L, math.factorial(2L));
        // factorial(1)
        assertEquals(1L, math.factorial(1L));
        // factorial(0)
        assertEquals(1L, math.factorial(0L));
    }

}