package se.iths.twentytwo.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public abstract class Vehicle {
    private int weight;
    private BigDecimal price;
    private Person owner;

    public Vehicle(int weight, BigDecimal price, Person owner) {
        this.weight = weight;
        this.price = price;
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
