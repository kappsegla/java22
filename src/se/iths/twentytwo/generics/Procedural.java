package se.iths.twentytwo.generics;

class Procedural {

    public static int value = 10;

    public static void main(String[] args) {
        
        System.out.println(sayHello("Martin"));

        int i = 10;

        for (int j = 0; j < 10; j++) {

        }

        int[] array = {1, 2, 3};
        for (int k : array) {

        }

        while(true) {
            break;
        }

        do {

        }while(true);
    }

    public static String sayHello(String name) {

        return "Hello " + name;
    }

}
