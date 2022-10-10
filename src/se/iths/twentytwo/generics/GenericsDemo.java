package se.iths.twentytwo.generics;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<>("Hej");
        storage1.data = "Hej";
        var temp = storage1.getData();

        ArrayList<String> list = new ArrayList<>();
        list.add("Hej");
        list.add("Hello");
        ArrayList<Integer> list2 = new ArrayList<>();

        printAll(list);
        printAll(list2);

        addStringToList(list);

        var secondItem = list.get(1);
        System.out.println(secondItem);
    }

    public static void printAll(ArrayList<?> input) {

    }

    //pecs
    //Producer extends consumer super
    public static void addStringToList(ArrayList<? super String> input) {
        input.add("Lunch time");
    }

    public static void readStringFromList(ArrayList<? extends String> input) {
        var text = input.get(0);
    }


}

class Storage<T> {
    T data;

    public Storage(T value) {
        data = value;
    }

    public T getData() {
        return data;
    }
}

class IntStorage {
    int data;
}
