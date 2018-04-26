package tasksAIU;
import java.util.Scanner;

public class ShowTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(showTwos(sc.nextInt()));

    }

    public static String showTwos(int n){

        int nCopy = n;
        int numOfTwos = 0;

        while (nCopy % 2 == 0){
            numOfTwos++;
            nCopy /= 2;
        }

        String result = Integer.toString(n) + " = ";

        for (int i = 0; i < numOfTwos; i++){
            if (i == 0){
                result += "2 ";
            } else {
                result += "* 2 ";
            }
        }

        return result + ((nCopy != n)? "* "+nCopy : nCopy);

    }
}
