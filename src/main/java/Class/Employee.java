package Class;

public class Employee {
    private String name;
    private int id;
    private int age;
    private double salary;

    public Employee(String employeeName, int employeeId, int employeeAge, double employeeSalary) {
        name = employeeName;
        id = employeeId;
        age = employeeAge;
        salary = employeeSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "Name: "+getName()+"\n Age: "+getAge()+"\n Id: "+getId()+"\n Salary: "+getSalary();
    }
}
