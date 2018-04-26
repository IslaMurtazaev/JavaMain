package codeWars;

public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("scriptsjava","javascripts"));
    }

    public static boolean scramble(String str1, String str2) { // Best Practice
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str1 = str1.replaceFirst(s,"");
        }

        return true;
    }

//    public static boolean scramble(String str1, String str2) {
//
//        StringBuilder word = new StringBuilder(str1);
//
//        for (int i = 0; i < str2.length(); i++){
//            if (word.indexOf(str2.substring(i, i+1)) != -1){
//                word.deleteCharAt(word.indexOf(str2.substring(i, i+1)));
//                continue;
//            }
//            return false;
//        }
//        return true;
//
//    }
}