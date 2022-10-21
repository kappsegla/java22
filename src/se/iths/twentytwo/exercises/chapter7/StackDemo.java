package se.iths.twentytwo.exercises.chapter7;

import java.util.Iterator;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("First string");
        myStack.push("Second string");
        myStack.push("Third string");

        for (String s : myStack) {
            System.out.println(s);
        }
        System.out.println("-------");
        Iterator<String> iterator = myStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------");

        System.out.println(myStack.size()); //3
        System.out.println(myStack.pop());  //Third string
        System.out.println(myStack.pop());  //Second string
        System.out.println(myStack.pop());  //First string
//        myStack.print();
//        myStack.printReversed();
        System.out.println(myStack.size()); //0
        System.out.println(myStack.isEmpty()); //true
        // if (!myStack.isEmpty())
        System.out.println(myStack.pop());  //Exception
    }
}
