package codeWars;

public class EvilAutocorrect {

    public static void main(String[] args) {
        System.out.println(autocorrect("Can't wait to see youuuuu"));
    }

    public static String autocorrect(String input) {

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll("[-+.^:!?]","");
        }


        for (int i = 0; i < words.length; i++){

            if (words[i].equalsIgnoreCase("you") || words[i].equalsIgnoreCase("u")){
                words[i] = "your sister";

            } else if (words[i].length() < 4){
                continue;
            } else if ((words[i].charAt(0) == 'y' || words[i].charAt(0) == 'Y') && words[i].charAt(1) == 'o'
                    && words[i].charAt(2) == 'u' && words[i].charAt(3) == 'u'){
                words[i] = "your sister";
            }

        }
        String result = String.join(" ", words);

        if (input.charAt(input.length()-1) == '.' || input.charAt(input.length()-1) == '!' || input.charAt(input.length()-1) == '?'){
            return result+input.charAt(input.length()-1);
        }

        return result;
    }

}