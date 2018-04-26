package tasksAIU;

import java.util.Scanner;

public class Palindrome {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        String n = scanner.nextLine();

        boolean palindrome = false;

        String reversedN = new StringBuilder(n).reverse().toString();

        if (reversedN.equals(n)){
            palindrome = true;
        }

        if (palindrome == true){
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }
    }
}