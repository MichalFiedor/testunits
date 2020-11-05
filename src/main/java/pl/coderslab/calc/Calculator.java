package pl.coderslab.calc;

import java.util.regex.Pattern;

public class Calculator {

    public double add(double val1, double val2) {
        return val1 + val2;
    }

    public double subtract(double val1, double val2) {
        return val1 - val2;
    }

    public double multiply(double val1, double val2) {
        return val1 * val2;
    }

    public double divide(double val1, double val2) {
        if (Math.abs(val2) < .00000001) {
            throw new IllegalArgumentException("Division by 0");
        }
        return val1 / val2;
    }

    public boolean greater(int val1, int val2) {
        return val1 > val2;
    }

    public int eval(String eval) {
        String[] array = eval.split("\\+");
        int sum = 0;

        Pattern pattern = Pattern.compile("\\+{2,}");
        if(pattern.matcher(eval).find()){
            throw new IllegalArgumentException("Illegal argument value");
        }

        for (String s : array) {
            sum += Integer.parseInt(s);
        }
        return sum;

    }
}
