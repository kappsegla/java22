package se.iths.twentytwo.files;

import java.util.Objects;

public final class Cake {
    private final int id;
    private final String name;
    private final double price;

    public Cake(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Cake) obj;
        return this.id == that.id &&
                Objects.equals(this.name, that.name) &&
                Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price);
    }

    @Override
    public String toString() {
        return "Cake[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "price=" + price + ']';
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

}
