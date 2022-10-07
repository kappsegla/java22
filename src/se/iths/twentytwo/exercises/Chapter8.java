package se.iths.twentytwo.exercises;

import java.util.Comparator;
import java.util.List;

public class Chapter8 {
    public static void main(String[] args) {


    }

    private static void task12() {
        getCountries().stream()
                .filter(country -> country.population > 7)
                .sorted(Comparator.comparing(Country::population))
                .limit(3)
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task11() {
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population))
                .limit(5)
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task10() {
        getCountries().stream()
                .filter(c -> c.countryName().length() > c.capital().length())
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task9() {
        getCountries().stream()
                //.filter(country -> !country.countryName().isEmpty() && !country.capital().isEmpty() && country.countryName().charAt(0) == country.capital().charAt(0))
                .filter(country -> country.countryName().charAt(0) == country.capital().charAt(0))
                .forEach(country -> System.out.println(country.countryName() + " " + country.capital()));
//                .filter(country -> country.countryName.startsWith(String.valueOf(country.capital.charAt(0))))
//                .forEach(country -> System.out.println(country.countryName() + ": " + country.capital()));
//                .filter(country -> country.countryName.substring(0, 1).equals(country.capital.substring(0, 1)))
//                .forEach(country -> System.out.println(country.countryName() + ": " + country.capital()));
    }

    private static void task8Complicated() {
        for (int i = 10_000; i < 1_000_001; i = i * 10) {
            int finalI = i;
            long count2 = getCountries().stream()
                    .filter(country -> country.area() > finalI)
                    .count();
            System.out.println(count2);
        }
    }

    private static void task8() {
        populationOver(getCountries(), 10_000);
        populationOver(getCountries(), 100_000);
        populationOver(getCountries(), 1_000_000);
    }

    public static void populationOver(List<Country> countries, int x) {
        long count = countries.stream()
                .filter(country -> country.area > x)
                .count();
        System.out.println(count);
    }

    private static void task7() {
        getCountries().stream()
                .filter(country -> (country.population() < 5))
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task6() {
        double averageArea = getCountries().stream()
                .mapToInt(Country::area)
                .average().orElse(0);
        System.out.printf("Average area is: %.2f\n", averageArea);

        long nBelowAverage = getCountries().stream()
                .filter(country -> country.area() < averageArea)
                .count();

        System.out.println("Number of countries below average are: " + nBelowAverage);
    }

    private static void task5() {
        double v = getCountries().stream()
                .mapToDouble(Country::population)
                .max()
                .orElse(0.0);
        System.out.println(v);
    }

    private static void task4() {
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population).reversed())
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task3() {
        getCountries().stream()
                .sorted(Comparator.comparing(Country::countryName))
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task2() {
        String s = getCountries().stream()
                .map(Country::countryName)
                .findFirst()
                .orElse("");
        System.out.println(s);

        String s1 = getCountries().stream()
                .skip(getCountries().size() - 1)
                .map(Country::countryName)
                .findFirst()
                .orElse("");
        System.out.println(s1);

        String s2 = getCountries().stream()
                .reduce((first, second) -> second)
                .map(Country::countryName)
                .orElse("");
        System.out.println(s2);
    }

    private static List<Country> getCountries() {
        return List.of(
                new Country("Sverige", "Stockholm", 10.07, 450295),
                new Country("Norge", "Oslo", 5.27, 323802),
                new Country("Island", "Reykjavik", 0.33, 102775),
                new Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Country("Finland", "Helsinki", 5.51, 338424),
                new Country("Belgien", "Bryssel", 11.30, 30528),
                new Country("Tyskland", "Berlin", 82.18, 357168),
                new Country("Frankrike", "Paris", 66.99, 640679),
                new Country("Storbritannien", "London", 60.80, 209331),
                new Country("Niue", "Alofi", 0.0016, 261),
                new Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Country("Polen", "Warszawa", 38.63, 312679),
                new Country("Spanien", "Madrid", 46.5, 505990),
                new Country("Portugal", "Lissabon", 10.31, 92212),
                new Country("Italien", "Rom", 60.59, 301338),
                new Country("Grekland", "Aten", 11.18, 131957),
                new Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Country("Liechtenstein", "Vaduz", 0.038, 160));
    }

    record Country(String countryName, String capital, double population, int area) {
    }
}
