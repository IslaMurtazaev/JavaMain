package tasksAIU;

import java.util.ArrayList;
import java.util.Scanner;

public class Shman {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        // System.out.print("Enter 10 numbers: ");
        try{
            for (int j = 0; j < 10; j++){
                if (!sc.hasNextLine()){break;}
                nums.add(sc.nextInt());
            }
        } catch (Exception e){
            String n = sc.nextLine();
            if (n.length() != 10){
                System.out.println("Error");
                System.out.println(n.split(" "));
                return;
            }
        }

        boolean canBeBalanced = false;

        for (int i = 0; i < nums.size(); i++){
            if (nums.subList(0, i).stream().mapToInt(Integer::intValue).sum() ==
                    nums.subList(i, nums.size()).stream().mapToInt(Integer::intValue).sum()){
                canBeBalanced = true;
                break;
            }
        }
        System.out.println((canBeBalanced)? "Can be balanced" : "Can not be balanced");
    }
}
