package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class ProdFib { // must be public for codewars

    public static void main(String[] args) {

        System.out.println(Arrays.toString(productFib(1)));

    }

    public static long[] productFib(long prod) {

        if (prod == 1){return new long[] {0, 1, 0};}

        int fibN = 0;

        long possibleFib = 0;

        ArrayList<Long> fibs = new ArrayList<>();

        while (possibleFib < prod){

            possibleFib = Math.round(Math.pow(((1+Math.sqrt(5))/2), fibN) / Math.sqrt(5)); // GOLDEN RATIO
            fibs.add(possibleFib);
            fibN++;

        }

        long[] result = new long[3];

        for (int i = 0; i < (fibs.size()-1); i++){

            if (fibs.get(i) * fibs.get(i+1) == prod){
                result[0] = fibs.get(i);
                result[1] = fibs.get(i+1);
                result[2] = 1;
                break;
            } else if (fibs.get(i) * fibs.get(i+1) > prod){
                result[0] = fibs.get(i);
                result[1] = fibs.get(i+1);
                result[2] = 0;
                break;
            }

        }

        return result;
    }
}