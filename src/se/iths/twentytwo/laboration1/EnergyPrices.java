package se.iths.twentytwo.laboration1;

import java.util.Arrays;
import java.util.Random;

public class EnergyPrices {

    public static int[] prices;
    public static Random random = new Random();

    public static void main(String[] args) {
        prices = inputPrice();
        printHours(prices);
    }

    private static boolean aboveThreshold(int price, int row, int rowCount, int min, int max) {
        var interval = max - min;
        var pRow = rowCount - row - 1;
        var priceThreshold = interval / rowCount * pRow;
        return price > priceThreshold;
    }

    //Print all rows
    private static void printAllLines(int row, int column, String[][] histogram) {
        System.out.println(histogram[row][column]);
    }

    private static int[] inputPrice() {
        return random.ints(24, 1, 400).toArray();
    }

    private static int maxValue(int[] prices) {
        return Arrays.stream(prices).max().orElse(0);
    }

    private static int minValue(int[] prices) {
        return Arrays.stream(prices).min().orElse(0);
    }

    //print hours
    public static void printHours(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.printf(" %02d", i);

        }
    }
}
