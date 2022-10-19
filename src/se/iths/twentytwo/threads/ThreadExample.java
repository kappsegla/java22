package se.iths.twentytwo.threads;

import java.util.Scanner;

public class ThreadExample {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread.ofPlatform().start(runner);
        //new Thread(runner).start();
        Thread.ofPlatform().start(runner);
        //Thread t3 = Thread.ofPlatform().start(runner);
        //runner.run();
//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        while(true){
            String s = scanner.nextLine();
            System.out.println("Input: " + s);
        }
    }




}

class Runner implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while(i < 20) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

