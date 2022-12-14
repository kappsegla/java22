package se.iths.twentytwo.regex;

import se.iths.twentytwo.stream.Pair;

import java.util.*;
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

        var indexMap = buildIndexMap(list);
//        var indexMap = buildIndexMapExcludingStopWords(list, Set.of("fudge", "sister"));

        System.out.println(indexMap.entrySet());
        System.out.println("Documents containing fudge: " + indexMap.get("fudge"));

        System.out.println(dice("fudge", "fudge"));

    }

    private static Map<String, Set<Integer>> buildIndexMap(List<String> list) {
        return IntStream.range(0, list.size())
                .mapToObj(createPairOfStringAndIndex(list, PATTERN_NOT_WANTED_CHARS))
                .map(splitStringIntoWords())
                .flatMap(getPairStreamFunction())
                .collect(Collectors.groupingBy(Pair::first,
                        Collectors.mapping(Pair::second, Collectors.toSet())));
    }

    private static Map<String, Set<Integer>> buildIndexMapExcludingStopWords(List<String> list, Set<String> stopWords) {
        return IntStream.range(0, list.size())
                .mapToObj(createPairOfStringAndIndex(list, PATTERN_NOT_WANTED_CHARS))
                .map(splitStringIntoWords())
                .flatMap(getPairStreamFunction())
                .filter(o -> !stopWords.contains(o.fst))
                .collect(Collectors.groupingBy(Pair::first,
                        Collectors.mapping(Pair::second, Collectors.toSet())));
    }

    private static Function<Pair<String, Integer>, Pair<String[], Integer>> splitStringIntoWords() {
        return s -> Pair.of(s.fst.split(" "), s.snd);
    }

    private static Function<Pair<String[], Integer>, Stream<? extends Pair<String, Integer>>> getPairStreamFunction() {
        return s -> {
            int i = s.snd;
            return Arrays.stream(s.fst)
                    .filter(w -> w.length() > 2)
                    .map(w -> Pair.of(w, i));
        };
    }

    private static IntFunction<Pair<String, Integer>> createPairOfStringAndIndex(List<String> list, Pattern pattern) {
        return i -> Pair.of(pattern.matcher(list.get(i)).replaceAll("").toLowerCase(), i);
    }

    public static double dice(String string1, String string2) {
        List<char[]> bigram1 = bigram(string1);
        List<char[]> bigram2 = bigram(string2);
        List<char[]> copy = new ArrayList<>(bigram2);
        int matches = 0;
        for (int i = bigram1.size(); --i >= 0; ) {
            char[] bigram = bigram1.get(i);
            for (int j = copy.size(); --j >= 0; ) {
                char[] toMatch = copy.get(j);
                if (bigram[0] == toMatch[0] && bigram[1] == toMatch[1]) {
                    copy.remove(j);
                    matches += 2;
                    break;
                }
            }
        }
        return (double) matches / (bigram1.size() + bigram2.size());
    }

    private static List<char[]> bigram(String input) {
        ArrayList<char[]> bigram = new ArrayList<char[]>();
        for (int i = 0; i < input.length() - 1; i++) {
            char[] chars = new char[2];
            chars[0] = input.charAt(i);
            chars[1] = input.charAt(i + 1);
            bigram.add(chars);
        }
        return bigram;
    }
}
