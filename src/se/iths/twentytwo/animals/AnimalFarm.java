package se.iths.twentytwo.animals;

public class AnimalFarm {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
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
        makeASound(horse);
    }

    public static void makeASound(Mammal mammal) {
        mammal.talk();
    }


    public Mammal createMammal(MammalType mammalType) {
        return switch (mammalType) {
            case CAT -> new Cat();
            case DOG -> new Dog();
            case HORSE -> new Horse();
        };
    }

}
