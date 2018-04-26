package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class SortOdd {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));

    }

    public static int[] sortArray(int[] array) {

        ArrayList<Integer> odds = new ArrayList<>();
        for (int i : array){
            if (i % 2 != 0){
                odds.add(i);
            }
        }
        odds.sort(null);

        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                array[i] = odds.get(j);
                j++;
            }
        }

        return array;
    }
}