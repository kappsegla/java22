package se.iths.twentytwo.sos;

public class BuildingFire extends Emergency {
    @Override
    public void handle() {
        System.out.println("Send a firetruck");
    }

    @Override
    public String description() {
        return "The roof is on fire";
    }
}
