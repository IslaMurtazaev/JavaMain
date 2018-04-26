package tasksAIU;

import java.io.Console;
import java.util.Scanner;

public class TripPlanner {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
//        greeting();
//        travelTimeBudget();
//        timeDifference();
        countryArea();
    }

    public static void greeting(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = console.nextLine();
        System.out.println(name.substring(1, name.length()-1));
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = console.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("***********");
    }

    private static void travelTimeBudget(){
        System.out.println("How many days are you going to spend traveling? ");
        int daysTraveling = console.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        int budgetUSD = console.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination? ");
        String currency = console.next();
        System.out.println("How many "+currency+" are there in 1 USD? ");
        double currencyInUSD = console.nextDouble();
        System.out.println();

        int hoursTraveling = daysTraveling * 24;
        int minutesTraveling = hoursTraveling * 60;
        int secondsTraveling = minutesTraveling * 60;
        double budgetPerDay = budgetUSD / (daysTraveling * 1.0);
        double budgetUserCurrency = budgetUSD * currencyInUSD;
        double budgetUserCurrencyPerDay = budgetUserCurrency / daysTraveling;
        budgetUserCurrencyPerDay = ((int)(budgetUserCurrencyPerDay * 100))/100.0;
        budgetPerDay = ((int)(budgetPerDay * 100))/100.0;
        budgetUserCurrencyPerDay = ((int)(budgetUserCurrencyPerDay * 10))/10.0;

        System.out.println("If you are traveling for "+daysTraveling+" days that is same as "+hoursTraveling+" hours or "+minutesTraveling+
                " minutes or "+secondsTraveling+" seconds.");
        System.out.println("If you are going to spend $"+budgetUSD+" USD that means per day you can spend up to $"+budgetPerDay+" USD");
        System.out.println("Your total budget in "+currency+" is "+budgetUserCurrency+" "+currency+", which per day is "+budgetUserCurrencyPerDay+" "+currency);
        System.out.println("***********");
    }

    public static void timeDifference(){
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hourDiffer = console.nextInt();

        String midnight, noon;
        if (hourDiffer > 0){
            midnight = (0 + hourDiffer)+":00";
            noon = (12 + hourDiffer)+":00";
        } else {
            midnight = (24 + hourDiffer)+":00";
            noon = (12 + hourDiffer)+":00";
        }

        System.out.println("That means that when it is midnight at home it will be "+midnight+" in your travel destination and" +
                " when it's noon at home it will be " + noon);
        System.out.println("***********");
    }

    public static void countryArea(){
        System.out.print("What is square area of your destination country in km2? ");
        int distanceKM = console.nextInt();
        double distanceMiles = (Math.round(distanceKM*0.621371*100)/100.0);
        System.out.println("In miles2 that is "+distanceMiles);
    }
}
