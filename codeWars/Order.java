package codeWars;

public class Order {

    public static void main(String[] args) {

        System.out.println(order(""));

    }

    public static String order(String sentence) {

        if (sentence.isEmpty()){return "";}

        String[] words = sentence.split(" ");

        String[] result = new String[words.length];

        for (int i = 0; i < result.length; i++){

            for (String word : words){

                if (word.contains(String.valueOf(i+1))){
                    result[i] = word;
                    break;
                }

            }

        }
        return String.join(" ", result);
    }

}