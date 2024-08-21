package Encapsulation;

public class Car {
    private boolean isRunning;
    private boolean isAccelerated;
    private boolean isAppliedBrake;


    public Car(boolean isRunning, boolean isAccelerated, boolean isAppliedBrake) {
        this.isRunning = isRunning;
        this.isAccelerated = isAccelerated;
        this.isAppliedBrake = isAppliedBrake;
    }

    public void start() {
        if(!isRunning()) {
            isRunning = true;
            System.out.println("Car Started!");
        } else {
            System.out.println("Car is already running!");
        }
    }

    public void accelerate() {
        if(!isAccelerated() && isRunning()) {
            isAccelerated = true;
            System.out.println("Car is accelerated to 50 Km/Hr!");
        } else if(isAccelerated()){
            System.out.println("Car is already running at accelerated speed: 50 km/Hr!");
        } else {
            System.out.println("Car needs to be running to get accelerated!");
        }
    }

    public void applyBrake() {
        if(!isAppliedBrake() || isRunning()) {
            isAppliedBrake = true;
            isRunning = false;
            isAccelerated = false;
            System.out.println("Car Stopped!");
        } else {
            System.out.println("Car is already stopped!");
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isAccelerated() {
        return isAccelerated;
    }

    public void setAccelerate(boolean isAccelerated) {
        this.isAccelerated = isAccelerated;
    }

    public boolean isAppliedBrake() {
        return isAppliedBrake;
    }

    public void setApplyBrake(boolean isAppliedBrake) {
        this.isAppliedBrake = isAppliedBrake;
    }
}
