package se.iths.twentytwo.exercises.chapter6;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore1 = Semaphore.requestSemaphore();
        Semaphore semaphore2 = Semaphore.requestSemaphore();
        Semaphore semaphore3 = Semaphore.requestSemaphore();
        Semaphore semaphore4 = Semaphore.requestSemaphore();

        System.out.println(semaphore1);
        System.out.println(semaphore2);
        System.out.println(semaphore3);
        System.out.println(semaphore4);

        semaphore3.returnSemaphore();
        Semaphore semaphore5 = Semaphore.requestSemaphore();
        System.out.println(semaphore5);
    }

}
