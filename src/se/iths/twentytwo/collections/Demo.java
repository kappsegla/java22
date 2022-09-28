package se.iths.twentytwo.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        String[] strings = new String[10];

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Text0");
        System.out.println(myList.size());

        myList.add("Text1");
        myList.add("Text2");
        myList.add("Text3");
        myList.add("Text3");

        myList.remove(2);
        myList.remove("Text1");
        //myList.remove("Text3");
//        for (int i = 0; i < myList.size(); i++) {
//            String data = myList.get(i);
//            if( data.equals("Text3")) {
//                myList.remove(i);
//                i--;
//            }
//        }

        myList.removeIf(e -> e.equals("Text3"));

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result.append(i).append(" ");
        }

        String theString = result.toString();
       // doSomething(result);
       // doSomething(theString);

        System.out.println("Enter Text3");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if( input.equals("Text3"))
            System.out.println("Same content");
        
        input = input.intern();
        if( input == "Text3")
            System.out.println("Same object");

    }

    public static void doSomething(CharSequence input){

        System.out.println(input);
    }



}
