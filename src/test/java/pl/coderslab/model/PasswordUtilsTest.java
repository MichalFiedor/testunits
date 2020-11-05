package pl.coderslab.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilsTest {

    @Test
    public void shouldHaveAtLeastEightChars() {
        String password = "Coraks9!";
        PasswordUtils passwordUtils = new PasswordUtils();
        assertTrue(passwordUtils.validatePasswordStrength(password));
    }
    @Test
    public void passwordHasMoreThanOneDigit(){
        String password = "Kukle123$";
        PasswordUtils  passwordUtils = new PasswordUtils();
        assertTrue(passwordUtils.validatePasswordStrength(password));
    }

    @Test
    public void passwordHasMoreThanOneMark(){
        String password = "Kukle1<}@#%$";
        PasswordUtils  passwordUtils = new PasswordUtils();
        assertTrue(passwordUtils.validatePasswordStrength(password));
    }

    @Test
    public void passwordHasOneLowerCase(){
        String password = "zIOBROKURWOJEBANA!@12";
        PasswordUtils  passwordUtils = new PasswordUtils();
        assertTrue(passwordUtils.validatePasswordStrength(password));
    }



}