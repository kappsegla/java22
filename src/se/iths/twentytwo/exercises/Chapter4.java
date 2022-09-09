package se.iths.twentytwo.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Chapter4 {

    public static Random rand = new Random();


    public static void main(String[] args) {
        task4();
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

    public static void task3() {

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 21);
        }

        int oddCounter = 0;
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
            if (j > max)
                max = j;
            if (j % 2 == 1)
                oddCounter++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Mån: " + min);
        System.out.println("Max: " + max);
        System.out.println("Antal udda tal:" + oddCounter);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur lång ska arrayen vara?");
        int[] num = new int[sc.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.println(num[i]);
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.printf("Medelvärdet är %.2f", (double) sum / num.length);
    }

}
