package polymorphism.Overriding;

public class Printer extends Machine {
    @Override
    public void run() {
        System.out.println("Printer started printing documents!");
    }

    @Override
    public void stop() {
        System.out.println("Printer stopped!");
    }
}
