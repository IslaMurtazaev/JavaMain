package codeWars;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class SupermarketQueue {

    public static int BestPracrice (int[] customers, int n) {
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {

        ArrayList<Integer> tills = new ArrayList<>();

        for (int i = 0; i < n; i++){
            tills.add(0);
        }

        for (int customer : customers){

            tills.set(0, customer + tills.get(0));
            Collections.sort(tills);

        }

        return tills.get(tills.size()-1);
    }

}