package se.iths.twentytwo.sos;

public class EarthQuake extends Disaster {
    @Override
    public void handle() {
        System.out.println("Stand in a door");
    }

    @Override
    public String description() {
        return "Feels like sitting on a drum";
    }
}
