package se.iths.twentytwo.exercises.chapter6.animals;

public class Cow extends Mammal implements NoiseMaker {

    public Cow(int weight, String sound, String name) {
        super(weight, sound, name);
    }

    @Override
    public void makeNoise() {
        System.out.println(" MUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }
}
