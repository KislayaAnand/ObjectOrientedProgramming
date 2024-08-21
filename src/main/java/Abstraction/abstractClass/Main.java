package Abstraction.abstractClass;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rectangle", "Red", 20.5, 11.25);
        Shape circle = new Circle("Circle", "Yellow", 15.50);

        rectangle.display();
        System.out.println();
        circle.display();

        ((Rectangle) rectangle).setLength(30);
        System.out.println();
        rectangle.display();;
    }
}
