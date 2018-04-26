package codeWars;

import java.math.BigDecimal;
import java.util.Arrays;

public class Tortoises {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(race(720, 850, 70)));

    }

    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2){return null;}

        int seconds = 0;
        BigDecimal G1 = new BigDecimal(g);
        BigDecimal G2 = new BigDecimal(0);

        while (G2.compareTo(G1) == -1){
            G1 = G1.add(new BigDecimal(v1/3600.0));
            G2 = G2.add(new BigDecimal(v2/3600.0));

            seconds++;
        }

        System.out.println(seconds);
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        return new int[] {hours, minutes, seconds};
    }
}