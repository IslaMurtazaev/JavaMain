package headFirst;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;
    public Scanner scanner = new Scanner(System.in);

    private void setUpGame(){
        // first make some dotComs and give them locations
        DotCom one = new DotCom();
        one.setName("shit.com");
        DotCom two = new DotCom();
        two.setName("Ask.fm");
        DotCom three = new DotCom();
        three.setName("OK.ru");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        for(DotCom i : dotComsList){
            System.out.print(i.getName()+" ");
        }
        System.out.println("Try to sing them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    } // END of METHOD

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    } // END of METHOD

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Miss...";

        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("Hit!")){
                break;
            }
            if (result.equals("Destroyed!!!")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    } // END of METHOD

    private void finishGame(){
        System.out.println("All Dot Coms are perished! Your stock is now worthless");
        if (numOfGuesses <= 18){
            System.out.println("It only took you "+numOfGuesses+" guesses cap!");
            System.out.println("You got out before your options sank");
        } else {
            System.out.println("Took you long enough. "+numOfGuesses+" guesses");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
