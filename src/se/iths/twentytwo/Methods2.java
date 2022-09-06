package se.iths.twentytwo;

public class Methods2 {

    public static void main(String[] args) {

        int a = sum(1,2);
        a = sum(1,2,3);
        double b = sum(1.0,2.0);

        double c = sum(1.0,2.0);
        printIfGreaterThanTwo(c);
        test();
        int temp = createdMethod(1);

        recurse();

    }

    public int recurciveSum(int lowerbound, int upperbound){
        if( lowerbound >= upperbound )
            return 0;
        return lowerbound + recurciveSum(lowerbound +1 , upperbound);
    }


    private static void recurse() {
        System.out.println("Hej");
        //recurse();
    }

    private static int createdMethod(int i) {
        return 0;
    }

    private static void test() {

    }

    private static void printIfGreaterThanTwo(double value) {

    }


    public static int sum( int a, int b) {
        return 0;
    }


    public static int sum( int c, int d, int e){
        return 0;
    }

    public static int sum(int a, double b){
        return 0;
    }

    public static double sum( double a, double b){
        return 0;
    }

//    public static double sum( double a, double b) {
//        return 0;
//    }




}
