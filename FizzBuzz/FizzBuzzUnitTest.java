package FizzBuzz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzUnitTest {
    @Test
    public void testFizzBuzzUpTo15() {
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";
        assertEquals(expected, FizzBuzzForTest.generateFizzBuzz(15));
    }

    @Test
    public void testFizzBuzzUpTo5() {
        String expected = "1, 2, Fizz, 4, Buzz";
        assertEquals(expected, FizzBuzzForTest.generateFizzBuzz(5));
    }

    @Test
    public void testFizzBuzzUpTo3() {
        String expected = "1, 2, Fizz";
        assertEquals(expected, FizzBuzzForTest.generateFizzBuzz(3));
    }

    @Test
    public void testFizzBuzzWithOnlyFizzBuzz() {
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzzForTest.generateFizzBuzz(15).split(", ")[14]);
    }

    @Test
    public void testFizzBuzzWithEmptyResult() {
        String expected = "";
        assertEquals(expected, FizzBuzzForTest.generateFizzBuzz(0));
    }

    @Test
    public void testFizzBuzzSingleNumber() {
        assertEquals("1", FizzBuzzForTest.generateFizzBuzz(1));
        assertEquals("Fizz", FizzBuzzForTest.generateFizzBuzz(3).split(", ")[2]);
        assertEquals("Buzz", FizzBuzzForTest.generateFizzBuzz(5).split(", ")[4]);
        assertEquals("FizzBuzz", FizzBuzzForTest.generateFizzBuzz(15).split(", ")[14]);
    }
}
