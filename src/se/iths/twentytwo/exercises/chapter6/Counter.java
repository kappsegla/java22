package se.iths.twentytwo.exercises.chapter6;

import java.io.IOException;

public class Counter {
    private int number;
    private static int nInstances;

    public Counter() {
        number = 0;
        nInstances++;
    }


    public void increase() {
        number++;
    }

    public void decrease() {
        number--;
    }

    public int value() {
        return number;
    }

    public void print() {
        System.out.println("Your counter is at: " + number);
        System.out.println("Number of counters in your system: " + nInstances);
    }

    public static void main(String[] args) {
        Counter count = new Counter();
        Counter counter2 = new Counter();
        count.increase();
        System.out.println(count.value());
        count.decrease();
        System.out.println(count.value());
        counter2.print();

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
