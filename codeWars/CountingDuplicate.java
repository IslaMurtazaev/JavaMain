package codeWars;

import java.util.ArrayList;

public class CountingDuplicate {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    public static int duplicateCount(String text) {

        String[] letters = text.split("");

        ArrayList<String> dupls = new ArrayList<>();

        int currentDupl = -1;
        for (String l : letters){
            currentDupl = -1;
            String currentLetter = l;
            for (String s : letters){
                if (l.equalsIgnoreCase(s)){ currentDupl++;}
            }
            if (currentDupl > 0 && (!dupls.contains(l.toUpperCase()) && !dupls.contains(l.toLowerCase()))){dupls.add(l);}

        }
        return dupls.size();
    }
}