package games;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BattleShip {

    public static Scanner sc = new Scanner(System.in);

    public static char[][] board = createBoard();

    public static void intro(int tries){
        System.out.println("Captain, our censors detected enemy ships in these waters!");
        System.out.println("Unfortunately, their plane attack has damaged our ship and we can't see where exactly they are");
        System.out.println("If we wouldn't find them soon enough, they will capture us\n");
        System.out.println("Here is the map sir, we marked places where they might be with asterisk sign");
        System.out.println("We have only "+tries+" strikes, before they will figure out our position!\n");
    }

    public static char[][] createBoard(){
        char[][] board = new char[8][8];
        for (char[] row : board) {
            for (int i = 0; i < row.length; i++)
                row[i] = '*';
        }
        return board;
    }

    public static char[] xPositions = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    public static char[] yPositions = {1, 2, 3, 4, 5, 6, 7, 8};
    public static void printBoard(){
        for (int i = -1; i < board.length; i++) {
            for (int j = -1; j < board.length; j++) {
                if (i == -1 && j == -1) {
                    System.out.print("  ");
                } else if (i < 0){
                    System.out.print(xPositions[j]+" ");
                } else if (j < 0){
                    System.out.print(i+1);
                } else {
                    System.out.print("|");
                    System.out.print(board[i][j]);
                }
            }
//            if (i < 0){System.out.println();}
            System.out.println((i < 0)? "" : "|");
        }
    }

//    public static void printBoard(){
//        for (char[] row : board) {
//            for (char cell : row){
//                System.out.print("|");
//                System.out.print((cell == 'S')? '*' : cell);
//            }
//            System.out.println("|");
//        }
//        System.out.println();
//    }

    public static void printClearBoard(){
        for (char[] row : board) {
            for (char cell : row){
                System.out.print("|");
                System.out.print((cell == '*')? ' ' : cell);
            }
            System.out.println("|");
        }
    }

    public static ArrayList<Integer> addEnemyShip(){

        ArrayList<Integer> shipCells = new ArrayList<>();

        int randomNum = (int)(Math.random() * 6) + 1;
        int[] ship = {randomNum-1, randomNum, randomNum+1};

        char axis = ((int)(Math.random() * 2) == 0)? 'x' : 'y';

        if (axis == 'x') { // HORIZONTALLY
            while (true) {
                int row = (int)(Math.random() * 8);

                if (board[row][ship[0]] == '*' && board[row][ship[1]] == '*' && board[row][ship[2]] == '*' &&
                        !(ship[0] > 0 && board[row][ship[0]-1] != '*' || ship[2] < 7 && board[row][ship[0]+1] != '*')){

                    for (int y_coordinate : ship) {
                        board[row][y_coordinate] = 'S';
                        shipCells.add(row);
                        shipCells.add(y_coordinate);
                    }
                    break;
                }
            }
        } else { // VERTICALLY
            while (true){
                int column = (int)(Math.random() * 8);
                if (board[ship[0]][column] == '*' && board[ship[1]][column] == '*' && board[ship[2]][column] == '*' &&
                        !(ship[0] > 0 && board[ship[0]-1][column] != '*' || ship[2] < 7 && board[ship[0]+1][column] != '*')){

                    for (int row : ship) {
                        board[row][column] = 'S';
                        shipCells.add(row);
                        shipCells.add(column);
                    }
                    break;
                }
            }
        }
        return shipCells;
    }

    public static void shoot() {

        int y, x;
        while (true) {
            try {
                System.out.print("Where do reckon those scums are hiding, cap? ");
                sc = new Scanner(System.in);
                y = sc.nextInt();
                x = sc.nextInt();
                if (x > 7 || x < 0 || y > 7 || y < 0) {
                    System.out.println("That's not even on our map, sir!");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Didn't catch that, sir?");
            }
        }

        if (board[y][x] == 'S'){
            board[y][x] = 'X';
            System.out.println("You got them sir!");
        } else {
            if (board[y][x] == '*'){
                board[y][x] = ' ';
                System.out.println("Missed!");
            } else {
                System.out.println("You have already shot there!");
            }
        }
    }

    public static boolean destroyed(ArrayList<Integer> shipCells){

        for (int i = 0; i < shipCells.size(); i+=2){
            if (board[shipCells.get(i)][shipCells.get(i+1)] != 'X'){return false;}
        }

        return true;
    }

} // Made by Islam Murtazaev