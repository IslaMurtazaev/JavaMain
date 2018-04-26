package tasksAIU;

import java.util.Scanner;

public class OddsAndEvens {

    static Scanner scanner = new Scanner(System.in);

    static String playerName = greeting();

    public static void main(String[] args) {

        char oddOrEven = OddOrEven();
        char sumIs = gamePlay(oddOrEven);
        whoWon(oddOrEven, sumIs);

    }

    public static String greeting(){

        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String playerName = scanner.nextLine();
        return playerName;

    }

    public static char OddOrEven(){

        System.out.print("Hi "+playerName+", which do you choose? (O)dds or (E)vens? ");
        String oddsOrEvens = scanner.next();

        if (oddsOrEvens.equalsIgnoreCase("O")){
            System.out.println(playerName+" has picked odds! The computer will be evens.");
            System.out.println("------------------------------");
            return 'O';
        } else {
            System.out.println(playerName+" has picked evens! The computer will be odds.");
            System.out.println("------------------------------");
            return 'E';
        }
    }

    public static char gamePlay(char oddOrEven){

        System.out.print("How many “fingers” do you put out? ");
        int fingers = scanner.nextInt();

        int computer = (int) (Math.random() * 6);
        System.out.println("The computer plays number \""+computer+"\" fingers.");
        System.out.println("------------------------------");

        int sum = fingers+computer;
        System.out.println(fingers+" + "+computer+" = "+sum);
        boolean isEven = sum % 2 == 0;
        if (isEven == true){
            System.out.println(sum+" is ...even!");
            return 'E';
        } else {
            System.out.println(sum+" is ...odd!");
            return 'O';
        }
    }

    public static void whoWon(char oddOrEven, char sumIs){

        if (oddOrEven == sumIs){
            System.out.println("That means "+playerName+" wins! :)");
        } else {
            System.out.println("That means "+playerName+" loses :(");
        }
        System.out.println("------------------------------");

    }

}
