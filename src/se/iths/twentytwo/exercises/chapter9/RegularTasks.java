package se.iths.twentytwo.exercises.chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks {

    public static void main(String[] args) {
        String text = "min katt har tre konkatenerade kanter";
        Pattern pattern = Pattern.compile("kat", Pattern.CASE_INSENSITIVE);
        System.out.println("kat exists in string: " + regexHit(pattern, text));

        regexTester("kat", text);
    }

    private static boolean regexHit(Pattern pattern, String stringToBeTested) {
        Matcher matcher = pattern.matcher(stringToBeTested);
        return matcher.find();
    }

    private static void regexTester(String regex, String stringToBeTested) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringToBeTested);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Hit #" + count); //"hit".equals("found")?
            System.out.println("Start index " + matcher.start());
            System.out.println("End index " + matcher.end());
        }
    }
}
