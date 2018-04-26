package codeWars;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields\n"));
    }

    static String toCamelCase(String s){

        String[] words = s.split("\\P{L}+");


//        words[0] = words[0].replaceFirst(words[0].substring(0,1), words[0].substring(0,1).toLowerCase());
        for (int i = 1; i < words.length; i++){
            String word = words[i];
            words[i] = word.replaceFirst(word.substring(0, 1), (word.substring(0, 1)).toUpperCase());
        }

        return String.join("", words);
    }
}