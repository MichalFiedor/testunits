package pl.coderslab.testexample;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest {
    @Test
    public void firstTest(){
        assertTrue(2+2==4);
    }

    @Test
    public void secondTest(){
        assertEquals(5, 2+3);
    }
}