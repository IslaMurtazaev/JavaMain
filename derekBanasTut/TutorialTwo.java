package derekBanasTut;

import java.util.Scanner;

public class TutorialTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println(Math.abs(-2));
        System.out.println(Math.max(12345, 54321));
        System.out.println(Math.min(12345, 54321));
        System.out.println((int)Math.sqrt(25));
        System.out.println(Math.round(5.5));
        System.out.println((int)(Math.random() * 101));

        System.out.print("Type your favorite number: ");

        if (userInput.hasNextInt()){

            int numberEntered = userInput.nextInt(); // nextFloat, nextDouble, nextLine etc...
//            System.out.println("I didn't know that your favorite number is " + numberEntered);

            int numberPlusTwo = numberEntered + 2;
            System.out.println(numberEntered +" plus 2 is "+numberPlusTwo+ "");

            int numberMinusOne = numberPlusTwo - 1;
            System.out.println("Minus 1 that's "+numberMinusOne+" quick math!");
        } else {
            System.out.println("Next time type an integer! Try '2' for example");
        }
    }
}
