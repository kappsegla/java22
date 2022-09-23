package se.iths.twentytwo.exercises.chapter6.inheritance;

import java.util.ArrayList;

public class Fruit {

    static int anInt = 10;  //Klass variabel
    int j = 10;             //Instance variabel

    public static Citrus createCitrus() {
        return new Citrus();
    }

    public static void main(String[] args) {
        var firstFruit = new Fruit();
        var firstCitrus = new Citrus();
        var integerValue = 10.0;   //Local variable
    }
}
