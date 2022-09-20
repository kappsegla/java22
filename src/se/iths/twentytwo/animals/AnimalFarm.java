package se.iths.twentytwo.animals;

import java.io.Serializable;

public class AnimalFarm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();
        //Mammal mammal = new Mammal();
       // Mammal mammal = duck;

        makeASound(dog);
        makeASound(cat);
        makeASound(duck);
       // makeASound(mammal);
    }

    public static void makeASound(Mammal mammal){
        mammal.talk();
    }


}
