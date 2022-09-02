package se.iths.twentytwo.exercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
        task7();
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
        Scanner s = new Scanner(System.in);
        System.out.println("mata in 2 tal");
        int x = s.nextInt(), y = s.nextInt();

        double aver = (double) (x + y) / 2;
//        double aver2 = (x + y) / 2.0;
        System.out.println(aver);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur mycket pengar har du på kontot?");
        double sum = sc.nextDouble();
        System.out.println("Hur många % ränta vill du ha?");
        double rent = sc.nextDouble();

        double saldo = sum + ((sum * rent) / 100);

        System.out.println(saldo);

//        String s = sc.next();
//        BigDecimal balance = new BigDecimal(s);
//        BigDecimal interest = new BigDecimal("0.02");
//        System.out.println(balance.multiply(interest));
    }
}
