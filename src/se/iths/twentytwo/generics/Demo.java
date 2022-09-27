package se.iths.twentytwo.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        
        
        Pair<String, Integer> twoStrings = readTwoStrings();
        
        System.out.println(twoStrings);
        System.out.println( twoStrings.first.length());
        System.out.println(twoStrings.second.intValue());


        String[] twoStringsInArray = readTwoStringsAsArray();
        System.out.println(Arrays.toString(twoStringsInArray));

        System.out.println(readTwoStringsAsRecord());
    }

    public static Pair<String,Integer> readTwoStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringOne = scanner.nextLine();
        System.out.print("Enter a second string: ");
        Integer stringTwo = scanner.nextInt();

        return Pair.of(stringOne, stringTwo);
    }

    public static String[] readTwoStringsAsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringOne = scanner.nextLine();
        System.out.print("Enter a second string: ");
        String stringTwo = scanner.nextLine();

        return new String[]{stringOne, stringTwo};
    }

    public static TwoValues readTwoStringsAsRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringOne = scanner.nextLine();
        System.out.print("Enter a second string: ");
        String stringTwo = scanner.nextLine();

        return new TwoValues(stringOne, stringTwo);
    }
}

record TwoValues(String first, String second) {
}

record StringAndInteger(String frist, Integer second){}
