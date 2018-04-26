package tasksAIU;
import java.util.Scanner;

public class EightQueens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] chessBoard = new int[8][8];

        for (int i = 0; i < 8; i++) {
            int j = sc.nextInt();
            chessBoard[j][i] = 1;
        }

        printBoard(chessBoard);

    }

    public static void printBoard(int[][] board){

        for (int[] arr : board){

            for (int i = 0; i < arr.length; i++) {

                System.out.print("|");
                if (arr[i] != 0){
                    System.out.print("Q");
                } else {
                    System.out.print("_");
                }
                System.out.print("|");

            }
            System.out.println();

        }

    }

}