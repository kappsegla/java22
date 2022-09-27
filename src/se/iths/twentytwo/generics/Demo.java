package se.iths.twentytwo.generics;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Pair twoStrings = readTwoStrings();

        System.out.println(twoStrings);
    }

    public static Pair readTwoStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringOne = scanner.nextLine();
        System.out.print("Enter a second string: ");
        String stringTwo = scanner.nextLine();

        return Pair.of(stringOne, stringTwo);
    }

}
