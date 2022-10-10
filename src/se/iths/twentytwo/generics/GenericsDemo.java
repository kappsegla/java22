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

        var secondItem = list.get(1);
        System.out.println(secondItem);
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
