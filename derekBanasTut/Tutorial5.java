package derekBanasTut;

import java.util.Scanner;

public class Tutorial5 {

    static double myPI = 3.14; // Class variable
    static int randomNum;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
//        System.out.println(addThem(1,1));
        System.out.println("Local "+pi());
        System.out.println("Global "+myPI);
    }
    public static double pi(){
        double myPI = 3.0;
        return myPI;
    }

    public static int addThem(int a, int b){
        return (a+b);
    }


}
