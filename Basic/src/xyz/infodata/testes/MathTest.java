package xyz.infodata.testes;

import xyz.infodata.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

    @Test
    void fatorialNegativo() {
        Math math = new Math();
        assertEquals(-1.0, math.fatorial(-10.0));
    }
    @Test
    void fatorial0() {
        Math math = new Math();
        assertEquals(1.0, math.fatorial(0.0));
    }
    @Test
    void fatorial1() {
        Math math = new Math();
        assertEquals(1.0, math.fatorial(1.0));
    }
    @Test
    void fatorial2() {
        Math math = new Math();
        assertEquals(2.0, math.fatorial(2.0));
    }
    @Test
    void fatorial3() {
        Math math = new Math();
        assertEquals(6.0, math.fatorial(3.0));
    }
    @Test
    void fatorial4() {
        Math math = new Math();
        assertEquals(24.0, math.fatorial(4.0));
    }
    @Test
    void fatorial5() {
        Math math = new Math();
        assertEquals(120.0, math.fatorial(5.0));
    }
    @Test
    void fatorialRecursivo100() {
        Math math = new Math();
        assertEquals(9.33262154439441E157, math.fatorial(100.0));
    }

    @Test
    void factorialInterativo100() {
        Math math = new Math();
        assertEquals(9.33262154439441E157, math.factorial(100.0));
    }
    @Test
    void factorialNegativo() {
        Math math = new Math();
        assertEquals(-1.0, math.factorial(-10.0));
    }
    @Test
    void factorial0() {
        Math math = new Math();
        assertEquals(1.0, math.factorial(0.0));
    }
    @Test
    void factorial1() {
        Math math = new Math();
        assertEquals(1.0, math.factorial(1.0));
    }
    @Test
    void factorial2() {
        Math math = new Math();
        assertEquals(2.0, math.factorial(2.0));
    }
    @Test
    void factorial3() {
        Math math = new Math();
        assertEquals(6.0, math.factorial(3.0));
    }
    @Test
    void factorial4() {
        Math math = new Math();
        assertEquals(24.0, math.factorial(4.0));
    }
    @Test
    void factorial5() {
        Math math = new Math();
        assertEquals(120.0, math.factorial(5.0));
    }

}