package se.iths.twentytwo.animals;

import se.iths.twentytwo.solid.lsp.ShapeDemo;

import java.awt.*;

public class Cat extends Mammal {

    @Override
    public void talk() {
        this.name = "Misse";
        System.out.println("Meow, meow!");
    }

}
