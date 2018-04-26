package headFirst;

public class Tiger extends Animal {



    @Override
    public void makeSound() {
        System.out.println("Grrrr!");
    }

    public void eat(){
        super.eat(); // overriding it's eat() method and calling parent eat() inside
        System.out.println("The tiger won't touch you now)");
    }

}
