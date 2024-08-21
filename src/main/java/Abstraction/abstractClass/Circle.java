package Abstraction.abstractClass;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    public void display() {
        super.display();
        System.out.println("Area: " + area() + " cm square");
    }
}
