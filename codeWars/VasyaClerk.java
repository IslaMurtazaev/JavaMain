package codeWars;

import java.util.ArrayList;

public class VasyaClerk {

    public static void main(String[] args) {

        int[] guestsBillsOK = {25, 50, 25, 100};
        int[] guestsBillsNO = {25, 50, 25, 25, 50, 50, 100};
        System.out.println(Tickets(guestsBillsOK));

    }

    public static String Tickets(int[] peopleInLine){

        ArrayList<Integer> myBills = new ArrayList<>();

        String result = "Yes";

        for (int bill : peopleInLine){
            if (bill == 25){
                myBills.add(bill);
            } else if (bill == 50 && myBills.contains(25)){
                myBills.add(bill);
                myBills.remove(myBills.indexOf(25));
            } else if (bill == 100 && myBills.contains(25) && myBills.contains(50)){
                myBills.add(bill);
                myBills.remove(myBills.indexOf(25));
                myBills.remove(myBills.indexOf(50));
            } else {
                result = "No";
            }

        }

        return result;
    }

}
