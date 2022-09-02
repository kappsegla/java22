package se.iths.twentytwo.exercises;

import java.math.BigDecimal;

public class Chapter2 {

    public static void main(String[] args) {
        task3();
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

    }

    public static void task5() {

    }

    public static void task6() {

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
