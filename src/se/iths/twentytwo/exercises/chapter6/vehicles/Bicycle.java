package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Bicycle extends Vehicle {
    public Bicycle(String manufacturer, int productionYear) {
        super(manufacturer, productionYear);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Cykeln färdas till " + destination);
    }

}
