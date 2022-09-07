package se.iths.twentytwo.objects;

import java.awt.Color;

public class Car {

    int weight;
    Color color;
    private int maxSpeed;

    public Car(int weight, int maxSpeed, Color color) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int maxSpeed(){
        return maxSpeed;
    }



}
