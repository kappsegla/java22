package se.iths.twentytwo.exercises.chapter9;

import java.util.regex.MatchResult;
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

        //System.out.println(regexHit(pattern8, TEXT));

        String result = TEXT.replace("l", "1");
        result = result.replace("o", "0");

        Pattern pattern9 = Pattern.compile("[lo]");
        //result = TEXT.replaceAll("[lo]","");
        Matcher matcher = pattern9.matcher(TEXT);
        result = matcher.replaceAll((matchResult) -> {
            if (matchResult.group().equals("l"))
                return "1";
            else if (matchResult.group().equals("o"))
                return "0";
            else
                throw new RuntimeException("Something went wrong cause Java is dumb");
        });

        result = matcher.replaceAll(RegularTasks2::getMatchResultStringFunction);

        result = matcher.replaceAll((matchResult) -> matchResult.group().equals("l") ? "1" : "0");

        System.out.println(result);

        Pattern pattern10 = Pattern.compile("\\b\\w{6}\\b");
        System.out.println(regexHit(pattern10, TEXT));

//        Pattern pattern11 = Pattern.compile("\\b\\w+[^ae]+|[^ae]+\\w+\\b");
        Pattern pattern11 = Pattern.compile("\\b[b-df-z]+\\b");
        System.out.println(regexHit(pattern11, TEXT));
    }

    private static String getMatchResultStringFunction(MatchResult matchResult) {
        if (matchResult.group().equals("l"))
            return "1";
        else if (matchResult.group().equals("o"))
            return "0";
        else
            throw new RuntimeException("Something went wrong cause Java is dumb");
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
