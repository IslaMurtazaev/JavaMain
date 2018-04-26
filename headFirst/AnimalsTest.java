package headFirst;

import java.util.ArrayList;

public class AnimalsTest {

    public static void main(String[] args) {

//        headFirst.Animal a = new headFirst.Animal(); we can't do it because headFirst.Animal is abstract (can't be initialized)

        Animal t = new Tiger();  // Polymorphism
        t.makeSound();
        System.out.println();

        Animal d = new Dog();
//        d.name = "Fluffy";
        d.makeSound();
        System.out.println();

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Dog();
        animals[0].makeSound();
        animals[1].eat();
        System.out.println();

        // OR

        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Tiger b = new Tiger();
        list.add(a);
        list.add(b);
        System.out.println();

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(a); // THEY BECOME KINDDA OBJECTS
        objects.add(b);

        if (objects.get(0) instanceof Dog){
            Dog puppy = (Dog)objects.get(0); // And here we cast them back to normal
            puppy.beFriendly();
        }
        System.out.println(objects.get(1).getClass());
        Tiger sherhan = (Tiger)objects.get(1);
        sherhan.eat();
    }



}
