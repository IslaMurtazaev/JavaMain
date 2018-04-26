package derekBanasTut;

import java.util.Scanner;

public class Tutorial4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        String answer = "Y";
//        int h = 1;
//        while(answer.equalsIgnoreCase("y")){
//            System.out.println("Current number is "+h);
//            h++;
//            System.out.print("Do you want to continue? ");
//            answer = scanner.next();

//        int i = 1;
//        while (i<=20){
//            System.out.println(i);
//            i++;

//        int k = 10;
//        do { // DO is used when a peace of program must run at least once
//            System.out.println(k);
//            k++;
//        } while (k < 10);

        for (int j = 10; j >= 1; j--){
            System.out.println(j);
        }

        int n, m;
        for (n = 1, m = 2; m <= 10; n+=2, m+=2){
            System.out.println(n+"\n"+m);
        }
    }
}
