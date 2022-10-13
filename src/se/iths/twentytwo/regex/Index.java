package se.iths.twentytwo.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Index {
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
        var pattern = Pattern.compile("[.,;?!\t\r\n]");

        var allWords =
                IntStream.range(0, list.size())
                        .mapToObj(i -> new StringWithIndex(pattern.matcher(list.get(i)).replaceAll("").toLowerCase(), i))
                        .map(s -> new StringArrayWithIndex(s.word().split(" "), s.index()))
                        .flatMap(s -> {
                            int i = s.index();
                            return Arrays.stream(s.words())
                                    .filter(w -> w.length() > 3)
                                    .map(w -> new StringWithIndex(w, i));
                        })

                        .collect(Collectors.groupingBy(StringWithIndex::word,
                                Collectors.mapping(StringWithIndex::index, Collectors.toSet())));

        System.out.println(allWords.entrySet());
        System.out.println(allWords.get("fudge"));

    }
}
