package Abstraction.abstractClass;

public abstract class Shape {
    private String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display() {
        System.out.println("Shape : " + getName() + "\n" +
                "Color: " + getColor());
    }

    public abstract double area();

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
