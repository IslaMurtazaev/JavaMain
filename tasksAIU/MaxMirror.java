package tasksAIU;
import java.util.Scanner;

public class MaxMirror {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharSequence s = "";
        System.out.println(maxMirror(String.join(s, sc.nextLine().trim().split(" "))));
    }

    public static int maxMirror(String arr){

        StringBuilder arrStr = new StringBuilder();
        String reversed = "";

        for (int i  = 0, j = arr.length()-1; i < arr.length(); i++, j--){
            arrStr.append(arr.charAt(i));
            reversed += arr.charAt(j);
        }

        int BiggestMirror = 0;
        for (int i = 0; i <= arrStr.length(); i++) {

            for (int j = i; j <= arrStr.length(); j++) {
                if (reversed.substring(0, reversed.length()-j).contains(arrStr.substring(i, j)) && (BiggestMirror < j - i)){
                    BiggestMirror = j - i;
                }
            }
        }
        return BiggestMirror;
    }

}
