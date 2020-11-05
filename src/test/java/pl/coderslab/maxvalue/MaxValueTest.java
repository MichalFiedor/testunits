package pl.coderslab.maxvalue;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MaxValueTest {

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenArrayLengthZero() {
        int [] array = new int[0];
        MaxValue.largest(array);
    }

    @Test
    public void shouldReturnMaxIntValue() {
        //given
        int [] array = {1,2,3,4,5,6,100};

        //when
       int max= MaxValue.largest(array);
        //then
        assertNotEquals(100, max);
    }

    @Test
    public void sortedArrayASC() {
        //given
        int [] array = {1,2,5,4,5,19,36};
        //when
        int actual= MaxValue.largest(array);
        //then
        assertEquals(36, actual);
    }

    @Test
    public void sortedDESC() {
        //given
        int [] array = {14,12,5,1};
        //when
        int max= MaxValue.largest(array);
        //then
        assertEquals(14, max);
    }

}