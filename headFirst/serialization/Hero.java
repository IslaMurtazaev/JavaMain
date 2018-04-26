package headFirst.serialization;

import java.io.*;

public class Hero implements Serializable {
    private int health = 100;
    private boolean alive = true;
    private int power = 100;
    private String race = "Creature";
    private String[] weapons = {"Bare hands"};
    private transient int[][] location; // transient means that this field shouldn't be saved

    public static void main(String[] args) {
//        Hero islam = new Hero(120, "Human", new String[] {"Godrick's Sword", "Impenetrable Shield", "Samurai Bow"});
//        try{
//            FileOutputStream fileStream = new FileOutputStream("MyHero.ser");
//            ObjectOutputStream os = new ObjectOutputStream(fileStream);
//            os.writeObject(islam);
//            os.close();
//            System.out.println("Your hero characteristics were successfully saved");
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
        try {
            FileInputStream fs = new FileInputStream("MyHero.ser");
            ObjectInputStream os = new ObjectInputStream(fs);
            Object hero1 = os.readObject();
            os.close();

            Hero islamResurrected = (Hero) hero1;
            islamResurrected.showWeapons();
        } catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }


    }

    public Hero(){}

    public Hero(int power, String race, String[] weapons){
        this.power = power;
        this.race = race;
        this.weapons = weapons;
    }

    public void showWeapons(){
        System.out.println(String.join(", ", this.weapons));
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getPower() {
        return power;
    }

    public String getRace() {
        return race;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }
}
