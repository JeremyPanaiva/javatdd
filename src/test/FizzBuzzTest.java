package test;

import  main.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testValue1() {
        assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    public void testValue2() {
        assertEquals("2", FizzBuzz.getResult(2));
    }

    @Test
    public void testValue3() {
        assertEquals("Fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void testValue5() {
        assertEquals("Buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void testValue9() {
        assertEquals("Fizz", FizzBuzz.getResult(9));
    }

    @Test
    public void testValue10() {
        assertEquals("Buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void testValue15() {
        assertEquals("FizzBuzz", FizzBuzz.getResult(15));
    }

    @Test
    public void testValue0() {
        assertEquals("FizzBuzz", FizzBuzz.getResult(0));
    }
}
