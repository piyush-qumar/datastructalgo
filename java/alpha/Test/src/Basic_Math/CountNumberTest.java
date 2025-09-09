package Basic_Math;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testCountDigit_SingleDigit() {
        CountNum sol = new CountNum();
        Assertions.assertEquals(1, sol.countDigit(5));
    }

    @Test
    void testCountDigit_MultipleDigits() {
        CountNum sol = new CountNum();
        Assertions.assertEquals(3, sol.countDigit(123));
    }

    @Test
    void testCountDigit_Zero() {
        CountNum sol = new CountNum();
        Assertions.assertEquals(1, sol.countDigit(0));
    }

    @Test
    void testCountDigit_NegativeNumber() {
        CountNum sol = new CountNum();
        Assertions.assertEquals(2, sol.countDigit(-9)); // "-9" has length 2
    }
    @Test
    void testCountOdd_Number() {
        CountOdd sol1 = new CountOdd();
        Assertions.assertEquals(1,sol1.countDigit(10));
    }
}
