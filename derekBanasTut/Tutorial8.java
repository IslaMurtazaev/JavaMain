package derekBanasTut;

//import org.apache.commons.lang3.ArrayUtils;

public class Tutorial8 {

    public static void main(String[] args) {

        Monster.buildBattleBoard();
        char[][] tempBattleBoard = new char[10][10];

        // ObjectName ArrayName = new ObjectName[numberOfElements];
        Monster[] Monsters = new Monster[4];

        // derekBanasTut.Monster(int newHealth, int attack, int movement, String name)
        Monsters[0] = new Monster(100, 10, 2, "Spider");
        Monsters[1] = new Monster(300, 30, 1, "Giant");
        Monsters[2] = new Monster(150, 20, 3, "Werewolf");
        Monsters[3] = new Monster(120, 20, 2, "Vampire");

        Monster.redrawBoard();

        for (Monster m : Monsters){
            if (m.getAlive()){
//                int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
//                m.moveMonster(Monsters, arrayItemIndex);
            }
        }

        Monster.redrawBoard();

    }

}
