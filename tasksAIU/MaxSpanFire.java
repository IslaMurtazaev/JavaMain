package tasksAIU;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MaxSpanFire {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ints = new ArrayList<>();

//        String[] nums = sc.nextLine().split(" ");
//
//        for (String n : nums) {
//            ints.add(Integer.valueOf(n));
//        }

        while(sc.hasNextInt()){
            ints.add(sc.nextInt());
        }

        System.out.println(ints);

        int maxSpan = 0;

        for (int i = 0; i < ints.size(); i++) {

            for (int j = i+1; j <= ints.size(); j++){

                for (int k = j+1; k <= ints.size(); k++) {

                    int sum1 = sum(ints.subList(i, j));
                    int sum2 = sum(ints.subList(j, k));

                    if (sum1 == sum2 && maxSpan < sum1){
                        maxSpan = sum1;
                        System.out.println(ints.subList(i, j) +" "+ ints.subList(j, k));
                        System.out.println(sum(ints.subList(i, j)));

                    }

                }

            }

        }
        System.out.println(maxSpan);
    }

    private static int sum(List<Integer> list){
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

}
