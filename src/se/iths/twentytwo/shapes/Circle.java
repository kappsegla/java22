package se.iths.twentytwo.shapes;

import java.util.Arrays;

public class Circle {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public Circle copyOf() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle(42);
        Circle refc = c;
        Circle copyOfC = new Circle(c);
        Circle secondCopy = c.copyOf();

//        c.radius++;
//        System.out.println("c.radius = " + c.getRadius());
//        System.out.println("refc.radius = " + refc.getRadius());
//        System.out.println("copyOfC.radius = " + copyOfC.getRadius());

        int[] array = {1, 2, 3};

        int[] copyOfArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }

        //Fast shallow copy of arrays.
        int[] copy = Arrays.copyOf(array, array.length);

        array[0] = 7;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copyOfArray));

        Circle[] circles = {new Circle(42), new Circle(43)};

        Circle[] copyOfCircles = new Circle[circles.length];

        for (int i = 0; i < circles.length; i++) {
            //Deep copy, new objects are created
            copyOfCircles[i] = circles[i].copyOf();
            //Shallow copy, both arrays points to same Circle object
            //copyOfCircles[i] = circles[i];
        }

//        circles[0].radius = 77;
//        System.out.println(circles[0].radius);
//        System.out.println(copyOfCircles[0].radius);


    }
}
