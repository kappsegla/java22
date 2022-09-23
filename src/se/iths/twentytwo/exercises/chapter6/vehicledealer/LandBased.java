package se.iths.twentytwo.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public abstract class LandBased extends Vehicle {

    private int kmDriven;

    public LandBased(int weight, BigDecimal price, Person owner) {
        super(weight, price, owner);
    }

    public void drive(int km) {
        kmDriven += km;
    }
}
