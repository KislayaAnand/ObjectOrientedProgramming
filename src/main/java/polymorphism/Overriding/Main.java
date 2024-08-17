package polymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Printer printer = new Printer();
        System.out.println("Calling from Machine: ");
        machine.run();

        System.out.println("Calling from Machine: ");
        machine.stop();

        System.out.println("Calling from Printer: ");
        printer.run();

        System.out.println("Calling from Printer: ");
        printer.stop();
    }
}
