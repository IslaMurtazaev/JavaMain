package derekBanasTut;

import java.util.LinkedList;

public class Tutorial12 {

    public static void main(String[] args) {

        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();
        names.add("Ayn Rend");
        names.add("Mark Twen");
        names.addLast("Chyngyz Aitmatov");
        names.addFirst("Robert Kiyosaki");
        names.add(0, "Joan Rowling");

        names.set(4, "R R Martin");

        names.remove(4);
        names.remove("Robert Kiyosaki");

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("\nFirst element "+names.get(0));
        System.out.println("Last element "+names.getLast());

        LinkedList<String> namesCopy = new LinkedList<>(names);
        System.out.println("Names copy: "+namesCopy);

        System.out.println("The index of Mark Twen is "+names.indexOf("Mark Twen"));

        System.out.println("Peek without causing an error "+names.peek());

        System.out.println("\n"+namesCopy);
        System.out.println(namesCopy.pop());
        System.out.println(namesCopy.poll()); // prints and removes an element
        System.out.println(namesCopy);
    }

}
