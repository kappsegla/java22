package se.iths.twentytwo.laboration1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    final static int MAX_NUM = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            menuChoice(scanner);
        }
    }

    private static void menuChoice(Scanner scanner) {
        var choice = scanner.nextLine();
        switch (choice) {
            case "1" -> upsideDown(scanner);
            case "2" -> minMax(scanner);
            case "3" -> stonePaperScissors(scanner);
            case "4" -> order(scanner);
            case "e", "E" -> System.exit(0);
        }
    }

    private static void order(Scanner scanner) {


    }

    private static void stonePaperScissors(Scanner scanner) {
        new StonePaperScissors().play(scanner);
    }

    private static void minMax(Scanner scanner) {
        int[] numbers = new int[MAX_NUM];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        var stat = Arrays.stream(numbers).summaryStatistics();

        System.out.println("Min value: " + stat.getMin());
        System.out.println("Max value: " + stat.getMax());
    }

    private static void upsideDown(Scanner scanner) {

//        String[] strings = new String[MAX_NUM];
//        int counter = 0;
//        for (int i = 0; i < MAX_NUM; i++) {
//            strings[i] = scanner.nextLine();
//            if( strings[i].equals("END"))
//                break;
//            counter++;
//        }
//
//        for (int i = counter - 1 ; i >= 0; i--) {
//            System.out.println(strings[i]);
//        }

        Deque<String> stack = new ArrayDeque<>();
        do {
            String value = scanner.nextLine();
            if (value.equals("END"))
                break;
            stack.add(value);
        } while (true);

        stack.descendingIterator().forEachRemaining(System.out::println);
    }

    private static void printMenu() {
        final String menuText = """
                1. Upp och Ner
                2. Min Max
                3. Sten Sax Påse
                4. Ordning och reda
                e. Avsluta
                """;
        System.out.println(menuText);
    }
}
