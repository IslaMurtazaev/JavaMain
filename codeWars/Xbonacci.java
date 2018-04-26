package codeWars;

import java.util.Arrays;

public class Xbonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double []{0,1,1},10)));
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] result = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++){
            result[i] = result[i-1]+result[i-2]+result[i-3];
        }
        return result;
    }
}