package tasksAIU;

import java.util.ArrayList;
import java.util.Arrays;

public class zeroFront{

    public static void main(String[] args){

        System.out.println(Arrays.toString(zeroFront(new int[] {1, 0, 0, 1})));

    }

    public static int[] zeroFront(int[] arr){

        ArrayList arrList = new ArrayList<>();

        for (int i : arr){
            if (i == 0) {
                arrList.add(0, i);
            } else if (i == 1) {
                arrList.add(i);
            }

        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) arrList.get(i);
        }

    return arr;
    }
}