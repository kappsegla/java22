package se.iths.twentytwo.stream;

import java.util.Comparator;
import java.util.List;

import static java.util.function.Predicate.not;

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
                .filter(value -> value < 5)
                .sum();

        //System.out.println(sum);

        long count = integerList.stream()
                .mapToInt(i -> i)
                .filter(value -> isOdd(value))
                .count();
        //System.out.println(count);


        long catcount1 = catList.stream()
                .filter(Cat::female)
                .count();
        System.out.println(catcount1);

        long maleCount = catList.stream()
                .filter(not(Cat::female))
                .filter(cat -> cat.age() < 5)
                .count();
        System.out.println(catcount1);

        double average = catList.stream()
                .mapToInt(Cat::age)
                .average()
                .orElseThrow();
        System.out.println(average);

        //Sort according to number of characters in cat name
        var result = catList.stream()
                .sorted(Comparator.comparingInt(Cat::getNameLength)
                        .thenComparing(Cat::name))
                .toList();

        result.forEach(System.out::println);

    }

    private static boolean lessThanFive(int value) {
        return value < 5;
    }

    private static boolean isOdd(int value) {
        return value % 2 == 1;
    }
}

record Cat(String name, int age, boolean female) {
    public int getNameLength() {
        return name.length();
    }
}
