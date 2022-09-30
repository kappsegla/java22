package se.iths.twentytwo.exercises.chapter7;

import java.util.LinkedList;

public class Stack<E> {

    private Node<E> head;

    private int length;

    public void push(E value) {

        length++;

        if (isEmpty()) {
            head = new Node<E>();
            head.value = value;
        } else {
            var tempNode = head;
            head = new Node<E>();
            head.value = value;
            head.next = tempNode;
        }
    }

    public E pop() {

        if (isEmpty())
            return null;
        E tempValue = head.value;
        length--;
        head = head.next;

        return tempValue;

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
