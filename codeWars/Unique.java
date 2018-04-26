package codeWars;

import java.util.ArrayList;

public class Unique {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }

    public static double findUniq(double[] arr) {

        ArrayList<Double> result = new ArrayList<>();
        ArrayList<Double> duplicates = new ArrayList<>();

        for (double d : arr){
            if (!result.contains(d)){
                result.add(d);
            } else {
                if (!duplicates.contains(d)) {
                    duplicates.add(d);
                }
            }
        }
        for (double i : result){
            if (duplicates.contains(i)){
                result.remove(i);
            }
        }

        return result.get(0);
    }
}