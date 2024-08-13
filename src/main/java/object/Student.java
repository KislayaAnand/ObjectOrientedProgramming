package object;

public class Student {
    private final String name;
    private final int rollNo;
    private final String standard;

    public Student(String studentName, int studentRollNo, String studentStandard) {
        this.name = studentName;
        this.rollNo = studentRollNo;
        this.standard = studentStandard;
    }

    public String getStudentName() {
        return this.name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public String getStandard() {
        return this.standard;
    }
}