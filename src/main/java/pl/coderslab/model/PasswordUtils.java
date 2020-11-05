package pl.coderslab.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUtils {

    public boolean validatePasswordStrength(String password){
        Pattern pattern1 = Pattern.compile("[aA-zZ]+");
        Pattern pattern2 = Pattern.compile("[!@#$%^&*()-\\={}\\[\\]|\\:\";'<>?,./]");
        Pattern pattern3 = Pattern.compile("[0-9]+");

        Matcher matcherUpperLetter = pattern1.matcher(password);
        Matcher matcherMarks= pattern2.matcher(password);
        Matcher matcherDigits= pattern3.matcher(password);
        if(password.length()>=8 && matcherMarks.find() && matcherUpperLetter.find() && matcherDigits.find()){
            return true;
        }
        return false;
    }
}
