package se.iths.twentytwo.exercises.chapter6;

import java.awt.*;

public class Car {
    private String model;
    private int price;
    private Color colour;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Car() {
        model = "Please give me a model, please";
        //colour = new Color(0, 0, 0); //Creates one color object for each car
        colour = Color.BLACK;  //This will give us the same black color object for all cars, less memory used
        price = Integer.MAX_VALUE; //en dyr bil - hahaha!
    }

    public Car(String model, int price, Color colour) {
        this.colour = colour;
        this.price = price;
        this.model = model;
    }

//    public int halfPrice() {
//        return price/2;
//    }

    //This is a command method. Preferred return type is void from a method that updates our fields.
    //Query methods returning field values should not update them.
    //This is called Command-Query separation
    public void halfPrice() {
        price = price / 2;
    }

    public static void main(String[] args) {
        Car car = new Car("Model 3", 800000, Color.RED);
        car.halfPrice();
        System.out.println(car.getPrice());
    }
}
