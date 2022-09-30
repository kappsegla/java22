package se.iths.twentytwo.exercises.chapter6.animals;

public class NullAnimal extends Animal {

    private static final Animal nullAnimal = new NullAnimal();

    public NullAnimal() {
        super(0, "", "");
    }

    @Override
    public void makeSound() {
    }

    public static Animal of() {
        return nullAnimal;
    }

}
