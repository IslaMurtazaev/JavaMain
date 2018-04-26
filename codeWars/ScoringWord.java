package codeWars;

import java.util.ArrayList;

public class ScoringWord {

    public static void main(String[] args) {

        System.out.println(high("what time are we climbing up to the volcano"));

    }

    public static String high(String s) {

        int bestScore = 0;
        String bestWord = "";

        String[] sentence = s.split(" ");
        for (String word : sentence){

            int wordScore = sumOfWord(word);
//            bestScore = (wordScore > bestScore) ? wordScore : bestScore;
            if(wordScore > bestScore){
                bestScore = wordScore;
                bestWord = word;
            }

        }

        return bestWord;
    }

    public static int sumOfWord(String word){

        int sum = 0;
        char[] arrayAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char c : arrayAlphabet){alphabet.add(c);}

        for (int i = 0; i < word.length(); i++){
            sum += alphabet.indexOf(word.charAt(i))+1;
        }

        return sum;
    }

}