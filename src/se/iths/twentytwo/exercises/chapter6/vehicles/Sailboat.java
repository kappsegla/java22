package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Sailboat extends Boat {

    @Override
    public void goTo(String destination) {
        System.out.println("Segelbåten har ankrat utanför " + destination);
    }
}
