package inheritance.Hybrid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(false, 50, 0);
        for(;;) {
            System.out.println("Select an Option: " + "\n" +
                    "1. Start Engine" + "\n" +
                    "2. Stop Engine" + "\n" +
                    "3. Refuel Engine" + "\n" +
                    "4. Service Engine");
            Scanner scanner = new Scanner(System.in);
            int response = scanner.nextInt();

            if (response == 1) {
                engine.start();
            } else if (response == 2) {
                engine.stop();
            } else if (response == 3) {
                engine.refuel(50);
            } else if (response == 4) {
                engine.service();
            }
        }
    }
}
