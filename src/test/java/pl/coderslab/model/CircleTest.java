package pl.coderslab.model;

import org.apache.commons.math3.util.Precision;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void shouldReturnPositiveValue() {
        //given
        Circle circle = new Circle();
        DecimalFormat two = new DecimalFormat("0.00");
        Double expected = Precision.round(Math.PI*Math.sqrt(5D), 2);
        //when
        Double actual = circle.circleArea(5D);
        //then
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThruExceptionWhenRadiusZero(){
        //given
        Circle circle = new Circle();
        //when
        circle.circleArea(0D);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThruExceptionWhenRadiusIsNegativeDigit(){
        //given
        Circle circle = new Circle();
        //when
        circle.circleArea(-10);
    }

    @Test
    public void shouldReturnResultWhenStringIsGiven(){
        //given
        Circle circle = new Circle();
        Double expected = Precision.round(Math.PI*Math.sqrt(12D), 2);
        //when
        Double actual = circle.circleArea("12");
        //then
        assertEquals(expected, actual);
    }
}