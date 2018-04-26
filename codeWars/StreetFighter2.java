package codeWars;

import java.util.Arrays;

public class StreetFighter2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(streetFighterSelection(new String[][]{
                {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
        {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}
}, new int[] {0,0}, new String[] {"up", "left", "down", "left", "left", "left", "right", "up", "right", "left", "right",
                "left", "up", "up", "up", "down", "right", "up", "left", "left", "left", "up", "down", "down"})));
    }

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){ // BEST PRACTICE
        int x = position[0];
        int y = position[1];
        String[] result = new String[moves.length];

        for (int i = 0; i < result.length; i++) {
            switch (moves[i]){
                case "right": x = (x + 1) % 6; break;
                case "left": x = (x + 5) % 6; break;
                case "up": y = 0; break;
                case "down": y = 1; break;
            }
            result[i] = fighters[y][x];
        }

        return result;
    }

//    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
//
//        if (moves.length < 1){
//            return new String[] {};
//        }
//
//        String result = "";
//
//        for (String move : moves) {
//            if (move.equals("right")){
//                position[1] += 1;
//                if (position[1] > 5){
//                    position[1] = 0;
//                }
//            } else if (move.equals("left")){
//                position[1] -= 1;
//                if (position[1] < 0){
//                    position[1] = 5;
//                }
//            } else if (move.equals("up") && position[0] != 0){
//                position[0] -= 1;
//            } else if (move.equals("down") && position[0] != 1){
//                position[0] += 1;
//            }
//            result += fighters[position[0]][position[1]]+", ";
//        }
//
//        return result.split(", ");
//    }

}
