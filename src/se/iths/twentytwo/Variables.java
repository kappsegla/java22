package se.iths.twentytwo;

import java.util.Locale;
import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        int x = getInteger3(scanner);
        System.out.println(x);

        double d = scanner.nextDouble();


//
//        switch (x) {
//            case 1 -> printOne();
//            case 2 -> System.out.println("x is two");
//            case 3 -> System.out.println("x is three");
//            default -> System.out.println("wrong number");
//        }
    }

    private static int getInteger(Scanner scanner) {
        int i = 0;
        boolean success = false;
        do {
            try {
                String s = scanner.next();
                i = Integer.parseInt(s);
                success = true;
                System.out.println("Managed to read " + i);
            } catch (Exception e) {
                System.out.println("Error");
            }
        } while (!success);
        return i;
    }

    private static int getInteger2(Scanner scanner) {
        int i = 0;
        while(true) {
            try {
                String s = scanner.next();
                i = Integer.parseInt(s);
                System.out.println("Managed to read " + i);
                break;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return i;
    }

    private static int getInteger3(Scanner scanner){
        int i = 0;
        while(!scanner.hasNextInt()){
            //Invalid chars to be parsed as integer, remove from input
            scanner.next();
            System.out.println("Removed invalid chars");
        }
        i = scanner.nextInt();
        return i;
    }


    private static void printOne() {
        System.out.println("x is one");
        System.out.println("x is one");
    }

}
