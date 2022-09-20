package se.iths.twentytwo.solid.lsp;

public class Square extends Rectangle {


    public Square(float size) {
        super(size, size);
    }


    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                "}";
    }
}
