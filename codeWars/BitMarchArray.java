package codeWars;

import java.util.Arrays;
import java.util.Scanner;

public class BitMarchArray {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        int[][] bitLegion = BitMarch(num);
//        System.out.println(Arrays.deepToString(bitLegion));
        for (int[] array : bitLegion){
            System.out.println(Arrays.toString(array));
        }

    }

    private static int[][] BitMarch(int num) {

        int[][] bitLegion = new int[9-num][8];

        int[] originalArray = numToBin(num);
        bitLegion[0] = originalArray;
        int c = 1;
        while (!bitsAreReady(originalArray)){
            originalArray = shiftArray(originalArray);
            bitLegion[c] = originalArray;
            c++;
        }

        return bitLegion;
    }

    private static int[] numToBin(int num){
        int[] binArmy = new int[8];
        for (int i = binArmy.length - 1; i >= binArmy.length - num; i--){
            binArmy[i] = 1;
        }
        return binArmy;
    }

    private static int[] numToBinary(int num){
        int index = 7;
        int[] binary = new int[8];
        int[] zeros = {0,0,0,0,0,0,0,0};

        if(num == 0){
            return zeros;
        } else {
            while (num > 0){
                binary[index--] = num % 2;
                num /= 2;
            }
        }
        return binary;
    }

    private static int[] shiftArray(int[] array){
        int[] shiftArray = new int[8];
        for (int i = 0; i < 7; i++){
            shiftArray[i] = array[i+1];
        }
        return shiftArray;
    }

    private static boolean bitsAreReady(int[] array){
        if (array[0] == 1){
            return true;
        }
        return false;
    }

}
