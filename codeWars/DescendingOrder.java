package codeWars;

import java.util.Arrays;

public class DescendingOrder {


    public static int sortDesc(final int num) {

        String[] arr = (String.valueOf(num).split(""));
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (String s : arr){
            sb.append(s);
        }
        int result = Integer.parseInt(String.valueOf(sb.reverse()));

        return result;
    }
}