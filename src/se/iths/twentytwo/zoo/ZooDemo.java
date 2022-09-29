package se.iths.twentytwo.zoo;

public class ZooDemo {

    public static void main(String[] args) {
        Pet myDogPet = new Lizzard();
        Pet myHorsePet = new MiniHorse();

        takeToVet(myDogPet);
        takeToVet(myHorsePet);
    }

    public static void takeToVet(Pet pet) {
        System.out.println("Taking my " + pet.getPetType() + " to the vet.");
    }
}

interface Pet {
    String getPetType();
}

class Lizzard implements Pet {

    @Override
    public String getPetType() {
        return "Lizzard";
    }
}

class MiniHorse implements Pet {

    @Override
    public String getPetType() {
        return "Mini Horse";
    }
}
