package se.iths.twentytwo.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public class Broker extends Person {
    public Broker(String name, int age, String work, BigDecimal bankBalance) {
        super(name, age, work, bankBalance);
    }


    public void sellVehicle(Vehicle vehicle, Buyer buyer) {

        var seller = vehicle.getOwner();

        System.out.println(vehicle.getOwner().getName() + " äger fordonet och har " + vehicle.getOwner().getBankBalance() + " på kontot");
        System.out.println(buyer.getName() + " har " + buyer.getBankBalance() + " på kontot och köper fordonet från " + vehicle.getOwner().getName() + " för " + vehicle.getPrice());

        vehicle.getOwner().setBankBalance(vehicle.getOwner().getBankBalance().add(vehicle.getPrice()));
        buyer.setBankBalance(buyer.getBankBalance().subtract(vehicle.getPrice()));
        vehicle.setOwner(buyer);

        System.out.println("Nu äger " + vehicle.getOwner().getName() + " fordonet och har " + vehicle.getOwner().getBankBalance() + " på kontot");
        System.out.println(seller.getName() + " har nu " + seller.getBankBalance() + " på kontot");
    }
}
