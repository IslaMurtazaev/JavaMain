package tasksAIU;

import java.util.ArrayList;

public class OneToOne {

    public static void main(String[] args) {

        ArrayList<Integer> results = new ArrayList<>();

        boolean oneToOne = true;

        for (int i = 0; i <= 100; i++){

            int output = function(i);
            if (results.contains(output)){
                oneToOne = false;
                break;
            }
            results.add(output);

        }

        System.out.println(oneToOne);
    }

    public static int function(int x){
        return (x*x+x+1);
    }

}


