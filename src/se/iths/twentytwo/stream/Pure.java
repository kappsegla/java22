package se.iths.twentytwo.stream;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.function.Consumer;

public class Pure {

    static int counter = 0;

    private int fieldValue;

    public int getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(int fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int getAndSetFieldValue(int fieldValue) {
        int temp = this.fieldValue;
        this.fieldValue = fieldValue;
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(dayOfWeek());

        String data = "Some random text";

        higherOrderFunction(text -> System.out.println(text + data));
    }

    public static void higherOrderFunction(Consumer<String> consumer) {
        consumer.accept("Handling this using an implementation handed to us as argument");
    }


    public static int pureFunction(int a) {
        return a * 2;
    }

    public static int sideEffects(int a) {
        counter++;
        return a;
    }

    public static int nonPureFunction(int a) {
        return (int) (a * (Math.random() * 100));
    }

    public static int dayOfWeek() {
        return LocalDateTime.now().getDayOfWeek().getValue();
    }

    public static String firstMonthOfTheYear() {
        return "January";
    }


}
