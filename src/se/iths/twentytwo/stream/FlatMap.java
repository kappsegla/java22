package se.iths.twentytwo.stream;

import java.util.List;

public class FlatMap {

    public static void main(String[] args) {


    }
}

record Country(String name, List<City> cities){}
record City(String name){}
