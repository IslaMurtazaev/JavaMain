package derekBanasTut;

import java.util.*;

public class Tutorial6 { // Exceptions
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        DivideByZero(2);
        System.out.print("How old are you? ");
        int age = checkValidAge();
        if (age != 0){
            System.out.println("Your age is "+age);
        }
    }

    public static int checkValidAge(){
        try{
            return scanner.nextInt();
        } catch (Exception e){
            System.out.println("Some error occurred");
            return 0;
        }
    }

    public static void DivideByZero(int a) {
        try{
            System.out.println(a/0);

        } catch (ArithmeticException e) {
            System.out.println("That is not allowed in Math!");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
