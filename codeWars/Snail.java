package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class Snail {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    public static int[] snail(int[][] array) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int[] innerArr : array){

            for (int i = 0; i < innerArr.length; i++){

                arrList.add(innerArr[i]);

            }

        }

        int [] result = new int[arrList.size()];
        for (int j = 0; j < arrList.size(); j++) {result[j] = arrList.get(j);}
        return result;
    }
}