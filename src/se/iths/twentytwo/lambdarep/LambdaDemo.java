package se.iths.twentytwo.lambdarep;

public class LambdaDemo {

    public static void main(String[] args) {

//        Calculatable calculatable = new Add();
//        Calculatable calculatable = new Mul();
//        Calculatable calculatable = new Calculatable() {
//            @Override
//            public int calculate(int a, int b) {
//                System.out.println(this.getClass().getName());
//                return a - b;
//            }
//        };
        Calculatable calculatable = (a, b) -> a / b;

        int result = calculatable.calculate(6, 3);
        System.out.println(result);
        System.out.println(calculatable.calculate(10, 2));
        System.out.println(calculatable.calculate(5, 2));

        Runnable runnable = () -> System.out.println("Hej");
        runnable.run();
        testMethod(runnable);
        testMethod(() -> System.out.println("Nu är det paus"));


    }

    public static void testMethod(Runnable impl) {
        impl.run();
        impl.run();
    }


}


@FunctionalInterface
interface Calculatable {
    int calculate(int a, int b);
}

class Add implements Calculatable {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Mul implements Calculatable {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
