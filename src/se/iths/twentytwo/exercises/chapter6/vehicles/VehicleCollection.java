package se.iths.twentytwo.exercises.chapter6.vehicles;

public class VehicleCollection {
    public static void main(String[] args) {
        var firstCar = new Car("Volvo", 2006);
        var firstSailboat = new Sailboat("Gustav Vasa", 1627);
        var firstMotorboat = new Motorboat("Yamarin", 2002);
        var firstBicycle = new Bicycle("GT", 1999);
        var firstBoat = new Boat("Buster", 2003);
        //var vehicle = new Vehicle("JAS 39 Gripen", 2004);

        //vehicle.goTo("Fotö");
        firstBoat.goTo("Björkö");
        firstBicycle.goTo("Öckerö");
        firstCar.goTo("Rörö");
        firstMotorboat.goTo("Hyppeln");
        firstSailboat.goTo("Stockholms skärgård");


    }
}
