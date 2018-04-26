package codeWars;

public class ExesOhs {

    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
    }

    public static boolean getXO (String str) {

        int exes = 0;
        int ohs = 0;
        boolean result = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') exes++;
            else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') ohs++;
        }

        return (exes == ohs)? result : false;
    }
}