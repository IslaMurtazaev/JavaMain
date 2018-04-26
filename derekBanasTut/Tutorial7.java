package derekBanasTut;

public class Tutorial7 {

    public static void main(String[] args) {

        Monster Basilisk = new Monster(100, 25, 5, "Serpent");
        Basilisk.name = "Great Serpent";
        Basilisk.setHealth(120);
//        System.out.println(Basilisk.getHelth());
//        System.out.println(Basilisk.getAlive());
        System.out.println("After Harry had swang his royal sword, the "+Basilisk.name+" fell with a crash");
        if (Basilisk.getAlive() != true){
            System.out.println("There it lied, still not moving, dead...");
        }
    }
}
