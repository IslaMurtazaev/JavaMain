package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class Line {

    public static void main(String[] args) {

        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        System.out.println(WhoIsNext(names, 2));

    }

    public static String WhoIsNext(String[] names, int n) {

        // INDUCTION OF GROWING -> 5 + 5*2 + 5*4 + 5*8 ... + 5*2^n

        ArrayList<String> namesStr = new ArrayList<String>(Arrays.asList(names));

        int c = 5;
        int result = 0;
        int powerOfTwo = 1;

        if (n > 5){
            c += 5 * Math.pow(2, powerOfTwo);
            powerOfTwo++;
            while (c < n){
                c += 5 * Math.pow(2, powerOfTwo);
                powerOfTwo++;
            }
        }

        for (int i = 0; i < 5; i++){
            if (c >= n){
                result = i;
                break;
            }
            c+=i;
        }

        return names[result];
    }

}