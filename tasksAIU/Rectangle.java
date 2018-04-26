package tasksAIU;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.setWidth(width);
        this.setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this(width, length);
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return height;
    }

    public void setWidth(double w) {
        width = (w < 0)? 0 : w;
    }

    public void setLength(double l) {
        height = (l < 0)? 0 : l;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width*2 + height*2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + height +
                ", color='" + color +"'"+
                ", filled=" + filled +
                '}';
    }
}
