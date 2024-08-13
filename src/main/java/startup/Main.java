package startup;

import object.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mohan", 11, "seventh");
        System.out.println("Name: "+student.getStudentName()+"\n"+"Roll No.: "+student.getRollNo()+"\n"+"Standard: "+student.getStandard());
    }
}
