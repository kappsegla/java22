package se.iths.twentytwo.threads;

public class ThreadArray {
    public static void main(String[] args) {
        double[] doubles = new double[100];

        Thread t1 = Thread.ofPlatform().start(() -> fillArray(doubles, 0, 50));
        Thread t2 = new Thread(() -> fillArray(doubles, 50, 100));
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (double d : doubles) {
            System.out.println(d);
        }
    }

    public static void fillArray(double[] array, int startPos, int stopPos) {
        for (int i = startPos; i < stopPos; i++) {
            array[i] = Math.random();
        }
    }
}
