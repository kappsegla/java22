package se.iths.twentytwo.exercises.chapter7;

import se.iths.twentytwo.exercises.chapter6.animals.*;

import java.util.HashMap;
import java.util.Map;

public class AnimalsCollection {

    public static void main(String[] args) {
        Map<String, Animal> firstHashMap = new HashMap<>();


        firstHashMap.put("Sten", new Cod(3, "blubblub", "Sten"));
        firstHashMap.put("Kaj", new Crow(4, "krakra", "Kaj"));
        firstHashMap.put("Harald", new Cow(188, "muuu", "Harald"));
        firstHashMap.put("Halvor", new Crocodile(88, "rrrrrrrrrr", "Halvor"));

        firstHashMap.get("Halvor").makeSound();
        System.out.println(firstHashMap.size());

        firstHashMap.remove("Halvor");
        if (firstHashMap.containsKey("Halvor"))
            firstHashMap.get("Halvor").makeSound();

        firstHashMap.getOrDefault("Halvor", NullAnimal.of()).makeSound();

        System.out.println(firstHashMap.size());
    }

}
