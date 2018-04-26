package headFirst;

public class Dog extends Animal implements Pet{

    String name = "dog";

    public void beFriendly(){
        System.out.println("Hellooo!");
    }

    public void play(){
        System.out.println("Your dog is playing");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.makeSound();

        dog1.name = "Crabbe";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Goyle";
        myDogs[1].name = "Draco";

        System.out.println("Last dog's name is "+myDogs[2].name);

        int x = 0;
        while (x < myDogs.length){
            myDogs[x].makeSound();
            x++;
        }

    }

    public void makeSound(){
        System.out.println(name + " says Ruff!");
    }

}
