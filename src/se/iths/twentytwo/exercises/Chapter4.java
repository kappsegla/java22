package se.iths.twentytwo.exercises;

import java.util.Arrays;

public class Chapter4 {
    public static void main(String[] args) {
        task2();
    }

    private static void task1() {
        String[] colors = {"Gul", "Grön", "Orange", "Blå", "Grå"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println(Arrays.toString(colors));
    }


    private static void task2() {
        int[] arr = {2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                sum += arr[i];
            else
                sum -= arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
