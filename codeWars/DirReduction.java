package codeWars;

import java.util.Stack;
import java.util.Arrays;

public class DirReduction {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[] {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})));
    }

    public static String[] dirReduc(String[] arr) { // Best practice!
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }

//    public static String[] dirReduc(String[] arr) {
//
//        while (!Arrays.equals(arr, removeDirects(arr))){
//            arr = removeDirects(arr);
//        }
//
//        int resultSize = 0;
//        for (String direction : arr){if (direction != null){resultSize++;}}
//
//        String[] result = new String[resultSize];
//
//        for (int i = 0, j = 0; i < arr.length; i++){
//            if (arr[i] == null){
//                continue;
//            } else {
//                result[j] = arr[i];
//                j++;
//            }
//        }
//        return result;
//
//    }
//
//    public static String[] removeDirects(String[] directs){
//
//        int wrongDirects = 0;
//
//        for (int i = 0; i < directs.length-1; i++){
//
//            if (directs[i] == null || directs[i+1] == null){continue;}
//
//            if (directs[i].equals("NORTH") && directs[i+1].equals("SOUTH") || directs[i].equals("SOUTH") && directs[i+1].equals("NORTH")
//                    || directs[i].equals("EAST") && directs[i+1].equals("WEST") || directs[i].equals("WEST") && directs[i+1].equals("EAST"))
//            {
//                directs[i] = null;
//                directs[i+1] = null;
//                wrongDirects+=2;
//            }
//        }
//
//        String[] arr = new String[directs.length - wrongDirects];
//
//        for (int i = 0, j = 0; i < directs.length; i++){
//            if (directs[i]==(null)){continue;}
//            arr[j] = directs[i];
//            j++;
//        }
//
//        return arr;
//    }

}