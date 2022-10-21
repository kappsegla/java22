package se.iths.twentytwo.laboration1;

import java.util.Arrays;
import java.util.Random;

public class EnergyPrices {

    public final static int ROW_COUNT = 10;
    public static int[] prices;
    public static Random random = new Random();

    public static void main(String[] args) {
        prices = inputPrice();
        printAllLines(prices);


        printHours(prices);
    }

    private static boolean aboveThreshold(int price, int row, int min, int max) {
        var interval = max - min;
        var pRow = ROW_COUNT - row - 1;
        var priceThreshold = interval / ROW_COUNT * pRow;
        return price > priceThreshold;
    }

    //Print all rows
    private static void printAllLines(int[] prices) {
        int min = minValue(prices);
        int max = maxValue(prices);
        for (int row = 0; row < ROW_COUNT; row++) {
            rowHeader(min, max, row);
            for (int col = 0; col < prices.length; col++) {
                if (aboveThreshold(prices[col], row, min, max))
                    System.out.print(" X ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
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

    public static void printHours(int[] prices) {
        rowHeader(minValue(prices), maxValue(prices), ROW_COUNT + 1);
        for (int i = 0; i < prices.length; i++) {
            System.out.print("---");
        }
        System.out.println();
        rowHeader(minValue(prices), maxValue(prices), ROW_COUNT + 2);
        for (int i = 0; i < prices.length; i++) {
            System.out.printf(" %02d", i);
        }
    }

    public static void rowHeader(int minValue, int maxValue, int row) {
        int stringMinValue = (minValue + "").length();
        int stringMaxValue = (maxValue + "").length();
        String space = " ";
        if (row == 0)
            System.out.print(maxValue + "|");
        else if (row == ROW_COUNT - 1)
            System.out.print(space.repeat(stringMaxValue - stringMinValue) + stringMinValue + "|");
        else
            System.out.print(space.repeat(stringMaxValue) + "|");


    }


}
