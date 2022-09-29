package se.iths.twentytwo.zoo;

import java.util.List;

public abstract class Animal {

    public abstract String getPetType();

    public static void main(String[] args) {
//        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        takeToVet(myCat);
        takeToVet(myDog, myCat);
        takeToVet(myDog, myDog, myCat, myCat);
    }

    public static void takeToVet(Animal myPet) {
        System.out.println("Taking my " + myPet.getPetType() + " to the vet");
    }

    public static void takeToVet(Animal myPet1, Animal myPet2) {
        System.out.println("Taking my " + myPet1.getPetType() + " and " + myPet2.getPetType() + " to the vet");
    }

    public static void takeToVet(Animal... myPets) {
        for (Animal animal : myPets) {
            System.out.println("Taking my " + animal.getPetType() + " to the vet");
        }
    }

}

class Dog extends Animal {
    @Override
    public String getPetType() {
        return "Dog";
    }
}

class Cat extends Animal {
    @Override
    public String getPetType() {
        return "Cat";
    }
}
