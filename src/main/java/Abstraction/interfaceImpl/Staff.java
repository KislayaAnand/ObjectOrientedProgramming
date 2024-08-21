package Abstraction.interfaceImpl;

public interface Staff {
    public void showDetails();

    public default void showTimings() {
        displaySchedule();
    }

    public double calculateSalary();

    private void displaySchedule() {
        System.out.println("Teaching Staff: 8:00 AM to 1:00 PM" + "\n" +
                "Non Teaching Staff: 7:00 AM to 3:00 PM");
    }
}
