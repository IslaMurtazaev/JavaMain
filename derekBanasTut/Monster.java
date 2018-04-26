package derekBanasTut;

import java.util.Arrays;

public class Monster { // Tutorial 7

    static char[][] battleBoard = new char[10][10];

    public static void buildBattleBoard (){
        for(char[] row : battleBoard){
            Arrays.fill(row, '*');
        }
    }

    public static void redrawBoard(){
        int k = 1;
        while (k <= 30){System.out.print("-"); k++;}
        System.out.println();
        for (int i = 0; i < battleBoard.length; i++){
            for (int j = 0; j < battleBoard[i].length; j++){
                System.out.print("|"+battleBoard[i][j]+"|");
            }
            System.out.println();
        }
        k = 1;
        while (k <= 30){System.out.print("-"); k++;}
    }

    public final String TOMBSTONE = "Here lies a terrible creature";

    private int health = 100; // fields can be changed only inside this class
    private int attack = 20;
    private int movement = 2;
    private boolean alive = true;

    public char nameChar1 = 'B';
    public String name = "Big ugly monster";
    public int xPosition = 0;
    public int yPosition = 0;
    public static int numberOfMonsters = 0;



    public static void main(String[] args) {
        buildBattleBoard();
        redrawBoard();

        Monster Voldemort = new Monster();
        Voldemort.name = "He-who-must-not-be-named";
        Voldemort.attack += 10; // inside this class You can change any value
//        System.out.println(Voldemort.attack);
    }
    public  boolean getAlive(){
        return alive;
    }

    public int getHelth(){
        return health;
    }

    public int getMovement(){
        return movement;
    }

    public int getAttack(){
        return attack;
    }

    public void setHealth(int decreasedHealth){
        health -= decreasedHealth;
        if (health < 0){
            alive = false;
        }
    }

    public void setHealth(double decreasedHealth){
        health -= (int)decreasedHealth;
        if (health < 0){
            alive = false;
        }
    }

    public void moveMonster(Monster[] monster, int arrayItemIndex) {
        boolean isSpaceOpen = true;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        while (isSpaceOpen) {
            int randomDirection = (int) (Math.random() * 4);
            int randomDistance = (int) (Math.random() * (this.getMovement() + 1));
            System.out.println(randomDirection + " " + randomDistance);

            battleBoard[this.yPosition][this.xPosition] = '*';

            if (randomDirection == 0) { // 0 => North
                if ((this.yPosition - randomDistance) < 0) {
                    this.yPosition = 0;
                } else {
                    this.yPosition -= randomDistance;
                }
            } else if (randomDirection == 1) { // 1 => East
                if ((this.xPosition + randomDistance) > maxXBoardSpace) {
                    this.xPosition = maxXBoardSpace;
                } else {
                    this.xPosition += randomDistance;
                }
            } else if (randomDirection == 2) { // 2 => South
                if ((this.yPosition + randomDistance) > maxYBoardSpace) {
                    this.yPosition = maxYBoardSpace;
                } else {
                    this.yPosition += randomDistance;
                }
            } else { // West
                if ((this.xPosition - randomDistance) < 0) {
                    this.xPosition = maxXBoardSpace;
                } else {
                    this.xPosition -= randomDistance;
                }
            }
            for(int j = 0; j <= monster.length; j++){
                if (j == arrayItemIndex){
                    continue;
                }
                if (onMySpace(monster, j, arrayItemIndex)){
                    isSpaceOpen = true;
                    break;
                } else {
                    isSpaceOpen = false;
                }
            }
        } // END OF WHILE LOOP

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

    } // END OF MoveMonster


    public boolean onMySpace(Monster[] monster, int indexToChk1, int indexToChk2){
        if((monster[indexToChk1].xPosition == monster[indexToChk2].xPosition &&
                monster[indexToChk1].yPosition == monster[indexToChk2].yPosition)){
            return true;
        } else {
            return false;
        }
    }

    public Monster(int newHealth, int attack, int movement, String name){
        health = newHealth;
        this.attack = attack; // you can also use this. keyword
        this.movement = movement;
        this.name = name;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do{
            randNumX = (int)(Math.random() * maxXBoardSpace);
            randNumY = (int)(Math.random() * maxYBoardSpace);
        } while (battleBoard[randNumX][randNumY] != '*');

        this.xPosition = randNumX;
        this.yPosition = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.xPosition][this.yPosition] = this.nameChar1;

        numberOfMonsters++;
    }
    // Default constructor
    public Monster(){
        numberOfMonsters++;
    }

//    public derekBanasTut.Monster(int newHealth){
//        health = newHealth;
//    }
//    public derekBanasTut.Monster(int newhealth, int newAttack){
//        this(newhealth);
//        attack = newAttack;
//    }
}
