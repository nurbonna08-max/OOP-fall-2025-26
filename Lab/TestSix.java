package Lab;

abstract class Shape {

    String color;

    // abstract method
    abstract double calculateArea();

    // concrete method
    public void displayShape() {
        System.out.println("Shape color is: " + color);
        System.out.println("Area is: " + calculateArea());
    }

    // constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class TestSix {

    public static void main(String[] args) {

        Shape s1 = new Rectangle("Blue", 5, 4);
        Shape s2 = new Circle("Red", 3);

        s1.displayShape();
        System.out.println();

        s2.displayShape();
    }
}
