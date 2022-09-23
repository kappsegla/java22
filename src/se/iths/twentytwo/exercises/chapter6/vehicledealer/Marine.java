package se.iths.twentytwo.exercises.chapter6.vehicledealer;


import java.util.Random;

public abstract class Marine extends Vehicle {
    private Random random = new Random();
    private double eastingGps;
    private double northingGps;

    public void go() {

        eastingGps = random.nextDouble(-180, 181);
        eastingGps = Math.min(eastingGps, 180);
        northingGps = (random.nextDouble(-90, 91));
        northingGps = Math.min(northingGps, 90);
        System.out.printf("Position is in easting %.6f", eastingGps);
        System.out.printf(" and in northing %.6f", northingGps);
    }

 /*   public void go() {
        double lat = new Random().nextDouble();
        double lon = new Random().nextDouble();
        double latitude = lat * (64.0 - 57.0) + 57;
        double longitude = lon * (4.0 - 0.0);
        System.out.println("The new GPS-coordinates is:");
        System.out.printf("Latitude: %.6f\n", latitude);
        System.out.printf("Longitude: %.6f\n", longitude);
    }*/

    public Marine(int weight, int price) {
        super(weight, price);
    }
}
