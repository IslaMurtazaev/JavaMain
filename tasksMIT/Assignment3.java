package tasksMIT;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment3 {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        HashMap<Integer, String> runners = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            runners.put(times[i], names[i]);
        }

        Arrays.sort(times);
        int place = 1;

        for (int time : times){
            System.out.println(place+") "+runners.get(time) + " came in "+time+" minutes");
            place++;
        }
    }
}
//    }
//    public static HashMap collectingList(){
//        /* returns a HashMap of Runner's NAME & TIME */
//        //      name   time
//        HashMap<String,Integer> runners = new HashMap<>();
//        while (true) {
//            System.out.print("Type name of the runner, when you reach the bottom of your list type \"DONE\": ");
//            String name = scanner.next();
//            if (name.equalsIgnoreCase("done")) {
//                break;
//            }
//            System.out.print("Type time he spent to he got to finish: ");
//            int time = scanner.nextInt();
//            runners.put(name, time);
//        }
//        return runners;
//    }
//}
