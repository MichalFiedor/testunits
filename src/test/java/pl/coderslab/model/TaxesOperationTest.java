package pl.coderslab.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxesOperationTest {

    @Test
    public void shouldReturnCalculatedValue() {
        //given
        TaxesOperation taxesOperation = new TaxesOperation();
        Double price = 125.00;
        int vat1 = 23;
        Double expected1 = price * (1 + vat1 / 100.00);
        int vat2 = 8;
        Double expected2 = price * (1 + vat2 / 100.00);
        int vat3 = 5;
        Double expected3 = price * (1 + vat3 / 100.00);
        int vat4 = 0;
        Double expected4 = price;
        //when
        Double result1 = taxesOperation.calculateVat(price, vat1);
        Double result2 = taxesOperation.calculateVat(price, vat2);
        Double result3 = taxesOperation.calculateVat(price, vat3);
        Double result4 = taxesOperation.calculateVat(price, vat4);
        //then
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThruExceptionWhenNegativeValueOfPrice() {
        //given
        TaxesOperation taxesOperation = new TaxesOperation();
        Double price = -1231.00;
        int vat1 = 23;
        //when
        Double result = taxesOperation.calculateVat(price, vat1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThruExceptionWhenIncorrectVatValue() {
        //given
        TaxesOperation taxesOperation = new TaxesOperation();
        Double price = 1175.00;
        int vat1 = 22;
        Double expected1 = price * (1 + vat1 / 100.00);
        int vat2 = 18;
        Double expected2 = price * (1 + vat2 / 100.00);
        int vat3 = 75;
        //when
        Double result1 = taxesOperation.calculateVat(price, vat1);
        Double result2 = taxesOperation.calculateVat(price, vat2);
    }


}