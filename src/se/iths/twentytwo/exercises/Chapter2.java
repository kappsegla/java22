package se.iths.twentytwo.exercises;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Chapter2 {

    public static void main(String[] args) {
        task6();
    }

    public static void task3() {
        String password = "1234";
        System.out.println("Skriv in ditt lösenord:");
        char[] enteredPassword = System.console().readPassword();

        String enteredPasswordString = String.valueOf(enteredPassword);
        if (enteredPasswordString.equals(password)) {
            System.out.println("Rätt lösenord!");
        } else {
            System.out.println("Fel lösenord!");
        }
        ///String passwordString = new String(inputPassword); // Gör om lösenord till string
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (number == 100) {
            System.out.println("The number is exactly 100");
        } else if (number < 100) {
            System.out.println("The number is lesser than 100");
        } else {
            System.out.println("The number is greater than 100");
        }

    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        month = month.toLowerCase();
        switch (month) {
            case "january", "jan" -> System.out.println("1");
            case "february" -> System.out.println("2");
            default -> System.out.println("Something went wrong");
        }
        //  System.out.println("Hej " + name.substring(0, 1).toUpperCase() + name.substring(1));
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Gissa ett tal från ett till och med 10!");

        int answer = rand.nextInt(1, 11);

        int guess = sc.nextInt();
        int nGuesses = 1;
        while (guess != answer) {
            System.out.println("Fel gissat, försök igen!");
            if (guess < answer) {
                System.out.println("Talet är högre än " + guess + "!");
            } else {
                System.out.println("Talet är lägre än " + guess + "!");
            }
            guess = sc.nextInt();
            nGuesses++;
        }
        System.out.println("Rätt gissat, det var " + answer + "!");
        System.out.println("Antal gissningar var: " + nGuesses);


//    Random randomNumber = new Random();
//    int secretNumber = randomNumber.nextInt(-1, 101);
//
//        System.out.println("Gissa vilket tal jag tänker på");
//
//        while(true)
//
//    {
//        int input = sc.nextInt();
//
//        if (input < secretNumber) {
//            System.out.println("För lågt, försök igen");
//            continue;
//        } else if (input > secretNumber) {
//            System.out.println("För högt, försök igen");
//            continue;
//
//        } else System.out.println("Rätt svar");
//        break;
//    }
    }

    public static void task7() {

    }

    public static void task8() {
        //pax
        // Julia paxaren
    }

    public static void task9() {

    }

    public static void task10() {

    }

    public static void task11() {

    }
}
