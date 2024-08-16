package inheritance.Hierarchial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professional professional = new Doctor("Mahesh", "D-111",8, 155000.80, "Gynaecologist");

        Doctor doctor = new Doctor("Sindhu", "D-222", 3, 75000, "Pediatrician");

        Engineer engineer = new Engineer("Vikram", "E-111", 3, 150000, "Computer Science");

        Lawyer lawyer = new Lawyer("Vaidehi", "L-777", 12, 3500000.400, "Supreme Court");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Shall we start? (y/n): ");
        String answer = scanner.nextLine();
        if(answer.equals("y")) {
            System.out.println("\n"+ professional.getInfo());
            System.out.println(((Doctor) professional).fetchDetails());

            System.out.println("\n"+ doctor.getInfo());
            System.out.println("\n"+ doctor.fetchDetails());

            System.out.println(("\n"+ engineer.getInfo()));
            System.out.println(("\n"+ engineer.fetchDetails()));

            System.out.println(("\n"+ lawyer.getInfo()));
            System.out.println(("\n"+ lawyer.fetchDetails()));
        } else {
            System.exit(0);
        }
    }
}
