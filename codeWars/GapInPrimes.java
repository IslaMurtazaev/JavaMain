package codeWars;

import java.util.Arrays;

class GapInPrimes {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(gap(4,100,110)));

    }


    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long l = m; l < n; l++) {
            if (isPrime(l)){
                if (l - last == g)
                    return new long[] {last, l};
                last = l;
            }
        }
        return null;
    }

    public static boolean isPrime(long n){
        for (long i = 1; i < n; i+=2)
            if (i < 2){continue;}
            else if (n % i == 0){return false;}
        return true;
    }
}