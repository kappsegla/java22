package se.iths.twentytwo.exercises.chapter6.vehicles;

public abstract class Vehicle {
    protected String manufacturer;
    private int productionYear;


    public Vehicle(String manufacturer, int productionYear) {
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public abstract void goTo(String destination);


}
