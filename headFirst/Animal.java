package headFirst;

public abstract class Animal {

    boolean isHungry;
    int speed;
    String food;

    public abstract void makeSound();

    public void eat(){
        System.out.println("headFirst.Animal is full and happy");
        isHungry = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (isHungry != animal.isHungry) return false;
        if (speed != animal.speed) return false;
        return food != null ? food.equals(animal.food) : animal.food == null;
    }

    @Override
    public int hashCode() {
        int result = (isHungry ? 1 : 0);
        result = 31 * result + speed;
        result = 31 * result + (food != null ? food.hashCode() : 0);
        return result;
    }
}
