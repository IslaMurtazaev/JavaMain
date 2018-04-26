package codeWars;

import java.util.Arrays;
import java.util.List;

public class SumOfK {

    private static int T;
    private static int closestSum;

    public static void main(String[] args){
        System.out.println(chooseBestSum(331, 2, Arrays.asList(91, 74, 73, 85, 73, 81, 87)));
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls){
        if (ls.size()< k){return null;}
        T = t;
        printCombination(ls, k);
        return closestSum;
    }

    private static void printCombination(List<Integer> list, int len){
        int[] currentArr = new int[len];
        combinationUtil(list, currentArr, 0, list.size()-1, 0, len);
    }

    private static void combinationUtil(List<Integer> list, int[] currentArr, int start, int end, int index, int len) {

        if (index == len){
            int sum = 0;
            for (int j = 0; j < currentArr.length; j++){
                sum += currentArr[j];
            }
//            System.out.println(sum);
            if (sum > closestSum && sum <= T){
                closestSum = sum;
            }
//            System.out.print(Arrays.toString(currentArr));
            return;
        }
        for (int i = start; i <= end; i++) {
            currentArr[index] = list.get(i);
            combinationUtil(list, currentArr, i+1, end, index+1, len);
        }
    }

}
