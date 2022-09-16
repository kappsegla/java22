package se.iths.twentytwo.exercises.chapter6;

public class Semaphore {

    private static int maxCount = 3;

    private Semaphore() {

    }

    public static Semaphore requestSemaphore() {
        if (maxCount > 0) {
            maxCount--;
            return new Semaphore();
        } else return null;
    }

    public void returnSemaphore() {
        maxCount++;
    }
}
