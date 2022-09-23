package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Motorboat extends Boat {


    @Override
    public void goTo(String destination) {
        System.out.println("Motorbåten kapsejsar vid " + destination);
    }
}
