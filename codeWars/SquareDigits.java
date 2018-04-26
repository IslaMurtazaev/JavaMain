package codeWars;

public class SquareDigits {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        String[] nStrs = (String.valueOf(n)).split("");
        String result = "";
        for (String d : nStrs){
            result += (int)Math.pow(Integer.parseInt(d), 2);
        }
        return Integer.parseInt(result);

    }

}