package tasksAIU;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ShiftRight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter your numbers, press return to end.");

        while (true) {
            String n = sc.nextLine();
            if (n.isEmpty()){ break; }

            try {
                nums.add(Integer.valueOf(n));
            } catch (NumberFormatException e){
                System.out.println("Not a legal number. Try again!");
            }
        } // END of WHILE

        System.out.println("Enter N:");
        int shift = sc.nextInt();
        if (shift >= nums.size()){shift %= nums.size();}

        int[] result = new int[nums.size()];
        for (int i = 0, j = result.length; i < result.length; i++){
            if(i-shift < 0){
                result[j-shift] = nums.get(i);
                j++;
            } else{
                result[i-shift] = nums.get(i);
            }
        }
        String resultStr = Arrays.toString(result);
        System.out.println(resultStr.substring(1, resultStr.length()-1));
    }
}
