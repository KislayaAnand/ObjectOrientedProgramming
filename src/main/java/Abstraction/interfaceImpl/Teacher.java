package Abstraction.interfaceImpl;

public class Teacher implements Staff {
    private String name;
    private String type;
    private int experience;

    public Teacher(String name, String type, int experience) {
        this.name = name;
        this.type = type;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public double calculateSalary() {
        return experience * 20000.59;
    }

    public void showDetails() {
        System.out.println("Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Experience: " + experience + " Years" + "\n" +
                "Salary: " + calculateSalary());
    }

    public void showTimings() {
       Staff.super.showTimings();
    }
}
