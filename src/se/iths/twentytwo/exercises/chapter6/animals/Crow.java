package se.iths.twentytwo.exercises.chapter6.animals;

public class Crow extends Bird implements NoiseMaker {
    public Crow(int weight, String sound, String name) {
        super(weight, sound, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("crawcrawcraw!!");

    }
}
