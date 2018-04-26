package tasksAIU;

import java.util.Scanner;
import java.util.ArrayList;

public class Primeness {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> primeNums = primesToN(n);
        for (int i = 0; i < primeNums.size(); i++){
            System.out.print(primeNums.get(i)+" ");
        }

    }

    // TODO: Awesome!
    private static ArrayList<Integer> primesToN(int n) {

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if(isPrime(i) == true){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;

    }

    private static Boolean isPrime(int num) {

        if (num < 2){
            return false;
        }
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
}
