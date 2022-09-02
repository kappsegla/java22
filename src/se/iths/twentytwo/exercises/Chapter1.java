package se.iths.twentytwo.exercises;

import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
        task5();
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter your name: ");
        String namn = scanner.next();
        System.out.println("Hej " + namn + "!");
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String name = scanner.next();

        System.out.println("Hej " + name + ", hur gammal är du?");

        String age = scanner.next();
        int age1 = Integer.parseInt(age);
        System.out.println("Okej, du är " + age1 + " år gammal.");
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in ett heltal: ");
        int number1 = sc.nextInt();
        System.out.print("Skriv in ett heltal till: ");
        int number2 = sc.nextInt();
        System.out.println("Summan av de två talen är: " + (number1 + number2));
        System.out.println("Produkten av de två talen är: " + number1 * number2);
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ett decimaltal: ");
        boolean isNumber = false;
        while (!isNumber) {
            try {
                double decimalNumber = Double.parseDouble(scanner.next());
                int doubleToInt = (int) decimalNumber;
                System.out.println("Ditt heltal är: " + doubleToInt);
                isNumber = true;
            } catch (Exception e) {
                System.out.println("Skriv ett tal");
            }
        }
    }

    public static void task6() {

    }

    public static void task7() {

    }
}
