package pl.coderslab.model;

import org.apache.commons.math3.util.Precision;

public class Circle {

    public Circle() {
    }

    public Double circleArea(double r){
        if(r<=0){
            throw new IllegalArgumentException("Radius must be positive and not equals 0");
        }
        Double circleArea = Math.PI * Math.sqrt(r);

        return Precision.round(circleArea, 2);
    }

    public Double circleArea(String r){
        Double radius = Double.parseDouble(r);
        if(radius<=0){
            throw new IllegalArgumentException("Radius must be positive and not equals 0");
        }
        Double circleArea = Math.PI * Math.sqrt(radius);

        return Precision.round(circleArea, 2);
    }
}
