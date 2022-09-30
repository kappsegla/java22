package se.iths.twentytwo.exercises.chapter7;

import java.util.ArrayList;
import java.util.Random;

public class DRandom {

    public static void main(String[] args) {
        ArrayList<Double> randomNumbers = new ArrayList<Double>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextDouble());
        }
        for (Double number : randomNumbers) {
            System.out.println(number);
        }

        //randomNumbers.forEach(System.out::println);

    }
}
