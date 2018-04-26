package derekBanasTut;

public class Tutorial15 {

    public static void main(String[] args) {

        Vehicle tesla = new Vehicle(4, 220.0);
        System.out.println("Tesla's got "+tesla.getSpeed()+" km/h maximal speed on "+tesla.getWheel()+" wheels");

        tesla.setCarStrength(10);
        System.out.println("Strength of your car is - "+tesla.getCarStrength());

    }

}
