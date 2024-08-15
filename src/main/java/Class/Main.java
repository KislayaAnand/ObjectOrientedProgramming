package Class;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Shyam", 111, 24, 1000.50);
        Employee secondEmployee = new Employee("Vijay", 222, 26, 3000.50);
        firstEmployee.setSalary(8000.234);
        secondEmployee.setAge(28);
        System.out.println(firstEmployee.getInfo() + "\n\n" +secondEmployee.getInfo());
    }
}
