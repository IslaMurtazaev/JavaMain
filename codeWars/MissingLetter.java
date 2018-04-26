package codeWars;

public class MissingLetter{

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

    public static char findMissingLetter(char[] array){

        char[] alphabetLower = "abcdefghijklmnopqrstuvxyz".toCharArray();
        char[] alphabetUpper = "abcdefghijklmnopqrstuvxyz".toUpperCase().toCharArray();

        char missingLetter = '0';

        for (int i = 0, j = 0; i < alphabetUpper.length; i++){
            if (alphabetLower[i] == array[j] || alphabetUpper[i] == array[j]){
                j++;
            } else if (j > 0){
                if (alphabetUpper[i-1] == array[j-1]){
                    missingLetter = alphabetUpper[i];
                    break;
                } else {
                    missingLetter = alphabetLower[i];
                    break;
                }
            }
        }

        return missingLetter;
    }
}