package se.iths.twentytwo.shapes;

public class Cylinder {
    private final Circle circle;
    private final int height;

    public Cylinder(int radius, int height) {
        this.circle = new Circle(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return circle.getRadius();
    }

    public double getVolume() {
        return circle.getArea() * height;
    }

}
