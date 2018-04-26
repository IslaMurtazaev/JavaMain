package codeWars;

import java.math.BigInteger;

public class TrailingZeros {

    public static void main(String[] args) {

        System.out.println(BestPractice(30));

    }

    public static int BestPractice(int n) {

        int zeros = 0;

        for (int i = 5; n/i >= 1; i *= 5){
            zeros += n/i;
        }

        return zeros;
    }

    public static int zeros(int n) {

        BigInteger fact = BigInteger.valueOf(2);

        for (int i = 3; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

        int zeros = 0;

        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            fact = fact.divide(BigInteger.TEN);
            zeros++;
        }

        return zeros;
    }

}