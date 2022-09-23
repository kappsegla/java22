package se.iths.twentytwo.exercises.chapter6.vehicles;

public class VehicleCollection {
    public static void main(String[] args) {
        var firstCar = new Car();
        var firstSailboat = new Sailboat();
        var firstMotorboat = new Motorboat();
        var firstBicycle = new Bicycle();
        var firstBoat = new Boat();
        var vehicle = new Vehicle();

        vehicle.goTo("Fotö");
        firstBoat.goTo("Björkö");
        firstBicycle.goTo("Öckerö");
        firstCar.goTo("Rörö");
        firstMotorboat.goTo("Hyppeln");
        firstSailboat.goTo("Ödby Ö");


    }
}
