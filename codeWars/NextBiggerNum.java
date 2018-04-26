package codeWars;

public class NextBiggerNum{ // NOT FINISHED

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(531));
    }

    public static long nextBiggerNumber(long n) {

        String[] nStrs = (String.valueOf(n)).split("");
        long[] arrLongs = new long[nStrs.length];
        for (int s = 0; s < arrLongs.length; s++) {arrLongs[s] = Long.parseLong(nStrs[s]);}

        long lastElem = arrLongs[arrLongs.length-1];
        for (int i = arrLongs.length-2; i >= 0; i--){
            if(lastElem > arrLongs[i]){
                arrLongs[i+1] = arrLongs[i];
                arrLongs[i] = lastElem;
                String resultStr = "";
                for (long l : arrLongs){resultStr+=l;}
                return Long.parseLong(resultStr);
            }
            lastElem = arrLongs[i];
        }

        return -1;

    }
}