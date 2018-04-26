package tasksAIU;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> set = new ArrayList<>();

        int count = 0;

        while(sc.hasNextInt()){
            set.add(sc.nextInt());
        }


        int repeatedNum = -1;

        for (int i = 1; i < set.size(); i++){
            if (set.get(i-1) == set.get(i)) {
                if (repeatedNum != set.get(i)) {
                    repeatedNum = set.get(i);
                    count++;
                }
            } else {
                repeatedNum = -1;
            }
        }
        System.out.println(count);
    }

}
