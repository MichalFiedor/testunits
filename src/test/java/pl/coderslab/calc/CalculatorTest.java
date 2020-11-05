package pl.coderslab.calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    private static final double DELTA = .00000001;


    @Test
    public void shouldAddTwoPositiveNumbers() {
        double actual = calculator.add(2., 2.);
        assertEquals(4, actual, DELTA);
    }

    @Test
    public void shouldAddTwoNegativeNumbers() {
        double actual = calculator.add(-3., -5.);
        assertEquals(-8, actual, DELTA);
    }

    @Test
    public void shouldAddPositiveAndNegativeNumbers() {
        double actual = calculator.add(20., -50.);
        assertEquals(-30, actual, DELTA);
    }

    @Test
    public void shouldAddNegativeAndPositiveNumbers() {
        double actual = calculator.add(-35., 70.);
        assertEquals(35, actual, DELTA);
    }

    @Test
    public void shouldAddTwoZero() {
        double actual = calculator.add(0., 0.);
        assertEquals(0, actual, DELTA);
    }

    @Test
    public void shouldSubtractTwoPositiveNumbersWhenFirstIsGreaterThanSecond() {
        double actual = calculator.subtract(5., 4.);
        assertEquals(1, actual, DELTA);
    }

    @Test
    public void shouldSubtractTwoPositiveNumbersWhenSecondIsGreaterThanFirst() {
        double actual = calculator.subtract(8., 15.);
        assertEquals(-7, actual, DELTA);
    }

    @Test
    public void shouldMultiplyPositiveDouble() {
        double actual = calculator.multiply(8., 8.);
        assertEquals(64., actual, DELTA);
    }

    @Test
    public void shouldMultiplyNegativeDouble() {
        double actual = calculator.multiply(-6., -4.);
        assertEquals(24., actual, DELTA);
    }

    @Test
    public void shouldMultiplyNegativeAndPositiveDouble() {
        double actual = calculator.multiply(-3., 7.);
        assertEquals(-21., actual, DELTA);
    }
    @Test
    public void shouldDividePositiveNumbers() {
        double actual = calculator.divide(4., 2);
        assertEquals(2., actual, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldDivideByZero() {
        double actual = calculator.divide(4., 0.);

    }

    @Test
    public void shouldReturnTrueWhenFirstDigitIsGreaterThanSecondDigit() {
        boolean actual = calculator.greater(6, 2);
        assertEquals(true, actual);
    }

    @Test
    public void shouldReturnFalseWhenSecondDigitIsGreaterThanFirstDigit() {
        boolean actual = calculator.greater(2, 4);
        assertEquals(false, actual);
    }

    @Test
    public void shouldReturnFalseWhenTwoDigitsAreEqual() {
        boolean actual = calculator.greater(4, 4);
        assertEquals(false, actual);
    }

    @Test
    public void shouldSumPositiveValuesFromLowestToLargest() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void shouldSumPositiveValuesFromLargestToLowest() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("18+5+1");
        assertEquals(24, sum);
    }

    @Test
    public void shouldSumPositiveUnsorted() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("2+11+6");
        assertEquals(19, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThruException() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("2+11++6");
    }
}