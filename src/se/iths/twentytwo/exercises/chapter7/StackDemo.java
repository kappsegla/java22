package se.iths.twentytwo.exercises.chapter7;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("First string");
        myStack.push("Second string");
        myStack.push("Third string");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
