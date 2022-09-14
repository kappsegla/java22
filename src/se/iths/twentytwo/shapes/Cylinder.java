package se.iths.twentytwo.shapes;

public class Cylinder extends Circle {

    private final int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 3);

        Circle circle = new Cylinder(1, 2);

        Cylinder cylinder1 = (Cylinder) circle;

        Object object = cylinder1;

        if (object.getClass() == Cylinder.class) {
            Cylinder cylinder2 = (Cylinder) object;
            System.out.println(cylinder2.getVolume());
        }
        if (object instanceof Cylinder) {
            Cylinder cylinder2 = (Cylinder) object;
            System.out.println(cylinder2.getVolume());
        }
        if (object instanceof Cylinder cylinder2) {
            System.out.println(cylinder2.getVolume());
        }
        myMethod(object);

    }

    public static void  myMethod(Object object){
        if (object instanceof Cylinder cylinder2) {
            System.out.println(cylinder2.getVolume());
        }
    }


}


//public class Cylinder {
//    private final Circle circle;
//    private final int height;
//
//    public Cylinder(int radius, int height) {
//        this.circle = new Circle(radius);
//        this.height = height;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public int getRadius() {
//        return circle.getRadius();
//    }
//
//    public double getVolume() {
//        return circle.getArea() * height;
//    }
//}
