package se.iths.twentytwo.exercises.chapter7;

import java.util.LinkedList;

public class Stack<E> {

    private final LinkedList<E> list = new LinkedList<>();

    private int length;

    public void push(E value) {
        list.addLast(value);
        length++;
    }

    public E pop() {
        length--;
        return list.removeLast();
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}

class Node<T> {
    public T value;
    public Node<T> next;
}
