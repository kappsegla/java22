package se.iths.twentytwo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {


    public static void main(String[] args) {
        String s = "My cat has four legs and a grey color. That's a cat.";
        Pattern pattern = Pattern.compile("cat");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.println("We found a cat");
            System.out.println(matcher.start());
            System.out.println(matcher.group());
        }


    }
}
