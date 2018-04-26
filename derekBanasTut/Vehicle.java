package derekBanasTut;

public class Vehicle extends Crashable implements Drivable, Cloneable{

    int numOfWheels = 2;

    double speed = 0;

    int carStrength = 3;

    // must have all methods that were implemented in its interface

    public int getWheel(){
        return this.numOfWheels;
    }

    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.speed = speed;
    }

    public Vehicle(){
        this.numOfWheels = 4;
        this.speed = 100;
    }

    public void setCarStrength(int strength){
        this.carStrength = strength;
    }

    public int getCarStrength(){
        return this.carStrength;
    }

    public String toString(){
        return "Number of wheels is: "+this.getWheel();
    }

    public Object clone(){
        Vehicle car;

        try{
            car = (Vehicle) super.clone();
        }

        catch(CloneNotSupportedException e){
            return null;
        }
        return car;
    }

}
