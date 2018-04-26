package derekBanasTut;

public abstract class Crashable { // class in which every method doesn't have to be implemented to use abstract class

    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int strength);

    public abstract int getCarStrength();

}
