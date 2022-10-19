package se.iths.twentytwo.threads;

public class ThreadsDemo implements Runnable {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        //Thread.ofPlatform().start(new ThreadsDemo());
        Thread thread = new Thread(new ThreadsDemo());
        thread.start();

        while(true){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        while(true) {
            System.out.println("Hej");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
