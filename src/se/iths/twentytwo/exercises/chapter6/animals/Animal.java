package se.iths.twentytwo.exercises.chapter6.animals;

public class Animal {
    private int weight;
    private String sound;
    private String name;

    public Animal(int weight, String sound, String name) {
        this.weight = weight;
        this.sound = sound;
        this.name = name;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void run() {
        System.out.println("IM RUNNING!!!!");
    }

}
