package codeAcademy;

/**
 * Created by Admin on 1/25/2018.
 */
public class Decisions {
    public static void main(String[] args) {

//        if (1 < 4 && 0 > 5) {
//
//            System.out.println("You ordered a cup of hot, mint tea.");
//
//        } else if (21 <= 19 || 17 >= 28) {
//
//            System.out.println("You ordered freshly squeezed orange juice!");
//
//        } else if ( !(true == true) ) {
//
//            System.out.println("You ordered hot cocoa!");
//
//        } else {
//
//            System.out.println("You ordered a cup of Java!");
//
//        }
////
        char answerChoice = 'C';

        switch (answerChoice) {

            case 'A':
                System.out.println("You answered: " + answerChoice + ". Please try again.");

            case 'B':
                System.out.println("You answered: " + answerChoice + ". Please try again.");

            case 'C': // prints everything after the test was true
                System.out.println("You answered: " + answerChoice + ". That is correct!");

            case 'D':
                System.out.println("You answered: " + answerChoice + ". Please try again.");

            default:
                System.out.println("Please select a valid answer choice.");
        }

        int fuelLevel = 3;
        char canDrive = (fuelLevel > 0) ? 'Y':'N';
        System.out.println(canDrive);

        }
//    System.out.println( !(false) || true && false); // precedence of boolean operators:1)! 2)&& 3)||

//        Ternary conditional
//        int pointsScored = 21;
//        char gameResult = (pointsScored > 22) ? 'W' : 'L';
//        System.out.println(gameResult);

        // NOTE: Switches

//        int restaurantRating = 3;

//        switch (restaurantRating) {
//
//            case 1:
//                System.out.println("This restaurant is not my favorite.");
//                break;
//
//            case 2:
//                System.out.println("This restaurant is good.");
//                break;
//
//            case 3:
//                System.out.println("This restaurant is fantastic!");
//                break;
//
//            default:
//                System.out.println("I've never dined at this restaurant.");
//                break;
//        }
//    }
}
