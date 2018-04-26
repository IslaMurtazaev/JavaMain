package derekBanasTut;

public class Tutorial14 {

    public static void main(String[] args) {

        Animals genericAnimal = new Animals();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        System.out.println();

        Cats morris = new Cats("Morris", "Beshbarmak", "Rubber mouse");
        System.out.println(morris.getName()+" eats "+morris.favFood+" and plays with "+morris.favToy);

        System.out.println();

        Animals norris = new Cats("Miss's Norris", "Students of Hogwarts", "Filch");

        acceptAnimal(norris); // Polymorphism (it sees a walfAround method in derekBanasTut.Animals, but uses a derekBanasTut.Cats' method)

        if(norris instanceof Cats){
            System.out.println(norris.getName()+" is a cat");
        }

        if(norris instanceof Animals){
            System.out.println(norris.getName()+" is an animal too");
        }
    }

    public static void acceptAnimal(Animals animal){
        System.out.println(animal.getName());
        System.out.println(animal.favFood);
        animal.walkAround();
        //animal.favToy; CAN NOT do it even if it's defined in Subclass, the Super class doesn't have such a field
        // to do it we must cast(convert) superclass object to a sublass object
        Cats tempCat = (Cats) animal;
        System.out.println(tempCat.favToy);
        //OR directly
        System.out.println(((Cats)animal).favToy);
    }

}
