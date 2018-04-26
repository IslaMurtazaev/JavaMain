package codeWars;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == ""){return null;}
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].replace(words[i].charAt(0), Character.toUpperCase(words[i].charAt(0)));
        }
        return phrase.join(" ", words);
    }

}