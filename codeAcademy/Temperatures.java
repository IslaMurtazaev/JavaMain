package codeAcademy;

import java.util.ArrayList;
import java.util.Comparator;

public class Temperatures {

    public static void main(String[] args) {

        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);

        weeklyTemperatures.add(2,111);

//        System.out.println(weeklyTemperatures.get(3));

        weeklyTemperatures.sort(Comparator.naturalOrder());

        for(int j = 0; j < weeklyTemperatures.size(); j++) {
            System.out.println(weeklyTemperatures.get(j));
        }

        for (Integer temperature : weeklyTemperatures) { // for each loop a shorter way to loop through each value
            System.out.println(temperature);
        }

    }
}