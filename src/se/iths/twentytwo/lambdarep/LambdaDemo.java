package se.iths.twentytwo.lambdarep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaDemo {

    public static void main(String[] args) {

//        Calculatable calculatable = new Add();
//        Calculatable calculatable = new Mul();
//        Calculatable calculatable = new Calculatable() {
//            @Override
//            public int calculate(int a, int b) {
//                System.out.println(this.getClass().getName());
//                return a - b;
//            }
//        };
        Calculatable calculatable = (a, b) -> a / b;
        //Prefer using java standard functional interfaces
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a / b;

        int result = calculatable.calculate(6, 3);
        result = calc.apply(6, 3);
        System.out.println(result);
        System.out.println(calculatable.calculate(10, 2));
        System.out.println(calculatable.calculate(5, 2));

        Runnable runnable = () -> System.out.println("Hej");
        runnable.run();
        testMethod(runnable);
        testMethod(() -> System.out.println("Nu är det paus"));

        List<String> listOfFlowers = List.of("Sunflower", "Rose", "Lily", "Dandelion");

        for (String flower : listOfFlowers) {
            System.out.println(flower);
        }

        listOfFlowers.forEach(flower -> System.out.println(flower));

        List<String> mutableListOfFlowers = new ArrayList<>(listOfFlowers);

//        mutableListOfFlowers.sort((object1, object2) -> object1.length() - object2.length());
        mutableListOfFlowers.sort(
                Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()));

        mutableListOfFlowers.forEach(System.out::println);


    }

    public static void testMethod(Runnable impl) {
        impl.run();
        impl.run();
    }


}


@FunctionalInterface
interface Calculatable {
    int calculate(int a, int b);
}

class Add implements Calculatable {
    @Override
    public int calculate(int tal1, int tal2) {
        return tal1 + tal2;
    }
}

class Mul implements Calculatable {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
