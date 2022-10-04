package se.iths.twentytwo.stream;

import java.util.List;

public class StreamExamples {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> stringList = List.of("Apple", "Bapelsin", "Citrus", "Tomato", "Kiwi", "Grape");
        List<Cat> catList = List.of(
                new Cat("Misse", 10, true),
                new Cat("Pelle", 2, false),
                new Cat("Snow white", 15, true),
                new Cat("Bella", 5, true),
                new Cat("Luna", 2, true),
                new Cat("Leo", 1, false));


        int sum = integerList.stream()
                .mapToInt(i -> i)
                .filter(StreamExamples::lessThanFive)
                .sorted()
                .sum();

        System.out.println(sum);

        long count  = integerList.stream()
                .mapToInt(i->i)
                .filter(StreamExamples::isOdd)
                .count();
        System.out.println(count);




    }

    private static boolean lessThanFive(int value) {
        return value < 5;
    }

    private static boolean isOdd(int value) {
        return value % 2 == 1;
    }
}

class Cat {
    private final String name;
    private final int age;
    private final boolean female;

    public Cat(String name, int age, boolean female) {
        this.name = name;
        this.age = age;
        this.female = female;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFemale() {
        return female;
    }
}
