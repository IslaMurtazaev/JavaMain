package codeWars;

import java.util.ArrayList;

public class Multiples {

    public int solution(int number) {

        ArrayList<Integer> mults = new ArrayList<>();

        for (int i = 3; i < number; i++){
            if (i % 3 == 0 || i % 5 == 0 && !mults.contains(i)){
                mults.add(i);
            }
        } // End of LOOP

        return mults.stream().mapToInt(Integer :: intValue).sum();
    }
}