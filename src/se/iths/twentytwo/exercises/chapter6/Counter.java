package se.iths.twentytwo.exercises.chapter6;

public class Counter {
    private int number;

    public void increase() {
        number++;
    }

    public void decrease() {
        number--;
    }

    public int value() {
        return number;
    }

    public static void main(String[] args) {
        Counter count = new Counter();
        count.increase();
        System.out.println(count.value());
        count.decrease();
        System.out.println(count.value());
    }
}
