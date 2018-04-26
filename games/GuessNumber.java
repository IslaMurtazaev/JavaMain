package games;

import java.util.Scanner;

public class GuessNumber {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = Greeting();
        boolean start = Start(userName);
        if (!start){return;}
        boolean won = Body(userName);
        Conclusion(userName, won);
    }

    public static String Greeting() {
        System.out.print("What is your name? ");
        String userName = scanner.nextLine();
        return userName;
    }

    public static boolean Start(String userName){
        System.out.print("Do you want to play a 'Secret number' game? (Y/N) ");
        String answer = scanner.nextLine();
        switch (answer) {
            case "Y":
            case "y":
                System.out.println("\nLet's start then!");
                return true;
            default:
                System.out.println("Farewell "+userName);
                return false;
        }
    }

    public static boolean Body(String userName){
        System.out.println("Your mission is to guess a secret number hidden between 1 and 100");
        System.out.println("Remember "+userName+", you have only 8 guesses");
        int secretNum = (int)(Math.random() * 101);
        System.out.print("What is your guess? ");
        int userGuess = scanner.nextInt();
        for (int j = 1; j < 8; j++){
            if (userGuess == secretNum){
                return true;
            } else if (userGuess < secretNum){
                System.out.println("Secret number is greater\n");
            } else if (userGuess > secretNum){
                System.out.println("Secret number is less\n");
            }
            System.out.print("What is your guess? ");
            userGuess = scanner.nextInt();
        }
        return false;
    }

    public static void Conclusion(String userName, boolean won){
        if (won == true){
            System.out.println("Congratulations "+userName+" you got it!");
        } else {
            System.out.println("Try harder next time)");
        }
    }
}