package tasksAIU;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String args[]) {
        // declaration
        Scanner console = new Scanner(System.in);

        // input
        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        // processing
        splitSentence2Words(sentence);
    }

    private static void splitSentence2Words(String clause) {
        String[] sentenceList = clause.split("\\W");
        for (String i : sentenceList){
            System.out.println(i);
        }
    }
}