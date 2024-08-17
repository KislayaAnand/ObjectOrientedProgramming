package polymorphism.Overloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        System.out.println("Integer multiplication with two values: " + multiplication.multiply(2, 5));
        System.out.println("Integer multiplication with three values: " + multiplication.multiply(2, 5, 7));
        System.out.println("Double multiplication with two values: " + multiplication.multiply(3.76, 5.87));
        System.out.println("Double multiplication with three values: " + multiplication.multiply(4.67, 2.9, 6.9));
    }
}
