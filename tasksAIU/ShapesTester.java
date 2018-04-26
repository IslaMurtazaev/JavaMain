package tasksAIU;

public class ShapesTester {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Rectangle r1 = new Rectangle(2, 5, "Red", true);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1);

        Square sq1 = new Square(2, "Blue", false);
        System.out.println(sq1);
        sq1.setSide(-1);
        System.out.println(sq1.getPerimeter());
        System.out.println(sq1.getArea());

    }

}
