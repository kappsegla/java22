package se.iths.twentytwo.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Chapter4 {

    public static Random rand = new Random();


    public static void main(String[] args) {
        //task4();
//        P4_7rektanglar.A();
//        P4_7rektanglar.B();
//        P4_7rektanglar.C();
//        P4_7rektanglar.D();
//        P4_7rektanglar.E();
//        P4_7rektanglar.F();
//        P4_7rektanglar.G();
//        P4_7rektanglar.H();
//        P4_7rektanglar.I();
//        P4_7rektanglar.J();
//        P4_7rektanglar.K();
//        P4_7rektanglar.task4_7_j();
//        P4_7rektanglar.task9();
        task8();

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

    public static void task8() {

        int[] intArray = new int[9];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 20) + 1;
        }
//        int[] intArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(intArray));

        boolean isSwaped = true;
        while (isSwaped) {
            isSwaped = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int temp = intArray[i + 1];
                    intArray[i + 1] = intArray[i];
                    intArray[i] = temp;
                    isSwaped = true;
                }
            }
            System.out.println(Arrays.toString(intArray));
        }
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = i + 1; j < intArray.length; j++) {
//                if (intArray[i] > intArray[j]) {
//                    int temp = intArray[j];
//                    intArray[j] = intArray[i];
//                    intArray[i] = temp;
//                }
//            }
//
//            System.out.println(Arrays.toString(intArray));
//        }


    }


}

class P4_7rektanglar {

    public static void A() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == col)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println();
        }

    }

    public static void B() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row || col == row + 4)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");

        }
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 8; x++) {
                if (x == y)
                    System.out.print("#");
                else if (x == (y + 4))
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void C() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row || col == row + 1)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void D() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == 2 || col == 5 || row == 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void E() {
        int x = 4;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == col || col == x)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            x--;
            System.out.println("");
        }
    }

    public static void F() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                if ((col + row) % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void G() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                if (col < 3 && row < 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void H() {

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row + 2 || col > 5 && row < 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }

            System.out.println();
        }
    }

    public static void I() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 2 && row != 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void J() {
        int x = 5;
        for (int row = 0; row < 5; row++) {
            x--;
            for (int col = 0; col < 5; col++) {
                if (col == row && row != 2)
                    System.out.print("#");
                else if (col == x && row != 2)
                    System.out.print("#");
                else if (col == 2 && row == 2)
                    System.out.print("o");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void K() {

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row < 2 && col % 2 == 1)
                    System.out.print("--");
                else if (row == 2 && col < 3)
                    System.out.print("ww");
                else if (row == 2)
                    System.out.print("~~");
                else
                    System.out.print("##");
            }
            System.out.println("");
        }
    }

    public static void task4_7_j() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""

                Give me an uneven number

                """);
        int rowSize = sc.nextInt();
        if (rowSize % 2 == 0) {
            System.out.println("""

                    You need to choose an uneven number

                    """);
            task4_7_j();
        }
        for (int row = 0; row < rowSize; row++) {
            System.out.println();
            for (int column = 0; column < rowSize; column++) {
                if (column == row && column == rowSize - 1 - row)
                    System.out.print("o");
                else if (column == row || column == rowSize - 1 - row)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
        task4_7_j();
        // Detta är Julia
    }

    public static void task9() {
        int[][] array2D = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        int[][] array2 = new int[4][];
        // array2[0] = new int[2];
        array2[0][0] = 1;
        array2[0][1] = 2;


    }
}
