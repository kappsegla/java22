package se.iths.twentytwo.exercises.chapter6.vehicles;

public class Sailboat extends Boat {
    public Sailboat(String manufacturer, int productionYear) {
        super(manufacturer, productionYear);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Segelbåten har kapsejsat utanför " + destination);
    }
}
