package codeWars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LuhnAlgorithm {

    public static void main(String[] args) {

        System.out.println(validate("252"));

    }
    private static boolean validate(String number){

        String[] digits = number.split("");

        int[] digitsInts = Arrays.stream(digits).mapToInt(Integer::parseInt).toArray(); // String[] -> int[]

        for (int last = digitsInts.length-2; last >= 0; last-=2){

            digitsInts[last] *= 2;
            if(digitsInts[last] > 9){
                digitsInts[last] -= 9;
            }

        } // end of for loop

        int sum = IntStream.of(digitsInts).sum();

        return (sum % 10 == 0);

    } // end of validate method

}
