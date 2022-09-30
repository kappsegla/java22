package se.iths.twentytwo.exercises.chapter7;

public class SafeDemo {
    public static void main(String[] args) {
        Safe<String> safe1 = new Safe<>();

        if (safe1.retrieve() != null) {
            System.out.println(safe1.retrieve());
        }
        safe1.store("GULD och kaffe med mjölk (men även utan mjölk)! :D");
        System.out.println(safe1.retrieve());
    }
}
