package se.iths.twentytwo.zoo;

public class ZooDemo {

    public static void main(String[] args) {
        Pet myDogPet = new Lizzard();
        Pet myHorsePet = new MiniHorse();

        takeToVet(myDogPet);
        takeToVet(myHorsePet);

        Ridable ridable = new MiniHorse();
        ridable.ride();
    }

    public static void takeToVet(Pet pet) {
        System.out.println("Taking my " + pet.getPetType() + " to the vet.");
    }
}

interface Pet {
    String getPetType();
}

interface Ridable {
    void ride();
}

class Lizzard implements Pet {

    @Override
    public String getPetType() {
        return "Lizzard";
    }
}

class MiniHorse implements Pet, Ridable {

    @Override
    public String getPetType() {
        return "Mini Horse";
    }

    @Override
    public void ride() {
        System.out.println("Riding around my house on my mini horse");
    }
}
