package polymorphism.Overloading;

public class Multiplication {
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }


}
