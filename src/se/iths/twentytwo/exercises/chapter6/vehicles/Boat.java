package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Boat extends Vehicle {

    public Boat(String manufacturer, int productionYear) {
        super(manufacturer, productionYear);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Båten färdas till " + destination + ".");
    }

}
