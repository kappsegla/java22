package se.iths.twentytwo.exercises;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Chapter5 {
    public static void main(String[] args) {


        System.out.println(doubleAdd(2.5, 2.5) + "\n");
        System.out.println(doubleMulti(2.5, 2.5) + "\n");
        System.out.println(unlimitetParametar(1, 1, 2, 2));

        threePaarametrar((byte) 12, "Robert", "Göteborg");

        System.out.println(task5_6(Month.Januari));
        System.out.println(daysOfMonth(Month2.FEB));

        task5_6(Month.Maj);

//        double d = 5.5;
//        f5(d);
//        System.out.println(d);
//
//        double[] dArr = {5.5};
//        f5(Arrays.copyOf(dArr, dArr.length));
//        System.out.println(dArr[0]);


    }

    public static void f5(double d) {
        d++;
    }

    public static void f5(double[] dArr) {
        dArr[0]++;
    }

    public static double doubleAdd(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public static double doubleMulti(double x, double y) {
        double sum = x * y;
        return sum;
    }

    public static int unlimitetParametar(int... x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    static void threePaarametrar(byte favoritNumber, String name, String city) {
        System.out.println("Välkommen " + name + " från " + city + " med favorite tal " + favoritNumber);
    }

    public static int task5_6(Month month) {
        return month.numberOfDays;
    }

    public enum Month {
        Januari(31),
        Februari(28),
        Mars(31),
        April(30),
        Maj(31),
        Juni(30),
        Juli(31),
        Augusti(31),
        September(30),
        Oktober(31),
        November(30),
        December(31);
        final int numberOfDays;

        Month(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }


    }

    public enum Month2 {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    public static int daysOfMonth(Month2 month) {
        Date d = new Date();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Year = " + year);
        return daysOfMonthSwitchCase(month, year);
    }

    public static int daysOfMonthSwitchCase(Month2 month, int year) {
        switch (month) {
            case JAN:
                return 31;
            case FEB:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            case MAR:
                return 31;
            case APR:
                return 30;
            case MAY:
                return 31;
            case JUN:
                return 30;
            case JUL:
                return 31;
            case AUG:
                return 31;
            case SEP:
                return 30;
            case OCT:
                return 31;
            case NOV:
                return 30;
            case DEC:
                return 31;
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {

        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        } else
            leap = false;

        return leap;

    }


}
