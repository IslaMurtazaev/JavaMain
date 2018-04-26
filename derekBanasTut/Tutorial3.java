package derekBanasTut;

public class Tutorial3 {
    public static void main(String[] args){
        int randomNum = (int) (Math.random() * 101);

        if (randomNum < 20){
            System.out.println("The random number is less than 20");
        } else if (randomNum < 40) {
            System.out.println("The random number is less than 40");
        } else if (randomNum <= 50) {
            System.out.println("The random number is in the first half");
        } else {
            System.out.println("The random number is greater than 50");
        }
        System.out.println("It's " + randomNum);

        /* BOOLEAN OPERATORS:
            ! => NOT ( negotiation )
            & => AND ( && also a conjunction that doesn't check the second part of a statement if first was false)
            | => OR ( || another disjunction that works faster in some cases)
            ^ => exclusive OR ( works only if one is true and another one is false)
         */

        // :? => shortcut for IF-ELSE statement
        int one = 1;
        int two = 2;
        int biggest = (one > two)? one : two;
        System.out.println("The biggest number is "+biggest);

        char grade = 'o';
        switch(grade){
            case 'o':
            case 'O':
                System.out.println("OUTSTANDING!");
                break;
            case 'E':
                System.out.println("Exceeded expectations!");
                break;
            case 'A':
                System.out.println("Acceptable");
                break;
            case 'D':
                System.out.println("Dreadful!");
                break;
            case 'T':
                System.out.println("Troll...");
                break;
            default:
                System.out.println("You must have misspelled the letter");
        }
    }
}
