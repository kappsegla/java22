package se.iths.twentytwo.exercises.chapter7;

import java.util.Optional;

public class SafeDemo {
    public static void main(String[] args) {
        Safe<String> safe1 = new Safe<>();

        if (safe1.retrieve() != null) {
            System.out.println(safe1.retrieve());
        }

        Optional<String> storedItem = safe1.retrieve();
        if (storedItem.isPresent())
            System.out.println(storedItem.get());

        String actualValue = "";
        if (storedItem.isPresent())
            actualValue = storedItem.get();

        actualValue = storedItem.orElse("");
        //System.out.println(safe1.retrieve());

        safe1.store("GULD och kaffe med mjölk (men även utan mjölk)! :D");
        storedItem = safe1.retrieve();
        storedItem.ifPresent(System.out::println);
    }
}
