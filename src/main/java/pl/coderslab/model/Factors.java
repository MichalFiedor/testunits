package pl.coderslab.model;

import java.util.ArrayList;
import java.util.List;

public class Factors {

    public static List<Integer> generatePrimeFactors(Long n){
        List<Integer> factors = new ArrayList<>();
        if(n==0){
            throw new IllegalArgumentException("Value must be other than 0");
        }
        if(n<0){
            for(int i=n.intValue(); i<0; i++){
                if(n%i==0){
                    factors.add(i);
                }
            }
            return factors;
        }

        for(int i=1; i<=n; i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        return factors;
    }
}
