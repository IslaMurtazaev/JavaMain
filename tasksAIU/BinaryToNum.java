package tasksAIU;

import java.util.Scanner;

public class BinaryToNum {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your binary number: ");

        String binary = scanner.nextLine();

        int num = 0;

        for (int i = binary.length() - 1; i >= 0; i--){

            if (binary.charAt(i) == '1'){
                num += Math.pow(2, binary.length() - (i+1));
            }

        }
        System.out.println(binary+" equals to "+num);
    }

}
