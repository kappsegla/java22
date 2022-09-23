package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Motorboat extends Boat {
    public Motorboat(String destination) {
        super(destination);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Kapsejsar vid " + destination);
    }
}
