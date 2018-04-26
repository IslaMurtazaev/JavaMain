package codeWars;

import java.util.Arrays;

public class Folder {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(foldArray(new int[] { -9, 9, -8, 8, 66, 23 }, 1)));

    }

    public static int[] foldArray(int[] array, int runs) {

        int foldedTimes = 0;

        int halfSize = array.length / 2;

        if (array.length % 2 != 0){
            halfSize++;
        }

        int[] foldedArray = new int[halfSize];

        while (foldedTimes < runs){
            foldedArray = foldArrayOnce(array);
            foldedTimes++;
            array = foldedArray;
            halfSize = array.length / 2;
            if (array.length % 2 != 0){
                halfSize++;
            }

        }

        return foldedArray;
    }

    public static int[] foldArrayOnce(int[] array){

        int halfSize = array.length / 2;

        if (array.length % 2 != 0){
            halfSize++;
        }

        int[] foldedArray = new int[halfSize];

        for (int i = 0; i < array.length/2; i++){

            foldedArray[i] = (array[i] + array[array.length-(i+1)]);

        }
        if (array.length % 2 != 0){
            foldedArray[halfSize-1] = array[array.length/2];
        }

        return foldedArray;
        }
}