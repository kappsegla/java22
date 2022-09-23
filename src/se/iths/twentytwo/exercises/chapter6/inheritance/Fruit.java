package se.iths.twentytwo.exercises.chapter6.inheritance;

import se.iths.twentytwo.exercises.chapter6.vehicles.Boat;
import se.iths.twentytwo.exercises.chapter6.vehicles.Vehicle;

import java.util.ArrayList;

public class Fruit {

    static int anInt = 10;  //Klass variabel
    int j = 10;             //Instance variabel

    public static Citrus createCitrus() {
        Citrus citrus = new Citrus();
        return citrus;
    }

    public static void main(String[] args) {
        var firstFruit = new Fruit();
        var firstCitrus = new Citrus();
        Fruit thirdCitrus = new Citrus();
        var secondCitrus = Fruit.createCitrus();
        var integerValue = 10.0;   //Local variable


        firstFruit.printFruit();
        firstFruit.allFruits();

        firstCitrus.printFruit();
        firstCitrus.allFruits();

        thirdCitrus.printFruit();
        thirdCitrus.allFruits();
    }

    public void printFruit() {
        System.out.println("This is a fruit");
    }

    public void allFruits() {
        System.out.println("Everything is a fruit, kind of");
    }

}
