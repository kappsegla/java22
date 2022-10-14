package se.iths.twentytwo.exercises.chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks2 {

    public static final String TEXT = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("as|od", Pattern.CASE_INSENSITIVE);
//      Pattern pattern2 = Pattern.compile("[ae][nds]", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("a[nds]|e[nds]", Pattern.CASE_INSENSITIVE);
        Pattern pattern3 = Pattern.compile("\\b[dh]");
        Pattern pattern4 = Pattern.compile("s\\b");
        Pattern pattern5 = Pattern.compile("\\b[a-z][aeiouy]");
        Pattern pattern6 = Pattern.compile("([a-z])\\1");
        Pattern pattern7 = Pattern.compile("(\\b[a-z]+\\b).*\\1");
        Pattern pattern8 = Pattern.compile("([a-z])\\1{2}");  //([a-z])\1\1

        System.out.println(regexHit(pattern8, TEXT));

    }


    private static int regexHit(Pattern pattern, String stringToBeTested) {
        Matcher matcher = pattern.matcher(stringToBeTested);
        return (int) matcher.results()
                .peek(matchResult -> System.out.println(matchResult.group()))
                .count();
//
//        int count = 0;
//        while (matcher.find()) {
//            count++;
//        }
//        return count;

    }
}
