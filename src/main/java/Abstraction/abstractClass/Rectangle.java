package Abstraction.abstractClass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(String name, String color, double length, double breadth) {
        super(name, color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    public void display() {
        super.display();
        System.out.println("Area: " + area() + " cm square");
    }

}
