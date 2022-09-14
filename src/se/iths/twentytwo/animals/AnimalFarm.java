package se.iths.twentytwo.animals;

public class AnimalFarm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

        makeASound(dog);
        makeASound(cat);
        makeASound(duck);
    }

    public static void makeASound(Mammal mammal){
        mammal.talk();
    }


}
