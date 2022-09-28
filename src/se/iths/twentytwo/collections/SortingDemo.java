package se.iths.twentytwo.collections;

import java.util.*;

public class SortingDemo {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Zebra");
        stringList.add("Anakonda");
        stringList.add("Älg");
        stringList.add("Apa");

       // stringList.sort(String::compareToIgnoreCase);

        Collections.sort(stringList);

        for( String s: stringList) {
            System.out.println(s);
        }

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kalle",32));
        persons.add(new Person("Mimmi",29));
        persons.add(new Person("Anders",23));
        persons.add(new Person("Pia",54));

        //Sort persons based on name
        Collections.sort(persons);
        //Sort persons based on age
        persons.sort(Comparator.comparingInt(Person::getAge));

        //Reverse sorting order
        //Can't use lambda when applying reversed, will lose type and think it's objects
        //persons.sort(Comparator.comparingInt(o->o.age).reversed());
        //If we add a getAge method and uses method reference instead it works :)
        persons.sort(Comparator.comparingInt(Person::getAge).reversed());

        //Print each person from persons array with System.out.println
        persons.forEach(System.out::println);
    }
}

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
