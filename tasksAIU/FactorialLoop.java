package tasksAIU;

import java.util.Scanner;

public class FactorialLoop{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter an integer number: ");

        int n = scanner.nextInt();

        int x = 1;

        if (n==0){
            System.out.println("x     x!");
            System.out.println("0     1");
            return;
        }

        System.out.println("x     x!");
        for (int i = 1; i <= n; i++){

            System.out.print(i+"     ");

            int f = 1;

            for (int j = 1; j <= i; j++){

                f *= j;

            }
            System.out.println(f);
        }
    }
}