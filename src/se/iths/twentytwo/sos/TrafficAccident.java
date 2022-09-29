package se.iths.twentytwo.sos;

public class TrafficAccident extends Emergency {
    @Override
    public void handle() {
        System.out.println("Send ambulance and police");
    }

    @Override
    public String description() {
        return "There is a car upside down";
    }
}
