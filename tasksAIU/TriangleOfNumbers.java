package tasksAIU;
import java.util.Scanner;

public class TriangleOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int space = n; space > i; space--){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println();

        }

    }

}
