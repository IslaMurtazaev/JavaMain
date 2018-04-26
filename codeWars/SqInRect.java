package codeWars;

import java.util.ArrayList;

public class SqInRect {

    public static void main(String[] args) {
        System.out.println(sqInRect(20, 14));
    }

    public static ArrayList<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth){return null;}

        ArrayList<Integer> squares = new ArrayList<>();

        while (lng > 0 && wdth > 0){
            if (lng > wdth){
                squares.add(wdth);
                lng -= wdth;
            } else {
                squares.add(lng);
                wdth -= lng;
            }
        }

        return squares;
    }
}