package se.iths.twentytwo.stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
        List<Country> countries = List.of(
                new Country("Sweden", List.of(new City("Stockholm"), new City("Gothenburg"))),
                new Country("Norway", List.of(new City("Oslo"), new City("Bergen"))));

        countries.stream()
                .flatMap(country -> country.cities().stream())
                .forEach(System.out::println);
    }
}

record Country(String name, List<City> cities) {
}

record City(String name) {
}
