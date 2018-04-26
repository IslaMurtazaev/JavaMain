package tasksMIT;

import java.util.Scanner;

class Assignment1 {

    public static final double GRAVITY = -9.81; // Earth's gravity in m/s^
    static Scanner initialVelocity = new Scanner(System.in);
    static Scanner initialPosition = new Scanner(System.in);
    static Scanner fallingTime = new Scanner(System.in);

    public static void main(String[] arguments){

        System.out.print("What is the initial velociy of the object: ");
        double iV = initialVelocity.nextDouble();
        System.out.print("What is the initial position of the object: ");
        double iP = initialPosition.nextDouble();
        System.out.print("What much time it was falling? ");
        double fT = fallingTime.nextDouble();
        double fP = 0.0;

        fP = 0.5 * GRAVITY * Math.pow(fT, 2) + iV + iP;

        System.out.println("The object's position after " + fT + " seconds is " + fP + " m.");
    }
}