package se.iths.twentytwo.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StreamsAndExceptions {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "a");

        //Sum of numbers
        try {
            var sum = numbers.stream()
                    .mapToInt(Integer::parseInt)
                    .sum();
        } catch (NumberFormatException e) {
            System.out.println("Error in input data");
        }

        //Sum of numbers
//        var sum = numbers.stream()
//                .map(wrap(Double::parseDouble))
//                .mapToDouble(Double::doubleValue)
//                //.map(wrap(Integer::parseInt))
//                //.mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum);

        var sum2 = numbers.stream()
                .map(Either.lift(Integer::parseInt))
                .filter(Either::isRight)
                .map(Either::getRight)
                .filter(Optional::isPresent)
                .mapToInt(Optional::get)
                .sum();

        System.out.println(sum2);

        var sum3 = numbers.stream()
                .map(Either.lift(Integer::parseInt))
                .filter(Either::isRight)
                .map(Either::getRight)
                .filter(Optional::isPresent)
                .mapToInt(Optional::get)
                .sum();

        System.out.println(sum2);


    }



    private static <T,R extends Number> Function<T, R> wrap(Function<T,R> mapper) {
        return n -> {
            try {
                return mapper.apply(n);
            } catch (NumberFormatException e) {
                System.out.println("Error in data");
                return null;
            }
        };
    }
}
