package se.iths.twentytwo.objects;

import java.awt.Color;

public class Car {

    private int weight;
    private Color color;
    private int maxSpeed;

    public Car(int weight, Color color, int maxSpeed) {
        this.weight = weight;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int maxSpeed(){
        return maxSpeed;
    }
}
