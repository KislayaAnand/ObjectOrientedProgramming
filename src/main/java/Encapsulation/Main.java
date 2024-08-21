package Encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(false, false, false);
        int selectedOption;
        Scanner readIn = new Scanner(System.in);;
        do {
            System.out.println("Select an option to continue: " + "\n" +
                    "1. Start" + "\n" +
                    "2. Accelerate" + "\n" +
                    "3. Apply Brake" + "\n" +
                    "4. Exit");
            selectedOption = readIn.nextInt();
            if (selectedOption == 1) {
                car.start();
            } else if (selectedOption == 2) {
                car.accelerate();
            } else if (selectedOption == 3) {
                car.applyBrake();
            }
        } while (selectedOption != 4);
    }
}
