package se.iths.twentytwo.exercises.chapter6.vehicledealer;

public abstract class LandBased extends Vehicle {

    private int kmDriven;

    public LandBased(int weight, int price) {
        super(weight, price);
    }

    public void drive(int km) {
        kmDriven += km;
    }
}
