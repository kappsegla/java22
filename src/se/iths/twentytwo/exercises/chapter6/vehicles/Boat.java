package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Boat extends Vehicle {

    @Override
    public void goTo(String destination) {
        System.out.println("Båten färdas till " + destination + ".");
    }

}
