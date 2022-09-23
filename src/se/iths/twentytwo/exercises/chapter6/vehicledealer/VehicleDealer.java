package se.iths.twentytwo.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public class VehicleDealer {
    public static void main(String[] args) {

        var firstSeller = new Seller("Viktor<3", 28, "Hemmaman", BigDecimal.valueOf(1));
        var secondSeller = new Seller("Harald", 25, "Java Developer", BigDecimal.valueOf(203854));
        var firstBuyer = new Buyer("Gunnar!", 58, "Snickare", BigDecimal.valueOf(1000000000));
        var secondBuyer = new Buyer("Halvor", 88, "Pensionär", BigDecimal.valueOf(2937253));

        var originalBroker = new Broker("HedinBil", 38, "Retailer", BigDecimal.valueOf(Integer.MAX_VALUE));

        Airplane airplane = new Airplane(20000, BigDecimal.valueOf(5000000), firstSeller);
        var helicopter = new Helicopter(4023, BigDecimal.valueOf(77000000), firstSeller);
        var limousine = new Car(2500, BigDecimal.valueOf(1), secondSeller);

        originalBroker.sellVehicle(airplane, firstBuyer);
        originalBroker.sellVehicle(helicopter, firstBuyer);
        originalBroker.sellVehicle(limousine, secondBuyer);


    }
}
