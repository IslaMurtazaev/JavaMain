package tasksAIU;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your favorite combination of five digits: ");
        String number;
        number = scanner.nextLine();
        for (int digit = 0; digit < number.length(); digit++) {
            System.out.println(number.charAt(digit));
        }
    }
}
