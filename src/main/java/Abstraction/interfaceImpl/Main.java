package Abstraction.interfaceImpl;

public class Main {
    public static void main(String[] args) {
        Staff teacher = new Teacher("Vijay", "Teaching Staff", 5);
        Staff peon = new Peon("Ramesh", "Non-Teaching Staff", 7);

        teacher.showTimings();
        System.out.println();
        teacher.showDetails();
        System.out.println();
        peon.showDetails();;
    }
}
