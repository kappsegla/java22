package se.iths.twentytwo.objects;

public class Box {
    int height;
    int width;
    int length;

    public void increaseBoxSize() {
        height = height * 2;
        width = width * 2;
        length = length * 2;
    }

    public void printBoxInfo() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }


}
