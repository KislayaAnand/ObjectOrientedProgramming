package inheritance.Hybrid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Engine implements Fuel, Service{
    private boolean isRunning;
    private int healthScore;
    private int fuelLevel;

    @Override
    public void refuel(int level) {
        fuelLevel = fuelLevel + level;
        System.out.println("Engine Refueled! Fuel Level: " + fuelLevel);
    }

    @Override
    public void service() {
        healthScore = 50;
        System.out.println("Engine Serviced! Health Score: " + healthScore);
    }

    @Override
    public void start() {
        if(!isRunning) {
            if (fuelLevel > 0) {
                isRunning = true;
                healthScore -= 5;
                System.out.println("Engine Started!, Helath Score: " + healthScore);
            } else {
                System.out.println("Refuel to start the Engine, Fuel Level: " + fuelLevel);
            }
        } else {
            System.out.println("Engine is running, Health Score: " + healthScore);
        }
    }

    @Override
    public void stop() {
        if(isRunning) {
            isRunning = false;
            healthScore -= 5;
            System.out.println("Engine Stopped!, Helath Score: "+healthScore);
        } else {
            System.out.println("Engine is not running, Helath Score: "+healthScore);
        }
    }
}
