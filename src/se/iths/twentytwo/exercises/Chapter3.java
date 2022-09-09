package se.iths.twentytwo.exercises;

import java.util.Scanner;

public class Chapter3 {

    //public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1(sc);
    }

    private static double task1(Scanner sc) {
        while (true) {
            try {
                String str = sc.nextLine();
                double aDouble = Double.parseDouble(str);
                System.out.println(aDouble);
                return aDouble;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
