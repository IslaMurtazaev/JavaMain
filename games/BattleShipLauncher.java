package games;

import java.util.ArrayList;
import static games.BattleShip.*;

public class BattleShipLauncher {

    public static void main(String[] args) {

        ArrayList<Integer> ship1 = addEnemyShip();
        ArrayList<Integer> ship2 = addEnemyShip();
        ArrayList<Integer> ship3 = addEnemyShip();
        boolean drown = false;

        intro(20);
        printBoard();


        for (int j = 0; j < 20; j++){
            shoot();
            printBoard();
            if (destroyed(ship1) && destroyed(ship2) && destroyed(ship3)){
                System.out.println("Their ships are drowning!!");
                drown = true;
                break;
            }
        }
        System.out.println((drown)? "Congratulations captain!" : "They found us, we lost..");
        printClearBoard();
    }

}
