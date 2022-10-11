package se.iths.twentytwo.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzImp {


    public static void main(String[] args) {
        fizzBuzz();
//       var result =  Stream.iterate(1, n-> n + 1)
//                .limit(100)
//                .map(FizzBuzzImp::convertToFizzBuzzString)
//                .collect(Collectors.joining(","));
//        System.out.println(result);

    }

    public static void fizzBuzz() {
        List<String> strings = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            strings.add(convertToFizzBuzzString(i));
        }
        System.out.println(String.join(",", strings));

    }

    public static String convertToFizzBuzzString(int number){
        if (number % 3 == 0 && number % 5 == 0)
            return "Fizz Buzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(number);
    }



}
