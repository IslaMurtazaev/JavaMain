package tasksAIU;

import java.util.Scanner;

public class numToBinary {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        int index = 0,originalNum = num;
        int[] binary = new int[10];

        if(num == 0){
            System.out.println(0);
        } else {
            while (num > 0){
                binary[index++] = num % 2;
                num /= 2;
            }
        }

        System.out.print("Binary of "+originalNum+" is ");
        for (int i = 7; i >= 0; i--){
            System.out.print(binary[i]);
        }
    }
}