package derekBanasTut;

public class Tutorial16 {

    public static void main(String[] args) {

        Object superCar = new Vehicle();
        System.out.println(((Vehicle)superCar).getSpeed());
        System.out.println();

        Vehicle superTruck = new Vehicle();
        System.out.println(superTruck.equals(superCar)); // they are two different objects
        System.out.println();

        System.out.println(superCar.getClass());
        System.out.println(superCar.getClass().getName());
        if (superCar.getClass() == superTruck.getClass()){
            System.out.println("They are relatives");
        }
        System.out.println(superCar.getClass().getSuperclass());
        System.out.println();

        System.out.println(superCar.hashCode()); // IDs of objects
        System.out.println(superTruck.hashCode());
        System.out.println();

        // we have overridden toString method
        System.out.println(superCar.toString());

        int randNum = 100;
        System.out.println(Integer.toString(randNum));
        System.out.println();

        // cloning
        superTruck.setWheels(6);
        Vehicle superTruck2 = (Vehicle)superTruck.clone();
        System.out.println(superTruck.getWheel());
        System.out.println(superTruck2.getWheel());
        // they are different
        System.out.println(superTruck.hashCode());
        System.out.println(superTruck2.hashCode());
        System.out.println();

    }

}
