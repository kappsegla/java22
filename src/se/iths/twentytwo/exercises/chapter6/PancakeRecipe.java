package se.iths.twentytwo.exercises.chapter6;

public class PancakeRecipe {
    int flour = 7;
    int milk = 6;
    int egg = 8;
    int salt = 7;
    int butter = 8;

    public boolean canMakePancakes() {
        return flour > 0 && milk > 0 && egg > 0 && salt > 0 && butter > 0;
    }

    public void makePancakes() {

        while (canMakePancakes()) {
            flour--;
            milk--;
            egg--;
            salt--;
            butter--;
            System.out.println("En pannkaka är klar");
        }
        System.out.println("slut på en ingridiens");

//        if (canMakePancakes()){
//            flour--;
//            milk--;
//            egg--;
//            salt--;
//            butter--;
//            System.out.println("En pannkaka är klar");
//            makePancakes();
//        }
//        else{
//            System.out.println("slut på en ingridiens");
//        }
    }


    public static void main(String[] args) {
        PancakeRecipe pancakeRecipe = new PancakeRecipe();
        pancakeRecipe.makePancakes();

    }
}
