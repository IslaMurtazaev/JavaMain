package codeWars;
import java.util.ArrayList;
import java.util.Arrays;

public class WeightSort {

    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

    public static String orderWeight(String string) {
        String[] strArr = string.split(" ");
        ArrayList<Integer> weightsOfWeights = new ArrayList<>();
        ArrayList<String> weights = new ArrayList<>(Arrays.asList(strArr));

        for (String weight : strArr) {
            weightsOfWeights.add(sumOfDigits(weight));
        }
        weights.sort(null);
        weightsOfWeights.sort(null);

        String[] result = new String[strArr.length];
        for (int i = 0; i < weightsOfWeights.size(); i++){
            for (String weight : weights){
                if (weightsOfWeights.get(i) == sumOfDigits(weight)){
                    result[i] = weight;
                    weights.remove(weight);
                    break;
                }
            }
        }

        return String.join(" ", result);
    }

    private static int sumOfDigits(String num){
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Character.getNumericValue(num.charAt(i));
        }
        return sum;
    }

}