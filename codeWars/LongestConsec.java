package codeWars;

class LongestConsec {

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
    }

    private static String longestConsec(String[] strarr, int k){

        if (strarr.length == 0 || k <= 0 || k > strarr.length)
            return "";

        String longestConsec = "";

        for (int index = 0; index < strarr.length - k + 1; index++){
            StringBuilder consec = new StringBuilder();
            for (int i = index; i < k+index; i++){
                consec.append(strarr[i]);
            }
            if (consec.length() > longestConsec.length()){
                longestConsec = consec.toString();
            }
        }
        return longestConsec;
    }

//    public static String longestConsec(String[] strarr, int k) {
//        if (k <= 0 || k > strarr.length){return "";}
//        String result = "";
//        int maxConsecs = 0;
//        int[] indices = new int[k];
//        for (int i = 0; i < strarr.length+1 - k; i++){
//            int currentConsecs = 0;
//            for (int j = i; j < i+k; j++){
//                currentConsecs += strarr[j].length();
//            }
//            if (currentConsecs > maxConsecs){
//                maxConsecs = currentConsecs;
//                for (int c = 0; c < indices.length; c++){ indices[c] = i+c;}
//            }
//        }
//
//        for (int j = 0; j < k; j++){
//            result+=strarr[indices[j]];
//        }
//        return result;
//    }
}