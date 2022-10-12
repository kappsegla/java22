package se.iths.twentytwo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("this");
        Matcher m = p.matcher("Lorem this is it Lorem this is it");
        while (m.find()) {
            System.out.println("Start " + m.start());
            System.out.println("End " + m.end());
        }
    }
}
