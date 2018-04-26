package tasksAIU;

public class Circle extends Shape{
    double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = (r < 0)? 0 : r;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +'\''+
                ", filled=" + filled +
                '}';
    }
}
