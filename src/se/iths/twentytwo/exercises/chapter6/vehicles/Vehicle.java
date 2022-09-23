package se.iths.twentytwo.exercises.chapter6.vehicles;

public abstract class Vehicle {
    private String manufacturer;
    private int productionYear;


    public Vehicle(String manufacturer, int productionYear) {
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    abstract void goTo(String destination);


}
