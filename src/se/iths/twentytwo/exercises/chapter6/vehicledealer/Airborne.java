package se.iths.twentytwo.exercises.chapter6.vehicledealer;

public abstract class Airborne extends Vehicle {

    public Airborne(int weight, int price) {
        super(weight, price);
    }

    private double altitude;

    private void fly(boolean isFlying) {
        if (isFlying)
            altitude += 200;
        else {
            System.out.println("Landing...");
            altitude = 0;
        }
    }

}
