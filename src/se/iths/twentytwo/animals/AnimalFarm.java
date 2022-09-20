package se.iths.twentytwo.animals;

import java.io.Serializable;

public class AnimalFarm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Duck duck = new Duck();
        Cat cat1 = new Cat();
        cat1.name = "Misse";
        Cat cat2 = new Cat();
        cat2.name = "Misse";

        if( cat1 == cat2)
            System.out.println("Same object");
        if( cat1.equals(cat2))
            System.out.println("Same content in objects");


        System.out.println(cat1);
        System.out.println(cat2);


        //Mammal mammal = new Mammal();
        Pet myPet = dog;
        System.out.println(myPet.isCute());


        makeASound(dog);
        makeASound(cat1);
        makeASound(duck);
    }

    public static void makeASound(Mammal mammal){
        mammal.talk();
    }


}
