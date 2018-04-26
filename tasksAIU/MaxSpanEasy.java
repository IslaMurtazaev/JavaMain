package tasksAIU;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSpanEasy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        while (sc.hasNextInt()){
            nums.add(sc.nextInt());
        }


        int maxSpan = 0;

        for (int i = 0; i < nums.size(); i++) {
            int span = (nums.lastIndexOf(nums.get(i)) - i) + 1;
            if (span > maxSpan){
                maxSpan = span;
            }


        }
        System.out.println(maxSpan);
    }

}