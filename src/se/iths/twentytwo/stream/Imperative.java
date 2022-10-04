package se.iths.twentytwo.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Imperative {

    public static void main(String[] args) {

        List<String> stringList = List.of("A", "B", "C", "D", "E", "F");

        boolean containsA = stringList.contains("A");

        boolean answer = false;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals("A")) {
                answer = true;
                break;
            }
        }

        stringList.forEach(s -> System.out.println(s));

        for (String s : stringList) {
            System.out.println(s);
        }

        Stream<String> li = Stream.empty();

        stringList.stream()
                .limit(4)
                .skip(7)
                .reduce((s, s2) -> String.valueOf((char) Math.max(s.charAt(0), s2.charAt(0))))
                .ifPresent(System.out::println);


    }
}
