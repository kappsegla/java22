package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Car extends Vehicle {

    public Car(String manufacturer, int productionYear) {
        super(manufacturer, productionYear);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med bil till " + destination);
    }
}
