package se.iths.twentytwo.regex;

import se.iths.twentytwo.stream.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IndexStrings {

    public static final Pattern PATTERN_NOT_WANTED_CHARS = Pattern.compile("[.,;?!\t\r\n]");


    public static void main(String[] args) {
        var list = List.of(
                "My sister is coming for the holidays.",
                "The holidays are a chance for family meeting.",
                "Who did your sister meet? Your other sister?",
                "It takes an hour to make fudge.",
                "My sister makes awesome fudge."
        );

//Build index, no stopwords used in this example.
//Should exclude common words like is, the, a, an....
//Now it just removes words with less than 3 characters


        var allWords =
                IntStream.range(0, list.size())
                        .mapToObj(createPairOfStringAndIndex(list, PATTERN_NOT_WANTED_CHARS))
                        .map(splitStringIntoWords())
                        .flatMap(getPairStreamFunction())
                        .collect(Collectors.groupingBy(Pair::first,
                                Collectors.mapping(Pair::second, Collectors.toSet())));

        System.out.println(allWords.entrySet());
        System.out.println(allWords.get("fudge"));

    }

    private static Function<Pair<String, Integer>, Pair<String[], Integer>> splitStringIntoWords() {
        return s -> Pair.of(s.fst.split(" "), s.snd);
    }

    private static Function<Pair<String[], Integer>, Stream<? extends Pair<String, Integer>>> getPairStreamFunction() {
        return s -> {
            int i = s.snd;
            return Arrays.stream(s.fst)
                    .filter(w -> w.length() > 3)
                    .map(w -> Pair.of(w, i));
        };
    }

    private static IntFunction<Pair<String, Integer>> createPairOfStringAndIndex(List<String> list, Pattern pattern) {
        return i -> Pair.of(pattern.matcher(list.get(i)).replaceAll("").toLowerCase(), i);
    }
}
