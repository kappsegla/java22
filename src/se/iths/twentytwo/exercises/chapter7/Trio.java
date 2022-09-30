package se.iths.twentytwo.exercises.chapter7;

import se.iths.twentytwo.exercises.chapter6.vehicledealer.*;

import se.iths.twentytwo.zoo.Animal;

import java.math.BigDecimal;

public class Trio<T1 extends LandBased, T2 extends Marine, T3 extends Airborne> {

    public T1 var1;
    public T2 var2;
    public T3 var3;

    public Trio(T1 var1, T2 var2, T3 var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public static void main(String[] args) {
        Person stina = new Person("Stina", 35, "bankrånare", new BigDecimal(99999999));
        Trio<Car, Boat, Helicopter> trioOfVehicles = new Trio<>(
                new Car(2000, BigDecimal.valueOf(39999), stina),
                new Boat(2000, BigDecimal.valueOf(39999), stina),
                new Helicopter(2000, BigDecimal.valueOf(39999), stina));
    }
}
