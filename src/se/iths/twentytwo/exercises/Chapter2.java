package se.iths.twentytwo.exercises;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Chapter2 {

    public static void main(String[] args) {
        task12();
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
    }

    public static void task6alt() {
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();
        int secretNumber = randomNumber.nextInt(-1, 101);

        System.out.println("Gissa vilket tal jag tänker på");

        while (true) {
            int input = sc.nextInt();

            if (input < secretNumber) {
                System.out.println("För lågt, försök igen");
                continue;
            } else if (input > secretNumber) {
                System.out.println("För högt, försök igen");
                continue;

            } else System.out.println("Rätt svar");
            break;
        }
    }

    public static void task6minimal() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Gissa ett tal från ett till och med 10!");

        int answer = rand.nextInt(1, 11);
        int nGuesses = 0;

        while (true) {
            int guess = sc.nextInt();
            nGuesses++;
            if (guess == answer)
                break;
            //Using string format and replacing if/else with ternary operator, https://www.baeldung.com/java-ternary-operator
            System.out.format("Fel gissat, försök igen!%nTalet är %s än %d!%n", guess < answer ? "högre" : "lägre", guess);
        }
        System.out.format("Rätt gissat, det var %s!%nAntal gissningar var: %s", answer, nGuesses);
    }

    public static void task7() {
        for (int i = 1; i <= 16; i++) {
            System.out.println(i);
        }
        int number = 1;
        while (number < 17) {
            System.out.println(number);
            number++;
        }
    }

    public static void task8() {
        for (int i = 20; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 20; i >= 2; i--) {
            if (isEven(i))
                System.out.println(i);
        }
        for (int i = 20; i > 1; i--) {
            System.out.println(i--);
        }
        for (int i = 20; i >= 2; i -= 2) {
            System.out.println(i);
        }
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static void task9() {

        for (int i = 65536; i > 1; i /= 2) {
            System.out.println(i);
        }
        for (int i = 65536; i > 1; i >>= 1) {
            System.out.println(i);
        }
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        String completeInput = "";

        while (true) {
            System.out.println("Skriv in ett ord");
            String input = scanner.nextLine();
            if (input.isEmpty() || input.equals("."))
                break;

            completeInput = completeInput + input + " ";
            System.out.println(completeInput);
        }
    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number 3 or more: ");
        long testNumber = scanner.nextLong();
        while (true) {
            if (testNumber < 3) {
                break;
            } else if (testNumber % 2 == 0)
                testNumber /= 2;
            else
                testNumber = testNumber * 3 + 1;
            System.out.println(testNumber);
        }
    }

    public static void task12() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (x == y)
                    System.out.print("#");
                else
                    System.out.print(".");
            }
            System.out.println("");
        }
    }
}
