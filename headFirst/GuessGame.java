package headFirst;

public class GuessGame {

        GuessGamePlayer p1;
        GuessGamePlayer p2;
        GuessGamePlayer p3;

        public void startGame(){
            p1 = new GuessGamePlayer();
            p2 = new GuessGamePlayer();
            p3 = new GuessGamePlayer();

            int guessp1 = 0;
            int guessp2 = 0;
            int guessp3 = 0;

            boolean p1IsRight = false;
            boolean p2IsRight = false;
            boolean p3IsRight = false;

            int targetNum = (int)(Math.random() * 10);
            System.out.println("I'm thinking of number between 0 and 9...");

            while (true){

                System.out.println("Number to guess is "+targetNum);
                p1.guess();
                p2.guess();
                p3.guess();

                guessp1 = p1.number;
                System.out.println("Player one guessed "+guessp1);
                guessp2 = p2.number;
                System.out.println("Player two guessed "+guessp2);
                guessp3 = p3.number;
                System.out.println("Player three guessed "+guessp3);

                if (guessp1 == targetNum){
                    p1IsRight = true;
                }
                if (guessp2 == targetNum){
                    p2IsRight = true;
                }
                if (guessp3 == targetNum){
                    p3IsRight = true;
                }

                if (p1IsRight || p2IsRight || p3IsRight){
                    System.out.println("\nWe have a winner!");
                    System.out.println("Player one got it right? "+p1IsRight);
                    System.out.println("Player two got it right? "+p2IsRight);
                    System.out.println("Player three got it right? "+p3IsRight);
                    System.out.println("GAME OVER...");
                    break;
                } else {
                    System.out.println("\nPlayers will have to try again");
                }

            }// end of loop

        }// end of method
}// end of class