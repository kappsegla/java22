package se.iths.twentytwo.exercises;

import java.util.Arrays;

public class Chapter5 {
    public static void main(String[] args) {

        double d = 5.5;
        f5(d);
        System.out.println(d);

        double[] dArr = {5.5};
        f5(Arrays.copyOf(dArr, dArr.length));
        System.out.println(dArr[0]);

    }

    public static void f5(double d) {
        d++;
    }

    public static void f5(double[] dArr) {
        dArr[0]++;
    }

}
