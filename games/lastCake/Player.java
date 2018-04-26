package games.lastCake;

public class Player {

    Player(int cakes) {
    }

    // Decide who moves first - player or opponent (return true if player)
    boolean firstMove(int cakes) {
        // I wish to move first
        return true;
    }

    // Decide your next move (return 1, 2 or 3)
    int move(int cakes, int last) {
        // I'm not greedy
        return last == 1 ? 2 : 1;
    }
}