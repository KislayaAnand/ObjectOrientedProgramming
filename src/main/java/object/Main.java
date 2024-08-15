package object;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Mohan", 11, "seventh");
        System.out.println("Name: "+firstStudent.getStudentName()+"\n"+"Roll No.: "+firstStudent.getRollNo()+"\n"+"Standard: "+firstStudent.getStandard());
    }
}
