package tasksAIU;

import java.util.Scanner;
import java.util.ArrayList;

public class Tester{

    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Double> nums = new ArrayList<>();
//
//        int size = sc.nextInt();
//
//        for (int i = 0; i < size; i ++){
//            nums.add(sc.nextDouble());
//        }
//
//        nums.sort(null);
//
//        if (nums.size() > 1){
//            System.out.println(nums.get(1));
//        }

        String str = "hello";


        if (str.getClass().equals("class java.lang.String")){
            System.out.println("String");
        }

        System.out.println(str instanceof String ? ("String") : null);
//        System.out.println(str.getClass());

    }
}