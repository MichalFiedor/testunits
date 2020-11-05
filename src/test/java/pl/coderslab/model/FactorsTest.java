package pl.coderslab.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FactorsTest {

    @Test
    public void shouldGeneratePrimeFactorsForPositiveDigit() {
        //given
        long digit = 10;
        List<Integer> factors = Arrays.asList(1,2,5,10);
        //when
        List<Integer> factorsFromMethod = Factors.generatePrimeFactors(digit);
        //then
        for(int i=0; i<factors.size();i++){
            assertEquals(factors.get(i),factorsFromMethod.get(i));
        }
    }

    @Test
    public void shouldGeneratePrimeFactorsForNegativeDigit() {
        //given
        long digit = -20;
        List<Integer> factors = Arrays.asList(-20,-10,-5,-4,-2,-1);
        //when
        List<Integer> factorsFromMethod = Factors.generatePrimeFactors(digit);
        //then
        for(int i=0; i<factors.size();i++){
            assertEquals(factors.get(i),factorsFromMethod.get(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThruExceptionWhenDigitEqualsZero() {
        long digit = 0;
        List<Integer> factorsFromMethod = Factors.generatePrimeFactors(digit);
    }


}