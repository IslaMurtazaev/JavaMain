package codeWars;

public class AreSame {

        public static boolean comp(int[] a, int[] b) {

            if (a.length == 0 && b.length == 0){
                return true;
            }

            if (a.length == 0 || b.length == 0){
                return false;
            }

            for (int i : b){
                boolean same = false;
                for (int j : a){
                    if (i == j*j){
                        same = true;
                    }
                }
                if (!same){
                    return false;
                }
            }
            return true;
        }
    }