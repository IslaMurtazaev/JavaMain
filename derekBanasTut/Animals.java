package derekBanasTut;

public class Animals {

    private String name = "Animal"; // ONLY this class can access to private info
    public String favFood = "Food"; // Everybody can access it

    protected final void changeName(String newName){ // final to prevent others change its name
        this.name = newName;
    }

    protected final String getName(){
        return this.name;
    }

    public void eatStuff(){
        System.out.println("Yum "+favFood);
    }

    public void walkAround(){
        System.out.println(this.name+" walks around");
    }

    public Animals(){

    }

    public Animals(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }

}
