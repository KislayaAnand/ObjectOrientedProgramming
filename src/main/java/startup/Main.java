package startup;

import object.Student;

import Class.Employee;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Mohan", 11, "seventh");
        System.out.println("Name: "+firstStudent.getStudentName()+"\n"+"Roll No.: "+firstStudent.getRollNo()+"\n"+"Standard: "+firstStudent.getStandard());

        Employee firstEmployee = new Employee("Shyam", 111, 24, 1000.50);
        Employee secondEmployee = new Employee("Vijay", 222, 26, 3000.50);
        firstEmployee.setSalary(8000.234);
        secondEmployee.setAge(28);
        System.out.println(firstEmployee.getInfo() + "\n" +secondEmployee.getInfo());
    }
}
