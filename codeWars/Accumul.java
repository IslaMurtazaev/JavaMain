package codeWars;

public class Accumul {

    public static void main(String[] args) {

        System.out.println(accum("abcd"));

    }

    public static String accum(String s) {

        StringBuilder sb = new StringBuilder();

        String sU = s.toUpperCase();
        String sL = s.toLowerCase();

        for (int i = 0; i < s.length(); i++){

            sb.append(sU.charAt(i));
            for (int j = 0; j < i; j++){
                sb.append(sL.charAt(i));
            }
            sb.append("-");

        }
        sb.delete(sb.length()-1, sb.length());
        return String.valueOf(sb);

//        String[] letters = s.split("");
//
//        for (int i = 0; i < letters.length; i++){
//
//            sb = String.letters[i].toUpperCase();
//
//            for (int j = 0; j < i; j++){
//                letters[i] = letters[i] + letters[i];
//            }
//
//        }
//
//        return s.join("-", letters);

    }
}