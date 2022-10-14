package se.iths.twentytwo.exercises.chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks {

    public static void main(String[] args) {
        String text = "min katt har tre konkatenerade kanter";
        Pattern pattern = Pattern.compile("kat", Pattern.CASE_INSENSITIVE);
        System.out.println("kat exists in string: " + regexHit(pattern, text));

        regexTester("k(at|an|on)", text);
        regexTester("a[a-zåäö]", text);
        regexTester("[^t]t[^t]", text);
        tTester(text);
    }

    private static void tTester(String text) {
        int count = 0;
        List<String> matchList = new ArrayList<>();
        for (int i = 1; i < text.length() - 1; i++) {
            if (text.charAt(i) == 't' && text.charAt(i - 1) != 't' && text.charAt(i + 1) != 't') {
                matchList.add(String.valueOf(text.charAt(i - 1)) + text.charAt(i) + text.charAt(i + 1));
                count++;
            }
        }
        System.out.println(count);
        matchList.forEach(System.out::println);
    }

    private static boolean regexHit(Pattern pattern, String stringToBeTested) {
        Matcher matcher = pattern.matcher(stringToBeTested);
        return matcher.find();
    }

    public static void regexTester(String regex, String stringToBeTested) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringToBeTested);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        System.out.println("Hits: " + count);
    }
}
