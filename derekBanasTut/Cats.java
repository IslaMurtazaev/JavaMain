package derekBanasTut;

public class Cats extends Animals{

    public String favToy = "Yarn";

    public void playWith(){
        System.out.println("Yeah " + favToy);
    }

    public void walkAround(){
        System.out.println(this.getName() + " stalks around");
    }

    public Cats(){

    }

    public Cats(String name, String favFood, String favToy){
        super(name, favFood); // take initializer from the super class
        this.favToy = favToy;
    }
}