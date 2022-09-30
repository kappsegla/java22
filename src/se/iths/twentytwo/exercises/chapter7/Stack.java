package se.iths.twentytwo.exercises.chapter7;

import java.util.LinkedList;

public class Stack<E> {

    private Node<E> head;
    private Node<E> tail;

    private int length;

    public void push(E value) {
        if (isEmpty()) {
            head = new Node<E>();
            tail = head;
            head.value = value;
        } else {
            var tempNode = head;
            head = new Node<E>();
            head.value = value;
            tempNode.prev = head;
            head.next = tempNode;
        }
        length++;
    }

    public E pop() {
        if (isEmpty())
            return null;
        E tempValue = head.value;
        length--;
        head = head.next;
        if (head != null)
            head.prev = null;

        return tempValue;

    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        var temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //For reversed order to work, we need a double linked list
    public void printReversed() {
        var temp = tail;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.prev;
        }
    }
}

class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> prev;
}
