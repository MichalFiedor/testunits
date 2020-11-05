package pl.coderslab.model;

public class TaxesOperation {

    public Double calculateVat(Double price, int vat) {
        if (vat != 23 && vat != 8 && vat != 5 && vat != 0) {
            throw new IllegalArgumentException("Incorrect vat value");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be positive value");
        }

        Double vatToCalculation = 1 + (vat / 100.0);
        Double calculatedValue = price * vatToCalculation;

        return calculatedValue;
    }
}
