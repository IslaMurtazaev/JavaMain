package codeWars;

import java.util.ArrayList;
import java.util.List;

public class Max {

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{1, 2 ,3 ,4 ,-15, 6 ,7, 8,9,10}));
    }

    public static int sequence(int[] arr) { // Best Practice
        int min = 0, max = 0, sum = 0;
        for(int i : arr) {
            sum += i;
            min = Math.min(sum, min);
            max = Math.max(max, sum - min);
            System.out.println(sum);
            System.out.println(min);
            System.out.println(max+"\n");
        }
        return max;
    }

//    public static int sequence(int[] arr) {
//
//        ArrayList<Integer> arrList = new ArrayList<>();
//        for (int n : arr){arrList.add(n);}
//
//        int biggestSum = 0;
//
//        for (int i = 0; i < arr.length; i++){
//
//            for (int j = i+1; j <= arr.length; j++){
//                int currentSum = sum(arrList.subList(i, j));
//
//                if (currentSum > biggestSum){biggestSum = currentSum;}
//            }
//        }
//
//        return biggestSum;
//    }
//
//    public static int sum(List<Integer> arrList){
//
//        int sum = 0;
//        for (int i : arrList){
//            sum+=i;
//        }
//        return sum;
//    }

}