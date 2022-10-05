package se.iths.twentytwo.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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
        var sum = numbers.stream()
                .map(wrap(Double::parseDouble))
                .map(i->i.orElse(0.0))
                .mapToDouble(Double::doubleValue)
//                .map(wrap(Integer::parseInt))
//                .map(i->i.orElse(0))
//                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        var sum2 = numbers.stream()
                .map(Either.lift(Integer::parseInt))
                .filter(Either::isRight)
                .map(Either::getRight)
                .filter(Optional::isPresent)
                .mapToInt(Optional::get)
                .sum();

        // System.out.println(sum2);

        var eithersPair = numbers.stream()
                .map(Either.lift(Integer::parseInt))
                .collect(teeing(
                        filtering(Either::isRight, toList()),
                        filtering(Either::isLeft, toList()),
                        Pair::of));

        eithersPair.fst.forEach(System.out::println);
        System.out.println("------");
        eithersPair.snd.forEach(System.out::println);
    }

    private static <T,R> Function<T, Optional<R>> wrap(Function<T, R> mapper) {
        return n -> {
            try {
                return Optional.of(mapper.apply(n));
            } catch (NumberFormatException e) {
                System.out.println("Error in data");
                return Optional.empty();
            }
        };
    }
}
