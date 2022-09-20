package se.iths.twentytwo.animals;

import java.io.Serializable;

public class AnimalFarm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();
        //Mammal mammal = new Mammal();
        Pet myPet = dog;
        System.out.println(myPet.isCute());


        makeASound(dog);
        makeASound(cat);
        makeASound(duck);
    }

    public static void makeASound(Mammal mammal){
        mammal.talk();
    }


}
