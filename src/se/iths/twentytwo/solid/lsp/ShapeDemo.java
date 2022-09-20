package se.iths.twentytwo.solid.lsp;

public class ShapeDemo {
    public static void main(String[] args) {

        Rectangle firstRect = new Rectangle(10.0f, 20.0f);
        System.out.println(firstRect);
        firstRect.setWidth(30f);
        System.out.println(firstRect);

        Square firstSquare = new Square(10.0f);
        System.out.println(firstSquare);
        firstSquare.setWidth(20.0f);
        System.out.println(firstSquare);

        Rectangle secondRect = new Square(10.0f);
        secondRect.setWidth(20.0f);
        System.out.println(secondRect);


    }

}
