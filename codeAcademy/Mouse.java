package codeAcademy;

public class Mouse extends Rodentia {

    String name;

    public Mouse(String name) {

        this.name = name;

    }

    public void eat() {

        System.out.println(name + " ate some cheese pizza!");

    }

    public void solveMaze(int minutes) {

        System.out.println(name + " solved the maze in " + minutes + " minutes!");

    }

    public static void main(String[] args) {

        Mouse ratly = new Mouse("Ratly");
        ratly.eat();
        ratly.solveMaze(3);
        ratly.order();

    }

}